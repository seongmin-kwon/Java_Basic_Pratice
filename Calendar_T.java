package days13;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_T {
	public static void main(String[] args) {
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		int year;
		int month;

		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		year = sc.nextInt();
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		int input = 0;
		while (input != 3) {
			sDay.set(year, month - 1, 1);
			eDay.set(year, month, 1);
			eDay.add(Calendar.DATE, -1);
			int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
			int END_WEEK = eDay.get(Calendar.DAY_OF_WEEK);
			System.out.println("\n" + year + "년  " + month + "월  ");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("----------------------------------------------");

			// 현재 출력할 달력이 2020년 5월 이라면(1일 금요일)
			sDay.add(Calendar.DATE, (START_WEEK - 1) * (-1));
			// sDay 의 날짜를 4월 26일(일요일)로, eDay 의 날짜를 6월 6일(토요일)로 설정
			eDay.add(Calendar.DATE, 7 - END_WEEK);
			// 참고로 5월 31일은 일요일
			// 달력 출력시 sDay 부터 eDay 까지 년 월 빼고 일만 출력
			for (int i = 1; sDay.before(eDay); sDay.add(Calendar.DATE, 1)) {
				//sDay.before(eDay) sDay가 eDay보다 이전이면 참 sDay를 늘려서 for 나아가야함.
				int day = sDay.get(Calendar.DATE); // 출력할 날짜의 일자 추출
				System.out.printf("%2d\t", day); // 일자 출력
				if (i++ % 7 == 0)
					System.out.println(); // 일곱번째 출력마다 줄바꿈
			}

			System.out.print("\n[이전달(1)] | [다음달(2)] | [종료(3)]");
			input = sc.nextInt();
			Calendar temp = Calendar.getInstance();
			if (input == 1) {
				temp.set(year, month - 1, 1);
				temp.add(Calendar.MONTH, -1);
				year = temp.get(Calendar.YEAR);
				month = temp.get(Calendar.MONTH) + 1;
			} else {
				temp.set(year, month - 1, 1);
				temp.add(Calendar.MONTH, 1);
				year = temp.get(Calendar.YEAR);
				month = temp.get(Calendar.MONTH) + 1;
			}

		}
	}
}
