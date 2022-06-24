package com.wipro.Spring_Annotation_BaseAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    	
    	Employee emp = context.getBean(Employee.class);
//    	Employee emp = (Employee) context.getBean("emp");	//BY ID

    	emp.setId(1);
//    	emp.setName("Bhojraja");
//    	emp.setBand("D1");
    	    	
    	System.out.println("ID : " +emp.getId());
    	System.out.println("Name : " + emp.getName());
    	System.out.println("Band : " + emp.getBand());
    	System.out.println("Address : " + emp.getAddress().getAddress());
    }
}
