package week10;

public class SharedBoard {
	private int sum = 0; //집계판의 합
	synchronized public void add() {
		int n = sum;
		Thread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
	public int getSum() {return sum;}
}
