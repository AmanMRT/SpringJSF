package com.wipro.Spring_Annotation_Collections;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Team {

	@Value("${players}")
	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Team [list=" + list + "]";
	}
	
	
}
