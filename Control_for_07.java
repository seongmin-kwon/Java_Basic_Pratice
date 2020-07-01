package days04;

public class Control_for_07 {
public static void main(String[] args) {
	//문제 :1~100 사이 이전 숫자와 다음 숫자가 세트를 이루는 수열 출력(0,1,2),(1,2,3,),(2,3,4)...
	int i =1;
	for (i = 0; i < (100-2); i++) {
		if(i %7==0) {
			System.out.println("\n");
		}else
		
			System.out.printf("(%2d,%2d,%2d)",i,i+1,i+2);
		// %2d 2개의 자리를 마련하고 오른쪽 정렬을해서 그방에 값넣는다. 즉 2면 _2인것
	}
	
    }
}
