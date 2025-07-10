package com.Spring.ORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.ORM.dao.StudentDao;
import com.Spring.ORM.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
        
        Student student=new Student(1235,"Lakshay","Panipat");
        
        int r=studentDao.insert(student);
        
        System.out.println("Done....." +r);

    }
}
