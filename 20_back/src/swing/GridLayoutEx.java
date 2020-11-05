package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	GridLayoutEx(){
		setTitle("�׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container ContentPane = getContentPane();
		ContentPane.setLayout(new GridLayout(4,2,3,3));
		
		ContentPane.add(new JLabel("�̸�"));
		ContentPane.add(new JTextField());
		ContentPane.add(new JLabel("�й�"));
		ContentPane.add(new JTextField());
		ContentPane.add(new JLabel("�а�"));
		ContentPane.add(new JTextField());
		ContentPane.add(new JLabel("����"));
		ContentPane.add(new JTextField());
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
