package days08;

import java.util.Scanner;

public class Method_08 {

	public static boolean yoon(int year) {
		int check1 = year % 4; // 조건1
		int check2 = year % 100; // 조건2
		int check3 = year % 400; // 조건3
		if ((check1 == 0 && check2 != 0) || (check3 == 0)) {

			return true;
		} else {

			return false;
		}
	}

	public static void prn(boolean a) {
		if (a == true) {
			System.out.printf("입력연도는 윤년입니다.");

		} else {

			System.out.println("입력연도는 평년입니다.");
		}
	}

	public static void main(String[] args) {
		int year;
		boolean a;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력:");
		year = sc.nextInt();
		a = yoon(year); // 년도를 전달인수로 전당 윤년 true 평년 false리턴
		prn(a);

	}
}
