package week11.SocketChat.tread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverTread extends Thread {
	Socket socket;
	
	ReceiverTread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				System.out.println("<상대>"+str);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
