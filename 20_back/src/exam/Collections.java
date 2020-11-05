package exam;

import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		Vector <Integer> v = new Vector<Integer>(7);
		v.add(5);
		v.add(2);
		v.add(3);
		v.add(7);
		v.add(3,11);
		int s = v.size() - 1;
		System.out.println(s+"    "+v.get(3));

	}

}
