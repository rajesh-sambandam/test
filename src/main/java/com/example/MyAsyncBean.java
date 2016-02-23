package com.example;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MyAsyncBean {

	@Scheduled(fixedDelayString = "${my.fixed.delay.prop}")
	void callMe(){
		System.out.println("Call me called start" + new Date());
//		try {
//			Thread.sleep(1000);
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Call me called end");
	}

	
	/*@Scheduled(fixedDelay= 20000)
	void callMeparallel(){
		System.out.println("CallMeparallelll me called");
	
	}*/

}
