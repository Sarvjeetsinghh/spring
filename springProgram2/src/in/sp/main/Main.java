package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.beans.Teacher;
import in.sp.resources.springConfigFile;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(springConfigFile.class);
//		Student std = (Student) context.getBean("stdId");
//		Teacher teac = (Teacher) context.getBean("teacher");
//		std.display();
//		
//		System.out.println("========================================================");
//		
//		teac.display();
		
		
	Student std1 = (Student) context.getBean("StudentObj1");
	std1.display();
	
	System.out.println("========================================");
	
	Student std2 = (Student) context.getBean("StudentObj2");
	std2.display();
	}
}
