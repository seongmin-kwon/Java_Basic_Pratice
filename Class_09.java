package days10;

class Bclass{
	private int age;
	//클래스 내부에 생성자를 꺼내어 따로 정의 하지 않으면,컴파일러는 자동으로 숨어있는 디폴트 생성자를 호출함.
	//디폴트 생성자 : Bclass(){}와 같이 생긴, 메모리 할당 이외에 아무일도 하지 않는 생성자.
// 보이진 않지만 여긴 디폴트 생성자가 자동으로 생성되어있는것이다. Bcalss(){}
	//아래와 같이 생성자를 따로 정의 하는것은, 아무것도 하지않는것과 같다.
	Bclass(){
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}


public class Class_09 {
	public static void main(String[] args) {

	}
}
