package com.test;

import java.io.Serializable;

public class TargetBean implements Serializable{
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TargetNested getNestedBean() {
		return nestedBean;
	}

	public void setNestedBean(TargetNested nestedBean) {
		this.nestedBean = nestedBean;
	}

	String name;
	
	TargetNested nestedBean;
}
