package com.example;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public String getAll(){
		System.out.println("Hello called");
		return "hello";
		
	}
	
	@RequestMapping(value = "/test/callme", method = RequestMethod.POST)
	public String callme(@RequestBody TestDto test) {
	
		System.out.println("Name is " + test.getName());
		/*try {
			for(int i=0; i<6000; i++)
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return test.getName();
	}
	
	@MyAnnotation
	void test() {
		
	}
	
}
