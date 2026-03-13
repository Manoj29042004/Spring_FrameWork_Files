package com.coders.demo.entity;

public class Student {

    private int id;
    private String name;
    private int age;
    private int marks;
    private Location location;

    public Student(int id, String name, int age, int marks) {
		super();
		System.out.println("parameterized constructor");
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		
	}

	public Student() {
    	super();
    	System.out.println("no parameterized constructor");
    }
    
    public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", location=" + location
				+ "]";
	}
}