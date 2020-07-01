package days08;
//매개변수의 역할
//call by value : 값에 의한 호출 
//call by reference : 참조에 의한 호출

//메소드의 매개변수는 지역변수이다.
//서로 다른 메소드에서 동일한 이름의 변수를 생성하는것이 가능하다. 이는  서로 독립적이고 이름만 같은 별고의 변수 들입니다.
public class Method_03 {

public static void updateValue(int num) {
	num=100;
	System.out.printf("num -> %d\n",num);
}

	
public static void main(String[] args) {
	int num = 10;
	System.out.println(num);
	updateValue(num); //num=10 하지만 함수의 100사용나옴. 변수안의 값의 복사본이 전달됨. 원래의 원본에 영향 안줌!
	System.out.println(num);
}	
	
}
