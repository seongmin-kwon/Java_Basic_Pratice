package days06;

public class Array_07 {
public static void main(String[] args) {
	// 배열 최대값 최소값 찾기
	int[] a = {56,87,96,87,45,89,69,36,12,98};
	int max=a[0];
	int i,j;
	for ( i = 1; i < a.length; i++) {
		if(max<a[i]) {
			max = a[i];	
		}
	}
	
	System.out.println("최대값 : "+ max);
	
	int min=a[0];
	for ( i = 1; i < a.length; i++) {
		if(min>a[i]) min = a[i];
	}
	System.out.println("최소값 : "+ min);
	
	//정렬 하기
	int temp=0;
	for ( i = 0; i <a.length; i++) {
		for ( j = i+1; j < a.length; j++) {
			if(a[j]<a[i]) {  //오름차순 정렬if(a[j]<a[i]) ,내림차순if(a[j]>a[i])
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
	}
	
		
	}
	for ( i = 0; i < a.length; i++) {
		
		System.out.printf("%d ",a[i]);
	}
	
}
}
