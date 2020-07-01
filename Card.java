package days11;

public  class Card {
	final static int spade = 4;
	final static int diamond = 3;
	final static int heart = 2;
	final static int clover = 1;
	
	//멤버변수
	int kind; //종류
	int number; //숫자
	
	public Card(int kind,int number) {
		this.kind=kind;
		this.number =number;
	}
	
	public Card() {
		this(spade, 1); //정수형 2개 생성자 있으니 형제 생성자 this사용가능
	}
	public String toString() {
		//Kind값 4, number 13이면 [Space:k]와같이 리턴함.
		String[] kinds = {"","Clover","Heart","Diamond","Spade"};
		String[] numbers = {"","A","1","2","3","4","5","6","7","8","9","J","Q","K"};
		return "[" +kinds[this.kind]+":"+numbers[this.number]+"]";
	}
	//toString()매서드가 있는 클래스의 객체를 println()으로 출력하면
	//클래스이름@해쉬코드말고 toString()에서 리턴하는값이 출력 -상속때배움.
	//Card c =new Card(4,13);
	//System.out.println(c);
	//출력 : [Spade : k]   //c.toString()출력과 같다.
}
