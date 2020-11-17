 package week11.SocketChat.tread;

import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) {
		
		IpPort ip = new IpPort();
		
		Socket socket = null;
		try {
			socket = new Socket(ip.myIp,ip.joyPort());
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
				//socket.close();
			}
			catch(Exception ignored) {
				
			}
		}
	}

}
