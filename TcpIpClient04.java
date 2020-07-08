package days19;
//현재 단방향 통신 서버4와 주고받기 가능
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient04 {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1"; 
		try {
			Socket s = new Socket(serverIp,7777);
			System.out.println("서버연결완료!");
			Sender sender =new Sender(s);
			Receiver receiver =new Receiver(s);
			sender.start();
			receiver.start();
		} catch (UnknownHostException e) {
			System.out.println("서버와연결이 실패했습니다.");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("서버와연결이 실패했습니다.");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("서버와연결이 실패했습니다.");
			e.printStackTrace();
		}
	}
}
