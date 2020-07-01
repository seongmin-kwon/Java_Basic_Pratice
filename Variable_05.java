package days02;

import java.util.Scanner;

public class Variable_05 {
public static void main(String[] args) {
	System.out.println("정수하나를 입력하세요:");
	Scanner sc = new Scanner(System.in);
	int num1=sc.nextInt();// 사용자에게 입력이있을때 까지 무한정 대기함.
	System.out.println("입력 정수는" + num1);
}
}
