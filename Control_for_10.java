package days05;

import java.util.Scanner;

public class Control_for_10 {
public static void main(String[] args) {
	//10개 입력받고 그들의 합을 계산.
	Scanner sc = new Scanner(System.in);
	int i =0;
	int input;
	int sum1 = 0;
	
	for (i = 1; i <= 10; i++) {
		System.out.printf("숫자를 입력 하세요: ");
		input =sc.nextInt();
		sum1+=input;
		System.out.printf("입력 %d: %d\n",i,sum1);
		
	}
	
	}
}
