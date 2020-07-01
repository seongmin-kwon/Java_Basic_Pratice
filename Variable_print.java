package days03;

import java.util.Scanner;

public class Variable_print {
public static void main(String[] args) {
	//포장할 사과의 개수 , 1개의 상자의 들어갈 사과의 갯수 입력 후 
	//포장된 사과박스의 개수:?
	//남은 사과의 개수:?
	
	Scanner sc = new Scanner(System.in);
	int moc = 0;
	int na = 0;
	System.out.printf("포장할 사과의 개수:");
	int apple = sc.nextInt();
	System.out.printf("1개의 박스에 들어갈수 있는 사과의 개수를 입력하세요:");
	int box = sc.nextInt();
	
	moc=apple / box;
	na = apple%box;
	
	System.out.printf("포장된 사과상자의 개수: %d개\n",moc);
	System.out.printf("남은 사과의 개수: %d개",na);
	
	
	
	
	
	
	
	
}
}
