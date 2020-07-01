package days12;
//추상클래스
//상속을 통한 다형성의 구현에 강제성을 부여하기위한 클래스- 추상메소드를 포함한 클래스
//추상메서드 :메서드의 원형만 존재하고 실제 내용이없는 메소드
//작성법
//abstract 리턴값의 타입 메소드명(매개변수);
//추상클래스는 일반클래스와 같으며 추가로 추상메소드를 포함 시킬수 있는  특징이 추가된 클래스이다.
//추상클래스는 상속을 통한 다형성 구현을 위해 생성됩니다.
abstract class Animal_A{
	public abstract void sound();
}
//추상메서드는 자식 클래스에서 새롭게 재정의 될 수 있습니다.
//추상메소드들을 오버라이딩한 자식클래스는 일반클래스로 사용될수 있습니다.

class Dog_A extends Animal_A{
	public void sound() {
		System.out.println("멍멍");
	}
}
//오버라이드 하지않으면 에러가생김. 즉 강제적으로 상속받는자식에게 오버라이딩을 강제함
class Cat_A extends Animal_A{

	@Override 
	public void sound() {
		System.out.println("야옹");
		
	}
	
}





public class Abstract_02 {
	public static void main(String[] args) {
		Animal_A dog = new Dog_A();
		Animal_A cat = new Cat_A();
		System.out.println("강아지 소리");
		dog.sound();
		System.out.println("야옹이 소리");
		cat.sound();
		//추상클래스는 상속을 총한 다형성의 구현을 위해서만 사용합니다.
	
	}
}
