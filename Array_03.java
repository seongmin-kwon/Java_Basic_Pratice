package days06;

public class Array_03 {
public static void main(String[] args) {
	// 배열 변수 의 활용 반복문~배열
	int [] arr =new int [100];
	for (int i = 0; i < arr.length; i++) {
		arr[i]= i+1;
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.printf("arr[%d]=%d\n",i,arr[i]);
		
	}
}
}
