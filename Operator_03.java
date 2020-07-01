package days03;

public class Operator_03 {
public static void main(String[] args) {
	//관계 연산자  <> == != 
	
	int n1 =10;
	int n2 =5;
	boolean result = false;
	char c1 ='A' ,c2 = 'B';
	result = c1>c2;
	System.out.printf("%c>%c=%b\n",c1,c2,result);
	String s1 ="1234",s2="987";
	int r =s1.compareTo(s2); // s1과 s2가 문자가 같은지 다른 지 알려줌  문자들의 비교는 왼쪽부터   
	//1-9 =-8 그래서 987이 더 크다. 
}
}
