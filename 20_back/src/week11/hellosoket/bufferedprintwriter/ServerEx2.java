package week11.hellosoket.bufferedprintwriter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

	public static void main(String[] args) {
	
		int port = 9000;
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(port);
			socket = serverSocket.accept();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			//수신된 데이터 출력
			String str = reader.readLine();
			System.out.println(str);
			
			//데이터 송신
			writer.println("Hello Client I`m Server");
			writer.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			}
			catch(Exception ignored) {
				
			}
			try {
				serverSocket.close();
			}
			catch(Exception ingnored) {
				
			}
		}
		
	}

}
