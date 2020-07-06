package days17;

import java.io.IOException;
import java.io.InputStreamReader;

public class IO_04 {
	public static void main(String[] args) throws IOException {
		/*
		 * 기본 입력을 문자 스트림으로 처리하는 방법
		 * 일반적으로 문자 스트림은 문자 스트림 클래스의 객체를 생성하여 입력을 수행합니다.
		 * 기종에 생성되 바이트 스트림이 존재한다면 , 바이트 스트림의 객체를 사용하여 문자 스트림을 변환 할 수 있습니다.
		 * 바이트 스트림 객체를 문자 스트림으로 변환하는 방법
		 * InputStreamReader 클래스를 사용
		 * InputStreamReader 클래스는 바이트 스트림의 객체를 생성자의 매개변수로 전달 받아 해당 바이트 스트림을 문자스트림으로 변환
		 * 
		 */
		InputStreamReader reader =new InputStreamReader(System.in);
		char[] message = new char[30];
		System.out.print("메세지를 입력하세요:");
		int size =reader.read(message);
		System.out.printf("입력된 메세지는 %d\n인 글자입니다.",size
				);
		System.out.println(message);
		for (int i = 0; i < message.length; i++) {
			System.out.printf("%c",message[i]);
		}
		
		
	}
}
