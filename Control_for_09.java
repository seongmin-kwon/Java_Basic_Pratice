package days05;

public class Control_for_09 {
public static void main(String[] args) {
	//1~100홀수 들의 합을 출력 하기
	int i=0;
	int sum1 =0;
	for (i = 1; i <= 100; i=i+2) {
		//홀수 if(i%2==1)
		sum1+=i;
		System.out.printf("%2d부터%2d까지의 합: %2d\n ",1,i,sum1);
		
		
	for (int j = 1; j <100; j++) {
		//continue: 반복실행문 안에서 countinu라는 명령을 만나면 현재 반복을 중단되고
		//다음 반복 실행을 진행. 즉 i가짝수 일때 는 넘어감.. 홀수 만 실행함.
		//반복문에서 break는 아이에 loop블록를 탈출함. 다음의 추가적 반복실행도 종료!
		if(i%2==0) continue;
		sum1+=i;
		System.out.printf("%2d부터%2d까지의 합: %2d\n ",1,i,sum1);
		break;
		
	}	
		
	}
	
}
}
