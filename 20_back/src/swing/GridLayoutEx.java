package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	GridLayoutEx(){
		setTitle("그리드 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container ContentPane = getContentPane();
		ContentPane.setLayout(new GridLayout(4,2,3,3));
		
		ContentPane.add(new JLabel("이름"));
		ContentPane.add(new JTextField());
		ContentPane.add(new JLabel("학번"));
		ContentPane.add(new JTextField());
		ContentPane.add(new JLabel("학과"));
		ContentPane.add(new JTextField());
		ContentPane.add(new JLabel("과목"));
		ContentPane.add(new JTextField());
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
