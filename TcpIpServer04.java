package days19;
// 이게 현제 단방향 통신
//while무한루프로 한스레드느 계속 입력 받고 다른스레드는 계속 보내는 방식으로 run속에 구현 하여 스타트만하자!
//총 3개의 쓰레드가돌겠다 메인,Sender,Receiver
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Sender extends Thread {
	DataOutputStream out;// 메세지 전송용 출력 스트림.
	Socket s;
	String name;

	Sender(Socket socket) { // 메인에서 전달한 s 가 들어갈곳!
		this.s = socket;
		// 생성자를 통해 전달되어 온소켓인스턴스를 자신의 소켓변수에 저장
		try {
			out = new DataOutputStream(s.getOutputStream());
			name = "[" + s.getInetAddress() + ":" + s.getPort() + "]";
			// 메세지 전달시 앞에 붙여줄 말머리
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run() {
		while (out != null) {// out객체가 살아있는한 계속됨
			// 화면을 통해 입력받아서
			//out레퍼선스변가 널값이 아니랍면 out인스턴스가 할당되어이는상태이면 
			//out임스턴스는 생성자에게 최초의 new로 생성되어 프로그램종료시까지 계속 없어지지 않습니다ㅣ.
			//결국 화면입력내용을 기다리다 입력이들어오면 상대ㅑ방에게 전송하는 작럽ㅈ을 계속하라는의미입니다.
			Scanner sc = new Scanner(System.in);
			try {
				out.writeUTF(name + sc.nextLine());// 화면의 입력내용을 말머리와 함께 계속 전송
			} catch (IOException e) {
				System.out.println("데이터 전송 객체를 생성하지 못했습니다.(Sender문제)");
				e.printStackTrace();
			}
		}
	}
}

class Receiver extends Thread {
	DataInputStream in;// 메세지 전송용 출력 스트림.
	Socket s; 
	Receiver(Socket socket){
		this.s =socket;
		try {
			in= new DataInputStream(s.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("매세지 수신객체를 생성하지 못했습니다.");
		}
	}
		public void run() {
			while (in != null) {// out객체가 살아있는한 계속됨
		
				try {
					System.out.println(in.readUTF());
				
				} catch (IOException e) {
					System.out.println("데이터 전송 객체를 생성하지 못했습니다.(Receiver문제)");
					e.printStackTrace();
				}
			}
		}
	}

public class TcpIpServer04  {
	// 쓰레드에 맞게 변경한 getTime()
	static String getTime() {
		String name = Thread.currentThread().getName();
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date()) + name;
	}

	public static void main(String[] args) {// 메인에서 1연결 1소켓 같이써야좋다.
		ServerSocket sS = null;
		Socket s = null;
		try {
			sS = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 정상 준비되었습니다.");
			s = sS.accept();// 연결정보를 통신소켓 s 에전달함.
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();
		} catch (IOException e) {
			System.out.println("서버소캣 생성 실패했습니다.");
		}

	}

}
