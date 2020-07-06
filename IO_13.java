package days17;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO_13 {
	public static void main(String[] args) throws IOException {
		//파일 처리
				//File 에 데이터 버퍼를 사용하여 출력하는방법
				//BufferedOutputStream(이진데이터),BufferedWriter(문자데이터)
					 File dir = new File("D:\\ksm\\dev\\javase\\java_tem");
				      if(!dir.exists()) dir.mkdirs();
				      
				      File file_binary = new File(dir, "binary_data_using_buffer.dat");
				      File file_text = new File(dir, "text_data_using_buffer.txt");
				      //파일에 이진 데이터를 출력할 수있는 객체 생성
				      BufferedInputStream bis_binary 
				      =new BufferedInputStream(new FileInputStream(file_binary));
				      
				      BufferedReader br_text 
				      =new BufferedReader(new FileReader(file_text));
				      
				      //flush 메소드는 버퍼에 쌓여있는 데이터를 출력하는 메소드(버퍼를 방눈 명령을 실행)
				      int input;
				      while((input = bis_binary.read()) !=-1)System.out.printf("%d",input);
				      while((input = br_text.read()) !=-1) System.out.printf("%c",input);
				      bis_binary.close();
				     br_text.close();
				      
				}
			}


	