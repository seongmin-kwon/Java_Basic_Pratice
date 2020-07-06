package days17;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IO_12 {
	public static void main(String[] args) throws IOException {
	//파일 처리
	//File 에 데이터 버퍼를 사용하여 출력하는방법
	//BufferedOutputStream(이진데이터),BufferedWriter(문자데이터)
		 File dir = new File("D:\\ksm\\dev\\javase\\java_tem");
	      if(!dir.exists()) dir.mkdirs();
	      
	      File file_binary = new File(dir, "binary_data_using_buffer.dat");
	      File file_text = new File(dir, "text_data_using_buffer.txt");
	      //파일에 이진 데이터를 출력할 수있는 객체 생성
	      BufferedOutputStream bos_binary 
	      =new BufferedOutputStream(new FileOutputStream(file_binary));
	      
	      BufferedWriter bw_text 
	      =new BufferedWriter(new FileWriter(file_text));
	      //flush 메소드는 버퍼에 쌓여있는 데이터를 출력하는 메소드(버퍼를 방눈 명령을 실행)
	      // 
	      bos_binary.write(255);
	      bos_binary.write(22);
	      bos_binary.flush();
	      
	      bw_text.write("hello");
	      bw_text.write("dud");
	      bw_text.flush();
	      bos_binary.close();
	      bw_text.close();
	      
	}
}
