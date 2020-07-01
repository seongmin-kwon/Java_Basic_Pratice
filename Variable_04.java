package days02;

public class Variable_04 {
	public static int sumArr(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
public static void main(String[] args) {
	

int[] student1 = new int[] {80, 40, 75};
int[] student2 = new int[] {100, 80, 65};
int[] student3 = new int[] {110, 80, 85};
int[] totalSum =new int[] {sumArr(student1),sumArr(student2),sumArr(student3)};
double[] totalAvg = new double[] {sumArr(student1)/3.0,sumArr(student2)/3.0,sumArr(student3)/3.0};


System.out.println("\t\t###성적표###");
System.out.println("----------------------------------------");
System.out.println("번호\t성명\t\t국어 영어 수학 총점  평균");
System.out.println("----------------------------------------");
System.out.printf("%d \t%s\t\t%d  %d  %d  %d    %.2f\n",1,"학생1",student1[0],student1[1],student1[2],totalSum[0],totalAvg[0]);
System.out.printf("%d\t%s\t\t%d  %d  %d  %d   %.2f\n",1,"학생2",student2[0],student2[1],student2[2],totalSum[1],totalAvg[1]);
System.out.printf("%d\t%s\t\t%d  %d  %d  %d   %.2f\n",1,"학생3",student3[0],student3[1],student3[2],totalSum[2],totalAvg[2]);


    }
}
