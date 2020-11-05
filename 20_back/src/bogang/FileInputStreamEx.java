package bogang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] =  new byte[7];
		
		try {
			FileInputStream fin = new FileInputStream("test.out");
		int n =0,c;
		
			while((c=fin.read())!= -1)
			{
				b[n] = (byte)c;
				n++;
			}
			System.out.println("test.out에서 읽은 배열을 출력합니다.");
			for(int i =0; i<n;i++)
			{
				System.out.print(b[i]+" ");
							
			}fin.close();
		} catch (IOException e) {
			System.out.println("못읽었어요 경로명을 체크");
		}
		

	}

}
