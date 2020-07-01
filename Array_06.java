package days06;

import java.util.Scanner;

public class Array_06 {
	//배열의 길이 length
	public static int getSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
	}
	 public static float getMean(int[] numbers) {
	        int sum = getSum(numbers);   
	        return ((float)sum) / ((float)numbers.length);
	    }
public static void main(String[] args) {
	

	Scanner sc =new Scanner(System.in);

	System.out.printf("과목수 :");
	int subjectNum =sc.nextInt();
	int[] score = new int[subjectNum];
	int sum1=0;
	int i=0;
	int j=0;
	int k=0;
	
	
		while(j < subjectNum) {
			System.out.printf("%d번과목 점수:",j+1);
			score[j]=sc.nextInt();
			j++;
		}
		System.out.printf("총점:%d, 평균:%.1f\n",getSum(score),getMean(score));

	
}
	
}