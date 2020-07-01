package days07;

import java.util.Random;

public class Arary_11 {
	public static void main(String[] args) {
		  Random rd = new Random();
		  int[] a = new int[6];
		  int i, j;
		  
		  for(i=0; i<a.length; i++) {  //0~5 
		   a[i] = rd.nextInt();
		   if(a[i] < 0) a[i]=a[i]*-1;   //음수는 양수로
		   a[i] =  a[i] % 45 + 1; //1~45 사이 난수
		   for(j=0;j<i;j++) { //i가 0일때 j<0까지 임으로 한번 실행 하지 않음.
			   if(a[j]==a[i]) {    //두 숫자를 비교 같은 값이 나오면 반복 멈춤.
				   break;
			   }
		   } //같은 값 없이 반복실행이 진행 되어도 반복을 멈추자. i==j인경우를 의미!
		   if(i!=j) {
			   i--;// 상당히 위험한 행동!
		   }
		  }
		  
		  for(i =0; i<a.length; i++) {   //오름 차순 정렬
		   for(j = i+1; j<a.length; j++) {
		    if(a[i] > a[j]) {
		     int temp = a[i];
		     a[i] = a[j];
		     a[j] = temp;
		    }
		   }
		  }
		  
		  for(i=0; i<a.length; i++) System.out.printf("%d ", a[i]);

		 }

		}




