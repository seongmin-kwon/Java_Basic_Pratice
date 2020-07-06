package days17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_05 {
	public static void main(String[] args) throws IOException {
/*
 * 자바의 입출력 클래스들은 다른 스트림 객체를 생성자의 매개변수로 전달받아 해당 스트림 객체에 
 * 기능을 추가할 수 있습니다.
 * 데코레이션 페턴(객체 다른 클래스의 기능을 추가하여 사용)
 * 키보드로 사용하여 데이터를 읽어올수 있도록 반환
 * 버퍼: 프로그램의 성능을 향상시키기 위해사용되는 메모리
 * 버퍼를 사용하여 READ/WRITE 성능을 행상시킬수 있음.
 * 
 */
		InputStreamReader reader = new InputStreamReader(System.in);
		//bufferedReader 문자 스크림 클래스의 하나로 버퍼를 사용하여 데이터를 읽어 들일 수 있는 클래스
		//BufferReader 문자 스트림 클래스의 하나로 버퍼를 사용하여 데이터를 읽어들일 수 있는 클래스
		//문자열로 받으면 integer.perseint같은걸로 더쉽게 문자를 숫자로 변환가능
		
		BufferedReader br = new BufferedReader(reader);
		System.out.println("메세지를 입력하세요");
		String message = br.readLine();//최초로 입력 변수에 String 사용됨.
		System.out.printf("입력된 메세지는 %d글자입니다.",message.length());
		System.out.println(message);
		//스트림은 메모리 누수 현상을 방지하기위해서 반드시 close메소드를 호출하여 종료해야함.
		//하나의 스크림에 여러개의 스트림 클래스가 적용되는경우
		//가장 마지막에 생성된(가장 바깥쪽의 객체) 만 close 하면 된다.	
		br.close();
		
	}
	
}
