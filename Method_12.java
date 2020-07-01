package days09;

public class Method_12 {

	
	public static void main(String[] args) {
		//참조변수와 기본형 자료변수는 모두 stack영역에 만들어진다.
		//new 인스턴스는 heap에 만들어진다.
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int total=0, fact;
		double avg;
		total = sum(a);
		avg = avg(a); // a는 배열의 이름 참조변수 임을 잊지마
		prn(total,avg);
	}
	
	public static int sum(int[] b) {
		//참조변수 a가 가진 값을 전달 인수로 전달 해서 배개변수인 b가 받았다
		//main 메서드에서 a의 이름으로 불리워지는 배열이, 지금 여기 sum메서드에서는 b라는 이름으로 사용
		int sum =0;
		for (int i = 0; i < 10; i++) {
			sum+=b[i];
		}
		return sum;
	}
	public static double avg(int[] a) {
		double avg;
		int total;
		total = sum(a);
		avg =total/a.length;
		return avg;
		//sum(a)/(double)a.length;
	}
	
	public static void prn(int total, double avg) {
		System.out.printf("합계: %d, 평균 %.2f",total,avg);
	}
}
