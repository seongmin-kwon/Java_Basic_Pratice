package days02;

public class Variable_03 {
	public static void main(String[] args) {
		//변수의 선언 위치 : 변수의 사용 전이라면 위치에 관계 없이 변수를 선언 할 수 있음
		//변수는 반드시 선언(생성) 후에 사용할 수 있으며 선언전에 사용하는 변수는 오류
		int n1=10;
		System.out.println("프로그램 시작 n1변수의 값: "+n1);
		n1=20;
		System.out.println("n3 변수의 값");
		n1=30;
		System.out.printf("n1="+ n1);
		//변수의 값은 여러번 대입 할 수 있으며 저장되는 값은 가장 최근 마지막에 저장한 값이 저장되어 사용.																																																																	
	}

}
