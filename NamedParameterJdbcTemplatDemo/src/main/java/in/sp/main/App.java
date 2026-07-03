package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.springConfigFile;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(springConfigFile.class);
      NamedParameterJdbcTemplate npJdbcTemplate = (NamedParameterJdbcTemplate) context.getBean("npJdbcTemplate");
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("key_roll", 104);
      map.put("key_name", "Naveen");
      map.put("key_marks", 98.9f);
      String insert_sql_quries = "INSERT INTO student VALUES(:key_roll,:key_name,:key_marks)";
      int count = npJdbcTemplate.update(insert_sql_quries, map);
      
      if(count > 0) {
    	  System.out.println("insertion success");
      } else {
    	  System.out.println("insertion failed");
      }
      
    }
}
