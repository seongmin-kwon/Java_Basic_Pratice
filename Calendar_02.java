package days13;

import java.util.Calendar;

public class Calendar_02 {
	public static void printDate(Calendar date){
		String[] weekday = { "", "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(date.get(Calendar.YEAR) + "년" 
		         +(date.get(Calendar.MONTH)+1) + "월"
		         + date.get(Calendar.DATE) + "일"      
		         + weekday[date.get(Calendar.DAY_OF_WEEK) ]+ "요일");

	}
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2015,7,15);//원하는 특정 날짜로 객체를 재설정 , date2는 아직 오늘날자!
		
	//set메서드에 위와 같이항목 차례로 나열하면 해당 날짜로 기업합니다.
	//set메서드에 필드명과 값을 넣어주면 해당 값만 변경됩니다.
	//date1.set(Calendar.MONTH, 6) ->월만 7월로 바뀜
	
	//위 println 을 주석처리하고 아래와 같이 메서드를 호출하면 위 println과 같은 출력이되는
	//메소드를 제작하세요
	
	printDate(date2);
}
}