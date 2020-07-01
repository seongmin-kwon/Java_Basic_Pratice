package days10;
//생성자(constructor)
//클래스의 객체가 생성될때, 멤버필드의 초기화를 위해서 사용되는 메서드
//각각의 객체가 생성될때, 서로다른 메모리를 가지는 객체를 생성할 수 있게 합니다.
//this는 멤버변수를 식별하는 식별자 입니다.

//생성자의 특징
//1.이또한 메소드 입니다.  클래스와같은이름()
//2.클래스의 이름과 동일한 이름을 갓는 메소드 입니다.
//3.리턴값이 없는 메소드
//4.따로 정의(생성)하지 않아도 이미 클래스 내부에 자동으로 존재하는 매서드이다
//5.생성자는 각각의 객체가 생성될 때마다 호출되는 메서드입니다. Aclass a =new Aclass();
//6.주로 하는 일은 new 와 함께 클래스모습대로 객체가 저장될 heap메모리를 할당하고, 그안에 멤버변수를 만드는일을 합니다.
/*Aclass(){
  
	매개변수 가없는 생성자.
}
*/
class Aclass{
	private int age;
	
	Aclass(){
		System.out.println("생성자를이용해서 멤버변수 초기화");
		age=100;
		//매개변수 가없는 생성자.
	}
	Aclass(String a,int num){
		//매개변수 가없는 생성자.
	}
	//객체가 만들어질때만 호출 가능이기때문에 다른 메서드 처럼 호출객체와 함께 사용되지는 않습니다.
	//a1.Aclass();에러
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age; // 매개변수도 멤버변수와 이름이 같을땐 구분을 위해 this.을 붙혀라. 이는 클래스의 멤버변수를 의미
	}
	public void prn() {
		System.out.printf("나이:%d",getAge());
	}
}
public class Class_08 {
	
	public static void main(String[] args) {
		Aclass a1 =new Aclass();
		a1.prn();
		Aclass a2 =new Aclass();
		a2.prn();
	}
}
