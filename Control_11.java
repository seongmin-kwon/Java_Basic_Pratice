package days04;

import java.util.Scanner;

public class Control_11 {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.printf("이름을입력하세요:");
	String name = sc.nextLine();
	System.out.printf("출생년도를 입력하세요:");
	int year = sc.nextInt();
	
	int age = 2020-year +1;
	if(age>0&&age>20) {
		System.out.printf("%s님은성인임으로 입장이 가능합니다.",name);
	}else {
		System.out.printf("%s님은 미성년자임으로 입장이 불가능합니다.",name);
	}
}
}

