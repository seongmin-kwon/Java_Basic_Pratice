package days17;
/*
 *입출력
 *자바에서 입출력은 스트림의 개념을 사용합니다.
 *스트림은 단방향 통신 을의미합니다.
 *입력과출력에 관한 스트림이 각각 클래스로 제공됩니다.
 *모든 입출력 클래스는 JAVA.IO 패키지에 정의되어있다.
 * 
 */

import java.io.IOException;

/*
 * 입출력 클래스
 * 1. 바이트 타입
 * -이진 데이터 (눈으로 읽을 수 없는 데이터):이미지 실행 파일 엑셀 파일 등등
 * -InputStream(입력의 최상위 부모 클래스), - OutPutStream(출력의 최상위 부모 클래스)
 * 2.문자 타입 
 * -텍스트 데이터 : txt파일과 같은 애용을 처리할 수있는 클래스
 * -Reader입력의 최상위 클래스  -Writer 출력의 최상위 부모 클래스
 * 
 */

public class IO_01 {
	public static void main(String[] args) throws IOException {
		//Scanner sc =new Scanner(System.in);기본입력 -키보드 입력
		//Scaner 없이 (System.in) 객체를 사용하여 기본입력을 처리할 수있다.
		//자바의 모든 입출력 작업은 명시적으로 예외처리를 선언해야합니다.
		//안그럼..IOException 발생됨: System.in.reaa();
		System.out.println("정수를 입력하세요: ");
		try {
			int num =System.in.read(); //바이트 입출력클래스
			//위와같은바이트 입출력 클래스는 스티림으로 부터 1바이트씩 읽거나 쓸수 있다.
			//기본 입력을 제공하는 System.in 객체는 키보드와 연결된 기본입력 스트림으로 부터
			//1바이트씩 읽어 올수 있으며, 읽어들이는값은 문자의(아스키코드)이다.
			//따라서 넘에 A -65 ,0 -48, a-97이 저장된다.,
			System.out.printf("입력된 정수 : %d\n",num);
			System.out.printf("입력된 문자 : %c\n", (char)num);	
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(" 예외발생");
		}catch(Exception e1) {
			System.out.println(" 예외발생");
	}
		//입력 스트림의 동작 방식
		//입력 스트림의 경우 데이터를 입력받을 버퍼를 검색하여 해당 버퍼에 내용이 존재하지않는경우
		//버퍼에 데이터 가 쌓일때까지 대기함(키보드 입력의 경우 사용자가 데이터를 입력하고 엔터키를입력할때까지)
		//연결된 버퍼에 데이터가 존재하는경우 , 해당 버퍼에서 
		//바이트 스트림은 1byte씩 데이터를 읽어오고 , 문자 스트림의 경우 2byte씩 데이터를읽어온다.
		int input;
		System.in.read();
		System.in.read();
		System.out.println("키보드 입력");
		input = System.in.read();
		System.out.printf("입력된 정수 : %d\n",input);
		System.out.printf("입력된 문자 : %c\n", (char)input);	
		//기본입력은 1바이트 읽기실행 
	}
}
