package days10;

import java.util.Scanner;

	
	
	
	class AccountWithPermission{
		//정보은닉
		//클래스 내부에 선언된 멤버필드들은 현실에 종재하는 대상의 정보를 저장한다.
		//일반적으로 이러한 정보들은 직접적으로 접근하여 변경되면 안된다.
		//이러한 이유로 모든 멤버필드들은 private으로 선언하고, 멤버 필드들을 제어할 수 있는 메소드를 통해서만 접근한다.
		//그를위해 public으로 선언한다.
		private double balance;
		
		public void initBalance(int money) {
			balance = money;
			}
		
		public void withdraw(int money) {
			if(money<=0)
			balance = balance - money;
			System.out.println("출금했습니다.");
			return;
		}

		public void display() {
			System.out.printf("잔액은 : %.1f원 입니다.", balance);
		}


		public void deposit(int money) {
			if(money <=0) {
				System.out.println("이금 금액에 문제가 발생했습니다.");
				return ; // 해당 메서드 종료
			}
			balance = balance + money;
			System.out.println("입금했습니다.");
		}
	}
	public class Class_06 {
		/*
		 * 접근지정자 모든 클래스의 멤버는 현실에 존재하는 대상의 정보로서,
		 *  직접적인 접근이 허용되는 것과 허용되면 안되는 정보가있고
		 *   접근지정자는클래스의 멤버들에 대한 접근을 제어하는 키워드 입니다.
		 *   public:공개 정도가 가장 높고 어디에서든 자유롭게 접근할 수 있다.
		 *   protected:같은 패키지 내에서 접근이 가능하고 다른 패키지에서도 상속을 받은 클래스 내부에서는 사용 가능하다.
		 *   public과 다른점은 다른 패키지의 자식 클래스 외부에서는 접근할 수 없다는 것이다. 
		 *   default (package private):같은 패키지 내에서만접근이 가능하다.
		 *   아무런 접근 지정자도 없을 경우 이 옵션이 자동으로 적용된다.
		 *   private:동일 클래스 내에서만 접근이 가능한 가장 낮은 단계의 자유도를 갖는다.
		 */
		 public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  int money, selectMenu;
			  AccountWithPermission a = new AccountWithPermission(); //객체 생성
			  a.initBalance(50000); //잔액 초기화
			  System.out.printf("메뉴선택 : 1. 입금   2. 출금   3.잔액확인    4. 종료");
			  selectMenu = sc.nextInt();
			  while( selectMenu != 4) {
			   switch(selectMenu) {
			   case 1:
			    System.out.printf("입금할 금액을 입력하세요");
			    money = sc.nextInt();
			    a.deposit(money);
			    a.display();
			    break;
			   case 2:
			    System.out.printf("출금할 금액을 입력하세요");
			    money = sc.nextInt();
			    a.withdraw(money);
			    a.display();
			    break;
			   case 3:
			    a.display();
			    break;
			   }
			   System.out.printf("메뉴선택 : 1. 입금   2. 출금   3.잔액확인    4. 종료");
			   selectMenu = sc.nextInt();
			  }
			  System.out.printf("프로그램 종료");
			 }
			}
			
