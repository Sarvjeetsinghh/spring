package in.sp.beans;

public class Student 
{
	private int rollno;
	private String city;
	private Address address;
	
	
	public Student(int rollno, String city , Address address) {
		this.rollno = rollno;
		this.city = city;
		this.address = address;
	}
	
	public void display() {
		System.out.println("rollno :" + rollno);
		System.out.println("city :" + city);
		System.out.println("address :" + address);
	}
}
