package com.ict.edu6;

import java.io.Serializable;

// 객체의 정보를 담당하는 클래스
// Serializable 인터페이스를 사용해서 직렬화 할 수 있다.
// 직렬화 제외 시키는 방법 : 변수앞에 transient 예약어를 사용
// 주의 사항 : boolean형은 무조건 false(가 기본값이라서 답을 안알려준건지 false가 값이었던 것인지 헷갈릴 수 있음)
public class VO implements Serializable {
	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	public VO() {}
	
	public VO (String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
	

}
