package week11.hellosoket.bufferedprintwriter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClinetEx2 {

	public static void main(String[] args) {
		String myIP = "172.30.1.44";
		String selfIP = "127.0.0.1";
		int port = 9000;
		
		
		Socket socket = null;
		try {
			socket = new Socket(selfIP,port);
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			
			//데이터 송신
			writer.println("Hello,Server I`m Client");
			writer.flush();
			
			//수신된 데이터 출력
			String str = reader.readLine();
			System.out.println(str);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
