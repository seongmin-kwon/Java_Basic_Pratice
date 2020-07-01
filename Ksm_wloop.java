package days05;

import java.util.Scanner;

public class Ksm_wloop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.printf("메뉴를 선택: 1(저장),  2(불러오기),  3\"q\"를입력 하여 종료");
	String s ="";
	while(!(s .equals("q"))){
	s= sc.nextLine();
	System.out.printf(s);
	}
	System.out.println("프로그램 종료");
	
	
}
}

