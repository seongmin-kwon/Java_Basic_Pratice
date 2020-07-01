package days12;
/*
 * 추상 클래스
 * 상속을 통한 다형성의 구현에 강제성을 부여하기 위한 클래스
 * 
 * 상속의 문제점: 강제성의 부재
 * 상속을 통해 다형성(부모클래스를 상속받아 여러형태의 자식 클래스를 생성하고 활용함)을 구현하고자 하여도,
 * 하위클래스에서 메소드 오버라이딩을 구현하지 안흥면 다형성을 완벽히 구현할 수 없습니다.
 * 이때, 오버라이딩을 구현하지 않는것이 문법상 문제가 없다는점을 강제성의 부재라고합니다.
 */

class Animal3{
	public void sound() {}
}
		class Dog3 extends Animal3{
			public void sound() { System.out.println("멍멍멍멍멍~");}
		}
		class Cat3 extends Animal3{
			public void sound() { System.out.println("야옹야옹~");}
		}


public class Abstract_01 {
	public static void main(String[] args) {
		Animal3 dog =new Dog3();
				Animal3 cat =new Cat3();
				System.out.println("강아지소리");
					
	}

}
