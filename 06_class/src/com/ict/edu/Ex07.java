package com.ict.edu;

public class Ex07 {
	private String name = "커피우유";
	private int su = 100 ;
	private int price = 1100 ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 // 지역변수와 전역변수이름 같을 때
		// 전역변수에 this를 붙인다.
		// 이유는 전역변수와 지역변수 이름 같으면
		// 무조건 우선순위는 지역변수 이므로 지역변수만 사용하게 된다.
		// 지역변수는 해당 메소드를 호출할 때 생성됨 
		this.name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
