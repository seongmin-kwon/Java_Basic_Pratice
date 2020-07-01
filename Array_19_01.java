package days07;

import java.util.Scanner;

public class Array_19_01 {
	public static void main(String[] args) {
		int[][] score = new int [3][4]; //3명의 학생의 3과목 저장 배열 마지막은 총점
		
		String[] name =new String[3];
		double[] ave = new double[3];
		
		//3명 이름 국영수 입력받아 성적표 출력 
		// 성적표에는 국영수 총점 평균 출력
		
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
		System.out.println("이름 과 점수를 입력해주세요");
		System.out.printf("%d번 학생의 이름: ",i+1);
		name[i]=sc.nextLine();
		
		System.out.printf("%d번 학생의 국어, 영어, 수학, 점수를 각각 입력하세요!\n",i+1);
		System.out.printf("국어: ");
		score[i][0]=sc.nextInt();
		System.out.printf("수학: ");
		
		score[i][1]=sc.nextInt();
		System.out.printf("영어: ");
		score[i][2]=sc.nextInt();
		sc.nextLine(); //마지막 \n도 문자로 인식해서 들어가기에 이것이씹히는것을 막기위함.
		ave[i]=(double)(score[i][0]+score[i][1]+score[i][2])/3.0;
		
		}
		System.out.println("성적표출력");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < score.length; i++) {
			
				System.out.printf("%3d\t%s\t%3d\t%3d\t%3d\t%3d\t%3.1f ",i+1,name[i],score[i][0],score[i][1],score[i][2],(score[i][0]+score[i][1]+score[i][2]),ave[i]);
			
			System.out.println();
		}
		
	}

	}
