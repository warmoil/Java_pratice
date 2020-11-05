package bogang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamEx {

	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("test.out");
		
			for(int i = 0; i < b.length; i++)
			{
				fout.write(b[i]);
			}
			fout.close();
		} catch(FileNotFoundException e) {
			System.out.println("Test.out파일이 없습니다");
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
