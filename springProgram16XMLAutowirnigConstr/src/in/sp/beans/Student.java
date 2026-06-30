package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private int rollno;
	private String name;
	
	@Autowired
	private Address address;

	public Student(int rollno, String name, Address address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("rollno :" + rollno);
		System.out.println("name :" + name);
		System.out.println("address :" + address);
	}
}
