package days17;

import java.io.IOException;

public class IO_02 {
	public static void main(String[] args) throws IOException {
//		InputStream 클래스의 read메소드
		//read(): 입력 스트림으로 부터 가장 앞에 위치한 1바이트를 읽어옴.
		//read(byte[]): 입력 스트림의 가장 앞부터 매개변수로 전달된 배열의 크기까지의 바이트를 읽어옴
		//read(byte[],int startIndex, int size):  입력스트림의 가장앞부터  sizez크기 만큼 데이터를 읽어옴.
		//저장은 매개변수로 전달된 배열의 startIdex 위치부터 저장
		byte[] input =new byte [20];
		System.out.println("\n키보드 입력을 실행:");
		int  size =System.in.read(input);
		System.out.println(size);
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%c\n", (char)input[i]);
			
			byte[] input2 = new byte[20];
			System.out.println();
			size = System.in.read(input2,5,5);
			for (int k = 0; k < input.length;k++) {
				System.out.printf("%c\n", (char)input[i]);
			
			
		}
		
	}
	}
}
