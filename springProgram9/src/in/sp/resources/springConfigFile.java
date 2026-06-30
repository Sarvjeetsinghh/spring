package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class springConfigFile {
	
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address();
		addr.setHouseno(101);
		addr.setName("NewDelhi");
		addr.setPincode(123455);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		std.setRollno(520);
		std.setName("Shivam");
	//	std.setAddress(createAddObj());
		return std;
	}
}
