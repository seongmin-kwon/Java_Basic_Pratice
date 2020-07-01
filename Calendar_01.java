package days13;

import java.util.Calendar;

public class Calendar_01 {
	public static void main(String[] args) {
		Calendar today =Calendar.getInstance(); //오늘날자.
		//싱글톤 방식의 클래스   ->  Calendar 구현
		//생성자가 private으로 -- 접근 차단됨(외부에서 접근 금지 new calendar() 사용못함.)
		//유일하게 실행된 new Calendar()는 클래스 내부에서 실행되어 
		//클래스 내부에 단하나로 생성된 레퍼런스 변수에 주소를 저장합니다.
		//그리고 그 레퍼런스 변수가 갖고있는 주소를 리턴하는 public static 형태의 getInstance메서드로
		//인스턴스 주소를 리턴 받아씁니다.
		//이후 다시 getInstance() 메서드가 실샣 되도록 현제 heap에 이미 인스턴스의 주소가 리턴됩니다.
		System.out.println("년도: "+ today.get(Calendar.YEAR));
		int i = today.get(Calendar.MONTH);
		System.out.println("월:(0~11) "+ "(i+1)+월");  //달은 1월이 0 이고 12월이 11이다 즉1 더해야 맞음!!! 꼭기억해
		i = today.get(Calendar.DATE);
		System.out.println("이달의 몇일 : "+i);
		i =today.get(Calendar.WEEK_OF_YEAR);
		System.out.println("금년의 몇째주 :" +i);
		i =today.get(Calendar.WEEK_OF_MONTH);
		System.out.println("이달의 몇째주 :" +i);
		
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.DATE);

		i = today.get(Calendar.DAY_OF_YEAR);
		System.out.println("이해의 몇 일:"+i);
		i=today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1~7,1:일요일)"+i);
		i =today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("이달의 몇쨰 요일:" +i);
		System.out.println("이달의 마지막 날:"+today.getActualMaximum(Calendar.DATE));
		
		//프로그램이 시작되어 Calendar인스턴스가 만들어진 시점
		//시:분:초:1/1000초(밀리초)
		
		System.out.println("오전_오후(0:오전,1:오후):"+today.get(Calendar.AM_PM));
		System.out.println("시간 0~11:"+today.get(Calendar.HOUR));
		System.out.println("시간 0 ~23:"+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분:"+today.get(Calendar.MINUTE));
		System.out.println("초:"+today.get(Calendar.SECOND));
		System.out.println("밀리초:"+today.get(Calendar.MILLISECOND));
		
		
		
	}
}
