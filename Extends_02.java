package days11;
//상속의 구현
//슈퍼클래스 =부모클래스 =상위 클래스
//하위 클래스 = 자식클래스
class Car {
	int 엔진;
	int 배기량;
	int 도어개수;
}

class K7 extends Car {
	public void printInfo() {
		System.out.println(this.엔진);
		System.out.println(this.배기량);
		System.out.println(this.도어개수);
	}
}

public class Extends_02 {
	public static void main(String[] args) {
		K7  k =new K7 ();
		k.엔진=6;
		System.out.println(k.엔진);
	}
}
