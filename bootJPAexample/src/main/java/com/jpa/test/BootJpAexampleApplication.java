package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootJpAexampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(BootJpAexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		User user =new User();
		user.setName("Pranjal Singh");
		user.setCity("Delhi");
		user.setStatus("Java programmer");
		
		 User user1=userRepository.save(user);
		 System.out.println(user1);

	}

}
