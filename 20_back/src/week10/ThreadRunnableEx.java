package week10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadRunnableEx extends JFrame {

	public ThreadRunnableEx() {
		setTitle("Thread를 상속ㅂ잗은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic" , Font.ITALIC,80));
		c.add(timerLabel);
		
		RunnableInterface runnable = new RunnableInterface(timerLabel);
		Thread th = new Thread(runnable);
		setSize(300,170);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
	
		new ThreadRunnableEx();

	}
}
