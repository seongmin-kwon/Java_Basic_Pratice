package days02;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		/*
		 * //변수의 생성 규칙 //->첫글자는 반드시 영문으로 만들자영어,숫자,_를섞어 만듬 중간에 공백 x 변수이름에 의미가 있어야 좋다.
		 * //너무 길면 사용시마다 그긴이름을 쳐야함.. //카멜기법을 사용 numSum 와같이 만듬.. 
		 * 
		 * boolean 'true' 'false'  1byte
		 * int 정수	4byte
		 *long 정수 8byte
		 *float실수 4byte
		 *double실수 8byte
		 * char 'a' 2byte
		 * String 클래스 ->문자열: "abc", "" 
		 */
		  // Scanner 클래스 를 이용하여
		 //사칙연산
		
		 /* System.out.println(35 + "+" + 38 + "=" + (35+38));
		  System.out.println(35 + "-" + 38 + "=" + (35-38));
		  System.out.println(35 + "x" + 38 + "=" + (35*38));
		  System.out.println(35 + "/" + 38 + "=" + (35/38.0));
		  System.out.println(35 + "%" + 38 + "=" + (35%38)); */
		  
		  // 변수의 이름생성 규칙
		  // 1. 인터넷 사이트의 회원가입시 아이디 만드는 규칙과 비슷함
		  // 2. 영문과 숫자, 그리고 일부 특수문자(_)를 섞어서 사용가능하지만
		  // 3. 첫글자는 반드시 영문으로 사용
		  // 4. 중간에 공백이 있을수 없음.
		  // 5. 너무 짧지 않게 약간의 의미를 부여해서 이름 생성하는 편임
		  // 6. 변수의 이름이 너무 짧으면, 변수의 갯수가 많아졌을때 서로의 용도를 구분하기 힘듬
		  // 7. 변수의 이름이 너무 길면, 사용할때마다 그 긴 이름을 타이핑해야하는 불편함이 있음.
		  // 8. 두가지 의미의 단어가 조합되어 변수이름이 만들어 진다면 첫단어는 소문자로, 두번째 단어첫글자 대문자로 생성
		  // ex) 덧셈의 결과 를 저장할 변수 이름 : plusResult
		  
		  //boolean - '참/거짓' 진위형 변수 
		  //int - 정수형 자료형1    4 Byte형 정수
		  //long - 정수형 자료형2  8 Byte형 정수
		  //float - 실수형 자료형1  4 Byte형 실수
		  //double - 실수형 자료형3  8Byte 형 실수
		  //char - 문자형 자료형-1 글자형 자료  'a', 'b'    2Byte
		  //String - 문자열 자료형: 현재는 자료형이라고 부르지만 엄밀히 자료형은 아니며 이후 객체단원에서 설명함
		  // 문자열 : "a", "Abc", "aBCD", ""
		

		 Scanner sc =new Scanner(System.in);
		System.out.println("연산할 두 수를 입력하세요1");
		System.out.println("num1 = ");
		int num1 = sc.nextInt();
		System.out.println("num2 = ");
		int num2 = sc.nextInt();
		int hap=num1+num2;
		int che= num1-num2;
		int gop =num1*num2;
		int moc =num1/num2;
		int na =num1%num2;
		System.out.println("연산자를 선택하세요 : 1.+ ,2.-, 3.x, 4./, 5.% ,6:all");
		int input = sc.nextInt();
		if(input == 1) {
			System.out.printf("%d + %d = %d\n",num1,num2,hap); 
		}
		if(input == 2) {
			System.out.printf("%d - %d = %d\n",num1,num2,che); 
		}
		if(input == 3) {
			System.out.printf("%d x %d = %d\n",num1,num2,gop); 
		}
		if(input == 4) {
			System.out.printf("%d / %d = %d\n",num1,num2,moc); 
		}
		if(input == 5) {
			System.out.printf("%d %% %d = %d",num1,num2,na); 
		}
		if(input ==6) {
		
			System.out.printf("%d + %d = %d\n",num1,num2,hap); 
			System.out.printf("%d - %d = %d\n",num1,num2,che);
			System.out.printf("%d x %d = %d\n",num1,num2,gop);
			System.out.printf("%d / %d = %d\n",num1,num2,moc); 
			System.out.printf("%d %% %d = %d\n",num1,num2,na); 
		}
		
		
	}

}
