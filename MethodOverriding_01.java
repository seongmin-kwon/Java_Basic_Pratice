package days12;

//오버로딩 vs 오버라이딩(상속 필수)

//상속이 일어났을때 만 발생하는 오버라이딩!
//오버라이딩 : 부모에게 받은게 잘 안맞아서 받은걸 재정의 해서 쓰자!
//메서드 오버라이딩은 자식 클래스에서 부모클래스의 메소드의 원형을 다시 정의하는 문법이다.
//메소드 오버라이팅을 구현하면, 부모클래스에서 물려받은 메소드는 무시되며, 새롭게 정의된자식의 메서드가 사용된다.
class Animal{
	public void crying() {
		System.out.println("울음 소리 !");
	}
}
class Dog extends Animal{
	public void crying(){
		super.crying();// 부모 의 원래 메서드 원하면 super.을 붙혀주어 사용
		System.out.println("멍멍멍 !");
	}
}
class Cat extends Animal{
	public void crying(){
		System.out.println("야옹야옹 !");
	}
}
public class MethodOverriding_01 {
	public static void main(String[] args) {
		Dog d =new Dog();
		Cat c =new Cat();
		
		d.crying();
		c.crying();
		
	}
}
