package days08;

public class Array_23 {
	// 달팽이 1
		public static void main(String[] args) {
			int [][] a = new int [5][5]; // 행 개수
			int k=0,i,j,c,b;// i,j는 배열용 ,  c,b는 반복실행용
			int d = 4; //현재 진행 횟수(0~4)5번 을 저장한 변수
			i=0;
			j=-1;
			int sw =1;
			while(k<=25) {  //반드시 25번을 반복하는명령은 아님
				for(c=0; c<=d; c++) {//1. d=4회 반복  3.d=3(4회) , 5. d=2(3회) 7. d=1(2회)9.d=0(1회)
				
				j=j+sw;
				a[i][j]= ++k;
				}
				d--;
				if(d<0) break;
				for (c = 0;  c<=d; c++) {// 2. d=3(4회), 4. d=2(3회)  6. d=1(2회)  8. d=0(1회)   10. d=-1 (0회)

					i=i+sw;
					a[i][j] = ++k;
				}
				sw=sw*(-1);				
						
			}
				

			for (i = 0; i < a.length; i++) {
				for (j = 0; j < a[i].length; j++) {
					System.out.printf("%2d ", a[i][j]);
				}
				System.out.println();
			}
		}
		}

