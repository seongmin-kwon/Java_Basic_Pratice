package days19;
// 이전은 무한정 접속을 기다린다. 

//이번엔 특정 시간동안만  받고 안오면 종료하게 구현하자.

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer02 {

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

	public static void main(String[] args)throws NullPointerException {
		ServerSocket sS = null;
		try {
			sS = new ServerSocket(6666); // 소캣의 실행경우 빨간버튼이 계속켜진상태에서 또키면 오류생김 소캣이 교착상태가되는것 이럴땐바꿔줘야해
			System.out.println(getTime() + "서버가 정상 준비되었습니다.");
			// 커멘드로 서버열고 이클립스로 클라이언트 접속 순서~
		} catch (IOException e) {
			System.out.println("서버소캣 생성 실패");
		}
		while (true) {
			try {
				System.out.println(getTime() + "연결 요청을 기다리는중입니다...");
				sS.setSoTimeout(5000); // setSoTimeout(5000) ->5초지나면 예외SocketTimeoutException처리가 발생됨. catch 로 이동.!
				Socket s = sS.accept(); // 요청이 들어와서 연결되는 시점
				System.out.println(getTime() + s.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[공지] 서버로부터 테스트 메세지가 전송했당.");
				System.out.println(getTime() + "데이터를 전송함");
				dos.close();
				s.close();
			} catch (SocketTimeoutException e) {
				System.out.println("5초동안 반응없네요 접속시간초과:서버를종료함");
				System.exit(0);// 서버를 종료함.
			} catch (IOException e) {
				System.out.println("클라이언트와 연결에 실패했어요.");

			}
		}

	}
}
