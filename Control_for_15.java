package days05;

import java.util.Scanner;

public class Control_for_15 {
public static void main(String[] args) {
	String[] Arr1 = { "A", "B" , "C"};
	String[] Arr2 = { "C", "D", "F", "G", "H" };

	for(int i = 0; i < Arr1.length ; i++) {
		for(int j = 0; j< Arr2.length; j++) {
			if(Arr1[i] == Arr2[j]) {
				System.out.printf(Arr2[j]);
			}
			
		}
	}
	Scanner sc =  new Scanner(System.in);
	int[] a=new int[100];
	System.out.println("두수 를 입력 받아 공배수를 출력 합니다.");
	int i=1;
	System.out.printf("입력1:");
	int input1= sc.nextInt();
	System.out.printf("입력2:");
	int input2= sc.nextInt();
	int small =0;
	int big=0;
	
	int[] arr1= new int[10];
	int[] arr2= new int[10];
	for (int j = 0; j < arr2.length; j++) {
		System.out.println(arr2[j]);
	}
	for (int j = 1; j < arr1.length; j++) {
		arr1[j]=j*input1;
		
	}
	for (int j = 1; j < arr1.length; j++) {
		arr2[j]=j*input1;
		
	}
	
	for(i = 0; i < arr1.length ; i++) {
		for(int j = 0; j< arr2.length; j++) {
			if(arr1[i] == arr2[j]) {
				System.out.printf("%d ",arr2[j]);
			}
			
		}
	}
	System.out.println();
	
	System.out.println(arr1[0]);
	System.out.println(arr2[0]);
}
}
