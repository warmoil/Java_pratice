package week10;

public class ThreadCheck {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int prioriy = Thread.currentThread().getPriority();//쓰레드 우선순위
		Thread.State s = Thread.currentThread().getState();
		System.out.println("현재 쓰레드 이름:"+name);
		System.out.println("현재 쓰레드 ID:"+id);
		System.out.println("현재 스레드 우선순위값 :"+prioriy);
		System.out.println("현재쓰레드 상태:"+s);
		

	}

}
