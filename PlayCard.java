package days11;

class Deck {
	Card[] cards = new Card[52];

	public Deck() {
		int i = 0;
		for (int k = 1; k <= 4; k++) { // 카드종류 1~4반복
			for (int n = 1; n <= 13; n++) {// 카드번호 1~13 반복
				cards[i++] = new Card(k, n); // 카드장수 i는 0~51
			}
		}
	}

	public void shuffle() {
		Card temp;
		for (int i = 0; i < 52; i++) {
			int r = (int) (Math.random() * 52);
			temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;

		}
	}

	public Card pick(int i) {
		return cards[i];
	}

}

public class PlayCard {

	public static void main(String[] args) {
		Deck d = new Deck();
		d.shuffle();
		// Card p = d.pick(0);
		// System.out.println(p);
		Card[] p1 = new Card[5];
		Card[] p2 = new Card[5];
		Card[] p3 = new Card[5];
		Card[] p4 = new Card[5];
		int k = 0;
		for (int i = 0; i <5; i++) {
			p1[i] = d.pick(k++);
			p2[i] = d.pick(k++);
			p3[i] = d.pick(k++);
			p4[i] = d.pick(k++);
		}
		for (int j = 0; j < 5; j++) {

			System.out.printf("p1: %s ", p1[j]);
		}
		System.out.println();
		for (int j = 0; j < 5; j++) {

			System.out.printf("p2: %s ", p2[j]);
		}
		System.out.println();
		for (int j = 0; j < 5; j++) {

			System.out.printf("p3: %s ", p3[j]);
		}
		System.out.println();
		for (int j = 0; j < 5; j++) {

			System.out.printf("p4: %s ", p4[j]);
		}
	}

}
