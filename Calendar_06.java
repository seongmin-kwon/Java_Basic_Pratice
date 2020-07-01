package days13;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_06 {
	public static void main(String[] args) {
		// 1.해당월의 시작날짜와 끝날자 을 저장할 켈린거 객체를생성합니다.
		Calendar sDay = Calendar.getInstance();// 시작일
		Calendar eDay = Calendar.getInstance();// 끝일
		// 2. 출력할 달력을 위해 년도와 월을 입력 받습니다.
		int year;
		int month;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요.");
		System.out.println("년도:");
		year = sc.nextInt();
		System.out.println("월:");
		month = sc.nextInt();
		
	//	while(input!=3) {
			
		// 3.입력받은 월의 시작날짜로 시작객체 변수를 세팅합니다.
		sDay.set(year, month - 1, 1); // 월+1로나오니 -1로입력과 맞춰주자.
		// 4.입력 받은 월의 끝날짜로 끝날짜 객체 변수를 세팅합니다.
		eDay.set(year, month, 1);// 입력 달의 다음달 1일 셋팅
		eDay.add(Calendar.DATE, -1);// 다음달 1일로 세팅해서 하루뺀 마지막달!
		// 5.시작날짜의 요일을 계산합니다.
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		int END_WEEK = eDay.get(Calendar.DAY_OF_WEEK);
		System.out.println(START_WEEK);
		// 5-1달력 타이틀 출력
		System.out.println("\n" + year + "년" + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------------------------");
		// 6.시작 날짜의 요일(숫자,일요일1) 까지 0부터 시작해서 빈칸을 채웁니다.
		sDay.add(Calendar.DATE, (START_WEEK - 1) * (-1));
		eDay.add(Calendar.DATE, 7 - END_WEEK);
		for (int i = 1; i <= eDay.get(Calendar.DATE); sDay.add(Calendar.DATE, 1)) {
			int day = sDay.get(Calendar.DATE);
			System.out.printf("%2d\t", day);
			if (i++%7 == 0) {
				System.out.println();
			}
		}

		// 이번 달력의 1일 이전 부분에 해당하는 빈칸의 수 를 알아야한다.
		// 전달의 마지막 부분 날자수 알아야하고

		// t답
		// 현재출력할 달력이 2020년 5월 이라면 1일금요일
		// sDay 의 날짜 4월 26일 ,eday 의 말짜를 6월 6일로 설정
		// 참고로 5월 31일은 일요일
		// 달력 출렧; sDay부터 eDay까지년 월 뺴고 일만 출력
		// 일곱 번째 출력마다 줄바꿈
		}
	//}/
}
