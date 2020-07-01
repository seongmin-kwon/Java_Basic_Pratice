package days11;
//복소수 : 3+5i ->i는 루트 -1이다.(제곱해서 -1이되는수 =허수 )

class Complex {
	private int real; // 실수부 자료 저장용 변수
	private int image; // 허수부 자료 저장용 변수

	public Complex() {
		real = 10;
		image = 20;
	}

	Complex(int real, int image) {
		this.real = real;
		this.image = image;
	}

	public void prn() {
		System.out.println(real + "+" + image + "i");
	}

	public Complex add(Complex a) {
		Complex d= new Complex();
		d.real = this.real + a.real;
		d.image = this.image + a.image;
		return d;

	}

	public Complex minus(Complex c) {
		Complex n= new Complex();
		n.real = this.real - c.real;
		n.image = this.image - c.image;
		return n;
	}

}

public class Class_20 {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex(7, 8);
		Complex c3;
		c1.prn();
		c2.prn();
		c3 = c1.add(c2); // (5+3i) + (2+2i) ->(7+6i)
		c3.prn();
		c3 = c1.minus(c2);// (5+3i) - (2+2i) ->(3+1i)
		c3.prn();
	}
}
