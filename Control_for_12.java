package days05;

import java.util.Scanner;

public class Control_for_12 {
public static void main(String[] args) {
	//두개의 숫자를 입력 받아 그둘의 공배수들과 최소 공배수 출력
	Scanner sc =  new Scanner(System.in);
	int[] a=new int[100];
	System.out.println("두수 를 입력 받아 공약수를 출력 합니다.");
	int i=1;
	System.out.printf("입력1:");
	int input1= sc.nextInt();
	int k=0;
	int k1=1;
	int k2=1;
	System.out.printf("입력2:");
	int input2= sc.nextInt();
	int small =0;
	int big=0;
	
	if(input1<input2) {
		small=input1;
		big= input2;
	}else {
		small=input2;
		big= input1;
	}
	System.out.printf("big: %d\n",big);
	System.out.printf("small: %d\n",small);
	
	for (i = 1; i <= 50; i++) {
		System.out.printf("%d ",i*small);
		k1=i*small;
		
		
	}
	System.out.println();
	
	for (i = 1; i <= 50; i++) {
		System.out.printf("%d ",i*big);
		k2=i*big;
	}
	
	System.out.println();
	
	System.out.printf("%d와%d의 최소 공배수는 %d입니다.",small,big,(small*big));
	
	
	}
}

