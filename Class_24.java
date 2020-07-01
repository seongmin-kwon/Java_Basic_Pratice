package days11;

class StaticD {
	private static int count;

	public StaticD() {
		count++;
	}

	public static void setCount(int count) {
		StaticD.count = count;
	}

	public static int getCount() {
		return count;
	}
	public static void setCount1(int count) {
		StaticD.count = count;
	}

	public static int getCount1() {
		return count;
	}
}

public class Class_24 {
	public static void main(String[] args) {
		
		System.out.printf("StaticD.count = %d\n",StaticD.getCount());
		StaticD.setCount(15);
		System.out.printf("StaticD.count = %d\n",StaticD.getCount());
		StaticD d1 =new StaticD();
		System.out.printf("StaticD.count = %d\n",d1.getCount1());
		StaticD.setCount(15);
		System.out.printf("StaticD.count = %d\n",d1.getCount1());

	}
}
