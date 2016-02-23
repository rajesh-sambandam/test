package com.example;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

//@Configuration
//@EnableAsync
//@EnableScheduling
public class AppConfig implements AsyncConfigurer {
//	 @Bean
//     public MyAsyncBean asyncfBean() {
//         return new MyAsyncBean();
//     }


    @Override
    @Bean
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(7);
        executor.setMaxPoolSize(42);
        executor.setQueueCapacity(11);
        executor.setThreadNamePrefix("MyExecutor-");
        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return  getMyAsyncUncaughtExceptionHandler();
    }

    @Bean
    AsyncUncaughtExceptionHandler getMyAsyncUncaughtExceptionHandler()
    {
    	return new MyAsyncUncaughtExceptionHandler();
    }
	
}
