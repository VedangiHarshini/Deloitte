package com.deloitte.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.deloitte.cms.model.Customer;

public class Client {

	public static void main(String[] args) {
		/*Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Customer customer = (Customer)factory.getBean("cust");
		System.out.println(customer);*/
		
		/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = (Customer)context.getBean("cust");
		Customer customer1 = (Customer)context.getBean("cust");
		System.out.println(customer);
		context.registerShutdownHook(); */
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"beans.xml","second.xml"});
		
		Customer customer = (Customer)context.getBean("cust");
		System.out.println(customer);
		context.registerShutdownHook();
		
	}
}
