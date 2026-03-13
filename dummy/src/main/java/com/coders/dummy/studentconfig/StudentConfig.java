package com.coders.dummy.studentconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coders.dummy.entity.Student;

@Configuration
@ComponentScan(basePackages = "com.coders.dummy")
public class StudentConfig {
//	@Bean("std")
//	public Student display() {
//		Student s = new Student();
//		return s;
//	}

}
