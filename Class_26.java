package days11;
//싱글턴 패턴

//특정 클래스의 객체를 반드시 한개만 생성할 수 있도록 강제하는 패턴
//즉 애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고(Static) 그 메모리에 인스턴스를 만들어 사용하는 디자인패턴.
//멤버필드값이 객체들간 스태틱변수가 아니면서일관된값을 가져야하고, 객체도 둘이상 더만들 필요가 없다
//하나의 객체(인스턴스)를 공유하며사용하는 싱글턴 방식이 사용된다.

//싱글턴 패턴 구현 
//단계1:생성자를 private로 보호
//단계2:클래스 내부에 생성자를 호출하여 생성한 객체를 선언합니다.
//static으로 선언합니다.
//단계3: 이객체도 private로 보호 합니다.클래스내부에서생성하는것이기에 private상관없이 생성가능
//단계4:생성해놓은 객체의 참조변수값을 리턴하는 public형의 메서드를 생성
//메서드 이름 getInstance() - static 으로 생성합니다.
class SingletonEx {
	int n1;
	int n2;

	private SingletonEx() {// 1
	}

	private static SingletonEx itc = new SingletonEx();

	// 2
	public  static SingletonEx getInstance() {// 3
		return itc;
	}
}

public class Class_26 {
	public static void main(String[] args) {
//		SingletonEx s1 = new SingletonEx();
//		SingletonEx s2 = new SingletonEx();
//		SingletonEx s3 = new SingletonEx();
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		SingletonEx s3 = SingletonEx.getInstance();
		SingletonEx s4 = s3;// 싱글턴은 이와같이 하나의 인스턴스를 공유해서쓰는것과 비슷합니다.
		System.out.println(s1); // 객체의 참조 변수를 print 하면 "클래스이름@해쉬코드가출력됨.
		System.out.println(s2);
		System.out.println(s3);
		//싱글톤 방식은 클래스 내부에 유일한 객체를 생성해두고(private static 으로 생성)
		//public Static으로 만들어진 getInstance() 메서드를 호출하고 리턴 받은 값으로 객체를 사용합니다.
		//셍성자 매서드는 static에 인스턴스 itc 만들때 최초 실행된 때 말고는 실행되지 않습니다.
		
		//싱글턴 패턴이 구현된 클래스의 활용
		//날짜,시간에 관련된 정보를 제공하는 Calendar:
		//클래스 싱글턴 패턴이 구현되어 new인스턴스를 사용하여 객체를 생성할 수 없음.
		//반드시 getLnstance메소드를 사용하여 객체를 반환 하여야함.
		
	}
	
	

}
