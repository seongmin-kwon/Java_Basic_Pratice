package days07;

public class Array_16 {
	public static void main(String[] args) {
		// 가변 배열 만들기
		int[][] arr;
		// 각 1차운 배열들의 주소를 저장할 참조 변수들의 배열을 할당
		arr = new int[3][];
		// 3개의 참조 변수에 3개의 1차원 배열들을 생성, 주소를 전달

	
//초기화
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) * (j + 1);
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
