package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{

	ContentPaneEx(){
		setTitle("ContenPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//gui끄면 쓰레드도 꺼라
		
		//JFrame오로 부터컨텐츠 팬얻기
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT,50,20));
		
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("cencel"));
		contentPane.add(new JButton("Ignore"));
		
		contentPane.add(new JButton("예스"));
		contentPane.add(new JButton("취소"));
		contentPane.add(new JButton("무시"));

		
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ContentPaneEx();
		
	}

}
