package com.example.JavaBasedConfigSpring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.JavaBasedConfigSpring.Alien;
import com.example.JavaBasedConfigSpring.Computer;
import com.example.JavaBasedConfigSpring.Desktop;
import com.example.JavaBasedConfigSpring.Laptop;

@Configuration
public class AppConfig {

	
//	@Bean
//	public Alien alien(@Autowired Computer com) {
//		
//		Alien obj = new Alien();
//		obj.setAge(18);
//		//obj.setCom(desktop());
//		obj.setCom(com);
//		return obj;
//	}
	
	@Bean
	public Alien alien(Computer com) {  //@Qualifier("beast") 
		
		Alien obj = new Alien();
		obj.setAge(13);
		obj.setCom(com);
		return obj;
	}
	
	@Bean(name = "beast")
	//@Scope("prototype")
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	@Primary
	public Laptop laptop() {
		return new Laptop();
	}
}
