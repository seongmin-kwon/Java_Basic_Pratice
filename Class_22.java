package days11;
//static 변수, static 메서드,인스턴스 변수 ,인스턴스 메서드
class Mymath{
	int a,b;
	static int c = 0;
	Mymath(){ c++;}
	//인스턴스 메서드들은 인스턴스 변수들을 자유롭게 사용 가능합니다.(기존 방식)
	int add(int e,int d) {return e+d+c;}
	int subtract(int e, int d,int c){return e-d +c;}
	int multiply(int e, int d) {return  e*d +c;}
	double divide(double e, double d ) {return e/d +c;}
	//인스천스 메서드에서는 스태틱변수를  자유롭게 사용할 수 있습니다.
	//인스턴스 메서드는 객체생성시 만들어짐멤버 인스턴스들은 언제 생길지도 모르니 스테틱함수에서 쓰면 안됨
	void init() {
		a = c*100;
		b= c*100;
	}
	
		//그러나 스태틱 메서드는 인스턴스 변수를 사용할 수 없습니다. 스태틱 변수만 사용 가능 합니다.

}  

public class Class_22 {
	public static void main(String[] args) {
		Mymath mm =new Mymath();
//		mm.a =200;
//		mm.b=100;
		mm.init();
		System.out.println(mm.add(1,21));
		System.out.println(mm.subtract(2,1,1));
		System.out.println(mm.multiply(2,1));
		System.out.println(mm.divide(3.0,6.0));
	}

}
