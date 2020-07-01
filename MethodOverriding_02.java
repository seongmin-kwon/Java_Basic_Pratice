package days12;

//메소드 오버로딩
//1.상속관계 입니다.
//2.메소드의 메개변수의 타입, 개수, 순서가 다를경우 이름이같이 하여 오버라이딩합니다.
//3. 상속 관계에서만 사용할 수 있습니다.
//4. 부모클래스의 메소드의 원형과 반드시 일치해야 합니다.(리턴값의 타입, 메소드 이름,매개변수)
//5.접근 지정자는 축소될 수 없다.(다형성의 구현때문에)
//6.부모클래스의 final로 정의된 메소드는 오버라이딩 할 수없다!!!
class Animal2 {
	public void crying() {
		System.out.println("울음 소리 !");
	}
}

class Dog2 extends Animal2 {
	public void crying() {
		System.out.println("멍멍멍 ! ");
		super.crying();// 부모 의 원래 메서드 원하면 super.을 붙혀주어 사용 //울음소리
	}
}


class Cat2 extends Animal2 {
	public void crying() {
		System.out.println("야옹야옹 !");
		
	}
}

public class MethodOverriding_02 {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		Cat2 c = new Cat2();
		d.crying();
		c.crying();
		
		Animal2 a =d; //이럴경우 자식 메소드 적용되지!
		//a.super.crying(); 에러
		a.crying();
	}

}
