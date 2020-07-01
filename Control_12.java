package days04;

import java.util.Scanner;

public class Control_12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String level =sc.nextLine();
	System.out.printf("직급을 입력하세요: ");
	System.out.printf("판매 실적을 입력하세요: ");
	int work = sc.nextInt();
	switch (level) {
	case "과장" :
		System.out.printf("%s의 활동수당 : %d",level,(int)(work+(work*0.5)));
		break;
	case "대리" :
		System.out.printf("%s의 활동수당 : %d",level,(int)(work+(work*0.25)));
		break;
	case "사원" :
		System.out.printf("%s의 활동수당 : %d",level,(int)(work+(work*0.15)));
		break;
	default :
		System.out.printf("잘못된 출력 입니다.");
	//switch문의 default는 if else의  마지막 else의 사용과 같다.
	}
	
}
}
