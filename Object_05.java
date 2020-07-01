package days12;
//부모클래스를 자식클래스에 강제케스팅해야하는 예제

//부모 클래스의 레퍼런스 변수에 자식클래스의 인스턴스 주소를 저장하는예제!! 

import java.util.Vector;

//equals오버라이딩의 이해를 돕기위한 예제

//부모 클래스의 레퍼런스 변수에 자식 클래스 인스턴스 주소를 저장하는 예제
//상속 클래스가 없다면 object클래스가 부모 클래스가 되어 인스턴스 주소를 저장했다가 다시 되돌리는 예제 

class Product {
	int price;
	int bonusPoint;

	public Product(int p) {
		// TODO Auto-generated constructor stub
		this.price = p;
		this.bonusPoint = p / 10;
	}
}

class Computer extends Product {
	public Computer() {
		super(150);
	}

	public String toString() {
		return "컴퓨터";
	}

}

class Tv extends Product {
	Tv() {
		super(60);
	}

	public String toString() {
		return "티비";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "오디오";
	}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	Vector item = new Vector(); // item엔 사람이 산 물건의 리스트가 들어감.
	// 백터란 배열의 확장형 리스트 구조이다. - 객체들을 저장할 수있는 배열이라고 이해해도 무방함 .
	// 사용자가 만든 클래스의 객체(메모리를 할당 받은 레퍼런스값)등이 저장되는 다형성 객체저장 리스트입니다.

	public void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("잔액이 부족하여 결제할 수없습니다.");
			return;
		}
		this.money -= p.price; // price는 상속받은녀석의 멤버변수 자식것 아냐~ 그래서 바로 쓰징
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "를구입하셨습니다!");
		item.add(p); // public void add(object obj){}꼴 예상 p가 오브젝트의 자식클래스이니까
		// Vector 클래스의 멤버 메서드 public void add(Object obj)
	}

	public void summury() {
		int sum = 0; // 지출 총액을 저장할 변수
		String itemList = "";// 구매목록을 저장할 변수
		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니당!");
			return;// 메서드 종료
		}
		//Vector 객체레서 저장된 요소를 하씩 꺼내오는 매서드 객체 이름.get(저장요소의 번호)
		Product p = (Product)item.get(0); //다시 자식에게 넣을땐 형변환 꼭필요
		for(int i =0; i<item.size();i++) {
			Product p1 = (Product)item.get(i);
			sum += p1.price;
			itemList = itemList + " " +p1;
		}
		System.out.println("지출총액:"+sum+ ", 구매목록:" + itemList);
	}
	
	public void refund(Product p) {
		if(item.remove(p)) { //벡터에서 원소 삭제시 그객체를삭제하고 빈방을 자동으로땡겨 체워준다.
			//item.remove(p)  ---> 경우 p가존재하여 잘지워졌으면 true 리턴
			money += p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+ "를 반품했어요");
		}else { //item.remove(p) :remove하려는 p가 목록에 없다면 false리턴
			System.out.println("구입하신물품중 해당 제품이 없네요");
		}
		
	}

}

public class Object_05 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		Buyer b = new Buyer();
		b.buy(t1);
		b.buy(t2);
		b.buy(t3);
		b.buy(c);
		b.buy(a);
		b.refund(t2);
		b.refund(t1);
		
		b.summury();
		
		
		
		
	}
}
