package com.te.springscope.singletonandprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("abc.xml");
		Demo bean = container.getBean(Demo.class);
		System.out.println(bean);
		Demo bean2 = container.getBean(Demo.class);
		System.out.println(bean2);
	}

}
