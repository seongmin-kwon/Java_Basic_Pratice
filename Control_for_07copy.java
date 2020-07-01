package days04;
public class Control_for_07copy {
public static void main(String[] args) {
	// :1~100 (0,1,2),(1,2,3,),(2,3,4)...
	int i =1;
	for (i = 0; i < (100-2); i++) {
		if(i %7==0) {
			System.out.println("\n");
		}else
		
			System.out.printf("(%d,%d,%d)",i,i+1,i+2);
		
	}
	
    }
}
