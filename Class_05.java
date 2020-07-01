package days09;

class Account {
	private double balance; // 잔액 정보 private은프라이빗은 맴버 메소드로만접근 가능하도록 은닉한다.
	// 접근 지정자를 사용하지 않는 경우 기본지정으로 public이 자동 설정되며 아래와 같이 임의의 값으로 멤버필드의 값이 강제로 수정될수
	// 있다.
	// private은 자기자신 class 의 멤버 베서드만 접근 가능합니다.
// 캡슐화가되어야 정보은닉이 가능하다. 의미있는 멤버변수끼리 묶는것이 캡슐화 이다.
	void initBalance(double inputBalance) {
		balance = inputBalance;
	}

	void display() {
		System.out.printf("잔액은 : %.1f원 입니다.", balance);
	}

	void withdraw(double inputBalance) {
		balance = balance - inputBalance;
		System.out.println("출금했습니다.");
	}

	void deposit(double inputBalance) {
		balance = balance + inputBalance;
		System.out.println("입금했습니다.");
	}

}

public class Class_05 {
	public static void main(String[] args) {
		Account a = new Account();
		// a.balance =50000; --> 에러
		a.initBalance(10000); // a는 호출 객체라 부른다.
		a.display();
		a.withdraw(5000);// 출금
		a.display();
		a.deposit(5000);// 입금
		a.display();

	}
}
