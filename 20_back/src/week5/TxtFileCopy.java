package week5;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TxtFileCopy {

	public static void main(String[] args) throws IOException{
	File src = new File("c:\\windows\\system.ini");//원본 파일경로명
	File dest = new File("system.txt"); // 복사 파일 경로명
	int c ;
	FileReader fr = new FileReader(src);
	FileWriter fw = new FileWriter(dest);
	while((c = fr.read()) != -1) { //문자 하나읽고
		fw.write((char)c); //문자 하나쓰고
	}
	fr.close();fw.close();
	System.out.println(src.getPath()+"를"+dest.getPath()+"로 복사하였습니다");
	}

}
