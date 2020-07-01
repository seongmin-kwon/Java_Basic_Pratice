package days13;

import java.util.Calendar;

public class Calendar_03 {
	public static void printTime(Calendar time){
		System.out.println("time:" 
				+time.get(Calendar.HOUR_OF_DAY) + "시" 
		         +(time.get(Calendar.MINUTE)) + "분"
		         + time.get(Calendar.SECOND) + "초"      
		         + time.get(Calendar.MILLISECOND)+"(1/1000초)밀리초");
	}
	
	public static void main(String[] args) {
		Calendar time1 =Calendar.getInstance();
		time1.set(Calendar.HOUR ,10);
		printTime(time1);
		
	}
}
