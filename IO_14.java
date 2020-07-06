package days17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_14 {
	public static void main(String[] args) throws IOException {
		String OriginalDirPath ="D:\\ksm\\dev\\javase\\java_tem";
		String CopyDirPath ="D:\\ksm\\dev\\javase\\copy";
		String FileName ="eclipse-inst-win64.exe";
		
		File dir =new File(OriginalDirPath);
		File file_original =new File(dir,FileName);
		BufferedInputStream bis 
		=new BufferedInputStream(new FileInputStream(file_original));
		
		BufferedOutputStream bos 
		=new BufferedOutputStream(new FileOutputStream(file_original));
		
		byte[] data =new byte[1024];
		int size;
		while((size= bis.read(data)) != -1) bos.write(data,0,size);
		//읽어온 크기만큼 파일 출력
		bis.close();
		bos.close();
		
	}
}
