package days17;
//프로그램릐 수행중 동시에 처리하고자하는 작업이 생겼을때 원래 갖고있는 메인 thread외에
//Thread클래스를 추가 사용하여 실행 시킬수 있습니다.
//메인메서드에 쓰레드가 1개 기본으로 있다.
//다른것들과 상관없이 따로 쓰레드를 돌릴수 있다 방법은 2가지 쓰레드 상속,러너블인터페이스 구현 하여 오버라이딩


//구현방법
//<1>
//1-1 쓰레드 클래스를 상속받아 public void run()메서드를 오버라이딩합니다.
//이때 public void run()은 쓰레드가 생성되어 수행할 작업을 정의 하는 메소드 입니다.

//1-2 해당클래스의 객체를 생성하고 start 메서드를 실행합니다.
//만약 오버라이딩된 run메소드를 호출하면 쓰레드 생성실행이아니라 일반 메서드 호출이되므로 반드시 start 
//메서드를 통해 run으로 이어지게 호출합니다.
//start 메서드: 쓰레드 클래스(부모) 에있는 메서드, 자체적을 쓰레드 주기생성후 run메서드를 재호출하는역할을 합니다.
//상속된 메서드로 메서드가 표면에 보여지지는 않은체 사용됩니다!!! 

//<2>
// Runable 인터페이스를 implements(구현)하는방법
//2-1 쓰레드클래스를 상속하는 방법과 같고 효과도 거의 같습니다.


class Thread_B_1 extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("B_1쓰레드: %d\n",i);
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.3초간 실행을 딜레이시켜라(일시정지느낌) thread클래스의 static메서드이다.
		}
	}
}

class Thread_B_2 extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("B_2쓰레드: %d\n",i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.3초간 실행을 딜레이시켜라(일시정지느낌) thread클래스의 static메서드이다.
			//자신의 클래스안엣 실행됨으로 클래스네임.~는생략가능
			//나아가 프로세서 실행에 관여한 메서드로 예외처리가따라다녀 구현 요구!
		}
	}
}

public class Thread_02 {
	public static void main(String[] args) {
		Thread_B_1 t1 = new Thread_B_1();
		Thread_B_2 t2 = new Thread_B_2();
		t1.start();
		t2.start();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("main쓰레드: %d\n",i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}



