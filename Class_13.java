package days10;

class Sum {
	private int a;
	private int b;

	public void init(int c, int d) {
		a = c;
		b = d;
	}

	public int add() {
		return a + b;
	}

//	public int add(int c, int d) {
//		return a + b;
//	}

	public int add(int... ags) {
		int i = 0;
		for (int j = 0; j < ags.length; j++) {
			i += ags[j];
		}
		return i;
	}
}

public class Class_13 {
	public static void main(String[] args) {
		Sum s = new Sum();
		s.init(25, 36);
		System.out.println("s.add()결과" + s.add());
		System.out.println("s.add(23)결과" + s.add(23));
		System.out.println("s.add(59,65)결과" + s.add(59, 65));
		System.out.println("s.add(58,98,78,36,59)결과" + s.add(58, 98, 78, 36, 59));
	}
}
