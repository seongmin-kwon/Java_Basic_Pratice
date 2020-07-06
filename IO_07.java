package days17;

import java.io.File;
import java.io.IOException;

public class IO_07 {
	public static void main(String[] args) throws IOException {
// 파일 처리
		//FILE 클래스 : 파일 또는 디렉토리 에 관련된 메타 정보를 제공하는 클래스
		//파일 생성, 디렉토리 를 생성등의 추가적인 기능을 제공
		File d=new File("D:\\ksm\\dev\\javase\\java_tem"); // \\로 쓰기 -> \로 인식
		//"D:\\ksm\\dev\\javase\\java_tem" 폴더를 참조하는 File 객체 생성
		if(d.exists()) {
			// 그파일이존재하면 true, 아니면 false
			System.out.println("발견");
		}else {
			System.out.println("없음으로 생성합니다.");
			d.mkdir(); //디렉토리를 생성하는 메소드
			//d.mkdir();   ->   최근 타겟 이전의 경로가 존재 햐야만 동작
			//d.mkdirs();  ->  최종 타켓이전의 경로 존재 하지 않아도 전체 경로를 생성
		}
		File f = new File(d,"msg.txt");
		if(!(f.exists())) {
			f.createNewFile(); //파일생성메소드'
			System.out.printf("파일명 :%s\n", f.getName());
			System.out.printf("전체경로 :%s\n", f.getAbsolutePath());
			System.out.printf("파일의 크기 :%d\n", f.length());
		}
		
		
	}
}

