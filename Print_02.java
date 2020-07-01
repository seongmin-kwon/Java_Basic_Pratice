package days02;

/*
 * 자바언어는 블럭구조를 지향하는 언어
 * 특정 영역을 지정하는 경우 중괄호로 시작하여 중괄호로 끝납니다.
 * {~~}
 * 복수개의 중괄호들은 각각 독립적이거나 포함 관계에 있습니다.
 * {} {}
 * {{ }}
 * 서로의 위치와 포함관계를 구분하기위해 들여쓰기를 사용하며, 서로 엇갈린 위치에 위치할 수 없습니다.
 * {
 *  	{
 *  
 * 		 }
 * }
 * */


public class Print_02 {
	public static void main(String[] args) {
		System.out.printf("printf() 는 특별히 형식화된 출력이 가능하다.\n");
		System.out.printf("%d x %d = %d" ,56, 69, 56*69);
		System.out.printf("%d / %d = %.2f\n ",26,13,27/13.0);
		System.out.printf("안녕하세요 %s\n","여러분");
		System.out.printf("%d %% %d = %.2f\n",56,23,56%32.0);
		
	}
}
