package days02;

public class Variable_08 {
public static void main(String[] args) {
	// 문자 타입의 변수 초기화 : 하나의 글자를 다른 데이터와 구분하기 위해 (' ') 작은 따옴표 사용
	  // (" ") 큰따옴표는 하나이상의 데이터가 될 가능성이 있는 문자열이며, 문자 데이터와 구분됨
	  char ch = 'A';
	  // printf 에서 문자데이터에 쓰이는 이스케이프 문자는 %c
	  System.out.printf("ch -> %c\n", ch);
	  // 문자가 저장될때는 문자 코드표(ASCII 코드)에 정의된 정수값(실제저장은 이진수)으로 저장.
	  // 문자의 정수값을 추출하기 위해서 형변환
	  // (형변환(캐스트연산) : 데이터의 타입을 임시로 변경하는 연산 -> (자료형)변경할값/변수)
	  System.out.printf("ch -> %d\n", (int)ch);
	  System.out.printf("A -> %d, a -> %d\n", (int)'A', (int)'a');
	  // 대소문자 변환  A : 65, a : 97, 0 : 48
	  // 대문자 A 값에 32를 더하여 소문자 a 로 변경
	  System.out.printf("%c + 32 -> %c\n", ch, ch + 32);
	  // 소문자 a와 대문자 A 사이의 간격을 계산형 대문자를 소문자로 변경
	  // 문자 데이터(char)에 +, - 연산은 해당 글자의 아스키 코드값에서 산술덧셈 뺄셈이 실행되고
	  // 결과의 아스키 코드 값이 남습니다. 그값이 %d 와 %c 로 모두 표현 가능합니다
	  System.out.printf("%c + ('a' - 'A') -> %c\n", ch, ch + ('a' - 'A'));
	  System.out.printf(" '0' -> %d\n", (int)'0');
	  System.out.printf(" '8' -> %d\n", (int)'8');
	  System.out.printf(" '8'-'0' -> %d\n", '8'-'0');
	  
	  
	  // 실수형 변수의 초기화
	  // 자바언어에서는 모든 실수를 double 타입으로 인지합니다. (8 byte 크기로 처리)
	  // float 타입으로 실수를 저장하기 위해서 float 형 실수로 선언해야 합니다.
	  // 실수값f, 실수값F -> 4Byte 크기의 실수로 처리
	  // 아래의 코드는 8 Byte 크기의 double 형을 float 대입하는 코드
	  // float f = 1.1  - 에러;
	  // float 타입의 실수 값을 사용하여 초기화하려면 아래와 같이 기술합니다
	  float f1 = 1.1f;
	  float f2 = 1.1F;
	  // 형변환을 사용한 float 타입 변수의 초기화
	  float f3 = (float)1.1;
	  // 출력형식은 double 과 같은 형식이 사용됩니다.
	  System.out.printf("%.1f\t%.1f\t%.1f\n", f1, f2, f3);
	  
	  String str = "abcdefg";
	  //문자열 변수는 기본 자료형은 아니지만 기본 자료형처럼 사용할 수 있게 만든 유일한 자료형
	  //변수에 자유롭게 값을 대입하고 변경할 수 있으며, %s 출력가능
	  //엄밀히 말하면 String 변수는 기본 자료형 변수가 아니라   참조형(reference) 변수라고 부릅니다
	  //참조형 변수는  배열 단원에서 자세히 다룹니다
	  System.out.printf("출력 문자열 : %s", str);
	  //데이터의 공간 제약 없다.
	 }
	}
	
