package days06;

import java.util.Scanner;

public class ControlOp_Dowhile_02 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int isExit=0;
	do {
		int n1,n2,result=0,operator;
		System.out.println("1번째 정수를 입력하세요: ");
		n1 = sc.nextInt();
		System.out.println("2번째 정수를 입력하세요: ");
		n2 = sc.nextInt();
		System.out.print("계산할 사용할 부호를 입력하세요(1:+,2-,3:x,4:/  : )");
		operator =sc.nextInt();
		switch(operator) {
		case 1: result = n1+n2; break;
		case 2: result = n1-n2; break;
		case 3: result = n1*n2; break;
		case 4: result = n1/n2; break;
		}
	System.out.printf("result = %d\n",result);
	System.out.printf("계속 하실까요?(y:1  n=2) : ");
	isExit = sc.nextInt();
	} while (isExit!=2);
	System.out.println("프로그램 종료");
}
}
