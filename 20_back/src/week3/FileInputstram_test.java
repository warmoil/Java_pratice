package week3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputstram_test {

	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		try {
		fin = new FileInputStream("C:\\Users\\HFM\\Desktop\\�ǳ� ������.txt");
		in = new InputStreamReader(fin,"UTF-8");
		int c;
		System.out.println("���ڵ� ���� ������"+in.getEncoding());
		
		
		while((c = in.read()) != -1)
		{
			System.out.print((char)c);
		}fin.close();
		}catch(IOException e) {
			System.out.println("����¿���");
		}
		
	}

}
