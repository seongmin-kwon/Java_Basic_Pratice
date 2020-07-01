package days04;

import java.util.Scanner;

public class Control_13 {
	//과락 40점 , 평균 60점이상 합격
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("국어 점수를 입력:");
		int kor = sc.nextInt();
		System.out.printf("수학 점수를 입력:");
		int math = sc.nextInt();
		System.out.printf("영어 점수를 입력:");
		int eng = sc.nextInt();
		double avg =(kor+math+eng)/3.0;
		
		if (kor>=40 && math>=40 && eng >=40) {
			if(avg>=60) {
				System.out.printf("평균 %.1f점 합격입니다.",avg);
				
			}else {
				System.out.printf("평균 %.1f점 점수 미달로 불합격입니다.",avg);
			}
		}else {
			System.out.printf("점수 미달로 과락 불합격입니다.");
		}
		
	}

}
