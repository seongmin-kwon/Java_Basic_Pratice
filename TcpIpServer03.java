package days19;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer03 implements Runnable {
	// 쓰레드에 맞게 변경한 getTime()
	static String getTime() {
		String name = Thread.currentThread().getName();
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date()) + name;
	}

	// 멤버변수
	ServerSocket sS; // 연결요청을 캐치할 서버소켓 준비
	Thread[] threadArr; // 쓰레드 배열준비(갯수는 아직 미정)

	// 생성자
	public TcpIpServer03(int num) {
		try {
			sS = new ServerSocket(5555); // 소캣의 실행경우 빨간버튼이 계속켜진상태에서 또키면 오류생김 소캣이 교착상태가되는것 이럴땐바꿔줘야해
			System.out.println(getTime() + "서버가 정상 준비되었습니다.");
			threadArr =new Thread[num];
			// 커멘드로 서버열고 이클립스로 클라이언트 접속 순서~
		} catch (IOException e) {
			System.out.println("서버소캣 생성 실패");
		}
		
	}

// implements Runnable 한클래스는 반드시 run()을 오버라이딩해줘야한다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(getTime() + "연결 요청을 기다리는중입니다...");
			Socket socket;
			socket = sS.accept(); // 요청이 들어와서 연결되는 시점
			System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다. ^_^");
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("[공지] 서버로부터 테스트 메세지가 전송했당.");
			System.out.println(getTime() + "데이터를 전송함");
			dos.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("클라이언트와 연결에 실패했어요 ㅠㅠ.");

		}
	}

	public void start() {
		for (int i = 0; i < threadArr.length; i++) {
			threadArr[i] = new Thread(this);
			// 5개짜리 스레드 배열에 새로운 스레드 인스턴스를 만들어 각칸에 할당
			threadArr[i].start();
			// 그 스레드들은 각각 start()가 호출
		}
	}

	public static void main(String[] args) {
		TcpIpServer03 server = new TcpIpServer03(5);
		server.start(); 
		// 쓰레드의 start가 아닌 start()실행 즉 start()안에 스레드의 start가 호출되어 실행함-> 5개의쓰레드가 동시에 지할일함.

	}
}
