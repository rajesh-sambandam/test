package com.example;

import java.io.Serializable;

public class SourceBean implements Serializable{

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SourceNested getNestedBean() {
		return nestedBean;
	}

	public void setNestedBean(SourceNested nestedBean) {
		this.nestedBean = nestedBean;
	}

	String name;
	
	SourceNested nestedBean;
}
