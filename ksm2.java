package days06;

import java.util.Scanner;

public class ksm2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("몇 개 짜리 Array만들까요?:");
	int input = sc.nextInt();
	
	int [] arr = new int[input];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i+1;
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	
	
}
}
