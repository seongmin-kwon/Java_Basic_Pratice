package days09;

public class method_16 {
	public static void main(String[] args) {
		sort("asc", 1, 2, 3, 4, 5, 6, 7);
		System.out.println();
		sort("desc", 7, 6, 5, 4, 3, 2, 1);
	}

	public static void sort(String op, int... a) {
		// compareTo 메서드가 두문자열의 크기 비교하면
		// equals메서드는 두문자열이 같은지 아닌지 비교하여 같으면 true,다르면 false
		if (op.equalsIgnoreCase("asc")) {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) { // 오름 차순
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}

				}
			}
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] < a[j]) {// 내림차순
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}

				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}

	}

}
