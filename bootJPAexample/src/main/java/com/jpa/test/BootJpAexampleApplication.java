package com.jpa.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootJpAexampleApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		
		ApplicationContext context=SpringApplication.run(BootJpAexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		User user =new User();
		System.out.println("Enter Name :-");
		String name=in.readLine();
		user.setName(name);
		System.out.println("Enter City :-");
		String city=in.readLine();
		user.setCity(city);
		System.out.println("Enter Status :-");
		String status=in.readLine();
		user.setStatus(status);
		
		 User user1=userRepository.save(user);
		 System.out.println(user1);

	}

}
