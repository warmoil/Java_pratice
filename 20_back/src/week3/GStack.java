package week3;

public class GStack<T> {
	int tos;
	int size;
	Object[] stck;
	
	public GStack()
	{
		tos = 0;
		stck = new Object[10];
	}
	
	
	public void push(T item)
	{
		if (tos == 10)		
			return;
		stck[tos] = item;
		tos++;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if (tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
	
	public int size()
	{
		return size;
	}
}
