package com.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started...");
        ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringJDBC/Config.xml");
       JdbcTemplate template= (JdbcTemplate) context.getBean("jdbcTemplate");
       
       String query="insert into students(id,name,city) values(?,?,?)";
       
       int result=template.update(query,456,"Uttam","Kanpur");
       
       System.out.println("Number of records inserted..."+result);

       
       
    }
}
