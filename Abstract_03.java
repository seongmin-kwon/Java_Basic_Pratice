package days12;

// 추상클래스의 단점
//추상 메소드 구현의 강제성!
//많은 수를 추상메소드를 갖추는 추상 클래스는 상속에 부담을 주게된다.
//자식클래스에서 사용하지 않을 추상메소드라도, 객체생성을 위해 반드시 구현해야하는 문제점이있다. 매우 귀찮..
abstract class Abstract_B {
	public abstract void test1();

	public abstract void test2();

	public abstract void test3();

	public abstract void test4();

	public abstract void test5();

	public abstract void test6();

	public abstract void test7();
}
//문제점 필요없는 메서드가있어도 추상메서드는 상속받은 자손에소 모두 오버라이딩 해야만한다..

class Abstract_B_sub1 extends Abstract_B {

	@Override
	public void test1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
	}

	@Override
	public void test7() {
		// TODO Auto-generated method stub
	}
}

class Abstract_B_Adapter extends Abstract_B {
	@Override
	public void test1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
	}

	@Override
	public void test7() {
		// TODO Auto-generated method stub
	}
}

//추상클래스의 추상메소드가 많이 존재하는경우 자식클래스의 부담을 덜어주기 위한 패턴 어댑터 클래스 만들어 사용한다.
//추상클래스의 모든 푸상 메소드들을 더미 메소드 형태로 미리 구현해놓은 클래스
class Abstract_B_Sub2 extends Abstract_B_Adapter {
	public void test1() {
		System.out.println("test1 오버라이딩~");
	}
}

public class Abstract_03 {
	public static void main(String[] args) {
		// 어댑터클래스를 상속 받은 클래스도 추상클래스의 자식클래스가 됩니다.
		Abstract_B obj = new Abstract_B_Sub2();
		obj.test1();
	}
}
