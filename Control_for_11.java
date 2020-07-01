package days05;

import java.util.Scanner;

public class Control_for_11 {
public static void main(String[] args) {
	// 두개의 숫자를 입력 받아 그 둘의 공약수 들을 출력
	//공약수: 두수의 공통된 약수
	//sol)작은 수만큼 반복하고 그두 수를 i와 비교 해서 배수인 관계 찾는다.
	
	Scanner sc =  new Scanner(System.in);
	System.out.println("두수 를 입력 받아 공약수를 출력 합니다.");
	int i=1;
	System.out.printf("입력1:");
	int input1= sc.nextInt();
	int k=0;
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
	
	for (i = 1; i <= small; i++) {
		if(small %i==0 && big% i==0) {
			
			System.out.printf("%d ",i);
			k=i;
			
			
		}
		
	}
	System.out.println();
	
	System.out.printf("%d와%d의 최대 공약수는 %d입니다.",small,big,k);
	
	
	}
}
