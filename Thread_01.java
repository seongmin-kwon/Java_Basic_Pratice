package days17;
//Thread : 프로스램의 명령을 실행하게끔 해주는 실행 주체
//개발자가 별도의 쓰레그를 생성하지 않는다면, 한 프로그램에 하나의 쓰레드만 존재하여 해당명령을 차례차례 순서대로 실행함.
//쓰레드가 둘이면 일하는사람이 둘이되는거다 아래의 예는 1개의 쓰레드뿐인 예제이다.



class Thread_A_1{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("A_1쓰레드: %d\n",i);
		}
	}
}

class Thread_A_2{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("A_2쓰레드: %d\n",i);
		}
	}
}
public class Thread_01 {
	public static void main(String[] args) {
		Thread_A_1 t1 = new Thread_A_1();
		Thread_A_2 t2 = new Thread_A_2();
		t1.run();
		t2.run();
		
	
			for (int i = 1; i <= 10; i++) {
				System.out.printf("main쓰레드: %d\n",i);
			}
		
	}
}
