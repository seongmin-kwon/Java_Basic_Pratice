package days07;

public class Array_17 {
	public static void main(String[] args) {
		 // 1차원 배열의 복사
		  // clone 메소드를 사용한 배열의 복사
		  // 배열명.clone()
		  // 해당 배열변수가 레퍼런스(참조)하고 있는 장소의 배열을 새로운 공간에 복제합니다.
		  // arr2는 arr1 배열이 복제된 배열을 참조하는 변수
		  int [] arr1 = {1,2,3,4,5};
		  int [] arr2 = arr1.clone(); // 힙 영역에 배열의 복사본을 새로 만들고 그 주소를 전달
		  arr2[1] = 222;
		  for(int k : arr1) System.out.printf("%d ", k);
		  System.out.println();
		  for(int k : arr2) System.out.printf("%d ", k);
		  System.out.println();
		  
		  // Heap 영역에 생성된 하나인데 두개의 참조변수가 그 주소를 저장하게 되는 경우
		  int [] arr3 = arr1;
		  arr1[1] = 200;
		  for(int k : arr1) System.out.printf("%d ", k);
		  System.out.println();
		  for(int k : arr3) System.out.printf("%d ", k);
		  System.out.println();
		  
		  // 2차원 배열의 복사
		  // 이차원배열(다차원배열)은 clone 메소드의 결과로 실제 일차원 배열을 관리하고 있는
		  // 참조 변수들의 배열만 복사합니다. (2차원 배열의 전체적 행갯수만 복사한다는 뜻)
		  int [][] arr4 = {{1,2,3}, {4,5,6}};
		  System.out.println("arr4 : ");
		  for( int i = 0 ; i < arr4.length ; i++ ) {
		   for( int j = 0 ; j < arr4[i].length ; j++ )
		    System.out.printf("%d   ", arr4[i][j]);
		   System.out.println();
		  }
		  int [][] arr5 = arr4.clone();
		  // arr4 과 공유하고 있는 1차원 배열의 값이 수정
		  // 얕은 복사로 복사된 arr5의 값을 수정하게 되면  arr4도 변경된 값을 출력하게됨
		  arr5[1][0] = 400; 
		  System.out.println("arr4 : ");
		  for( int i = 0 ; i < arr4.length ; i++ ) {
		   for( int j = 0 ; j < arr4[i].length ; j++ )
		    System.out.printf("%d   ", arr5[i][j]);
		   System.out.println();
		  }
		 }

		}
	

