package days17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//문제 : 아래의 텍스트를 	abc.txt (경로는 각자 알아서)파일에 저장되도록 프로그래밍하세요(FileWriter사용)
//선거에 있어서 최고 득표자가 2인이상인 때에는 국회의 재적의원 과반수 가 출석한 공개회의에서 다수표를 얻은자를 당선자로 한다.
//이헌법시행당시의 법려과 조약은 이헝법에 위배되지아니 하는한 그효력이 지속된다.
public class IO_10 {
	public static void main(String[] args) throws IOException {
		 File dir = new File("D:\\ksm\\dev\\javase\\java_tem");
	      if(!dir.exists()) dir.mkdirs();
	  		File file_text =new File(dir, "abc.txt");
	  		FileWriter fos_t = new FileWriter(file_text);
	  		fos_t.write("선거에 있어서 최고 득표자가 2인이상인 때에는 국회의 재적의원 과반수 가 출석한 공개회의에서 다수표를 얻은자를 당선자로 한다.\n");
	  		fos_t.write("이헌법시행당시의 법려과 조약은 이헝법에 위배되지아니 하는한 그효력이 지속된다.");
	  		fos_t.close();
	}
}
