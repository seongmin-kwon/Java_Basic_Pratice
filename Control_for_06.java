package days04;

import java.util.Scanner;

public class Control_for_06 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("값을 입력하세요(펙토리얼 연산)");
	int input= sc.nextInt();
	
	int k=1;
	int i = 1;
	int total =1;
	String s="";
	
	for ( i =1; i <= input; i++) {
		total=total*i;
	}
	
	for(int j =1;j<=input;j++) {
		if(j==input) {
			s+=j;
		}else s+=j+"x";
	}
	System.out.printf("%d! = %s =%d\n",input,s,total);
	System.out.printf("%d! =",input);
	
	for (k= input; k >1
			; k--) {
		System.out.printf("%dx",k);
	}
	System.out.printf("%d=%d\n",k,total*k);
	
	System.out.printf("%d! = %d",input,total);
	
 }
}
