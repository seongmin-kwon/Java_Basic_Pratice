package days08;

public class Method_02 {

// 매배변수 메서드 호풀시 메서드가 필요로하는 데이터를 전달해주는 매개역할의 변수
	public static void myPrint() {
		System.out.println("나의 출력 메서드");
	}
	
	public static void main(String[] args) {
		myPrint();
		myPrintWith2Int(10,20); // 10 20 은 전달인자이다.
	}
	//public: 공용의 의미 누구나 사용 가능 메서드 앞에 표기
	//static : 정적 의미 처음부터 만들어지는 이라는 의미로 추후 객체지향에서 배움
	//void : 빈 리턴값이 없다는 의미. 메서드 관련 이후 예제에서 공부
	public static void myPrintWith2Int(int n1 ,int n2 ) {
		System.out.println("전달 값1: " +n1 +"전달 값2:" +n2); //n1 n2는매개변수 라한다.
	}
	//c와 다른점이 이런 부분이다. c는 반드시 위에 선언이라도 해줘야 하지만 자바는 어디든 상관 없다.
	//전달인수는매개변수의 수 와 타입에 맞게 사용해야 에러안남.
	//전달 순서 역시 지켜줘야한다.
}
