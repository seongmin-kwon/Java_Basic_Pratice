package days19;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer01 {
//소캣 : 전구의 전류량을 조절해서 관리하는녀석인데 네트웤 접속중에서 잘 접속되는지 의 서버의 역할 하게하기위해서 서버라는이름의 소캣을 만듬
	// 클래스 명일뿐~
	// 서버 역할로 연결을 요청하는 클라이언트의 요청을 수락하고 연결을 완성해줄 클래스
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

	public static void main(String[] args) {
		ServerSocket sS = null;
		try {// 소켓을 통한 연결 실패시 예외 처리
				// 네트워크상의 서버 소켓으로 실행할 연결은 여러개가 있을 수 있으며, 그들을 서로 구분하기 위해 포트 번호를 설정 합니다.
				// 만들어지는 소켓마다 생성자에 전달하여 설정합니다.
				// 소캣마다 포트번호가 있어 이들을 통해 다차원통신이 가능하다.
				// 지금의 경우 7777로 정했으니 연결해주는 클라이언트&서버간의 암묵적암호를 7777로 정한것이라 보면된다.
				// getTime() 스테틱 메서드이다.
			sS = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 정상 준비되었습니다.");
			// 서버가 new ServerSocket으로 생성되면 연결 준비가 완료된 것입니다.
			//커멘드로 서버열고 이클립스로 클라이언트 접속 순서~
		} catch (IOException e) {
			System.out.println("서버소캣 생성 실패");
			e.printStackTrace();

		}
		while (true) { // 아직 종료 안되는 불안정한 프로그램이다.
			try {
				// 클라이언트의 연결요청이 오면클라이언트 소켓과 통신할 새로운 통신용 소켓을 생성하거 ,서버소캣이 연결해놓은 서버연결을 전달합니다.
				// 서버 소켓은 클라이언트의 연결 요청이올때 까지 실행을 멈추고 계속 기다립니다.
				System.out.println(getTime() + "연결 요청을 기다리는중입니다...");
				Socket s = sS.accept();
				System.out.println(getTime() + s.getInetAddress() + "안녕하세요.");
				// 통신소켓의 출력 스트림을 얻어옵니다.
				OutputStream out = s.getOutputStream(); // new로 안하고 소캣클래스에도 들어있어서 이렇게 사용가능
				// 소켓의 출력 스트림을 DataOutputStream에 전달해서 서버 -> 클라이언트의 데이터 출력을 준비 합니다.
				// 참고로 스트림은 단방향 통신입니다.
				DataOutputStream dos = new DataOutputStream(out);
				// 최종 통신 출력 도구: dos
				// s.getOutputStream () -> outputStream ->DataOutputStream
				// 원격 소켓 에 데이터를 보낸다;
				dos.writeUTF("[공지] 서버로부터 테스트 메세지가 전송되었습니다.");
				System.out.println(getTime() + "데이터를 전송함");
				// 스트림과 소캣을 닫아준다.
				dos.close();
				s.close();

			} catch (IOException e) {
				System.out.println("클라이언트 연결 실패");

			}
		}
	}

}
