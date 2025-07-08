package com.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.SpringJDBC.dao.StudentDao;
import com.SpringJDBC.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started...");
        ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringJDBC/Config.xml");
       
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
       
        Student student =new Student ();
        student.setId(666);
        student.setName("Pinky");
        student.setCity("Haryana");
        
        int result=studentDao.insert(student);
        
        System.out.println("student added "+result);

       
       
       
       
    }
}
