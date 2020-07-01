package days12;

class SuperG {
}

class SubG1 extends SuperG {
}

class SubG2 extends SuperG {
}

class SubG3 extends SuperG {
}

public class TypeCasting_03 {
	public static void main(String[] args) {
		SuperG s = new SuperG();
		SubG1 s1 = new SubG1();
		SubG2 s2 = new SubG2();
		SubG3 s3 = new SubG3();
		
		if (s instanceof SubG1) {
			System.out.println("SubG1 ");
		} else if (s instanceof SubG2) {
			System.out.println("SubG2 ");
		} else if (s instanceof SubG3) {
			System.out.println("SubG3 ");
		} else if (s instanceof SuperG) {
			System.out.println("SuperG ");
		} else {
			System.out.println("형변환을 실행할 수 없습니다.");
		}
		
		if (s1 instanceof SubG1) {
			System.out.println("SubG1 ");
		} else if (s instanceof SubG2) {
			System.out.println("SubG2 ");
		} else if (s instanceof SubG3) {
			System.out.println("SubG3 ");
		} else if (s instanceof SuperG) {
			System.out.println("SuperG ");
		} else {
			System.out.println("형변환을 실행할 수 없습니다.");
		}
		// 실제 인스턴스가 자식 클래스형이라면 가능하지만 아니라면 런타임 에러!
	}
}
