package week10;

public class SyncrhonizedEx {
	public static void main(String [] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("Kitae",board);
		Thread th2 = new StudentThread("Hyosoo",board);
		th1.start();
		th2.start();
		
	}
}
