package swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
/*
 *Swing ���α׷������� �����츦 ��Ÿ����
 *JFrame ���ý������ main() �޼ҵ� ������ 2���� ����
 *==>�����츦 �ݴ��� ������ ������� �����ϰ� �ֱ⤨������ ���α׷� ���ᰡ ��������
 */
	//JFrame�� ��ӹ��� Ŭ������ ������ �ȿ��� ȭ�� ������ ���� ��� �κ� ó��(�ʱ�ȭ)	
	MyFrame(){
		super("JFrameŬ������ ����� ������ ���� ����");//�̰͵� ������Ÿ��Ʋ 
		//setTitle("300x300 ���� ������ �����");//������Ÿ��Ʋ
		setSize(300,300);//jFrame�� ũ�� ����
		setVisible(true);//ȭ��� ǥ��
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		

	}

}
