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
		setTitle("보더레이아웃 연습");
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel centerPanel= new JPanel();//컨테이너 생성
		centerPanel.setLayout(new FlowLayout());//레이아웃 매니저 지정
		
		//centerPanel 을 contentPane의 자식으로 나둠
		
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
