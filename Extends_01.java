package days11;
//클래스릐 상속
//다수개의 클래스들이 중복되는 멤버변수,멤버메서드를 포함하고 있는경우
//부모 자식 관계를 생성하려 ㅌ코드의 중복을 방지 하는것을 1차 목적으로 사용합니다.
//차 목적으로 코그의 재활용 방법을 목적으로 사용 합니다.
//코드의 중복이 발생하고 있는 클래스에서 중복되는 메서드를 별도의 클래스로 선언하고
//상속을 구현하여 사용합니다.

public class Extends_01 {
	public static void main(String[] args) {
		class A {
			String aField = "클래스 A 필드";
			public void aMethod() {
				System.out.println(aField);
				// System.out.println("A : "+ bField); // 컴파일 에러(자식 필드 사용 불가)
			}
		}

		class B extends A {
			String bField = "클래스 B 필드";
			public void bMethod() {
				System.out.println(aField); // 부모 클래스 필드 사용
				System.out.println(bField); // 본인 클래스 필드 사용
				// System.out.println("B : "+cField); // 컴파일 에러(자식 필드 사용 불가)
			}
		}

		class C extends B {
			String cField = "클래스 C 필드";
			public void cMethod() {
				System.out.println(aField); // 조부모 클래스 필드 사용
				System.out.println(bField); // 부모 클래스 필드 사용
				System.out.println(cField); // 본인 클래스 필드 사용
			}
		}

	
				System.out.println("----------A----------");
				A a = new A();
				a.aMethod(); // 본인 메소드 사용
				// a.bMethod(); // A(부모) 객체로 B(자식) 메소드 접근 불가
				System.out.println("----------A----------");
				System.out.println("----------B----------");
				B b = new B();
				b.aMethod(); // 부모 메소드 사용
				b.bMethod(); // 본인 메소드 사용
				// b.cMethod(); // B(부모) 객체로 C(자식) 메소드 접근 불가
				System.out.println("----------B----------");
				System.out.println("----------C----------");
				C c = new C();
				c.aMethod(); // 조부모 메소드 사용
				c.bMethod(); // 부모 메소드 사용
				c.cMethod(); // 본인 메소드 사용
				System.out.println("----------C----------");
	
	}
}
	
