package com.wipro.Spring_Annotation_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.Spring_Annotation_BaseAnnotation.BeanConfiguration;

public class Client {

	public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
    	
    	Team players = context.getBean(Team.class);
    	
    	for(String name : players.getList())
    	{
    		System.out.println(name);
    	}
    }
}
