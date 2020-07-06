package days17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_06 {
	public static void main(String[] args) throws IOException {
		//BufferedReader 객체 생성 예제
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String input;
		//BufferedReader클래스의 객체를 사용하여 기본 자료형의 타입을 읽어온후 형변환을 시행합니다.
		System.out.println("정수를 입력하세요:");
		 input = br.readLine();
		 int num=Integer.parseInt(input);
		 System.out.printf("입력정수: %d\n",num);
		 System.out.printf("실수 입력하세요");
		 input = br.readLine();
		 double d= Double.parseDouble(input); //입력된 문자열을 실수로 변환
		 System.out.printf("입력정수: %.2f\n",(double)d);
		 System.out.printf("실수 입력하세요");
		 char ch =(char)br.read();
		 System.out.printf("입력된 문자 : %c\n",ch);
		 br.close();
				
	}
}
