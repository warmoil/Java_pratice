package week12.SUDAMessenger;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Messenger extends JFrame {

	String userName = null;
	Socket socket;
	JFrame frame;
	JTextArea talkingArea;
	InputTextField messageInputTextField;
	JScrollPane talkingScrollPane;
	JScrollPane messageInputScrollPane;

	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("유저네임주세영");
			return;
		}
		 Messenger messenger =  new Messenger(args[0]);

	}

	Messenger(String userName){
		try {
			this.userName = userName;
			socket = new Socket("127.0.0.1",9002);
			setupUI();
			messageInputTextField.joinChat();
			ReceiverThread r = new ReceiverThread(socket,talkingArea);
			r.start();
		}
		catch(Exception e) {System.out.println(e.getMessage());}
			
	}	
	public void setupUI() {
		frame = new	JFrame("수다 메신저"+userName);
		frame.setIconImage(frame.getToolkit().getImage("res/메인아이콘.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(new MenuBar());
		frame.getContentPane().add(new MainToolBar(),BorderLayout.NORTH);
		
		//대화내용창
		talkingArea = new JTextArea();
		talkingArea.setLineWrap(true);//영역에 맞게 자동조절
		talkingArea.setWrapStyleWord(true);//자동조절시 단어를 기준으로
		talkingArea.setEditable(false);//대화창에 글자 바꿀생각하지마라
		talkingScrollPane = new JScrollPane(talkingArea);
		frame.getContentPane().add(talkingArea , BorderLayout.CENTER);
		//메세지 입력창
		messageInputTextField = new InputTextField(socket , userName);
		messageInputTextField.dummy(talkingArea);
		messageInputScrollPane = new JScrollPane(messageInputTextField);
		frame.getContentPane().add(messageInputTextField , BorderLayout.SOUTH);
		frame.setLocation(512,430);
		frame.setPreferredSize(new Dimension(300,500));
		
		frame.pack();
		frame.setVisible(true);
		
	}
}

