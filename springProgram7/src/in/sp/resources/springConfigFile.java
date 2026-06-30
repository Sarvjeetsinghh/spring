package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class springConfigFile 
{
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address();
		addr.setHouseno(101);
		addr.setCity("Bhopal");
		addr.setPincode(123456);
		return addr;
	}
	@Bean
	public Student createStuObj() {
		
		Student std = new Student();
		
		std.setRollno(100210526);
		std.setName("Sarvjeet");
		std.setAddress(createAddObj());
		return std;
	}
}
