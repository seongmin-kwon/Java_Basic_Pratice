package days15;

public class Collection_03_wapperEx_01 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		
		//찹조 변수 (레퍼런스) 들의 비교
		if(i1==i2)System.out.println("i1과i2가 값이 같습니다.");
		else System.out.println("서로 다릅니다.");
		System.out.println("i1 ==i2?" +(i1+i2));
		
		//실제 인스턴스 에 저장된 값들의 비교
		if(i1.equals(i2))System.out.println("equals 같다.");
		else System.out.println("다르다.");
		System.out.println("i1.equals(i2)"+i1.equals(i2));
		
		System.out.printf("i1.compareTo(i2)="+i1.compareTo(i2));
		//실제 인스턴스에 저장된 값들의 비교 -뺄셈 연산으로 비교 앞에 숫자가 크면 양수 뒤에 숫자가 크면 음수 반환
		//같으면 0 반환
		
		//object 부모 클래스의 메서드 오버라이딩
		System.out.println("i1.toString() ="+i1.toString());
		
		System.out.println("max"+Integer.MAX_VALUE);
		System.out.println("min"+Integer.MIN_VALUE);
		
		//비트 바이트로 표현한 저장크기
		System.out.println("BIT="+Integer.SIZE);
		System.out.println("BYTES"+Integer.BYTES);
		
		//자료형
		System.out.println("TYPE="+Integer.TYPE);
		int i =10;
		Integer inti =(Integer)i;
		
		int i3 =inti+10;
		System.out.println(i3);
		
		int num1=3;
		Integer num2=new Integer(4);
		System.out.println(num1+num2);
		
		
	}
}
