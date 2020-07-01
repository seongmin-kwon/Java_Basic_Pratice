package days07;

public class Array_14 {
	public static void main(String[] args) {
		// 2차원 배열
		// 행과열의 개념을 사용하는 인덱스가 2개인 배열
		// 2차원 배열의 변수 선언 - 행과 열을 의미하는 []가 두개 사용됨
		int[][] arr;

		// 2차원 배열의 공간 생성
		// 변수 명 = new 자료형 [행의 수][열의 수];
		arr = new int[3][2];
		// 2차원 배열의 요소 접근
		// 2개의 인덱스 사용
		arr[0][0] = 10;
		System.out.println(arr[0][0]);
		int[][] arr2 = new int[2][3];
//1차원 배열 과 마찬가지로 2차원 배열 역시 heap에 메모리가 생성됨
		// 따라서 초기화 값은 자동으로 0으로 들어감.
		int[][] arr3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.printf("%d ",arr3[0][0]);
		System.out.printf("%d ",arr3[0][1]);
		System.out.printf("%d ",arr3[0][2]);
System.out.println();
		// 2차원 배열 실행후 반복 실행문에 의한 값 저장 &출력
//이차원 배열을 사용하는이유 : 1차원 배열의 묶음으로 행과 열을 이용한 테이블로 값들을 관리 할 수 있다.
// ex) 가령 성적 과같은 테이블을 정리할 때 구조적으로 코딩할 수 있다.

		int[][] a = new int[5][5];
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = k++;
			}
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%d\t", a[i][j]);

			}
			System.out.println();
		}

	}
}
