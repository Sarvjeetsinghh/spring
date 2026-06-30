package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	private int rollno;
	private String name;
	@Autowired
	@Qualifier("createAddObjc")
	private Address address;
	@Autowired
	private Subject subject;
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("rollno :" + rollno);
		System.out.println("name  :" + name);
		System.out.println("address :" + address);
		System.out.println("subject :" + subject);
	}
	
}
