package days17;


class Thread_E extends Thread{
	public void run () {
		System.out.printf("현재 실행중인 쓰레드의이름:%s\n",this.getName());
	}
}
public class Thread_06 {
	
	public static void main(String[] args) {
		//쓰레드의 객체의 이름을 확인 : thread 클래스의 getName메소드 사용
		//쓰레드의 이름을 지정하지 않으면 생성되는 순서로 thread 0,1,2같은 이름을 사용합니다.
		Thread_E e1= new Thread_E();
		Thread_E e2= new Thread_E();
		Thread_E e3= new Thread_E();
		e1.run();
		e2.run();
		e3.run();
		e1.start();
		e2.start();
		e3.start();
		
	}
}
