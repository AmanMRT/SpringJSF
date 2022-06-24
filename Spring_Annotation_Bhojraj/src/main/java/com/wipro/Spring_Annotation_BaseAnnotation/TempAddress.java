package com.wipro.Spring_Annotation_BaseAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("taddress")
public class TempAddress implements EmpAddress {

	public String getAddress() {

		return "Gurugram";
	}

}
