package days12;
//자바는 단일상속만을 지원합니다. 

//여러개 상속하고 싶으면 a->b->c방식의 수직 구조로 만들곤 했다.
//이런다중상속을 편하게 하기위해 인터페이스(interface 사용한다.)
//인터페이스도 클래스 o ->제약있는 클래스
//인터페이스도 멤버필드public static final멤버만가짐
//인터페이스는 멤버베소드로 public abstract메소드만 가질 수  있다.
//비로소 다중상속이 가능하다.

//class 만들듯 생성, class란 키워드 대신 interface사용
interface Inter_A {
	public static final int n1 = 10;

	// int n1 ->에러
	public abstract void test();
	// public Inter_A(){} -->에러
}

//인터페이스를 구현하는 자식클래스의 선언
//class자식클래스명 implements로 부모인터페이스명
//으로 인터페이스를 상속하는 클래스는 상속할 클래스 앞에 extends대신 implements를 씁니다.
class Sub_A implements Inter_A{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		
	}

	
	
}

public class Interface_01 {
	public static void main(String[] args) {
		//인터페이스는 객체를 생성할 수 없습니다.
		//1. 생성자가 없기 때문에 객체생성 불가.
		//2.추상메소드를 포함할수 있기때문에
		//inter_A a= new Inter_A() --> 에러
		//상속을 통한 다형성 구현에만 인터페이스가 활용됨
		Inter_A a= new Sub_A();
		//부모  인터페이스의 레퍼런스를 사용하여 자식 클래스의 오버라이딩된 메소드를 호출
		a.test();
	}
}
