package days11;

class StaticF {
	private static int num =1;
	//인스턴스블록은 객체를 만들어야만 실행됨!
	{ // 객체가 만들어질때 실행(생성자와 성격이 비슷함.)
		System.out.println("생성자없이 인스턴스변수를 초기화 하고싶을때 초기화 블록사용");
	}
	
	StaticF(){
		num=-1;
		System.out.println(this.num);
	}
	static {//static 블록 static 멤버 변수를 초기화 하기위한 영역 객체없이도 실행됨
		//단순값으로 초기화하는경우 대입연산자를 통해서 처리 가능.
		//실행문이 포함된 초기화를 진행 하는 경우 아래와 같이 초기화 과정을 정의할 수 있음.
		System.out.println("static 블록  실행"); // 따로 사용못해 그러니까 스태틱 블록에 넣어 주어야 가능해!
		num=55;
	}
}

public class Class_25 {
	public static void main(String[] args) {
	}
}
