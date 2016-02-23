package com.example;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Tasks {

	@Async
public void callMe(){
		
		System.out.println("Call me called start");
//		try {
//			Thread.sleep(60*1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Call me called end");
	}

	
	@Async
	public void callMeparallel(){
		System.out.println("CallMeparallelll me called");
		while(true){
			try {
			Thread.sleep(60*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
