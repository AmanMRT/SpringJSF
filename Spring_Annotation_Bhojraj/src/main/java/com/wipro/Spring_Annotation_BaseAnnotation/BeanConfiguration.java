package com.wipro.Spring_Annotation_BaseAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.wipro.Spring_Annotation_Bhojraj")
public class BeanConfiguration {

	/*
	//@Bean
	@Bean(name="emp")		//by ID
	@Scope("prototype")		//Scope of Object
	public Employee getEmployee()
	{
		return new Employee();
	}
	*/
}
