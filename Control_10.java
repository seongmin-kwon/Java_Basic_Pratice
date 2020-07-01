package days04;

import java.util.Scanner;

public class Control_10 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("기본급을 입력하세요: ");
	int input = sc.nextInt();
	
	if(input>1000000) {
		System.out.println(input+((int)(input*0.5))+"원");
	}else {
		System.out.println(input+((int)(input*0.6))+"원");
	}
	
	
	
}
}
