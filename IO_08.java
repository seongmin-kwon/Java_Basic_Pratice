package days17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IO_08 {
	public static void main(String[] args) throws IOException  {
//파일 처리 
//File 에 데이터를 출력하는클래스 FileOutputStream(이진데이터), FileWriter(문자 데이터)
		File dir =new File("D:\\ksm\\dev\\javase\\java_tem");
		if(!dir.exists()) dir.mkdir();
		File file_binary =new File(dir, "binary_data.dat");
		File file_text =new File(dir, "text_data.txt");
		//파일 출력 스트림 객체는 해당 파일이 존재하지않는경우 파일을 생성하여 스트림을 구성함.
		//파일에 이진 데이터를 출력할 수있는 객체 생성
		FileOutputStream fos_binnary =new FileOutputStream(file_binary);
		//파일 문자 데이터를 툴력 할 수있는 객체 생성
		FileWriter fos_text = new FileWriter(file_text);
		//파일에 내용을 출력
		fos_binnary.write(11);
		fos_binnary.write(22);
		fos_text.write("hello");
		fos_text.write("world");
		fos_binnary.close();
		fos_text.close();
	}
}
