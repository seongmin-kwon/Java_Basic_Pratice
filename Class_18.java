package days10;
class StaticC{
	static int count=0;
	int num;
	public StaticC() {
		this.num =count++; //생성자 메서드에서 count 값을 1씩 증가시키며 , 그값을 num에 저장
	}
	//num 값은 객체가 만들어질때마다(생성자가 호출될때 마다) 1씩 증가하는 순차값으 갖게되며,
	//count값은 현재몇개가 만들어졌는지에도 활용할 수 있다.
}
public class Class_18 {
	int k=0;//? 전역 변수와 의 차이점?
	public static void main(String[] args) {
		StaticC c1 = new StaticC();
		System.out.printf("NUM = %d, count = %d\n",c1.num,StaticC.count);
		StaticC c2 = new StaticC();
		System.out.printf("NUM = %d, count = %d\n",c2.num,StaticC.count);
		StaticC c3 = new StaticC();
		System.out.printf("NUM = %d, count = %d\n",c3.num,StaticC.count);
	}

}
