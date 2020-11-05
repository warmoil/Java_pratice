package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BorderLayoutEx extends JFrame{

	BorderLayoutEx(){
		setTitle("�������̾ƿ� ����");
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel centerPanel= new JPanel();//�����̳� ����
		centerPanel.setLayout(new FlowLayout());//���̾ƿ� �Ŵ��� ����
		
		//centerPanel �� contentPane�� �ڽ����� ����
		
		contentPane.add(centerPanel,BorderLayout.CENTER);
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("div"),BorderLayout.WEST);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		
		centerPanel.add(new JButton("Calculate"));
		centerPanel.add(new JButton("Result"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
