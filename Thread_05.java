package days17;

public class Thread_05 {
	public static void main(String[] args) {
//좀 새로운 방법  new Thread().start();
		// 익명클래스를 활용한 쓰레드 생성
		// 익명 클래스 :메소드를 오버라이딩 하면서 객체를 생성하는 방법
		// 쓰레드는 상속받는것만이아닌 새 인스턴스만들어서 사용도 가능하다.
		new Thread() {
			public void run() {
				for (int i = 1; i < 10; i++) {
					System.out.printf("익명 클래스: %d\n", i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}

		}.start();
		for (int i = 0; i <= 10; i++) {
		
				System.out.printf("익명 클래스: %d\n", i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}

		}
	}

