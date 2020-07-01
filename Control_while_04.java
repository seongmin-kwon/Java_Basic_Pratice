package days05;

import java.util.Scanner;

public class Control_while_04 {
	public static void main(String[] args) {
		//가위 바위 보  게임 만들기
		
		Scanner sc = new Scanner(System.in);
		int k=0;
		String input="";
		String op ="";
		int rand=(int)(Math.random()*3); //0,1,2
		if(rand==0) {
			op ="가위";
		}
		if(rand==1) {
			op ="바위";
		}
		if(rand==2) {
			op ="보";
		}
		
		
		while(!(input.equals("q"))){
		if(input.equals("q")) {
			break;
		}
		System.out.printf("가위, 바위, 보, 중 선택1 입력:");
		input =sc.next();
			
			//0 가위
			//1 바위
			//2 보
			
			if((input.equals("가위")&&op.equals("보"))||(input.equals("보")&&op.equals("주먹"))||(input.equals("주먹")&&op.equals("가위"))) {
				System.out.println("당신이 이겼습니다. ");
				
			}else if((input.equals("가위")&&op.equals("주먹"))||(input.equals("보")&&op.equals("가위"))||(input.equals("주먹")&&op.equals("보"))) {
			System.out.println("당신이 졌습니다 ㅠㅠ");
			
			
			}else if((input.equals("가위")&&op.equals("가위"))||(input.equals("보")&&op.equals("보"))||(input.equals("주먹")&&op.equals("주먹"))) {
			System.out.println("비겼습니다.");
				
			}else {
				break;
			}
	}
	}
}
