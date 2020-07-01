package days12;

public class Object_04 {
	public static void main(String[] args) {
Student s1 =new Student("홍길동",21);
Student s2 =new Student("홍길동",21);
if(s1==s2) {
	System.out.println("같다");
}else 	System.out.println("다르다");


/*
 * if(s1.equals(s2)) { System.out.println("같다"); }else
 * System.out.println("다르다"); //아직오버로딩안하니 다르다로나옴 String만 오버로딩 되어있음. //원래 equals도
 * 참조변수의 주소값을 비교함.
 */	

//if(s1==s3) {
//	System.out.println("같다");
//}else 	System.out.println("다르다");
	
	
	}
}
