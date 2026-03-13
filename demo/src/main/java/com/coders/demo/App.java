package com.coders.demo;

import com.coders.demo.entity.Student;
import com.coders.demo.entity.Employee;
import com.coders.demo.entity.Location;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/coders/demo/configfiles/studentconfig.xml");
		
//		System.out.println("XML file uploaded....");
//		
//		Student std1 = context.getBean("orv",Student.class);
//		
//		System.out.println(std1);
		
//		getBean(id):
//		Student std1 = (Student) context.getBean("orv");
//		Student std2 = (Student) context.getBean("orv");
		
//		getBean(class):
//		Student std1 = context.getBean(Student.class);
//		Student std2 = context.getBean(Student.class);
		
//		getBean(id,class):
//		Student std1 = context.getBean("orv",Student.class);
//		Student std2 = context.getBean("orv",Student.class);
		
//		System.out.println(std2);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/coders/demo/configfiles/studentconfig.xml");
        
        System.out.println("XML Files Uploaded...!");
        
        Student std = (Student)context.getBean("std");
        
//        std.setId(1);
//        std.setName("Kishore");
//        std.setAge(22);
//        std.setMarks(91);
        System.out.println(std);
        
//        Location loc = context.getBean("satya",Location.class);
        
//        loc.setLid(1);
//        loc.setCity("Hyderabad");
        
//        System.out.println(loc);
        
//        Employee emp = context.getBean("emp",Employee.class);
//        
//        System.out.println(emp);
		

	}
}

