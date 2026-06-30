package in.sp.resourecs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class springConfigFile {
	
	@Bean
	public Address createAdd() {
		Address add = new Address(101,"Kushinagar",123234);
		return add;
	}
	
	@Bean
	public Student createStu() {
		Student std = new Student(210,"Nikita",createAdd());
		return std;
	}
}
