package week11.SocketChat.tread;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket serverSocket= null;
		Socket socket = null;
		IpPort ip = new IpPort();
		System.out.println(ip.joyIp());
		try {
			serverSocket = new ServerSocket(ip.joyPort());
			socket = serverSocket.accept();
			
			Thread t1 = new SenderThread(socket);
			Thread t2 = new ReceiverTread(socket);
			t1.start();
			t2.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				serverSocket.close();
			}
			catch(Exception ignored) {
				
			}
		}
	}

}
