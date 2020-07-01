package days06;

import java.util.Scanner;

public class Array_04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.printf("국어 점수를 입력:");
	int kor = sc.nextInt();
	System.out.printf("수학 점수를 입력:");
	int math = sc.nextInt();
	System.out.printf("영어 점수를 입력:");
	int eng = sc.nextInt();
	double avg =(kor+math+eng)/3.0;
	int[] ga=new int[3];
	ga[0] = kor;
	ga[1] = math;
	ga[2] = eng;
	
	if (kor>=40 && math>=40 && eng >=40) {
		if(avg>=60) {
			System.out.printf("평균 %.1f점 합격입니다.",avg);
			
		}else {
			System.out.printf("평균 %.1f점 점수 미달로 불합격입니다.",avg);
		}//40 점 미만인 값만 출력 하고싶다.
	}else {
		for (int i = 0; i < ga.length; i++) {
			if(i==0&&ga[i]<40) {
				System.out.printf("%d점 국어 점수 과락\n",kor);
			}else if(i==1&&ga[i]<40) {
				System.out.printf("%d점 수학 점수 과락\n",math);
			}else if(i==2&&ga[i]<40) {
				System.out.printf("%d점 영어 점수 과락\n",eng);
			}
			
		}
		
		//조건이 추가될때 if문을 추가해보자.
	}
	
}

}
