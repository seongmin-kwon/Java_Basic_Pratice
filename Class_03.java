package days09;

class Animal {
	String name;
	int age;

	// 멤버 메서드 생성
	// 클래스 내부에는 해당 클래스가 제공할 수있는 기능을 정의 하기위해 메소드 생성할 수 있다.
	void output() {

		System.out.println("이름은" + name + "나이는" + age + "살 입니다.");
	}

	void input(String input_name, int input_age) {
		name = input_name;
		age = input_age;
	}
}

public class Class_03 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "댕댕이";
		a.age = 10;
		a.output();
		Animal b = new Animal();
		b.input("야옹이", 8);
		b.output();
	}
}
