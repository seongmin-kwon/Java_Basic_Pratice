package days07;

public class Array_18 {
	public static void main(String[] args) {
		// 가변 배열 만들기
		int[][] arr;
		arr = new int[9][];   //행 개수
		for (int i = 0; i < 6; i++) {
			arr[i] = new int[i + 1];
		}
		for (int i = 4; i < 0; i--) {
			arr[i] = new int[i + 1];
		}
		
		//열개수
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];
		arr[5] = new int[4];
		arr[6] = new int[3];
		arr[7] = new int[2];
		arr[8] = new int[1];

		/*
		 * -더스마트한 방법 for (int i = 0; i < 4; i++)
		 *  { arr[i]=new int[i+1]; }
		 *   for (int i =5; i <= 8; i--)
		 *    { arr[i]=new int[9-i]; }
		 */
//초기화
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}

		}
//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}
}
