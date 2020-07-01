package days14;



import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;

public class Calendar_00 {

   public static void main(String[] args) {
      Calendar sDay = Calendar.getInstance();
      Calendar eDay = Calendar.getInstance();
      Calendar temp  = Calendar.getInstance();
      int year;
      int month;
      int input=0;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("년도 입력 : ");
      year = sc.nextInt();
      System.out.println("월 입력 : ");
      month = sc.nextInt();
      sDay.set(year , month-1,1);
      eDay.set(year,month,1);
      eDay.add(Calendar.DATE,-1);
      temp.set(year, month-1,1);
      temp.add(Calendar.DATE,-1);
      
      int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
      System.out.println(START_WEEK);
      System.out.println("\n" + year + "년 " + month + "월 ");
      System.out.println("일\t월\t화\t수\t목\t금\t토");
      System.out.println("----------------------------------------");
      int p = START_WEEK-2;
      for(int i = 1; i<START_WEEK; i++) {
         System.out.printf("%d\t",temp.get(Calendar.DATE)-p);
         p--;
      }
      for(int i = 1; i<=eDay.get(Calendar.DATE); i++) {
         System.out.printf("%d\t",i);
         if(START_WEEK%7==0) {
            System.out.println();
         }
            START_WEEK++;
            
         }
   }

}