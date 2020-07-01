package days13;

interface Repairable{
}
//스타그레프트
class Unit {
	int hp; // 현재 체력
	int max_hp; // 최대 체력

	Unit() {
	}

	Unit(int p) {
		max_hp = p; // 유닛마다 최대 hp가다르기때문에 설정
		hp = (int) (p * 0.8); // 현재 체력 80프로로보자.
	}

	public void prnHP() {
		System.out.println("최대 체력: " + max_hp +" "+ "현재체력:  " + hp);
	}
}

class GroundUnit extends Unit {
	GroundUnit(int p) {
		super(p);
	}
}

class AirUnit extends Unit {
	AirUnit(int p) {
		super(p);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}

	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(150);
	}

	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit implements Repairable {
	Marine() {
		super(40);
	}

	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit {
	SCV() {
		super(50);
	}

	public String toString() {
		return "SCV";
	}

//	public void repair(Tank t) {}
//	public void repair(Dropship d) {}
//	public void repair(SCV s) {}
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u =(Unit)r; //인터페이스에서 클래스간의 형변환
			//자유롭게 hp에 접근하기위해서
			u.prnHP();
			if(u.hp != u.max_hp) System.out.println(u+"의 수리를 시작합니다.\n");
			else {
				System.out.println(u+ "의 hp는 만땅입니다.\n");
			}
			while(u.hp != u.max_hp) {
				u.hp += 2;
				System.out.println("현재 체력 : " +u.hp);
			}
			System.out.println();
			System.out.println(u+ "의 수리가 끝났습니다.\n");
			
		}
	}
}


public class Interface_05 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		System.out.printf("%s : ", tank.toString());
		tank.prnHP();
		Dropship dropship = new Dropship();
		System.out.printf("%s : ", dropship.toString());
		dropship.prnHP();
		Marine marine = new Marine();
		System.out.printf("%s : ", marine.toString());
		marine.prnHP();
		SCV scv = new SCV();
		System.out.printf("%s : ", scv.toString());
		scv.prnHP();
		scv.repair(tank);
	}
}
