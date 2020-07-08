package days19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network_01 {
	public static void main(String[] args) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com"); //호스트네임
			System.out.println("getHostName():" + ip.getHostName());
			System.out.println("getHostaddress():" + ip.getHostAddress());
			System.out.println("toString(): " + ip.toString());
			byte[] ipAddr = ip.getAddress();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
		 //local호스트 : 내컴퓨터이다.
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName():" + ip.getHostName());
			System.out.println("getHostAddress():" + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//서버화 이후 가능 
		//로컬 호스트 대표 아이피 127.0.0.1 써도 됨 
		//=192.168.0.32
		//=http://localhost
		//서버화하면 이후에 위 3주소로 내 컴퓨터의 로컬호스트로 접속 가능
	}
}
