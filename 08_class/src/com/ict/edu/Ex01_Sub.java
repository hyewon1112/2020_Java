package com.ict.edu;

// 자식 클래스 : 자식클래스에서 부모클래스와 상속관계를 맺는다.
public class Ex01_Sub extends Ex01_Sup{
	String name = "홍반장";
	int age = 13;

	public Ex01_Sub() {
		super(); // 생략되어있다.
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void play() {
		System.out.println(name); // 홍반장
		
		// 지역변수가 우선
		String name =  "홍두깨";
		System.out.println(name); // 홍두깨
		
		// 지역X, 전역X, 부모O
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);	
		
		int age = 3;
		System.out.println(age); 		// 3  (지역)
		System.out.println(this.age); 	// 13 (전역)
		System.out.println(super.age);  // 57 (부모)
		
	}
	
	public void play2() {
		// private은 상속이어도 접근 안됨
		//System.out.println(dog);
		System.out.println(GENDER);
		System.out.println(car);
		
	}
	
	
	
}
