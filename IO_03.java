package days17;

import java.io.IOException;

public class IO_03 {
	public static void main(String[] args) throws IOException {
//System.in 객체를 사용하여 +연산을 수행하는 프로그램을 작성하시오
		// 첫정수 :123,두번째 : 25 , 결과 :123 +25 =148
		byte[] firstNumber = new byte[10];
		byte[] secondNumber = new byte[10];
		System.out.print("첫번째 정수 : ");
		int size_1 = System.in.read(firstNumber);
		System.out.println("두번째 정수: ");
		int size_2 = System.in.read(secondNumber);
		System.out.println(size_1 + " " + size_2);
		//165입력시 firstNumber[0]=1, firstNumber[1]=6, firstNumber[2]=5;
		int i,m,n1=0,n2=0;
		for (i = size_1-3, m=1; i >0; i--,m=m*10) {
			n1 +=(firstNumber[i] -'0')*m;  // 숫자 를얻어내기위함 과정 숫자의 아스키 코드 -아스키 코드 0 은 48이라 이를빼줘야함. 그래야 숫자얻음
		}
		
		//System.in.read 로 읽을경우 입력한 문자갯수보다 두개가 더 많은 사이즈가 잡힙니다.(입력의 끝문자와 엔터 즉 \n+널값이 포함됨.)
		//따라서 사이즈 -3을해야 마지막 입력한 문자의 첨자가 사용됩니다.
		//마지막 숫자 1의자리 아라비라 기호 부터 0번쨰 숫자 (10이상의 자리 , 아라비아 기호)까지
		//'0'으로으로 뺄셈연산을 해야 마지막 입력한 문자의 첨자가 사용됩니다.
	}
}
