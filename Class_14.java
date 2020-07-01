package days10;
//전달인수로 객체 매개변수로 객체  객체도 자료형이닷!
//클래스의 멤버필드들은 new 라는 키워드에의해서 각가그이 객체별로생성됩니다.(서로다른 메모리 영역)

//반면,멤버메서드는 생성된(오버로딩 포함 )메서드별로 하나만 존재하며 모든 객페들이 공유하게 됩니다.
//이때 현재 메서드들 호출 객체가 어껀 객체인지 구분하여 실행될 수 있게 this라는 숨겨진 참조변수를 제공합니다.

class ThisA {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		// this 에는 현재 메서드를 호출한 객체의 참조 변수값이 전달되어 저장됩니다.
		// 매개변수로 선언된 num 변수는 현재 매서드안에서만 사용되는 지역 변수로만 사용되고 소멸합니다.
		// 멤버 메서드에서는 멤버변수에 접근 권한이 있으므로, 참조변수 this와 변수(.)으로 연결되어 사용됩니다.
	}

	public void display() {
		// 보통 멤버변수를 this없이 사용해도 매개변수가 아니라면 아래의 실행 코드는 내부적으로 this 사 붙어서
		// 다음과 같이 변환되어 실행 됩니다.
		// System.out.printf("num =%d\n" this.num);
		System.out.printf("num = %d\n", num);
	}
	//this 1.멤버메서드를 호출한 호출객체의 참조변수값(주소값)을 전달받아 사용한다.
	public void copy1(ThisA b) { //this <== a4,b<--a2
		this.num =b.num;
	
	}
	//객체가 리턴 값인 멤버 메서드 -객체의 복사 방법2
	public ThisA copy2() { //this< - a1  반환형이 객체
		ThisA a=new ThisA();
		a.num = this.num;
		return a;
		
	}
}

public class Class_14 {
	public static void main(String[] args) {
		ThisA a1 = new ThisA();
		ThisA a2 = new ThisA();
		a1.setNum(10);
		a2.setNum(20);
		a1.display();
		a2.display();
		ThisA a3 =new ThisA(); //새로운 공간 
		a3=a1;
		a3.display();
		ThisA a4 =new ThisA(); 
		a4.copy1(a2);//객체 복사 방법실제적인복사로 전달인수가 다른 메모리상에 있는 객체의 참조변수
		a4.display();
		
		ThisA a5 =a1.copy2();
		a5.display();
		a1.setNum(1);
		a1.display();
		a2.copy1(a1);
		a2.display();
		a3=a1;
		a3.display();
		System.out.println(a3);
	}
}
