package com.wipro.Spring_Annotation_Collections;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.wipro.Spring_Annotation_Collections")
public class AppConfiguration {

}
