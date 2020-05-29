package com.ict.edu01;

// 열거형(enum) : 상수를 하나의 객체로 인식하고, 여러개의 상수 객체들을 한 곳에 모아 둔 
//				  하나의 묶음 (객체)
public class Ex01 {
	
	static final int JAVA = 200 ;	// 상수
	static final int HTML = 1000 ;
	
	public enum Lesson{
		// static final 모임
		JAVA, JSP, SPRING, ANDROID, HTML	// , 1000 오류(으로 넣으면 오류라는것)
	}
	
	public static void main(String[] args) {
		// enum에서 하나 추출
		Lesson s1 = Lesson.JAVA;
		System.out.println("s1 : " + s1);				// 객체 (로 인식한거임)
		System.out.println("JAVA : " + Ex01.JAVA);		// 데이터
		System.out.println("=======================");
		System.out.println("HTML : " + Ex01.HTML);		// 데이터 (가 나옴)
		System.out.println("HTML : " + Lesson.HTML);	// 객체 (가 나온다)
		
		// 한번에 추출
		Lesson[] items = Lesson.values();
		
		// ordinal : index()
		for (Lesson k : items) {
			System.out.println(k + ":" + k.ordinal()); 
		}
		
	}
}
