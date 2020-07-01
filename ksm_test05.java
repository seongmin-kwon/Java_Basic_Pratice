package days03;

import javax.swing.JOptionPane;

public class ksm_test05 {
	public static void main(String[] args) {
		//커피 메뉴를 출력하고 사용자의 입력에 따라 총 계산값 구하는 switch문 작성
	
	
		 String menu = "*** 커피 메뉴 ***\n";
	        menu += "1. 아메리카노    2000원\n";
	        menu += "2. 카페라떼    3500원\n";
	        menu += "3. 카라멜 마끼아또        5000원\n";
	        menu += "4. 자바칩 프라프치노    6500원\n";
	        menu += "5. 프로그램 종료\n";
	        
	        int sum = 0;
	        int exit = 0;
	        String bill = "*** 영수증 ***\n";
	        
	        while(true) {
	            
	            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu + "커피를 선택하세요."));
	            
	            switch (choice) {
	            case 1:
	                sum += 2000;
	                bill += "아메리카노    2000원\n";
	                break;
	                
	            case 2:
	                sum += 3500;
	                bill += "카페라떼    3500원\n";
	                break;
	                
	            case 3:
	                sum += 5000;
	                bill += "카라멜 마끼아또    5000원\n";
	                break;
	                
	            case 4:
	                sum += 6500;
	                bill += "자바칩 프라프치노    6500원\n";
	                break;
	                
	            case 5:
	                exit = -1;
	                break; 
	                
	            default:
	                JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
	            } // switch
	            
	            if (exit == -1) {
	                JOptionPane.showMessageDialog(null, "프로그램 종료");
	                break;
	            }
	        } // while
	        
	        bill += "--------------------\n";
	        bill += "총 합계:         " + sum + "원";
	        JOptionPane.showMessageDialog(null, bill);
	
	
	
	
	
	}

}
