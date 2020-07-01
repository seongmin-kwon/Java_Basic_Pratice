package days09;

import java.util.Scanner;

public class Method_09 {
	public static double a(int input, int height) {
			double	result =(input*height)* 0.5;
				return result; 
	}
	
	public static void prn(double result) {
		System.out.printf("입력한 삼각형의 넓이는 %.1f 입니다.",result);
	}
	
	public static int scan(int input) {
		Scanner sc = new Scanner(System.in);
		if(input ==1) {
	
			System.out.println("밑변의 길이를 입력하세요:");
			int num1=sc.nextInt();
			return num1;
		}
		if(input ==2) {
			
			System.out.println("높이를 입력하세요:");
			int num1=sc.nextInt();
			return num1;
		}else
			return 0;
		
		
	}
	
	public static void main(String[] args) {
		
		//밑변과 높이를 입력 받아 삼각형의 넓이를 계산하여 출력하는 메서드.
		 int k=scan(1);
		 int i =scan(2);
		 prn(a(k,i));
		 
		
	
	}
}
