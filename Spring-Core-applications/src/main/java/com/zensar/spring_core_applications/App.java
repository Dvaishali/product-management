package com.zensar.spring_core_applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring_core_applications.beans.Address;
import com.zensar.spring_core_applications.beans.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
      //  ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Training Soft\\context.xml");
        //Customer customer = (Customer) context.getBean("customer");
      //  System.out.println(context.getBean("customer", Customer.class));
        
      //  System.out.println(context.getBean("customer", Customer.class));
       // customer.getFullAddress();
        System.out.println(context.getBean("address", Address.class));
		/*
		 * System.out.println(context.getBean("customer", Customer.class));
		 * System.out.println(context.getBean("customer", Customer.class));
		 * System.out.println(context.getBean("customer", Customer.class));
		 */
        ((AbstractApplicationContext) context).close();
    }
}
