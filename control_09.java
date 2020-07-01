package days03;

import java.util.Scanner;

public class control_09 {
public static void main(String[] args) {
	//문제
		//2020년 1월 1일 -> 목요일
		//2020년에한해서 월과 일을 입력받아 무슨요일인지 출력!
		//일수 ->1:31 2:29 3:31 4:30 5:31 6:31 7:31 8:31 9:30 10:31 11:30 12:31
		//월과 일을 입력받습니다.
		int sumM =0; //합산 날자수
		int Tday=0;
		Scanner sc =new Scanner(System.in);
		System.out.printf("월을 입력하세요:");
		int month = sc.nextInt();
		
		System.out.printf("일을 입력하세요:");
		int day = sc.nextInt();
		
		System.out.printf("입력한 날자는 2020년 %d월 %d일 입니다.\n",month, day);
		
		//입력된 월의 전달까지의 날자를 합산

		//입력된 일값을 합산
		
		//합산된 총날자를 7로 나눈 나머지를 계산 만약 나머지가 1=목 2=금..
		
		//요일을 출력한다.
		switch (month) {
		case 1:sumM=0;Tday = (sumM+day)%7;break;
		case 2:sumM=31;Tday = (sumM+day)%7;break;
		case 3:sumM=31+29;Tday = (sumM+day)%7;break;
		case 4:sumM=31+29+31;Tday = (sumM+day)%7;break;
		case 5:sumM=31+29+31+30;Tday = (sumM+day)%7;break;
		case 6:sumM=31+29+31+30+31;Tday = (sumM+day)%7;break;
		case 7:sumM=31+29+31+30+31+31;Tday = (sumM+day)%7;break;
		case 8:sumM=31+29+31+30+31+31+31;Tday = (sumM+day)%7;break;
		case 9:sumM=31+29+31+30+31+31+31+31;Tday = (sumM+day)%7;break;
		case 10:sumM=31+29+31+30+31+31+31+31+30;Tday = (sumM+day)%7;break;
		case 11:sumM=31+29+31+30+31+31+31+31+30+31;Tday = (sumM+day)%7;break;
		case 12:sumM=31+29+31+30+31+31+31+31+30+31+30;Tday = (sumM+day)%7;break;
		}
		/*   - 이렇게 break를 안쓰고 합을 이용하면 좋다.
		switch (month) {
		case 12:sumM=SumM + 30;
		case 11:sumM=SumM + 31;
		case 10:sumM=SumM + 30;
		case 9:sumM=SumM + 31;
		case 8:sumM=SumM + 31;
		case 7:sumM=SumM + 30;
		case 6:sumM=SumM + 31;
		case 5:sumM=SumM + 30;
		case 4:sumM=SumM + 31;
		case 3:sumM=SumM + 29;
		case 2:sumM=SumM + 31;
		case 1:sumM=SumM + 0;
		}
		*/
		
		switch(Tday) {
		case 1:System.out.printf("입력한 날자는 2020년 %d월 %d일은 수요일 입니다.\n",month, day);break;
		case 2:System.out.printf("입력한 날자는 2020년 %d월 %d일은 목요일 입니다.\n",month, day);break;
		case 3:System.out.printf("입력한 날자는 2020년 %d월 %d일은 금요일 입니다.\n",month, day);break;
		case 4:System.out.printf("입력한 날자는 2020년 %d월 %d일은 토요일 입니다.\n",month, day);break;
		case 5:System.out.printf("입력한 날자는 2020년 %d월 %d일은 일요일 입니다.\n",month, day);break;
		case 6:System.out.printf("입력한 날자는 2020년 %d월 %d일은 월요일 입니다.\n",month, day);break;
		case 0:System.out.printf("입력한 날자는 2020년 %d월 %d일은 화요일 입니다.\n",month, day);break;
		}
		
}
}
