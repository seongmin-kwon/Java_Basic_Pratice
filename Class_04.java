package days09;

class Student1 {
	int bun;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	void init(int input_bun, String input_name, int input_ko, int input_eng, int input_math) {
		bun = input_bun;
		name = input_name;
		kor = input_ko;
		eng = input_eng;
		math = input_math;
		total = kor + eng + math;
		avg = total / 3.0;
	}

	void prn() {
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\n", bun, name, kor, eng, math, total, avg);

	}
}

public class Class_04 {
	public static void main(String[] args) {
		Student1 std = new Student1();
		std.init(1, "홍길동", 56, 87, 98);
		std.prn();

	}
}
