package com.MockProject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.MockProject.demo.services.SortAlgorithm;
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	//@Autowired
	SortImpl sortimpl;
	

	public static void main(String[] args) {
		//SortImpl sortimpl=new SortImpl();
		//System.out.print(sortimpl);
		
		//DemoApplication a=new DemoApplication();
		//a.hi();
		SpringApplication.run(DemoApplication.class, args);
		//ApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);
		//SortImpl sortimpl=applicationContext.getBean(SortImpl.class);
		//sortimpl.printMessage();
	}

}
