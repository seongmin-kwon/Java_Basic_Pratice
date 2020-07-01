package days12;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() { //생성자 이름 나이 출력
		String info = "name = " + this.name + ",";
		info += "age= " + this.age;
		return info;
	}
	//사용자가 정의한 클래스에서 참조변수의 실제 값을 비교하는 equals메소드를 이용하려면 오버라이딩 필요
	//여기에 해줍니다!
	/*방법
	 * 0.오브젝트 클래스의 메서드 원형대로 오버드라이ㅣㅣ
	 * 1.매게변수로 전달된 object타입의 변수에 대하여 타입 채크를 진행 ,현재클래스와동일한 타입인지를 비교 instanceof사용
	 * 2.이때 동일 타입이 전달되지않으면 return false
	 * 3.만약 동일한 타입이 전달되었다면강제 형변환을 통해 현재 사용중인 클래스 타입을로 변환
	 * 4.타입이 변화된 레퍼런스를 사용하여 멤버필드의 값을 비교
	 * 5비교결과 반환
	 */
	//암기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//public boolean equals(Object obj) { } 로 같게 써줘야 오버라이딩된다!!
	//오브젝트 입장에선 내것이 다상속될것인데 인자를 알수 없으니Object obj 로 내 레버런스변수를 인자로 받는다고 적어서
	//어떤것이든 받을수 있는 모양으로 만들어서 얼마든지 오버라이딩 할 수 있게 하자.
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))  return false;//1.타입비교,2.비교할수 없는타입이면 false 리턴
		Student target =(Student)obj;//부모 레퍼런스로 멤버변수를 접근할 수 없기때문에 강제 형변황을텅해 자식타입으로 변환
		//자식클래스의 레퍼런스가 부모에갔다 다시 자식에 저장된경우
		boolean flag_name =this.name.equals(target.name);
	    boolean flag_age =this.age == target.age;
	    boolean result =flag_name && flag_age;
	    return result; //비교 결과 를 반환
}
}
