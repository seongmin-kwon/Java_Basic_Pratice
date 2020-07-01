package days04;

public class Control_for_02 {
public static void main(String[] args) {
	int i =0;
	System.out.println("1~100  짝수 출력");
	for(i=1 ;i<=100;i++) {
		if(i%2==0) {
			System.out.printf("%d ",i);
		}
		if(i%10 ==0) {
			System.out.printf("\n",i);
		}
	}
	
	System.out.println("\n");
	
	
	System.out.println("홀수 출력1");
	for(i=1 ;i<=100;i++) {
		if(i%3==0) {
			System.out.printf("%d ",i);
		}
		if(i%10 ==0) {
			System.out.printf("\n",i);
		}
	}
	System.out.println("\n");
	
	
	
	int j=0;
	int[] arr = new int[50];
	System.out.println("홀수 출력2");
	for(i=1 ;i<=100;i+=2) {
		
			arr[j]=i;
			j++;
		
	}
	
	for(i=0;i<arr.length;i++) {
		
		if(i%10==0) {
			System.out.printf("\n");
		}
		System.out.printf("%d ",arr[i]);
		
	}
}
}
