package days08;

public class Array_22 {
// 달팽이 1
	public static void main(String[] args) {
		int [][] a = new int [5][5]; // 행 개수
		int i = 0, j = 0;
		int b = 1;     // b는방향 1:오른쪽.2:왼쪽3.위 4.아래

		for (int k = 1; k <= 25; k++) {
			a[i][j] = k;

			// i,j에따른 방향이동 설정
			if (b == 1)
				j++;
			else if (b == 2)
				i++;
			else if (b == 3)
				j--;
			else
				i--;

			if (b == 1 && (j > 4 || a[i][j] != 0)) {
				// 오른쪽으로 가다 아래로 방향 바꿀 상황
				j--;
				i++;
				b = 2;
			} else if (b == 2 && (i > 4 || a[i][j] != 0)) {
				i--;
				j--;
				b = 3;
			} else if (b == 3 && (j < 0 || a[i][j] != 0)) {
				i--;
				j++;
				b = 4;
			} else if (b == 4 && (i < 0 || a[i][j] != 0)) {
				i++;
				j++;
				b = 1;
			}

		}

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
	}
}