package week5;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TxtFileCopy {

	public static void main(String[] args) throws IOException{
	File src = new File("c:\\windows\\system.ini");//���� ���ϰ�θ�
	File dest = new File("system.txt"); // ���� ���� ��θ�
	int c ;
	FileReader fr = new FileReader(src);
	FileWriter fw = new FileWriter(dest);
	while((c = fr.read()) != -1) { //���� �ϳ��а�
		fw.write((char)c); //���� �ϳ�����
	}
	fr.close();fw.close();
	System.out.println(src.getPath()+"��"+dest.getPath()+"�� �����Ͽ����ϴ�");
	}

}
