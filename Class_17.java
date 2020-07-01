package days10;
//static 키워드 -정적의의미
//-> 프로그램 시작전에 다만들어짐! 
//클래스(중첩클래스에서만 사용 가능) , 멤버변수 , 멤버메소드에 적용할 수 있는 키워드
//정적변수(클래스 변수) ,정적메소도(클래스 메소드)를 선언할 때 사용

//자바프로그램 구동 과정
//1.JVM에 의해서 실행할 모든 클래스중 Static 메소드, static 멤버 필드를 수집해서 메모리에 로딩
//프로그램의 시작(main에 메소드의 실행)전에 메모리 적재
//2.메모리에 로딩된 static 메소드중 main 이름을 검색
//3.main 메소드가 검색 되었다면 JVM해당 main 메소드를 호출하여 프로그램 시작

//staitic 필드/메소드의 특징
//프로그램의 구동 전부터 메모리를 확보하고 있는 멤버 필드 및 메서드
class StaticA{
	int num; //멤버변수의 선언 -동적 변수
	static int number =100;  // 멤버변수 선언 -정적 변수
}
//-동적변수와 정적변수의 구분 기준은 생성 시기로 나뉩니다.
//-위에 선언한 동적 변수는 StaticA클래스 형태의 객체가 생성될때(=StaticA();)생성되는 변수이고,
//-정적변수는 main() 메서드 실행전에 자동으로 미리 생성되는 변수 입니다.



public class Class_17 {

	public static void main(String[] args) {
		//main 메서드 실행전 스태틱 변수는 이미 생성되 있습니다.
		System.out.println(StaticA.number);
		//다만 클래스 외부에서 static 변수에 접근하여면 위와 같이 클래스 이름과 함께 사용합니다.
		//동적 변수와 마찬가지로 private 으로 보호 되지 않았다면 임의 접근이 가능하고
		StaticA.number = 10;
		System.out.println(StaticA.number);
		//private로 보호된 static 변수는 static 메서드를 사용하여 값을 저장하거나 얻어냅니다.
		//동적변수는 객체가 생성되지 않으면 사용x 
		StaticA a  = new StaticA();
		a.num=200;
		System.out.println(a.num);
		//객체생성전에 꼭 동적변수 사용을 원하면 아래와 같이 사용해야한다!
		new StaticA().num = 500;
		//이와 같은 사용은 참조변수가 없기 때문에 이후에 다시 재활용이 안됩니다.!!
		
		//동적변수는 객체가 생성될때마다  내부에서 생성되어 객체 개수만큼 생성되지만
		//정적변수는 객체 개수와 상관없이 단한개만 생성되어 계속 값이 유지 됩니다.
		 
		
		StaticA a1= new StaticA();
		StaticA a2= new StaticA();
		StaticA a3= new StaticA();
		a1.num = StaticA.number++;
		a2.num = StaticA.number++;
		a3.num = StaticA.number++;
		System.out.println(a1.num);
		System.out.println(a2.num);
		System.out.println(a3.num);
		//멤버 변수는 객체마다 하나씩 존재하고 static 변수는 프로그램 통틀어 하나만 존재함을 뜻함.
		
	}
}
