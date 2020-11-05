package week3;

public class MyStack {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		
		for(int n = 0; n < stringStack.size(); n++)
		{
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int n = 0; n < intStack.size(); n++)
		{
			System.out.println(intStack.pop());
		}
	}

}
