package days04;

import java.util.Scanner;

public class Control_for_08_yunyear {
public static void main(String[] args) {
	//년월일을 입력 받아 해달 날자의 요일을 구하는 프로그램을 작성 하시오.
	  Scanner sc = new Scanner(System.in);
	  int m, d, days=0, t , y; //m:월,d:일, t:요일에 해당하는 날자, y:년도, days : 날자들의 합
	  int i =0; //loop용도
	  System.out.printf("년 입력 : ");
	  y = sc.nextInt();
	  System.out.printf("월 입력 : ");
	  m = sc.nextInt();
	  System.out.printf("일 입력 : ");
	  d = sc.nextInt(); 
	  System.out.println("입력한 날짜 : " + y + "년  " + m + "월  " + d + "일");
	  
	  days = 365 * (y-1); //전년도 까지의 날자 합 365x전년도 days는 전년도 까지의 날자 합(아직 올해는 안더함.)
	  for(i=1; i<=y-1; i++)
	   if( (i%4 == 0) && ( i%100 != 0) || ( i%400 ==0 ) )
	    days++; //윤년인 경우는 366일임으로 하루 를 더해준다.
	   
	  switch(m) {
	  case 12: days = days + 30;
	  case 11: days = days + 31;
	  case 10: days = days + 30;
	  case 9: days = days + 31;
	  case 8: days = days + 31;
	  case 7: days = days + 30;
	  case 6: days = days + 31;
	  case 5: days = days + 30;
	  case 4: days = days + 31;
	  case 3: //days = days + 29;
	   if( (y%4 == 0) && ( y%100 != 0) || ( y%400 ==0 ) )  days = days + 29;
	   else days = days + 28;
	  case 2: days = days + 31;
	  case 1: days = days + 0;
	  }
	  days = days + d;
	  t = days % 7;
	  switch(t) {
	  case 1: System.out.println("월요일입니다"); break;
	  case 2: System.out.println("화요일입니다"); break;
	  case 3: System.out.println("수요일입니다"); break;
	  case 4: System.out.println("목요일입니다"); break;
	  case 5: System.out.println("금요일입니다"); break;
	  case 6: System.out.println("토요일입니다"); break;
	  case 0: System.out.println("일요일입니다"); break;
	  }
	 }

	}



