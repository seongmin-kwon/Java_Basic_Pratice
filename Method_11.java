package days09;

import java.util.Scanner;

public class Method_11 {
	public static void main(String[] args) {
		int n;
		int total, fact;
		
		n = myInput();
		total = sum(n);
		fact = fact(n);
		prn(total,fact);
		
	
	}
	public static int myInput() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇 펙토리얼을 구할까요?");
		int result = sc.nextInt();
		return result;
	}
	
	public static int sum(int n) {
		int sum=0;
		
		for (int i = 1; i <= n; i++) {
			sum+= i ; // sum =sum+i
		}
		return  sum;
		
	}
	public static int fact(int input) {
		int total=1;
		for ( int i =1; i <= input; i++) {
			total=total*i;
		}
		return total;
	}
		
		public static void prn(int total, int fact) {
			System.out.printf("합 %d\n",total);
			
			System.out.printf("factorial값:%d",fact);
		}
		
	}


