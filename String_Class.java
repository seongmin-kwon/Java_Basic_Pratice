package days13;

import java.util.Date;

public class String_Class {
	public static void main(String[] args) {
		//0.
		String s = "hello";
		//heap에 저장후 그주소 s에전달 이미 저장된 "hello"있다면 불멸객체로 그주소 전달
		System.out.println("0."+s);
		//print,string은 toString생략가능
		//System.out.println("0."+s.toString());
		
		
		//1.
		s= new String("hello");
		System.out.println("1."+s);
		//string 클래스는object클래스를 상속받고이미 tostring 과 equals가 자신에게 적합하게 오버라이딩 되어있다.
		//이외 의   사용자 정의 클래스는 오버라이딩해서 값에의한 비교를하도록 수정해야함.
		
		//2.
		char[] c = {'h','e','l','l','o'};
		String s2 =new String(c);
		System.out.println("2. "+ s2);
		
		//3
		String n ="0123456789";
		char c1 = s.charAt(0);// 글자 하나골라네기!!!!!!!!!!!!!!!!!!!!!!!!!!! 
		char c2 = n.charAt(5);
		System.out.println("3." +c1 +" "+c2);
		
		//4.
		String a1 =new String("ABCD");
		String a2 =new String("BCD");
		String a3 =new String("ABCD");
		System.out.println("4. a1.compareTo(a2) ? "+ a1.compareTo(a2));
		System.out.println("4. a2.compareTo(a3) ? "+ a2.compareTo(a3));
		System.out.println("4. a1.compareTo(a3) ? "+ a1.compareTo(a3));
		//compareTo는 정렬에 이용함.
		//문자열간의 비교 
		//숫자 987 보다 숫자 1234가 크다고 표현하지만 문자열 
		//문자들간의 비교는 첫글자 부터 차례차례 비교하여, 서로 글자가 다르면 그글자의 아스키코드 값으로
		//앞글자 - 뒤글자 (아스키코드)
		//크기를 결정 짓소, 첫글자가 같으면 두번째 글자끼리 비교하여 결정
		//두번째도 같으면 세번째글자로 ..
		//크기의 결정방법은 비교되는 두글자들의 뺄셈연산으로 결과가음수이면 두번째글자가 크가고 하고 양수이면 앞글자가 크다한다.
		//'A' - 'B' => -1 
		
		//5. s: Hello
		System.out.println(s);
		s2 = s.concat("world"); //이어붙히기 + 와 같이 합쳐서 생성하고 반환함.
		System.out.println("5. "+s2);
		System.out.println("5. "+s);
		
		//6.
		s= new String("abcdefg");
		boolean b = s.contains("bc");
		//괄호안의 문자열이 메서드 호출 객체를 갖고 있는 문자열의 일부로 포함되어 있다면 참을 리턴해주는 메서드.
		//boolean b =new String("abcdefg").contains("bc);
		System.out.println("6. 문자열"+s + "에는 \"bc\" 가 포함되어 있다?" +b );
		
		//7
		s= new String("Hello.txt");
		b= s.endsWith("txt");
		//메서드 호출 객체가 갖고 있는 문자열이 괄호안의 문자열로 끝나면 참 리턴해주는 매서드
		System.out.println("7. 문자열"+s+"는 \"txt\"로 끝난다?" +b);
		
		//8
		s = new String("hello");
		//대소문자 구분해서 비교
		System.out.println(s.contentEquals("hello"));
		System.out.println(s.equalsIgnoreCase("hello"));
		
		//9.글자를지목해서 인덱스 얻기
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf('k'));
		//있으면 인덱스 리턴없으면 -1
		
		System.out.println("9. " +s + "s.indexof(\'e\',0)"+s.lastIndexOf('e', 0));
		// 팢고자하는 문자가 지정한 정수 부터 몇번째 글자인지 위치하는지 구해줍
		//0번째 부터 찾아서 알파벳순으로 몇번째인지 찾아줌
		//없으면 리턴 -1
		
		
		//10. 
		s= new String("ABCD");
		System.out.println("\n 10. " + s + "s.index0f(cd)" + s.indexOf("CD"));
		//문자열의 일부가 위치한 위치값
		s ="java.lang.object";
		System.out.println("10" + s+ "문자열중 '.' 의 마지막 위치"+s.lastIndexOf(','));
		//문자열 의 일부 또는 문자 가 마지막으로 확인된위치
		
		
		//11.
		s= "hello";
		System.out.println(s + ""+ s.replace('H', 'C'));
		s2 =s.replace('H', 'C');
		System.out.println("11. " +s + " "+s2);
		s2=s.replace("ll", "LL");
		System.out.println("11. "+s+" "+s2);	
		
		//12.
		String animal = "dog,cat,bear";
		String[] a = animal.split(",");
		System.out.println("\n12.");
		for(int i =0; i<a.length;i++)System.out.printf("%s ",a[i]);
		System.out.println();
		
		
		//13.
		s="java.lang.Object";
		s2= s.substring(5,9);
	
		System.out.println(s2);
		s2=s.substring(10);
		System.out.println("13"+s2);
		
		
		
		
		//14.valueOf 뭐든 문자열로 바꾸어줌
		
		System.out.println(String.valueOf(true));
		s =String.valueOf(100);
		System.out.println(s);
		s =String.valueOf(100.123);
		System.out.println(s);

		
		//java.util.Date dd = new java.util.Date();
		Date dd =new Date();
		s= String.valueOf(dd);
		System.out.println(s);
		
	}

}
