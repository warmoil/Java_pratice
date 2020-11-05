package week3;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
public class Yeajea7_8_2 {

	
	public static void main(String[] args) {
		Vector<Product> myList = new Vector<Product>();
		myList.add(new Product("L001","진라면",100));
		myList.add(new Product("L005","신라면",100));
		myList.add(new Product("L003","열라면",100));
		myList.add(new Product("X900","LG노트북",100));
		myList.add(new Product("S001","삼성노트북",100));
		
		//정렬하기
		Collections.sort(myList);
		System.out.println("정렬");
		printList(myList);
		//뒤집어 정렬하기(역정렬)
		Collections.reverse(myList);
		System.out.println("역정렬");
		printList(myList);
		
		int index = Collections.binarySearch(myList,new Product("L001","진라면",100));
		System.out.println(new Product("L001","진라면",100).getPname()+"는"+(index+1)+"번째 요소입니다");
		System.out.println("진라면은 "+(index+1)+"번째 요소입니다");
	}
	static void printList(Vector<Product> l)
	{
		Iterator<Product> it = l.iterator();
		while(it.hasNext())
		{
			Product e = it.next();
			String separator = (it.hasNext())?"->":"\n";
			System.out.print(e.getPname()+separator);
		}
	}
}
