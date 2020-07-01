package days10;
//this 의 용도 2
//this()는 자기 자신의 생성자를 호출할 때 사용하며 호출하는 곳의 첫 번째 문장에 작성해야 한다.


class ThisB {
	private int num1;
	private int num2;
	private int num3;

	ThisB(int n){
		this.num1 =n;  //this <--- b1이 갖고 있는 주소 전달
		System.out.println("ThisB클래스의 생성자1가 호출되었습니다.");
	}

	ThisB(int n1, int n2) {
		//this.num1 =n1;
		//생성자 사이에 this를 사용해 생성자간 호출이 가능하다!
		//this(생성자의 매개변수...)
		//this 용도2 this() 행제 생성자를 재호출 가능 같은 동작을 일임함.
		this(n1);
		//this를 사용한 생성자간 호출 코드는 반드시 생성자의 명령 중 첫번쨰 실핼 코드만 사용가능하다.
		this.num2 =n2;
		System.out.println("ThisB클래스의 생성자2가 호출되었습니다.");
	}

	ThisB(int n1, int n2, int n3) {
		this(n1,n2);
		this.num3 =n3;

		System.out.println("ThisB클래스의 생성자3가 호출되었습니다.");
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

}

public class Class_15 {
	public static void main(String[] args) {
		
			ThisB b1 = new ThisB(10);
			ThisB b2 = new ThisB(10,20);
			ThisB b3 = new ThisB(10,20,30);
			

	}
}
