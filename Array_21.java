package days08;

public class Array_21 {
	public static void main(String[] args) {
		// 가변 배열 만들기
		int[][] a = new int[5][5]; // 행 개수
		int k = 1;
		for (int i = 0; i < a.length; i++) {
				
				
				if(i%2==0) {
					for (int j = 0; j < a.length; j++) {
						a[i][j] = k++;
					}
				}else  {
					for (int j = a[i].length-1; j>=0;j--) {
						
						a[i][j] = k++;
					}
					k=k+5;
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


