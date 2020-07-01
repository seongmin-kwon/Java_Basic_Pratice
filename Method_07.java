package days08;

import java.util.Scanner;

public class Method_07 {
	static double pi = 3.141592;

	public static double calculate1(double ban) {
		double result = 0;
		result = ban * ban * pi;
		return result;
	}

	public static double calculate2(double ban) {
		double result = 0;
		result = 2 * ban * pi;
		return result;

	}

	public static void prn(double a, double b) {
		System.out.printf("입력한 원의 넓이는 %2.2f 입니다.\n", a);
		System.out.printf("입력한 원의 둘레는 %2.2f 입니다.", b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요:");
		double r = sc.nextInt();

		double n;
		n = calculate1(r);
		double d;
		d = calculate2(r);
		prn(n, d);

	}
}