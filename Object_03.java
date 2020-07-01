package days12;
//object : 클래스의 equals 메소드 : 객체간의 비교를 위해서 사용되는 메소드
//object 가 상속한 클래스중에 toString과 가장많이 함께 사용하는 오버라이딩 메서드

public class Object_03 {
	public static void main(String[] args) {
		String s1 ="hello";
		String s2 ="hello";
		if(s1==s2) {
			System.out.println("같다");
		}else System.out.println("다르다");
 
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		if(s3==s4) {
			System.out.println("같다");
		}else 			System.out.println("다르다");
 
		
		//결국 두예제의 결론으로 정리해보면 문자열들 사이에 ==연산은 저장된문자열이아니라
		//ref변수의 주소비교를 한다.
		// 또한 new 를 사용하지 않은 String 데이터의 초기화는 이미 저장된 똑같은 문자열 데이터가 있을때
		//새로 메모리를 할당하지 않고 그문장열의 주소를 새로운 레퍼런스 변수에 저장합니다.
		
		//따라서 객체의 실제 값이 같은지의 비교를위해선 equlas 메소드를 사용해야 정확합니다!
		//사용하면 참조값이 서로 다른 객체의 실제 데이터를 비교하여 동일한 데이터를 가지고 있는지 확인할 수 있습니다.
		
		if(s3.equals(s4))System.out.println("같다.");
		else System.out.println("다르다");
		
		
		//String 클래스는 이미 equals 메서드를 실제 값의 비교로 오버라이딩 되어 있으며
		//기타 다른 사용자 정의 클래스에서는 별도로 equals를 실제값으로 비교하도록 오버라이딩 해줘야 합니다.
		
		
		//참조형의 ==비교는 주소값을 비교 값의 비교가 아님.!
		//참조형의 비교는 equals()사용하지만 오버로딩 필요 값의 비교를위해선
		//equals() 는 원래 오브젝트 클래스에서 상속받은것인데 스트링에선 오버라이딩 해두어서실제 값의 비교를하는데
		//다른데서 사용할때 우리가 주소의 비교가아닌 객체 값의 비교를 하도록 오버라이딩을 필수로 해줘야함.!
	}

}
