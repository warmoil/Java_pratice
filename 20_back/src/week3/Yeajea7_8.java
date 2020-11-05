package week3;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class Yeajea7_8 {

	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");
		
		//정렬하기
		Collections.sort(myList);
		System.out.println("정렬");
		printList(myList);
		//뒤집어 정렬하기(역정렬)
		Collections.reverse(myList);
		System.out.println("역정렬");
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타");
		System.out.println(myList.get(index)+"는"+(index+1)+"번째 요소입니다");
	}
	static void printList(LinkedList<String> l)
	{
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			String e = it.next();
			String separator = (it.hasNext())?"->":"\n";
			System.out.print(e+separator);
		}
	}
}
