package days02;

public class Print_05 {

	public static void main(String[] args) {
		int total = 85+56+78;
		double avg = total/3.0;
		System.out.println("\t\t###성적표###");
		System.out.println("----------------------------------------");
		System.out.println("번호\t성명\t  \t국어 영어 수학 총점 평균");
		System.out.println("----------------------------------------");
		System.out.println(" 1\t권성민  \t100 90 80 " +(total)+ (avg));
		System.out.printf(" 2\t김성민  \t%d %d %d %d %.1f\n ",85, 56, 78, total, avg);
		System.out.printf("3\t전지현  \t%d %d %d %d %.1f\n ",85, 56, 78, total, avg);
		System.out.println("----------------------------------------");
	}

}
