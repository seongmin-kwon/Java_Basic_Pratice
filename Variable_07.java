package days02;

import java.util.Scanner;

public class Variable_07 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("반지름을 입력하세요:");
	int r =sc.nextInt();
	double pi =  3.141592;
	

	double res1 =(r*r)* pi;
	double res2 =2* pi*r;
	System.out.printf("입력한 원의 넓이는 %.2f 입니다.\n",res1);
	System.out.printf("입력한 원의 둘레는 %.2f 입니다.",res2);
	
}
}
