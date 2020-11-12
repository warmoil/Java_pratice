package week10;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//깜빡이
		FlickeringLabel fLabel = new FlickeringLabel("깜빡",300);
		//안깜박
		JLabel label = new JLabel("안깜빡");
		//또다시~~ 깜빡여
		FlickeringLabel fLabel2 = new FlickeringLabel("또오다시~깜빡",700);
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new FlickeringLabelEx();
	}

}
