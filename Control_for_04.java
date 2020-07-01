package days04;

import java.util.Scanner;

public class Control_for_04 {
public static void main(String[] args) {
	// 구구단 만들기
	int i=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("출력할 단을 입력 하세요! :");
	int input = sc.nextInt();
	for ( i = 1; i <=9; i++) {
		System.out.printf("%d x %d =%d\n",input, i ,input*i);
	
	}
	
	
}
}
