package days07;

import java.util.Scanner;

class Arrary_09{
	public static void main(String[] args) {
		//배열의 개수를 입력 받아 갯수 크기의 배열(a,b,c)생성
		// 각개수 만큼 a는 7의 배수 b는 8의 배수c 는 10의 이들의 합
		//배열 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("생성할 배열의 길이를 입력:");
		int input =sc.nextInt();
		int[] a = new int[input];
		int[] b = new int[input];
		int[] c = new int[input];
		
		for (int i = 0; i < a.length ; i++) {
			a[i]=(i+1)*7;
			b[i]=(i+1)*8;
			c[i]= a[i]+b[i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);	
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.printf("%d ",b[i]);
		}
		System.out.println();
		for (int i = 0; i <= c.length; i++) {
			System.out.printf("%d ",c[i]);
		}
		System.out.println();

		
	}
	}
