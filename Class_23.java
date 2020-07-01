package days11;

//인스턴스 메서드에서는 인스턴스 변수를 사용할 수있습니다
//인스턴스 메서드는 스태틱 변수를 사용할 수있습니다.
//스태틱 메서드는 인스턴수 변수를 사용할 수 없습니다.
//스태틱 메서드는 스태틱변수를 사용할 수있습니다.
class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	// 인스턴스 변수 : 객체가 생성될때 iv2가 생성 --> 이미 만들어져서 20을 저장하고 있는 cv값으로 초기화
	// static int cv2=iv; //에러지.. 언제 생성될지 모르는 인스턴스 변수 값으로 스태틱변수를초기화 할 수없다.
	static int cv2 = new MemberCall().iv; // 당장 너무 필요하면 이렇게 임시방편으로 객체 생성후 변수를사용하는것도 방법이다.
	// 래퍼런스 변수 없는 new 인스턴스를 만들어서 멤버변수 사용.

	static void staticMehod() {
		//System.out.println(cv);// 스태틱메서드는 스태틱 필드를 사용 가능
//		System.out.println(iv); //스테틱메서드는 인스턴스 변수사용 X
	//	System.out.println(new MemberCall().iv);// 억지로라도 쓰는방법
	}
		void instancemethod1() {
		//인스턴스 메서드는 인스턴스 변수 , 스태틱변수 ,인스턴스 메서드,스태틱 메서드 모두 자유롭게 사용가능
			System.out.println(cv);
			System.out.println(iv);
			
			
		}
		void instancemethod2() {
			staticMehod();
			instancemethod1();
	}
}

public class Class_23 {
	public static void main(String[] args) {

	}

}
