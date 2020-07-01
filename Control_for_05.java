package days04;

import java.util.Scanner;

public class Control_for_05 {
public static void main(String[] args) {
	//두개의 정수 a b 를 입력 받아 a부터 b까지의 출력
	Scanner sc= new Scanner(System.in);
	System.out.println("첫정수 입력 :");
	int input1 = sc.nextInt();
	
	System.out.println("두번째정수 입력 :");
	int input2 = sc.nextInt();
	for (int i = input2; i >=input1; i--) {
		System.out.println(i);
		
	}
	
}
}
