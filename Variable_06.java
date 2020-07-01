package days02;

import java.util.Scanner;

public class Variable_06 {
public static void main(String[] args) {
	//밑변의 길이를 입력하세요:
	//높이를 입력하세요:
	//입력한 삼각형의 넓이는 xx입니다(소수점1자리까지)
	Scanner sc = new Scanner(System.in);
	System.out.println("밑변의 길이를 입력하세요:");
	int num1=sc.nextInt();
	
	System.out.println("높이를 입력하세요:");
	int height=sc.nextInt();
	double result =(num1*height)* 0.5;
	System.out.printf("입력한 삼각형의 넓이는 %.1f 입니다.",result);
	
   }
}
