package days19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.sound.midi.SysexMessage;

public class TcpIpMultiChatServer {
	HashMap clients; // 클라이언트 와의 연결들을 관리할 리스트
	// key : 클라이언트의 이름 - 클라이언트 접속과 함꼐 전달된 이름: 숫자로 구성됨
	// Value : 클라이언트에 연결된 이름(key값)으로 생성된 out 객체 , key 값의 클라이언트 전용 전송객체

	TcpIpMultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		// 멀티 쓰레드 환경에서 단일 해쉬멤에 멀티스레드가 동시접근하여 값을 변경하는 것을 막는 동기화 과정.
	}

	class SeverReceiver extends Thread {
		Socket s;
		DataInputStream in;
		DataOutputStream out;

		SeverReceiver(Socket socket) {
			this.s = socket;
			try {
				in = new DataInputStream(s.getInputStream());
				out = new DataOutputStream(s.getOutputStream());
			} catch (IOException e) {
				System.out.println("송수신 객체 생성에 실패했습니다.");
			}
		} // 송수신을 위한 객체 (생성자)

		public void run() {
			String name = "";
			try {
				name = in.readUTF(); // 접속과 함께 전달된 이름을 저장
				clients.put(name, out);
				sendToAll("#" + name + "님이 들어오셨습니다."); // 이름을 출력(모든 클라이언트에게)
				System.out.println("현재 서버접속자 수는" + clients.size() + "입니다.");
				while (in != null)
					sendToAll(in.readUTF());
			} catch (IOException e) {
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name); // 해쉬맵에서 현재 사용자 삭제
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]" + "에서 접속을 종료하였습니다.");
				System.out.println("현재 접속자 수는 " + clients.size() + "입니다.");
			}
		}
	}

	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator(); // 해쉬맵의 키들에 차례로 접근할 수 있는 이터레이터 생성
		while (it.hasNext()) {// 키 값이 마지막까지 다다를 떄 까지 반복실행
			try {
				// 클라이언트에서 (next)키 값으로 얻어낸 Value (클라이언트전용 out객체)를 꺼내서 out에 저장
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg); // 해쉬맵에서 꺼내온 out 객체를 통해 메세지 전송
			} catch (IOException e) {
			}
		} // clients 해쉬맵에 있는 각 클라이언트의 OutStream 을 각각 꺼내어 현재 메세지를 전송
	}

	public void start() throws IOException {
		ServerSocket sS = null;
		Socket s = null;
		try {
			sS = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");

			s = sS.accept();
			System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]" + "에서 접속하였습니다.");
			// 아이피와 포트 번호로 접속 알림(서버화면)

			SeverReceiver th = new SeverReceiver(s); // 데이터 송수신을 위한 쓰레드

		} catch (IOException e) {
			System.out.println("서버 소켓 생성에 실패했습니다. 서버를 종료합니다.");
			System.exit(0);
		}
	}

	public static void main(String[] args) throws IOException {
		TcpIpMultiChatServer k = new TcpIpMultiChatServer();
		k.start();
	}

}