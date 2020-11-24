package week12.SUDAMessenger;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class MainToolBar extends JToolBar {
	
	public MainToolBar() {
		MainToolBarActions talkWithAction  = new MainToolBarActions("대화",new ImageIcon("res/대화.gif"),"대화하기",'T');
		MainToolBarActions sendNoteAction = new MainToolBarActions("쪽지",new ImageIcon("res/쪽지.gif"),"쪽지보내기",'S');
		MainToolBarActions addFriendAction = new MainToolBarActions("친추",new ImageIcon("res/친구추가.gif"),"친구추가하기",'A');
		
		add(talkWithAction);
		add(sendNoteAction);
		add(addFriendAction);
	}
	
	class MainToolBarActions extends AbstractAction{
		
		public MainToolBarActions(String text , Icon icon, String description,char accelerator) {
			super(text,icon);
			putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(accelerator,Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
			putValue(SHORT_DESCRIPTION , description);
		}
		public void actionPerformed(ActionEvent e) {
			try {
				System.out.println("Action ["+getValue(NAME)+"] performed!!!");
			}catch(Exception e1) {e1.printStackTrace();}
		}
	}
}
