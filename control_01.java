package days03;

import java.util.Scanner;

public class control_01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=0;
	while(i<=3) {
	System.out.println("정수 입력:");
	int input = sc.nextInt();
	int result = input %2 ;
	if(result ==0) {
		System.out.printf("정수 : %d 짝수 입니다.\n ",input);
		
	}else {
		System.out.printf("정수 : %d 홀수 입니다.\n ",input);	}
	i++;
}
}
}
