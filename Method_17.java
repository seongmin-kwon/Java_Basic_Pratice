package days09;

public class Method_17 {
	public static void main(String[] args) {
		// cals 메서드 오버로딩해서 평균 이나 합계구하기
		cals("합계", 89, 89, 78, 67, 56, 43, 56, 78);

		cals("평균", 89, 89, 78, 67, 56, 43, 56, 78);
	}

	public static void cals(String s, int... args) {
		int sum = 0;

		if (s == "합계") {
			for (int i = 0; i < args.length; i++) {
				sum += args[i];
			}

			System.out.println(sum);
		}

		if (s == "평균") {
			for (int i = 0; i < args.length; i++) {
				sum += args[i];
			}

			System.out.println(sum / (double) args.length);
		}

	}
}
