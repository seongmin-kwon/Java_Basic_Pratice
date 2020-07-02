package days15;
//컬렉션 클래스 저장 방식

import java.util.ArrayList;

//모든 컬렉션 클래스들은 기본적으로 오브젝트 타입을 저장 반환할 수있다

//오브젝트 타입의 매개변수 사용 하는 모든 컬렉션 클래스들은 타입에 상관없이 저장할 수 있음
//하지만 저장된 데이터를 반환받는 과정에서 런타임 에러가 발생 될 수있다.
//오브젝트 -> 자식 클래스의 타입 : 강제 형변환
public class Collection_02 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		//다양한 타입을 저장할 수있는 컬렉션 클래스 객체
		a.add(100);
		a.add(1.1);
		a.add("hello");
		
		Integer i0 = (Integer)a.get(0);
		//컬렉션 내부의 데이터를 추출 하는 과정에서 일치하지않는 타입으로 형변환이 일어나는 경우
		//런타입 에러가 발생되어 프로그램 종료
		//Integer i1 = (Integer)a.get(1); 에러
		Double i1 = (Double)a.get(1);
		String i2 = (String)a.get(2);
	}
}
