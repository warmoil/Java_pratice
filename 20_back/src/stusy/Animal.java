package stusy;

public class Animal {
	int age;
	String name;
	
		Animal(String name , int age){
			this.name = name;
			this.age = age;			
		}
		void move()
		{
			System.out.println(age+"살"+name + "이가 움직입니다 " );
		}
}


