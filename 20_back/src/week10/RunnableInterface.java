package week10;

import javax.swing.JLabel;

public class RunnableInterface implements Runnable{

	private JLabel timerLabel;
	public RunnableInterface(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override 
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
