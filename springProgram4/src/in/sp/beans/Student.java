package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Sakshi Singh")
	private String name;
	@Value("108")
	private int rollno;
	@Value("IT")
	private String branch;
	@Value("Gorakhpur")
	private String Address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public void display() {
		System.out.println("name : " + name);
		System.out.println("rollno : " + rollno);
		System.out.println("branch : " + branch);
		System.out.println("address : " + Address);
	}
}
