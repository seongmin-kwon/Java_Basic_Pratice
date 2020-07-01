package days10;
//int형 데이터하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩된 생성자를 갖는 클래스 제작

//멤버 필드로는 int dan;하나생성
//멤버메서드로는 dan 값이 0이면 1~9단의 구구단 모두 출력 ,0이아니면 해당 구구단만 출력하는메서드제작
//메서드이름 print()
//디폴트 생성자는 dan변수를 0으로 저장, 전달인수가 있는생성자는 dan변수를 전달 인수 값으로 저장.
//클래스 이름 Gugudan

class Gugudan {
	private int dan;

	Gugudan() {
		dan = 0;
	}

	Gugudan(int a) {
		dan = a;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public void print() {
		if (dan == 0) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d =%d\n", i, j, i * j);
				}
			}
		} else {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d =%d\n", getDan(), j, getDan() * j);

			}
		}

	}
}

public class Class_12 {
	public static void main(String[] args) {

		Gugudan g1 = new Gugudan(5);
		Gugudan g2 = new Gugudan();
		g1.print();
		g2.print();
		

	}
}
