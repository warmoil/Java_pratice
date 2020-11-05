package swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
/*
 *Swing 프로그램에서는 윈도우를 나타내는
 *JFrame 관련스레드와 main() 메소드 스레드 2개가 동작
 *==>윈도우를 닫더라도 나머지 스레드는 동작하고 있기ㄸ떄문에 프로그램 종료가 되지않음
 */
	//JFrame을 상속받은 클래스의 생성자 안에서 화면 구성에 대한 모든 부분 처리(초기화)	
	MyFrame(){
		super("JFrame클래스를 사용해 윈도우 제목 설정");//이것도 윈도우타이틀 
		//setTitle("300x300 스윙 프레임 만들기");//윈도우타이틀
		setSize(300,300);//jFrame의 크기 설정
		setVisible(true);//화면상에 표시
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		

	}

}
