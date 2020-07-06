package days17;
//thread 예제 3 중간에 쓰레드 나가는방법


import javax.swing.JOptionPane;

class Thread_C_2 extends Thread{
	private boolean state =true; // 쓰레드를 나가기 위함
	public void setState(boolean s) {
		this.state=s;
	}
	public void run() {
		for (int i = 10; i >0 &&this.state == true; i--) {
			System.out.printf("C_1쓰레드: %d\n",i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.3초간 실행을 딜레이시켜라(일시정지느낌) thread클래스의 static메서드이다.
		}
	}
}
public class Thread_08 {
	public static void main(String[] args) {
		Thread_C_2 t2= new Thread_C_2();
		t2.start(); // run 메서드가 모두 종료 되면 자동으로 종료된다.
		String input=JOptionPane.showInputDialog("아무값이나 입력하세요:");
		t2.setState(false);
		System.out.println("입력하신값은 "+ input+"입니다.");
		if(input.length()>0) {
			//t2.stop(); 안쓴다는 이야기 Thread의 stop메서드는 사용중이었던 자원(변수 메모리등)의 불안정을 
			//초래하기 때문에 지듬은 사용하지 않는다.
			
		}
	}
}
