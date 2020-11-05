package week5;

import java.io.Serializable;

//직렬화가 가능한 Student 클래스 선언 
public class Student implements Serializable {
	private String name ;
	private String sno;
	private String dept;
	public Student(String name, String sno, String dept) {
		super();
		this.name = name;
		this.sno = sno;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
