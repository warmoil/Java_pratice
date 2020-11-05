package bogang;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin=null;
				
		int c;
		try {
			fin = new FileReader("또난과제야.txt");
		BufferedOutputStream out =new BufferedOutputStream(System.out,5);
		while((c=fin.read())!=-1)
		{
			//out.write(c);
			System.out.print((char)c);
		}
		Scanner s = new Scanner(System.in);
		s.nextLine();
		out.flush();// 남아있던 문자 모두 출력
		fin.close();
		out.close();
		s.close();
		}catch(IOException e)
		{
			System.out.println("����");
		}
	}

}
