package com.wipro.Spring_Annotation_BaseAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PermanentAddress implements EmpAddress {

	public String getAddress() {
		// TODO Auto-generated method stub
		return "Meerut";
	}

}
