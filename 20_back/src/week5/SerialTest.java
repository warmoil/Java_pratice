package week5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Student s1 = new Student("정온유","15731058","인정과");
		
		//doSerializable(s1,"냉동인간.std");
		Student s2 = (Student)undoSerializable("냉동인간.std");
		System.out.printf("%s %s %s",s2.getName(),s2.getSno(),s2.getDept());
	}
	
	//마살링 (marshalling)수행 ,직렬화
	public static void doSerializable(Student student , String filePath) throws IOException {
	
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
	}
	
	public static Object undoSerializable(String filePath) throws IOException,ClassNotFoundException {
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object student = (Student) ois.readObject();
		ois.close();
		
		return student;
	}
}
