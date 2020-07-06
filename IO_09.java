package days17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class IO_09 {

   public static void main(String[] args) throws IOException {
      // 파일 처리
      // File 에서 데이터를 읽어오는 방법 : FileInputStream(이진데이터), FileReader(문자데이터)
      File dir = new File("D:\\ksm\\dev\\javase\\java_tem");
      if(!dir.exists()) dir.mkdirs();
      File file_binary = new File(dir, "binary_data.dat");
      File file_text = new File(dir, "text_data.txt");
      // 파일로부터 이진 데이터를 읽어올 수 있는 스트림 객체 생성
      FileInputStream fis_bynary = new FileInputStream(file_binary);
      // 파일로부터 텍스트 데이터를 읽어올 수 있는 스트림 객체 생성
      FileReader fr_text = new FileReader(file_text);
      int data_binary;
      data_binary = fis_bynary.read();
      System.out.println(data_binary);
      data_binary = fis_bynary.read();
      System.out.println(data_binary);
      data_binary = fis_bynary.read(); // 파일의 끝에 도착하면 -1값이 반환
      System.out.println(data_binary);
      fis_bynary.close();
      
      // 주의사항
      // 만약 텍스트 파일의 내용을 한글자씩 읽어들이는 경우 반드시 int 타입으로 문자값을 전달받아야 합니다.
      // 파일의 끝에 도달하면 -1 값이 반환하지만 char은 부호가 없는 자료형이므로 - 값을 처리할 수 없습니다.
      // 무조건 양수로만 취급하여 반복을 빠져나올 수 없습니다
      int data_text;
      while((data_text = fr_text.read()) !=-1)
         System.out.print((char)data_text);
      fr_text.close();

   }

}