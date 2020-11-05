package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{

	ContentPaneEx(){
		setTitle("ContenPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//gui���� �����嵵 ����
		
		//JFrame���� ���������� �Ҿ��
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT,50,20));
		
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("cencel"));
		contentPane.add(new JButton("Ignore"));
		
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("����"));

		
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ContentPaneEx();
		
	}

}
