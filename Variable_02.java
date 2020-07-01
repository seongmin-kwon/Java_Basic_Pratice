package days02;

public class Variable_02 {
	 // 정수형 : byte(1), short(2), int(4 - 기본형) -21억~21억, long(8)
	 // 실수형 : float(4), double(8 - 기본형)  ±10의 -308승 ~ ±10의 308승 까지
	 // 문자형 : char(2 - 유니코드 지원)
	 // 진리형 : boolean(1 - true/false의 값만 저장할 수 있음)
	 // 문자열 : String(클래스, 정해진 크기가 없음)
	 public static void main(String[] args) {
	  // 4 바이트의 크기로 정수형을 저장할 수 있는 변수 선언
	  // 임의의 메모리 공간 4 바이트를 확보하고, 해당 공간에 num 이라는 이름을 붙임
	  int num;
	  // 변수에 값을 할당 : 대입연산자 = 을 활용  // A = B;  우항 B의 값을 좌항 A에 대입하는 역할
	  num = 100;
	  // 변수가 저장하고 있는 값을 참조하는 방법 : 변수명으로 값을 참조
	  System.out.printf("num = %d\n", num);
	  System.out.println("num = " + num);
	  // 변수의 다양한 선언 방법
	  // 1. 변수의 선언 후, 값을 할당
	  int n1;
	  n1 = 10;
	  // 2. 변수의 선언과 값의 대입을 동시에 처리
	  int n2 = 20;
	  // 3. 다수개의 변수를 선언하는 방법 (동일한 자료형만 가능)
	  int n3, n4, n5;
	  // 4. 다수개의 변수를 값을 대입하면서 생성하는 방법
	  int n6 = 60, n7 = 70;
	  // 5. 처음부터 모든 변수에 값을 대입할 필요는 없음
	  int n8, n9 = 90, n10;
	 }
}
