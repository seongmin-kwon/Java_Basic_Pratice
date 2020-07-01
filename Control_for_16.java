package days05;

public class Control_for_16 {
public static void main(String[] args) {
	// 1부터 100 사이의  프라임 넘버 소수 를 찾아서 출력
	//소수 : 1과 자기자신으로 만 나누어 떨어지는 약수 가 없는 숫자.
	//나머지가 0이었던 적이 딱 두번 나오는 숫자를 소수 화면에 출력
	//2,3,5,7
	int i = 2; // i : 나눌 대상
	boolean isPrime = true;
	while (i <= 1000) {
		isPrime = true;
		for (int n = 2; n < i; n++) {
			if (i % n == 0) {
				isPrime = false;
			}
			continue;
		}
		if (isPrime == true)
			System.out.printf("%d ",i);
		i++;
		if(i%100==0)System.out.println();
	}

}
}
		



