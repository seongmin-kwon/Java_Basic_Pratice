package days03;

import java.util.Scanner;

public class control_04 {
public static void main(String[] args) {
	int year =0;
	int na ;
	Scanner sc = new Scanner(System.in);
	System.out.printf("출생년도 입력:");
	year = sc.nextInt();
	na =2020 - year +1; //만나이 구하기
	if(year<=0){
		System.out.println("잘못된 입력입니다.");
	}else if(1<na&&na<12) {
		System.out.println("어린이입니다.");
	}else if(12<=na&&na<18) {
		System.out.println("청소년입니다.");
	}else if(19<=na&&na<25) {
		System.out.println("청년입니다.");
	}else if(na>=25){
		System.out.println("성인입니다.");
	}else  {
		System.out.println("잘못된 입력입니다.");
	}
}
}
