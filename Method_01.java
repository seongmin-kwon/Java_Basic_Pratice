package days08;
//method : Function이라고 부르며 , 간헐적으로 반복되는 코드 단위를별도로 정의 하고 그이름을 재사용하여 코드 실행의 재사용성을 높힌다.
//특징
// 명령들이 모여서 기능을 정의하는 단위. -- 기능!
//메소드의 생성은 반드시클래스의 내부에서만 선언할 수 있습니다.
//메소드는 선언된 이후, 메소드를 이름으로 호출해야만 메소드의 실행코드들이 실행됩니다.
//
public class Method_01 {  //하나의 프로그래밍 단위
	
	
	public static void myPrint() {
		System.out.println("나의 출력 메서드");
	}
	public static void main(String[] args) { //main 메서드 프로그램의 시작과 끝을 정의하는 메서드
		System.out.println("프로그래밍 시작");
	myPrint();
	
}



}
