package days15;
//컬렉션 프레임워크

//이들은 자료구조를 구현하고 있는 클래스이다.
//자료구조: 각가의 데이터들을 효율적으로 저장하고 운용하기 위한 방법론

import java.util.ArrayList;
import java.util.Vector;

//1.배열
/*
 * 다수개의 요소를 저장할 수 있음, 인덱싱이가능 단 크기가 고정되어 데이터의 중간 삽입과 중간 삭제가 비효율적이다.
 */

//2.리스트(List)
/*
 * 크기의 제약 없이 데이터를 저장할  수 있음. 데이터의 삽입과 삭제에 최적화
 * 검색에 취액 -참조값(주소)을 저장하기 때문에
 * 이를 개선하기위한 더블링크드 리스트를 사용하기도 함
 * 데이터를 저장시 불필요한 메모리 사용
 * 자바의 모든 자료구조 클래스(컬랙션)들은 java.util 패키지를 통해 제공 받을 수있음.
 * 위와같은 동적 배열을 구현하고 있는 클래스들 -Vector, ArrayList(가장많이사용)
 */

//3. Set타입의 저장방법을 구현하고 있는 클래스들
/*
 * set타입: 데이터를 저장할 떄, 중복을 허용하지 않는 방법
 * 검색을 위해서 사용, 중복 된 값을 제거하기위해서 사용
 * HashSet(사용빈도 중), TreeSet
 */

//4. Map타입의 저장 방법을 구현하고 있는 클래스들
/*
 * Map 타입: 데이터를 key와 value의 형태로 저장하는 방법
 * (검색을 위해서 사용, key의 값은 중복을 허용하지 않음, Value의 값은 중복을 허용)
 * Hashtable, HashMap(가장많이사용)
 * 
 */

//5.Vector,ArrayList 클래스
/*
 *두개의 클래스는 동일한 기능을 제공
 *쓰레드 동기화의 지원여부 크기의 제약없이 데이터를 저장(동적크기를 확장) 
 *배열과 같이 인덱스를 기반으로 데이터 접근
 *데이터의 중복을 허용
 *데이터의 입력 순서를 유지
 */

public class Collection_01 {
	public static void main(String[] args) {
		// 동적 배열의 객체 생성 초기값으로 크기를 지정할 수있지만 통산크기지정없이 사용함.
		Vector v = new Vector();
		ArrayList a = new ArrayList(); // list를 상속받은녀석
		// Vector,Arralist : add() get() remove() size()
		v.add(10);
		v.add(20);
		v.add(30);
		a.add(10);
		a.add(20);
		a.add(30);
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));

		}

		a.set(2, 100);
		a.add(2, 300);
		for (int i = 0; i < a.size(); i++) {
			System.out.printf("a[%d] = %d  ",i,a.get(i));

		}

	}
	

}
