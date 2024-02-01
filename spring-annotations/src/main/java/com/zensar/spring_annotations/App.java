package com.zensar.spring_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring_annotations.beans.Employee;
import com.zensar.spring_annotations.beans.Product;
import com.zensar.spring_annotations.config.JavaConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
