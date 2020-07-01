package days12;
//상위 클래스 와 하위 클래스 간의 타입 캐스팅
//자식 레퍼런스를 부모레퍼런스에 줄수 있다
//자식인스턴스의 주소를 받은 부모 레퍼런스 변수는 자식
//부모클래스의 객체 접근할때 상속해준것만쓸수 있다. 자식은
// 자식클래스의 멤버에는 접근할 수 없음
// super2.subNum = 10;(에러)

// 부모 클래스 레퍼런스 변수  <-  Heap영역에 new로 만들어진 자식인스턴스의 주소
// SuperF super = new SubF();
// SuperF super;  SubF sub = new SubF();  super = sub;
// super.superNum = 300; O    super.subNum = 300; X

// 만약 부모클래스의 레퍼런스 변수를 자식클래스의 객체를 참조하려는 경우
// 강제 캐스팅을 사용하여 자식클래스의 레퍼런스 변수에 부모의 레퍼런스 값을 대입할 수 있습니다.
// SubF sub2 = (SubF)super1;  // 현재 에러가 표시되지는 않음 -> 실행시 런타임 에러
// 다만 실제 Heap 저장된 인스턴스의 타입이 자식 클래스가 아니면 프로그램 실행중 런타임 에러가 발생되어
// 프로그래밍 종료 됩니다.
// 따라서 부모레퍼런스값을 자식 레퍼런스에 넣을 수 있는 경우를 선별해야 하는데
// 현재의 부모 레퍼런스변수가 저장한 주소에 자식 인스턴스가 저장된 경우로 제한합니다.




class SuperF{
	int superNum;
	
}

class SubF extends SuperF{
	int subNum;
}

public class TypeCasting_02 {
	public static void main(String[] args) {
		SuperF super1 =new SuperF();
		SubF sub1 =new SubF();
		
		SubF super2 =sub1;
		super2.subNum = 10;
		// 부모 REF = 자식 REF  가능하다는것 들어간다는건 CASTING 되는것이한뜻
		//super.superNum =300; yes!  super.subNum =300 no!
		
		
		//만약 부모클래스의 레퍼런스 변수를 자식 클래스의 객체를 참조하려는경우
		//강제 캐스팅을 사용하여 자식 클래스의 레퍼런스 변수에 부모 레퍼런스 값을 대입할 수 있습니다.
		//SubF sub2 =(SubF)super1;
		//다만 실제 heap 저장된 인스턴스의 타입이 자식 클래스가 아니면 프로그램 실행중 런타임 에러가발생되어 프로그램이 종료됩니다.	
		//현재의 부모 레퍼런스 변수가 저장한 주소에 자식 인스턴스가 저장된 경우로 제한합니다.
		
		SubF sub2 =(SubF)super2;
		//자식 레퍼런스 <- 부모 레퍼런스 <- 자식 인스턴스의 주소
		SuperF super4 = new SuperF();
		if(super4 instanceof SubF) {
			SubF sub4 =(SubF)super4;
			System.out.println("형변환 성공~!");
			
		}else {
			System.out.println("형변환을 실행할 수 없습니다.");
			//실제 인스턴스가 자식 클래스형이라면 가능하지만 아니라면 런타임 에러!
		}
		
		SuperF super5 = new SubF();
		if(super5 instanceof SubF) {
			SubF sub4 =(SubF)super5;
			System.out.println("형변환 성공~!");
			
		}else {
			System.out.println("형변환을 실행할 수 없습니다.");
			//실제 인스턴스가 자식 클래스형이라면 가능하지만 아니라면 런타임 에러!
		}
		
		}
}
