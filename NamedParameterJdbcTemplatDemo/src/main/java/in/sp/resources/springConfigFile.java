package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class springConfigFile 
{
	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("Jdbc:mysql://localhost:3306/spring_jdbc_db");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	
	@Bean
	public NamedParameterJdbcTemplate npJdbcTemplate() {
		NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(myDataSource());
		return namedTemplate;
	}
}
