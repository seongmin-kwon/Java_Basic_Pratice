package days06;

import java.util.Scanner;

public class ControlOp_DoWhile_01 {
public static void main(String[] args) {
	int i =0;
	Scanner sc = new Scanner(System.in);
	int input;
	do {
		System.out.println("start");
		i++;
	}
	while(i<10);
	{
		System.out.println(i);
		i++;
	}
	do {
		System.out.println("정수입력:");
		input =sc.nextInt();
		input = sc.nextInt();
	} while(input!=100); {
		System.out.println("프로그램 종료");
	
	}
   }
}
