package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Ex05_main {
	public static void main(String[] args) {
		// 내부클래스가 별도로 객체 생성을 할 수 없다
		// Inner01 inner01 = new Inner01();
		
		// 외부클래스를 통해서 객체 생성 해야 된다.
		Ex05 e5 = new Ex05();
		System.out.println(e5.name);
		
		// private이므로 오류
		//System.out.println(e5.age);
		
		e5.play();
		System.out.println("========================");
		
		// Member 내부클래스
		Ex05.Inner01 inner01 = new Ex05().new Inner01();
		System.out.println("========================");
		
		Ex05.Inner01 inner02 = e5.new Inner01();
		inner02.prn();
		System.out.println("========================");
		
		// static 내부클래스 호출
		System.out.println(Inner02.a3);
		System.out.println(Inner02.a4);
		Inner02.go2();
		System.out.println("========================");
		
		// static 내부클래스는 외부클래스를 통하지 않고 바로 만들 수 있다.
		Inner02 test = new Inner02();
		System.out.println(test.a1);
		System.out.println(test.a2);
		test.go();
	}
}
