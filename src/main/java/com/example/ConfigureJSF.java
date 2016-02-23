package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.faces.config.FacesInitializer;

@Configuration
public class ConfigureJSF {

	@Bean
	public ServletRegistrationBean facesServletRegistration() {

		ServletRegistrationBean servletRegistrationBean = new JsfServletRegistrationBean();

		return servletRegistrationBean;
	}

	public class JsfServletRegistrationBean extends ServletRegistrationBean {

		public JsfServletRegistrationBean() {
			super();
		}

		@Override
		public void onStartup(ServletContext servletContext)
				throws ServletException {
			
			System.out.println("-----------222222222222----------");

			FacesInitializer facesInitializer = new FacesInitializer();
			

			Set<Class<?>> clazz = new HashSet<Class<?>>();
			clazz.add(ConfigureJSF.class);
			facesInitializer.onStartup(clazz, servletContext);
		}
	}
}