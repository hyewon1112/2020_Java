 package com.ict.edu01;

public class Ex02 {
	public static void main(String[] args) {
		// 선언 -> 생성 -> 저장 -> 출력
		
		// char[] su2 ;
		// su2 = new char[4] ;
		
		// 선언과 생성을 한번에
		char[] su2 = new char[4];
		
		// 데이터 저장 
		su2[0] = 'b';
		su2[1] = 'o';
		su2[2] = 'y';
		su2[3] = 's';
		
		//출력
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		System.out.println("=================");
		
		for (char k : su2) {
			System.out.println(k);  // k 안쓰고 m쓰든 뭐쓰든 상관없음 !
		}
		System.out.println("=================");
		
		// 선언과 생성을 한번에
		// String 배열만들고 저장내용 : "java", "jsp" , "html", "css", "jQuery"
		
		String[] V = new String[5];
		V[0] = "java" ;
		V[1] = "jsp" ;
		V[2] = "html" ;
		V[3] = "css" ;
		V[4] = "jQuery" ;
		
		for (int i = 0; i < V.length; i++) {
			System.out.println(V[i]);
		}	
		System.out.println("=================");
		
		for (String h : V) {
			System.out.println(h);
		}
		System.out.println("=================");
		
		// 선언, 생성, 데이터 저장을 한번에
		int[] su4 = {10,200,3000,40000};
		
		for (int i = 0; i < su4.length; i++) {
			System.out.println(su4[i]);
		}
		System.out.println("=================");
		
		for (int k : su4) {
			System.out.println(k);
		}
		
		// String 배열만들고 저장내용 ("java", "jsp" , "html", "css", "jQuery") 한 번에
		String[] su5 = {"java","jsp","html","css","jQuery"}; 
		for (int i = 0; i < su5.length; i++) {
			System.out.println(su5[i]);
		}
		System.out.println("==================");
		
		for (String k : su5) {
			System.out.println(k);
		}
		
	}
}
