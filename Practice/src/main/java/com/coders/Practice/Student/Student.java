package com.coders.Practice.Student;


public class Student {
	
	private int id;
	private String name;
	private int age;
	private int marks;
	private Location loc;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("No parameterized Student constructor");
	}
	public Student(int id, String name, int age, int marks) {
		super();
		System.out.println("parameterized Student constructor");
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", loc=" + loc + "]";
	}
	

}
