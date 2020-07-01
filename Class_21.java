package days11;
//java.lang에 있는애들기본으로 임포트되있음.
//static 메서드 : static 변수 같이 프로그램의 구동전에 메모리에 로딩되어 객체의 생성 없이 클래스의 이름을 사용해 호출할 수 있는 메소드
//사용 예
//1.간단한 공용의 기능을 제공하기위한 Math클래스

//미리만들어지고 객체와 상관없이 사용가능단 클래스 이름을 앞에 두고 (.) 으로 연결해서 사용
public class Class_21 {
	public static void main(String[] args) {
		int num = -1;
		System.out.printf("num= %d ,num 변수의 절대값 = %d\n",num,Math.abs(num));
		num=9;
		System.out.printf("num 변수의 제곱근 = %.2f\n",Math.sqrt(num));
		System.out.printf("Math클래스 난수 발생 스태틱메서드 값%d\n",(int)(Math.random()*10));
		//integer클래스(int 타입의 자료를 클래스화 즉 int 타입과 매핑 되는 클래스)
		//integer 클래스의 parseInt 메소드는 문자열로 되어있는 정수값을 int 타입으로 반환
		String strNum1="100";
		String strNum2="50";
		//문자열 결합
		System.out.println(strNum1+strNum2);
		//문자열의 값을 정수로 변환후 연산
	     System.out.println(Integer.parseInt(strNum1) + Integer.parseInt(strNum2));	
	     strNum1 = String.valueOf(1234);
	     System.out.println(strNum1);
	}
}
