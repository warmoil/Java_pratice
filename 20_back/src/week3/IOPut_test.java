package week3;

import java.io.FileReader;
import java.io.IOException;

public class IOPut_test {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
		fin = new FileReader(".\\또난과제야.txt");
		int c;
		while((c = fin.read()) != -1)
		{
			System.out.print((char)c);
		}		
		fin.close();
		}
		catch(IOException e) 
		{
			System.out.println("입출력오류");
		}
		
	}

}
