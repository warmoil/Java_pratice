package week11.multichat.Client;

import java.net.Socket;

public class MultiChatClient {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("사용법 : java MultiChatClient<사용자이름>");
			return;
		}
		try {
			Socket socket = new Socket("127.0.0.1",9000);
			Thread thread1 = new SenderThread(socket , args[0]);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
