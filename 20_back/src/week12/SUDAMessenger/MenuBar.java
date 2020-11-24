package week12.SUDAMessenger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class MenuBar extends JMenuBar {

	//메인 메뉴 항목별 하위 메뉴
	String[] fileItems = new String[] {"로그아웃","종료"};
	String[] actionItems = new String[] {"대화하기 ","쪽지보내기"};
	String[] friendItems = new String[] {"친구추가","친구복사","친구이동","친구삭제"};
	
	//메인메뉴 항목별 단축키
	char[] fileShortcuts = {'O','X'};
	char[] actionShortcuts = {'T','S'};
	char[] friendShortcuts = {'A','C','M','D'};
	
	public MenuBar() {
		//메인 메뉴 항목생성
		JMenu fileMenu = new JMenu("파일");
		JMenu actionMenu = new JMenu("동작");
		JMenu friendMenu = new JMenu("친구");
		
		//메인 메뉴 항목들에 대한 이벤트 리스너 설정
		 ActionListener mainMenuListener = new ActionListener() {
			 public void actionPerformed(ActionEvent event) {
				 System.out.println("Menu Item ["+event.getActionCommand()+"] was pressed."+ event.paramString());
			 }
		 };
		 //파일메뉴
		 for(int i = 0; i < fileItems.length; i++) {		
			 JMenuItem item = new JMenuItem(fileItems[i]+"("+fileShortcuts[i]+")",fileShortcuts[i]);
			 switch(i) {
			 case 0 : item.addActionListener(mainMenuListener); break;
			 case 1 : item.addActionListener(new ExitAction()); break;
			 }
			 fileMenu.add(item);
		 }
		 fileMenu.insertSeparator(1); //이건 구분선 
		 
		 //동작메뉴
		 for(int i = 0; i < actionItems.length; i++) {
			 JMenuItem item = new JMenuItem(actionItems[i]+"("+actionShortcuts[i]+")",actionShortcuts[i]);
			 item.setAccelerator(KeyStroke.getKeyStroke(actionShortcuts[i], java.awt.event.InputEvent.CTRL_DOWN_MASK,false));
			 item.addActionListener(mainMenuListener);
			 actionMenu.add(item);
		 }
		 //친구구성 
		 for(int i = 0; i < friendItems.length; i++) {
			 JMenuItem item = new JMenuItem(friendItems[i]+"("+friendShortcuts[i]+")",friendShortcuts[i]);
			 item.setAccelerator(KeyStroke.getKeyStroke(friendShortcuts[i], java.awt.event.InputEvent.CTRL_DOWN_MASK,false));
			 item.addActionListener(mainMenuListener);
			 friendMenu.add(item);
		 }
		 //메뉴 조합
		 add(fileMenu);
		 add(actionMenu);
		 add(friendMenu);
	}
	
	public class ExitAction extends AbstractAction{
		public ExitAction() {super("Exit");}
		public void actionPerformed(ActionEvent e) {System.exit(0);}
	}
}
