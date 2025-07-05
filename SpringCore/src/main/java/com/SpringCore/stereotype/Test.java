package com.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/stereotype/stereoconfig.xml");
		Student student=(Student) context.getBean("student");
		
		System.out.println(student.hashCode());
		
		Student student2=(Student) context.getBean("student");
		System.out.println(student2.hashCode());

	}

} 