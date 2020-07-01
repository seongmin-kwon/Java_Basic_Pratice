package days05;
import java.util.Scanner;
public class Control_for_14 {
public static void main(String[] args) {
	//다양한 이중 for문 연습
	System.out.println("문제1");
	for (int i = 1; i <= 10; i++) {
		for( int j =0; j < i; j++) {
			System.out.printf("#");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("문제2");
	/*-------------------------------------------*/
	for (int i = 1; i <= 10; i++) {
		for( int j =10; i <=j; j--) {
			System.out.printf("#");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("문제3");
	/*-------------------------------------------*/
	for (int i = 1; i <= 10; i++) {
		for( int j =1; j <=10; j++) {
			
			if(j>=i) {
				System.out.printf("#");
				
			}else {
				System.out.printf(" ");
			}
			
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("문제4");
	/*-------------------------------------------*/
	for (int i = 10; i >=1 ; i--) {
		for( int j =1; j <=10; j++) {
			
			if(j>=i) {
				System.out.printf("#");
				
			}else {
				System.out.printf(" ");
			}
			
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("----------------------------------------------------------");
	System.out.println("문제5");
	/*-------------------------------------------*/
	for (int i=0;i<=10;i++){
		  for (int j=1; j<=9+i;j++)
		  {
		     if (j>=11-i) {
		    	 System.out.print("#");
		     }else {
		    	 System.out.print(" ");
		     }
		        
		  }
		  System.out.println();
	}
	for (int i=10;i>=1;i--){
		  for (int j=1; j<=9+i;j++)
		  {
		     if (j>=11-i) {
		    	 System.out.print("#");
		     }else {
		    	 System.out.print(" ");
		     }
		        
		  }
		  System.out.println();
	}
 }
}
