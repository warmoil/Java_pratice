package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {

	NullContainerEx(){
		setTitle("매니저가 사라졌어요!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		c.setLayout(null);
		
		JLabel la = new JLabel("버튼을 눌러보게");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		for(int i = 0; i<10 ; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setSize(50,20);
			b.setLocation(i*15,i*15);
			c.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new  NullContainerEx();
		

	}

}
