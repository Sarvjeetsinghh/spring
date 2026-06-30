package in.sp.beans;

public class Teacher {
private String name;
private String subject;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public void display() {
	System.out.println("name :" + name);
	System.out.println("subject :" + subject);
	System.out.println("age : " + age );
}
}
