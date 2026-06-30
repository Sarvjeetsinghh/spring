package in.sp.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	String config_LOC = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_LOC);
        
       Student std = (Student) context.getBean("stdId");
       std.display();
    }
}
