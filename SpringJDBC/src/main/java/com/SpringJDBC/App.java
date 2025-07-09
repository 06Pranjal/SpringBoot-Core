package com.SpringJDBC;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.SpringJDBC.dao.StudentDao;
import com.SpringJDBC.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started...");
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
       
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
//INSERT      
//        Student student =new Student ();
//        student.setId(666);
//        student.setName("Pinky");
//        student.setCity("Haryana");
//        
//        int result=studentDao.insert(student);
//        
//        System.out.println("student added "+result);
        
        
 //UPDATE       
//        Student student=new Student();
//         student.setName("Raj");
//         student.setCity("Mumbai");
//         student.setId(666);
//         int result=studentDao.change(student);
//         System.out.println("Data Updated ..."+result);

        
        //DELETE
     // Get user input for deletion
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the ID of the student you want to delete: ");
//        int id = sc.nextInt();
//        sc.close();
//
//        int result = studentDao.delete(id);
//
//        if (result > 0) {
//            System.out.println("Deleted successfully. Rows affected: " + result);
//        } else {
//            System.out.println("No record found with ID: " + id);
//        }
      
        
        
//   Student student=studentDao.getStudent(222); 
//   System.out.println(student);
        
        
        List<Student> students=studentDao.getAllStudents();
        for(Student s:students) {
        	System.out.println(s);

        }

        

        
        

       
       
       
       
    }
}
