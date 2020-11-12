package week10;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;

public class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}

	void finish() {
		flag = true;
	}

	@Override
	public void run() {
		while (true) {
			int x = ((int) (Math.random() * contentPane.getWidth()));
			int y = ((int) (Math.random() * contentPane.getHeight()));
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			label.setForeground(Color.blue);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if (flag == true) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.pink);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			} 
			catch (InterruptedException e) {return;}
		}
	}
}
