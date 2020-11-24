package week12.SUDAMessenger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

public class ReceiverThread extends Thread {
	JTextArea talkingArea;
	Socket socket;
	
	ReceiverThread(Socket socket,  JTextArea talkingArea){
		this.socket = socket;
		this.talkingArea = talkingArea;
	}
	
	public void run() {
		BufferedReader reader =  null;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String message = reader.readLine();
				if(message == null)
					break;
				talkingArea.append(message+"\n");
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {reader.close();}
			catch(Exception e) {}
		}
	}
}
