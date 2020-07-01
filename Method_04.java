package days08;

public class Method_04 {
	// call by reference : 참조에 의한 호출 배열,문자열 string참조변수 , class 참조변수, 참조변수 같은 참조 변수 즉 주소값을 복사해서 보냄
	//호출된 메소드에서 참조값을 사용해 값을 변경하게 되면 호출한곳이 가리키는 곳의 메모리에 직접 반영된다.

	
	public static void main(String[] args) {
	System.out.println("프로그램 시작");
	int [] arr = {111,222,333};
	
	for (int i = 0; i < arr.length; i++) {
		System.out.printf("arr[%d] = %d\t",i,arr[i]);
		updateValue(arr);
		
	}
	}
	public static void updateValue(int[] brr) {
		brr[0]=100;
		brr[1]=200;
		brr[2]=300;
		System.out.println("\nupdateValue 메소드");
	}
}
