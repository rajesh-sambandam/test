package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.TargetBean;

public class Test {

	public static void main(String args[]){
		
		ObjectMapper mapper = new ObjectMapper();
		SourceBean sb = new SourceBean();
		sb.setName("rajesh");
		SourceNested snb = new SourceNested();
		snb.setName("nested");
		sb.setNestedBean(snb);
		
		TargetBean tc = mapper.convertValue(sb,TargetBean.class);
		
		System.out.println(tc.getName());
		System.out.println(tc.getNestedBean().getName());
		snb.setName("nested changed");
		System.out.println(tc.getNestedBean().getName());
		System.out.println(sb.getNestedBean().getName());
	}
}
