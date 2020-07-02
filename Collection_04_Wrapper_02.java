package days15;

import java.math.BigInteger;

public class Collection_04_Wrapper_02 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<41;i++) {
			System.out.printf("%d!=%s%n",i,calcFactorial(i));
			Thread.sleep(300);// 0.3초 지연
		}
	}

	public static String calcFactorial(int i) {
		String result; 
		BigInteger n = BigInteger.valueOf(i);
		BigInteger fact = BigInteger.ONE; // FACT는 1로 계산용이다.
		for (BigInteger k = BigInteger.ONE; k.compareTo(n)<=0; k=k.add(BigInteger.ONE)) {
			fact =fact.multiply(k);
			
		}
		result =fact.toString();
		return result;
	}
}
