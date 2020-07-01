package days11;
//접근지정자의 상속
//부모클래스의 private 멤버는 아무리 자식 클래스라고 하더라도 접근할 수 없는 멤버입니다,
//단 public으로 선언된 멤버메서드를 이용하면 부모 클래스의 private멤버에도 접근 이 가능합니다.
//this 사용한 메서드는 super의 사용권한을 호출한 형제 생성자에게 일임한다.
//따라서 오버로딩된 생성자 중에 반드시 하나이상의 생성자가 super()호출해야합니다.
//둘다 안쓰면 super() 가 들어온것으로 간주됩니다.
//본 예제의 super();sms public SubD(String arg) {} 에서 암시적으로 호출됩니다.
//
class par{
	private int a=1;
	public int s=11;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}

class chil extends par{
	private int k=8;
	public void print() {
		
		System.out.println(this.k);
	chil c = new chil();
	System.out.println(c.getA());
	System.out.println(super.s);
	
}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	
}
public class Extends_03 {
	public static void main(String[] args) {
		chil a =new chil();
		a.print();
		System.out.println(a.getK());
		System.out.println();
	
		
		
	}

}
