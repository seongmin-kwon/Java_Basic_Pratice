package days03;

import java.util.Scanner;

public class control_08 {
public static void main(String[] args) {
	//전역 변수의 초기화시 자바 컴파일러는 if문에서의 초기화는 실행 x경우도 생각해 초기화를 인정하지 않는다.
	//switch   단순조건인데 개수가 많다
	//if else  다양한 조건으로 복잡한 필터링시
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 입력:");
	int a= sc.nextInt();
	switch (a) {
	case 0:
		System.out.println("안녕");
		break;
	}
	
	
}
}
