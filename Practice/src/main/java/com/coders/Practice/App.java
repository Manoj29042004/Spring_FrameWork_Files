package com.coders.Practice;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coders.Practice.Employee.Employee;
import com.coders.Practice.Student.Student;
import com.coders.Practice.Student.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/coders/Practice/configfiles/config.xml");

		Student std = (Student) context.getBean("std");
		Employee emp = (Employee) context.getBean("emp");
		Location Loc = (Location) context.getBean("Loc");

		System.out.println("Employee Details:");
		System.out.println(emp);

		
		Loc.setCity("Vijayawada");
		Loc.setLocid(101);
		Loc.setPincode(520072);
		std.setId(1);
		std.setName("Manoj");
		std.setAge(21);
		std.setMarks(95);
		std.setLoc(Loc);

		System.out.println("Student Details:");
		System.out.println(std);

		System.out.println("Hello World!");
	}
}
