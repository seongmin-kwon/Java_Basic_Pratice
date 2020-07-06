package days17;

//쓰레드 객체의 이름을 지정하는 방법: setName 메소드를 사용하여 이름을 지정할 수있음
//히지만 일반적으로 Thread 클래스의 문자열을 매개 변수로 받는 생성자를 사용
class Thread_F extends Thread{
	public Thread_F(String name) {
		//부모 클래스 Thread 클래스의 생성자를 사용하여 이름을 지정하는 예제
		super(name);
	}
	public void run() {
		System.out.printf("현재 실행중인 쓰레드의이름:%s\n",this.getName());
	}
}
public class Thread_07 extends Thread {
	public static void main(String[] args) {
		Thread_F f1 = new Thread_F("one");
		Thread_F f2 = new Thread_F("two");
		Thread_F f3 = new Thread_F("three");
		f2.setName("TEN");
		f1.start(); f2.start(); f3.start();
		//생성된 쓰레드가 다다르기 떄문에 다르게 나오는게 당연하다
		
		
		
	}
}
