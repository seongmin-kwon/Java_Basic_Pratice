package days09;

public class Method_15 {
	public static void main(String[] args) {
//메서드 오버로딩을 하고자 ,전달인수의 요소들을 파악합니다.
//전달인수의 요소들이 개수만 다르고 ,자료형이 모두 같다면 메서드 하나만으로 처리 가능합니다.!!!
		int c;
		c=max(50,60,80,60,54,60);
		System.out.println("가장큰값 : "+ c);
		c= max(50,60,80,60,54,60,87,69);
		System.out.println("가장큰값 : "+ c);
	}
	
	public static int max(int...args) { //전달 인수 수만큼 배열로 전달, 주소값이 전달! , args는 배열 참조변수 의이름이다.
		int max=args[0] ;
		for (int i = 1; i < args.length; i++) {
			if(max<args[i]) max =args[i];
		}
		return max;
	}
}

