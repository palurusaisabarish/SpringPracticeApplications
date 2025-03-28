package com.example.JavaBasedConfigSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.JavaBasedConfigSpring.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	
    	Alien al = context.getBean(Alien.class);
    	al.setAge(27);
    	System.out.println(al.getAge());
    	al.code();
    	
    	//Bean byType
//    	Desktop dt = context.getBean(Desktop.class);
//    	dt.complie();
    	
    	
//    	Desktop dt1 = context.getBean(Desktop.class);
//    	dt.complie();

    	//Bean byName
    	//Desktop dt = context.getBean("beast",Desktop.class);
    	//dt.complie();
    }
}
