package com.revature.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// used for all beans
public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean,
			String beanName) throws BeansException {
		
		System.out.println("PostProcessAfterInit " + bean.getClass());
		
		return bean; // return the bean back to Spring
	}

	public Object postProcessBeforeInitialization(Object bean,
			String beanName) throws BeansException {

		System.out.println("PostProcessBeforeInit " + bean.getClass());
		
		return bean; // return the bean back to Spring
	}

	
	
}
