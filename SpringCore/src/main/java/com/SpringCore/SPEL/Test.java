package com.SpringCore.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/SPEL/Spelconfig.xml");
	Demo d1=(Demo) context.getBean("demo");
	System.out.println(d1);


	}

}
