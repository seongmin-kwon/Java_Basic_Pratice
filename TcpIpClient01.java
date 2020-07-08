package days19;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient01 {
	public static void main(String[] args) {
		String serverIp = "192.168.0.20"; // 샘 ip 단 공유기가 같은 인터넷을 공유중 가능
		//클라이언트는 소캣구체적으로 만들 필요없고 들어갈 서버의 ip주소가 필요
		try {
			Socket s = new Socket(serverIp,7777);
			InputStream in =s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String m =dis.readUTF();
			//UTF로 보낸건 UTF로 받자
			System.out.println("서버로 부터 받은 메시지 "+ m);
			System.out.println("연결을 종료 합니다.");
			//잊지말고 소캣 닫는다.
			dis.close();
			s.close();
			System.out.println("정상종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("서버와연결이 실패했습니다.");
			e.printStackTrace();
		}
	}
}
