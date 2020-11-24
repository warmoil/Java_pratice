package week12.SUDAMessenger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InputTextField extends JTextField {
	String userName;
	Socket socket;
	JTextArea out;
	
	
	InputTextField(Socket socket, String userName){
		this.socket = socket;
		this.userName = userName;
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				processActionEvent(event);
			}
		});
	}
		
	
	private void processActionEvent(ActionEvent event) {
		String message = event.getActionCommand();
		
		this.setText(null);
		sendMessage(message);
	}
	
	
	private void sendMessage(String message) {
		try {
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			if(message.contentEquals("bye")) {
				try {socket.close();}
				catch(Exception ignored) {   }
			}
			writer.println(message);
			writer.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void joinChat() {
		try {
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println(userName);
			writer.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void dummy(JTextArea out) {
		this.out = out;
	}
}
