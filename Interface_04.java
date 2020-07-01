package days13;

		//부모 인터페이스 
		interface Inter_D{
			public abstract void interDTest();
		}
		abstract class Super_D{
			public abstract void superDTest();
		}
		//클래스와 인터페이스를 동시에 다중 상속 받을 수있습니다.
		//class 자식 클래스명ㄹ extends 부모클래스명 implements 부모 인터페이스명
		class Sub_D extends Super_D implements Inter_D{
			public void interDTest() {}
			public void superDTest() {}
		}
		
		
		public class Interface_04 {
			public static void main(String[] args) {
	}
}
