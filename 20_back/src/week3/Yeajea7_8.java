package week3;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class Yeajea7_8 {

	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add("�͹̳�����");
		myList.add("�ƹ�Ÿ");
		
		//�����ϱ�
		Collections.sort(myList);
		System.out.println("����");
		printList(myList);
		//������ �����ϱ�(������)
		Collections.reverse(myList);
		System.out.println("������");
		printList(myList);
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ");
		System.out.println(myList.get(index)+"��"+(index+1)+"��° ����Դϴ�");
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
