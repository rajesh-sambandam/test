package com.test;

import java.io.Serializable;

public class TargetNested implements Serializable{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
