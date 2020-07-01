package days09;

class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
}

public class Class_02 {
	public static void main(String[] args) {
		Student std1 =new Student();
		std1.bun =1;
		std1.name = "홍길동";
		std1.kor=10;std1.eng=20;std1.math=30;
		std1.total=std1.kor+std1.eng+std1.math;
		std1.avg = std1.total /3.0;
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\n",std1.bun,std1.name ,std1.kor,std1.eng,std1.math,std1.total,std1.avg);
		
	}
}
