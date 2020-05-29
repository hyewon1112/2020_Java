package com.ict.edu9;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Serializable 이 아닌 다른 방법
// writeExternal() => 직렬화, readExternal() => 역직렬
// 제외 시키는 방법 : transient 소용 없다.
//				메소드 writeExternal() 와 readExternal() 안에 있는 멤버를 동시에 제외시킨다.
public class VO implements Externalizable {
	private String name;
	private int age ;
	private double weight;
	private boolean gender;
	
	
	public VO() {}
	

	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = (int) in.readObject();
		weight = (double) in.readObject();
	//	gender = (boolean)in.readObject();
	}

	@Override // > 이게 직렬화라서 위에 오버라이드 말고 이거 먼저 함.
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
	//	out.writeObject(gender);
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
		this.age = age; // 외부에서 뭔가를 받아서 바꾸는 것(변경시키는 것)
	}

	public double getWeight() {
		return weight; // 있는걸 보내고 뭔가를 받지 않음 
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
