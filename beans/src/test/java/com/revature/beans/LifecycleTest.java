package com.revature.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.lifecycle.ExampleBean;

public class LifecycleTest {

	@Test
	public void test(){
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("lifecycle.xml");
		System.out.println("Done spinning up Spring container");
		
		ExampleBean bean = context.getBean(ExampleBean.class);
		bean.service();
		// prototype test
			//ExampleBean bean2 = context.getBean(ExampleBean.class);
			//System.err.println(bean == bean2);
		// end prototype test
		context.registerShutdownHook();
		System.out.println("Spring container destroyed");
		
	}
	
}




