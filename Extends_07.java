package days12;

class SuperE {
	int x = 10;
	SuperE(int a) {
		x = a;
	}
	SuperE(int a,int b) {
		x = a;
	}

	void superEMethod() {
		System.out.println("suprtEMethod.exe");
		System.out.println("this.x= " + this.x);
	}
}

class SubE extends SuperE{
	int y = 20;
	SubE(int a, int b){
		super(a);
		y=b;
	}
	void subE() {
		System.out.println("subEMethod 실행\n this.x = " +this.x +"\nsuper.x=");
	}
}


class SubsubE extends SuperE{
	int z=30;
	SubsubE(int a,int b,int c){
		super(a,b);
		z=c;
	}
		void SubsubEMethod() {
			System.out.println("SubsubEMethod()실행 \n this.x = " +this.x+"super.x = "+super.x);
			
		}
	}

public class Extends_07 {
	public static void main(String[] args) {
		SuperE s = new SuperE(100);
		s.superEMethod();
		SubE s1 = new SubE(200,300);
		s1.superEMethod();
	}
}
