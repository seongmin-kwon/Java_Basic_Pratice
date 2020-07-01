package days12;
//object 클래스
//사용자 정의 클래스를 생성하면서 , extends(상속)을 구현하지 않으면 자동으로 java.lang.Object 클래스를 상속.
//Object 클래스는 Java에서 사용되는 모든 클래스들의 최상위 부모 클래스입니다.
//보이지 않지만 항상 모든 클래스는 Object클래스를 상속하고 있고 막약 extends로 다른 부모를 상속했다해도
//그부모 클래스역시 object를 상속 받고있기에 결국 어떻게 해서든 object를 상속받습니다.


class UserClass{}

public class Object_01 {
	public static void main(String[] args) {
		UserClass obj =new UserClass();
		
		System.out.println(obj.hashCode()); // 객체의 해쉬코드값반환
		System.out.println(obj.getClass()); //객체의 클래스 이름 반환
		System.out.println(obj.toString()); //toString 메소드는 클래스의 객체 정보를 문자열로 반환(객체클래스명 + @ +해쉬코드값 16진수)
		//toString()은 생략 해도 print 메서드에서 문자열로 뿌려줌
		
	}

}
