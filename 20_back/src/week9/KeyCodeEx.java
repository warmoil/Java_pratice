package week9;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {

	private JLabel la =  new JLabel();
	private Container contentPane;
	
	public KeyCodeEx() {
		setTitle("KeyCode 예제 : F1키 초록 , %키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		
		
		setSize(300,150);
		setVisible(true);
		
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}

	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			//Container contentPane = getContentPane();
			
			if(e.getKeyChar() =='%') 
				contentPane.setBackground(Color.YELLOW);
			
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
			
		}
	}

	public static void main(String[] args) {
		
		new KeyCodeEx();
		
	}

}
