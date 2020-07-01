package days10;
class Cclass{
	private int age;
	Cclass(){
		// 생성한 클래스에 1개라고 생성자를 선언하면 보이지않던 디폴트 생성자는 사라지기에
		//직접 디폴트생성자를 넣어주어야한다
		this.age=40;
	}
	Cclass(int age){
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

//셍성자는 메소드 이므로 매개변수를 사용할 수있습니다.
public class Class_10 {
	public static void main(String[] args) {
		Cclass c1 =new Cclass(10);
		Cclass c2 =new Cclass(20);
		Cclass c3 =new Cclass(30);
		
	}
}
