package days08;

public class Array_20_03 {
	public static void main(String[] args) {
		// 가변 배열 만들기
		int[][] a = new int[5][5]; // 행 개수
		int k = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==0) {
					a[i][0] = 1;
				}else if(i ==1) {
					a[i][1] = 2;
				}
				else if(i ==2) {
					a[i][2] = 3;
				}
				else if(i ==3) {
					a[i][3] = 4;
				}
				else if(i ==4) {
					a[i][4] = 5;
				}else {
					continue;
				}
				
		/*
		 * 더쉬운 방법
		 * if(i==j) a[i][j]= k++;
		 * 
		 */
				

			}
		}

//출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}

	}
}

