package days17;

import javax.swing.JOptionPane;

//어떨때 사용할까? 메인이 진행중에 퀴즈 10초안에 맞추는방식을 구형할때 사용되겠다.

class Thread_C_1 extends Thread{
	public void run() {
		for (int i = 10; i >0; i--) {
			System.out.printf("C_1쓰레드: %d\n",i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.3초간 실행을 딜레이시켜라(일시정지느낌) thread클래스의 static메서드이다.
		}
	}

	public void threadStop(boolean b) {
		System.out.println("쓰레드를종료합니다.");
		
	}
}
// 블리언변수를하나선언하여 해당 조건이 되면 빠져나오게 쓰레드를 만들자.
public class Thread_03 {
	public static void main(String[] args) {
		Thread_C_1 t1= new Thread_C_1();
		t1.start();
		String input=JOptionPane.showInputDialog("아무값이나 입력하세요:");
		System.out.println("입력하신값은 "+ input+"입니다.");
		if(input.length()>0) {
			//t1.stop(); 안쓴다는 이야기 Thread의 stop메서드는 사용중이었던 자원(변수 메모리등)의 불안정을 
			//초래하기 때문에 지듬은 사용하지 않는다.
			
		}
	}
}
