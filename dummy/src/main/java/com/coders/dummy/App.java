package com.coders.dummy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coders.dummy.entity.Student;
import com.coders.dummy.studentconfig.StudentConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/coders/dummy/configfiles/Studentconfig.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
    	Student s = (Student) context.getBean("std");
    	System.out.println(s);
        System.out.println( "Hello World!" );
    }
}
