package days04;

import java.util.Random;

public class ksm_test01 {
public static void main(String[] args) {

	Random rand = new Random(); 
	for(int i = 0; i < 10; i++) {
	    int iValue = rand.nextInt(10);  // 0 <= iValue < 10
	    System.out.println(iValue);
	}
  
}
}
