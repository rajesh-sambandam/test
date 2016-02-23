package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	
	public static void main(String args[]){
		 Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9]{2,9}");
		 Matcher m = p.matcher("AB1");
		 boolean b = m.matches();
		 
		 System.out.println(b);
	}

}
