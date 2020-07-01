package days10;
class Dclass {
	//매개변수를 선언하지 않은 디폴트 생성자
	public Dclass() {
		System.out.println("Dclass생성자 호출");
	}
	public Dclass(int i) {
		System.out.println(" int type Dclass생성자 호출");
	}

	
	public Dclass(double d) {
		System.out.println("double type Dclass생성자 호출");
	}

}
public class Class_11 {
	public static void main(String[] args) {
		Dclass d1 =new Dclass();
		Dclass d2 =new Dclass(10);
		Dclass d3 =new Dclass(23.23);
		
	}
}
