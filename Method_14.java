package days09;

public class Method_14 {
	public static void main(String[] args) {
		//메소드 오버로딩
		//메소드의 이름은 같고 매개변수의 타입 개수 순서가 다르면 서로 다른 메소드로 인지하는 문법
		//일관된 메소드 이름을 사용하여 사용자 에게 직관적인 이름을 사용하게 합니다.
		System.out.println("둘중 큰값 : " +max1(11,33));
		System.out.println("셋중 큰값 : " +max1(11,33,77));
		System.out.println("넷중 큰값 : " +max1(11,33,77,1));
		
	}
	public static int max1(int n1,int n2) {
		return n1>n2?n1:n2;
	}
	public static int max1(int n1,int n2,int n3) {
		int temp;
		temp =n1>n2?n1:n2;
		return temp>n3 ?temp:n3;
	}
	public static int max1(int n1,int n2,int n3,int n4) {
		int temp1= n1>n2?n1:n2;
		int temp2 = temp1>n3?temp1:n3;
		int temp3 = temp2>n4?temp2:n4;
		return temp3;
		
		
	}
}
