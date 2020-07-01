package days11;

//객체배열 
class Std {
	private int bun;
	private String name;
	private int[] score;
	private static int count;

	Std(int a, int b, int c) {
		score = new int[3];
		bun = ++count;
		name = "std" + bun;
		score[0] = a;
		score[1] = b;
		score[2] = c;
	}

}

public class Class_27 {
	public static void main(String[] args) {
		Std [] std=new Std[5];// 객체를 만든것이아닌 배열을 만드는명령,5개 참조변수가 배열로만들어짐.
	//Std std = new Std(1,2,3);	 이게객체만드는 명령이야
		std[0] = new Std(11,23,34);
		std[1] = new Std(11,23,34);
		std[2] = new Std(11,23,34);
		std[3] = new Std(11,23,34);
	}

}
