package days05;

import java.util.Arrays;

public class ksm_test02 {
public static void main(String[] args) {
	int[] arr3 = new int [10];
	
	for (int i = 0; i < arr3.length; i++) {
		System.out.printf("%d ",arr3[i]);
		
	}
	System.out.println();
	
	for (int i = 0; i < arr3.length; i++) {
		System.out.printf("%d ",i);
	}
	System.out.println();
	
	for (int i = 1; i <= arr3.length; i++) {
		arr3[i]=i;
		System.out.printf("%d ",arr3[i]);
		
	}
	System.out.println();
	System.out.printf("%d",arr3.length);
	
	//배열의 길이가 0인 배열도 선언 할 수 있다.
	//배열의 길이는 한번 선언하면 변경할 수없다.
	//배열이름.length --> 상수이다.
	//배열의 길이는 한번 선언하면 변경 할 수없다.
	
	
}
}
