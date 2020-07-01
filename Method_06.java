package days08;
// 리턴값이 존재하는 메소드 선언
// 메서드 호출후 메서드에서 계산되어 진 결과를 반환
//return 을 이용

public class Method_06 {
	
	public static int squar(int num) {
		int result = num * num;
		return  result;
		
	}
	public static int max(int a, int b, int c) {
		int max_result =a;
		if(a<b) {
			max_result=b;
		}else if(a<c) {
			max_result=c;
		}else {
		}
		return max_result;
		
		
	}
	
	public static void main(String[] args) {
		int num =77;
		int k ;
		k = squar(num); 
		System.out.printf("%d의 제곱은%d입니다.\n",num,k);
		int max_result = max(10,5,17);
		System.out.printf("그중 가장큰수는 %d\n",max_result);
		//함수 사용과 형태
		//abc() -전달인수 x리턴x
		//abc(12,13) -전달인수2개 o 리턴x
		//k=abc()  - 전달인수 x 리턴 o
		//k=abc(12,13) -전달인수2개 o 리턴o
	}
}
