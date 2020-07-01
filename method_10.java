package days09;

import java.util.Scanner;

public class method_10 {

	public static int myInput(int i) {
		int result = 0;

		Scanner sc = new Scanner(System.in);
		if (i == 1) {
			System.out.printf("국어 점수를 입력:");
			result = sc.nextInt();
			return result;
		}
		if (i == 2) {
			System.out.printf("영어 점수를 입력:");
			result = sc.nextInt();
			return result;
		}
		if (i == 3) {

			System.out.printf("수학 점수를 입력:");
			result = sc.nextInt();
			return result;
		} else
			return 0;

	}

	public static int sum(int a, int b, int c) {
		int sum = a + b + c;

		return sum;
	}

	public static double avg(int sum) {
		double avg = sum / 3.0;
		return avg;
	}

	public static void prn(int sum, double avg) {
		String hac = "";
		if (avg < 0) {
			System.out.println("잘못된 입력입니다.");
		} else if (avg >= 90) {
			hac = "A학점";
		} else if (avg >= 80 && avg <= 89) {
			hac = "B학점";
		} else if (avg >= 70 && avg <= 79) {
			hac = "C학점";
		} else if (avg >= 60 && avg <= 69) {
			hac = "D학점";
		} else if (avg < 60) {
			hac = "F학점";
		} else {
		}
		System.out.printf("총점: %d "
				+ "평균 %.2f인 %s 입니다.", sum, avg, hac);
	}

	public static void main(String[] args) {
		int kor, eng, math, total;
		double avg;
		kor = myInput(1);
		eng = myInput(2);
		math = myInput(3);
		total = sum(kor, eng, math);
		avg = avg(total);
		prn(total, avg);

	}
}
