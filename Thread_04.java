package days17;
//이번엔Runnable인터페이스로 구현해보자
/*
 * 러너블인터페이스를 구현하는 클래스 작성
 * public void run() 오버라이딩 구현
 * 해당클래스의 a객체 생성
 * a 객체를 쓰레드 클래스의 생성자로 전달하여 쓰레드 객체 생성
 * 생성시킨 쓰레드 의 start메서드 호출
 */
class Thread_D_1 implements Runnable{
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.printf("D_1쓰레드: %d\n",i);
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
}
	
	class Thread_D_2 implements Runnable{
		public void run() {
			for (int i = 1; i <=10; i++) {
				System.out.printf("D_2쓰레드: %d\n",i);
				try {Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		}
	}		
public class Thread_04 {
	public static void main(String[] args) {
		//Runnable 인터페이스를 구현한 쓰레드 생성
		//1.러버블 인터페이스를 구현한 클래스의 객체 생성
		Thread_D_1 t1 = new Thread_D_1();
		//2. 1에서 생성된 쓰레드 생성자에 전달인수를 전달하여 쓰레드 객체생성 
		Thread t =new Thread(t1);
		//3.2에서 생성된 쓰레드 객체를 사용하여 스타트 메소드 호출
		t.start();
		
		//위의 내용 한라인으로 구현
		new Thread(new Thread_D_2()).start();
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




