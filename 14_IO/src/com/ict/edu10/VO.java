package com.ict.edu10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class VO implements Externalizable {
	private String name;
	private int kor ;
	private int eng ;
	private int math ;
	private int sum ;
	private double avg ;
	private String hak ;
	
	public VO() {} 

	public VO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		sum = kor + eng + math ;
		avg = (int)(sum/3.0*10)/10.0;
		if (avg >= 90) {
			hak = "A";
		}else if (avg >= 80) {
			hak = "B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
		
	}
	
	// 역직렬
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		kor = (int)in.readObject();
		eng = (int)in.readObject();
		math = (int)in.readObject();
		sum = (int)in.readObject();
		avg = (double)in.readObject();
		hak = (String)in.readObject();
		
	}
	
	// 직렬
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}
	
	
	
	
	

}
