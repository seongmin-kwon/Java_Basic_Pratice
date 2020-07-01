package days03;

import java.util.Scanner;

public class control_05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.printf("점수를 입력 하세요:");
	int score = sc.nextInt();
	if (score<0) {
		System.out.println("잘못된 입력입니다.");
	}else if (score>=90) {
		System.out.println("A학점");
	}else if (score>=80&&score<=89) {
		System.out.println("B학점");
	}else if (score>=70&&score<=79) {
		System.out.println("C학점");
	}
	else if (score>=60&&score<=69) {
		System.out.println("D학점");
	}
	else if (score<60) {
		System.out.println("F학점");
	}
		
	
	
	
	
}
}
