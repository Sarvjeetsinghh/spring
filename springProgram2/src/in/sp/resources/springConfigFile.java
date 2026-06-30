package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;
import in.sp.beans.Teacher;

@Configuration
public class springConfigFile {
	
	@Bean("StudentObj1")
	public Student stdId1() 
		{
			Student std = new Student();
			
			std.setName("Raj Singh");
			std.setRollno(103);
			std.setEmail("rajsingh103@gmail.com");
			
			return std;
		}
	
	
	@Bean("StudentObj2")
	public Student stdId2() 
		{
			Student std = new Student();
			
			std.setName("Ram Singh");
			std.setRollno(104);
			std.setEmail("ramsingh104@gmail.com");
			
			return std;
		}
	
	@Bean
	public Teacher teacher()
	{
		Teacher teac = new Teacher();
		teac.setName("Rahul Singh");
		teac.setSubject("Mathmetics");
		teac.setAge(22);
		return teac;
	}
}
