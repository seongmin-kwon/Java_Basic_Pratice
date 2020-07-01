package days08;

public class Method_05 {
	
	
	
	public static void gugudan(int i ) {
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d x %d = %d\n",i,j,i*j);
			
		}
	}
	public static void main(String[] args) {
		gugudan(2);
		gugudan(6);
		gugudan(19);
		
	}
}
