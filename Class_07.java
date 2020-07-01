package days10;
//멤버메서드의 주된 목적은 멤버변수의값을 초기화 하거나,얻어오는 2목적이크다.
//때문에 멤버메서드를 별도의 사유가 없어도 멤버변수에 따라 필요한 만큼 만들고 시작하는 경우가 많다.
//메서드 이름은 setter,geter두개 입니다.
//private으로 선언된 인스턴스 필드의 접근을 위해 getter,setter를 사용한다.
//setter은 메인함수에서 인스턴스 필드에 접근하는 함수로 매개변수로 멤버 변수를 초기화함.
//getter도 메인함수에서 인스턴스 필드에 접근하는 함수로 포기화된 멤버변수를 return 함
//이때 멤버변수가 어떤 값으로도 초기화 되지 않았다면 null을 리턴함.

class Test{
	private int num;
	private double dou;
	private String str;
	
	public void prn() {
		System.out.println("hello world");
	}
//개터 세터 자동완성 source ->generate getter and setter선택

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getDou() {
		return dou;
	}

	public void setDou(double dou) {
		this.dou = dou;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}


public class Class_07 {
	public static void main(String[] args) {
		Test t =new Test();
		t.setNum(3);
		System.out.printf("정수:%d",t.getNum());
		t.setDou(3.14);
		System.out.printf("정수:%f",t.getDou());
		t.setStr("hello world");
		System.out.printf("정수:%s",t.getStr());
		
		
	}

}
