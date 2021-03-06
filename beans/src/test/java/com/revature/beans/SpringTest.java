package com.revature.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void go(){
		// object of Spring container
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		// fire up the container, and wire your beans together (DI)
		FacadeImpl facade = context.getBean("facade", FacadeImpl.class);
		facade.save("Hello World");
		
		// give me a bean that implements DAO interface
		DAO dao = context.getBean(DAO.class); 
	}
	
}






