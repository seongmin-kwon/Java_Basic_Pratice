package days03;
import java.util.Scanner;
public class control_06 {
	public static void main(String[] args) {
		//실습예제
		//년도를 입력받아 입력한 년도가 윤년인지 평년인지 출력하는 코드
		//윤년의 조건: 4의 배수 이면서 100의 배수가아니거나 400의 배수인해
		Scanner sc = new Scanner(System.in) ;
		System.out.printf("구하고자 하는 년도를 입력하세요:");
		int inputYear = sc.nextInt();
		int check1=inputYear%4;  //조건1
		int check2=inputYear%100; //조건2
		int check3 = inputYear%400; //조건3
		
		
			if((check1==0&&check2 != 0 )|| (check3 == 0)) {
				System.out.println("윤년입니다.");
			}else {
				System.out.println("평년 입니다.");
			}
			
		}// 2020년은 윤년 , 1900년은 평년이다.
// n의 4배수인지 아닌지 확인하는방법은 n%4==0 인것이다.

	}


