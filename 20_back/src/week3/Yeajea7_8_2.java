package week3;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
public class Yeajea7_8_2 {

	
	public static void main(String[] args) {
		Vector<Product> myList = new Vector<Product>();
		myList.add(new Product("L001","�����",100));
		myList.add(new Product("L005","�Ŷ��",100));
		myList.add(new Product("L003","�����",100));
		myList.add(new Product("X900","LG��Ʈ��",100));
		myList.add(new Product("S001","�Ｚ��Ʈ��",100));
		
		//�����ϱ�
		Collections.sort(myList);
		System.out.println("����");
		printList(myList);
		//������ �����ϱ�(������)
		Collections.reverse(myList);
		System.out.println("������");
		printList(myList);
		
		int index = Collections.binarySearch(myList,new Product("L001","�����",100));
		System.out.println(new Product("L001","�����",100).getPname()+"��"+(index+1)+"��° ����Դϴ�");
		System.out.println("������� "+(index+1)+"��° ����Դϴ�");
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
