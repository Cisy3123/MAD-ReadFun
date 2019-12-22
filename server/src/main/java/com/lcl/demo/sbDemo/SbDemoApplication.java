package com.lcl.demo.sbDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages ={ "com.lcl.demo.sbDemo.controller","com.lcl.demo.sbDemo.dao","com.lcl.demo.sbDemo.entity","com.lcl.demo.sbDemo.service"})
public class SbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDemoApplication.class, args);
	}
}
