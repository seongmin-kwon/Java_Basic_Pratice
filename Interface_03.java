package days12;

//인터페이스의 상속 : 인터페이스끼리 부모 , 자식 상속의 관계를 생성할 수 있다.
interface Inter_C_Super1 {
	public abstract void interC1Test();
}

interface Inter_C_Super2 {
	public abstract void interC2Test();
}

//두개의 인터페이스를 상속받은 자식 인터페이스 생성(인터페이스끼리는 복수개의 상속이 가능)
//interface 자식 인터페이스명 extends 부모인토페이스명,...
interface Inter_C_Sub extends Inter_C_Super1, Inter_C_Super2 {
	// public abstract void interC1Test(); 상속받은 추상메서드
	// public abstract void interC2Test(); 상속받은 추상메서드
	public abstract void interCSubTest();
}

//클래스에서 다수개의 인터페이스를 구현할 수 있다.
//class 자식 클래스명 implements 인터페이스명 1 ,인터페이스명 2
//class Sub_C1 implements Inter_C_Super1, Inter_C_Super2 {
//	public abstract void interC1Test() {}
//	public abstract void interC2Test() {}
//}

public class Interface_03 {
	public static void main(String[] args) {
		
	}
}
