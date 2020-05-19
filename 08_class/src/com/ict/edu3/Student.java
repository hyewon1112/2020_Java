package com.ict.edu3;

public class Student extends Person {
	private int id ;
	
	/*
	public Student() {
		// super(); 오류가 난 이유
		// super("태권브이", 24); // 1. 오류 아님
		// Person클래스에 기본 생성자 만들어도 오류 아님
	}
	*/
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("이름 : " + super.getName() + "나이 : " + getAge() + ", 학번 : " + id );
	}
	
}
