package com.Spring.ORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.ORM.dao.StudentDao;
import com.Spring.ORM.entities.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("\n=== Student Management Menu ===");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Display Student by ID");
                System.out.println("4. Delete a Student");
                System.out.println("5. Update Student by ID");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(bufferedReader.readLine());

                switch (choice) {
                    case 1:
                        // Add Student
                        System.out.print("Enter student ID: ");
                        int id = Integer.parseInt(bufferedReader.readLine());
                        System.out.print("Enter student name: ");
                        String name = bufferedReader.readLine();
                        System.out.print("Enter student city: ");
                        String city = bufferedReader.readLine();

                        Student student = new Student(id, name, city);
                        int result = studentDao.insert(student);
                        System.out.println("Student added with ID: " + result);
                        break;

                    case 2:
                        // Display all students
                        List<Student> allStudents = studentDao.getAllStudents();
                        for (Student s : allStudents) {
                            System.out.println(s);
                        }
                        break;

                    case 3:
                        // Display single student
                        System.out.print("Enter student ID to fetch: ");
                        int sid = Integer.parseInt(bufferedReader.readLine());
                        Student singleStudent = studentDao.getStudent(sid);
                        if (singleStudent != null) {
                            System.out.println(singleStudent);
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 4:
                    	// Delete student by ID
                        System.out.print("Enter student ID to delete: ");
                        int delId = Integer.parseInt(bufferedReader.readLine());
                        studentDao.deleteStudent(delId);
                        System.out.println("Student deleted if existed.");
                        break;

                    case 5:
                        // Update Student by ID
                        System.out.print("Enter student ID to update: ");
                        int updateId = Integer.parseInt(bufferedReader.readLine());

                        Student existingStudent = studentDao.getStudent(updateId);
                        if (existingStudent != null) {
                            System.out.print("Enter new name: ");
                            String newName = bufferedReader.readLine();
                            System.out.print("Enter new city: ");
                            String newCity = bufferedReader.readLine();

                            existingStudent.setStudentName(newName);
                            existingStudent.setStudentCity(newCity);

                            studentDao.updateStudent(existingStudent);
                            System.out.println("Student updated.");
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    
                    case 6:
                        // Exit
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
