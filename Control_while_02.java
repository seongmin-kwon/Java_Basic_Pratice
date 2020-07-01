package days05;

public class Control_while_02 {
public static void main(String[] args) {
	//for -> while
	int n=3,fact=1;
	while(n>1) {
		System.out.printf("%dx",n);
		fact =fact*n;
		n--;
	}
	System.out.println("1="+fact);
}
}
