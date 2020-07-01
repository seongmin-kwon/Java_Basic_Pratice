package days06;

import java.util.Scanner;

public class ControlOp_03 {
	public static void main(String[] args) {
		//년월일을 입력 받아 해달 날자의 요일을 구하는 프로그램을 작성 하시오.
		//원하는 년도의 달력 을 만들자
		  Scanner sc = new Scanner(System.in);
		  int m, d, days=0, t , y; //m:월,d:일, t:요일에 해당하는 날자, y:년도, days : 날자들의 합
		  int i =0; //loop용도
		  System.out.println("달력 출력!");
		  System.out.printf("년 입력 : ");
		  y = sc.nextInt();
		  System.out.printf("월 입력 : ");
		  m = sc.nextInt();
//		  System.out.printf("일 입력 : ");
//		  d = sc.nextInt(); 
		
		  
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
		  days = days + 1;
		  t = days % 7;
		  System.out.println();
		  System.out.println( y + "년  " + m + "월");
		  System.out.println("-----------------------------------------------");
		  System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		  System.out.println("-----------------------------------------------");
		  int start = 0,cnt=0;
		  switch (t) {    // 달력의 시작을 정해줌.
		  case 1:start =0; break;
		  case 2:start =-1; break;
		  case 3:start =-2; break;
		  case 4:start =-3; break;
		  case 5:start =-4; break;
		  case 6:start =-5; break;
		  case 0:start =1; break;
		  
		  }
		  int last=0; //그달의 말일까지 결정하는것
		  switch(m) {
		  case 1:last =31; break;
		  case 2:
			  if( (y%4 == 0) && ( y%100 != 0) || ( y%400 ==0 ) ) last =29;
			   else days =28;
			   break;
		  case 3:last =31; break;
		  case 4:last =30; break;
		  case 5:last =31; break;
		  case 6:last =30; break;
		  case 7:last =31; break;
		  case 8:last =31; break;
		  case 9:last =30; break;
		  case 10:last =31; break;
		  case 11:last =30; break;
		  case 12:last =31; break;
		  
		  
		  }
		  
		  for (i =start; i <= last; i++) {
			 cnt++;
			 if(i <=0) System.out.println("\t");	 
			 else System.out.printf("%2d\t",i);
			if(cnt%7==0)System.out.println();
		}
		 }

		}



