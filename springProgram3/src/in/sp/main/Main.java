package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String config_loc = "/in/sp/resources/applicationContext.xml";
	    ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
	    
	    
	  Student stu = (Student) context.getBean("student");
	  stu.display();
	
	  
	}
}
