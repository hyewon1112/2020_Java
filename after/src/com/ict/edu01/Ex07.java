package com.ict.edu01;

public class Ex07 {
	public static void main(String[] args) {
		// 다차원배열 : 1차원 배열이 여러개 모인 것
		// 		종류 : 고정길이, 가변길이
		// 고정길이배열 : 1차원 안에 존재하는 배열의 수가 같다.
		// 가변길이배열 : 1차원 안에 존재하는 배열의 수가 다르다.
		
		// 고정길이배열
		// 선언 : 자료형[][] 이름 ;
		char[][] ch ;
		// 생성 : 이름 = new 자료형[1차원 배열의 수][1차원 안에 존재하는 배열의 수] 
		ch = new char[3][2] ;
		
	    // 선언과 생성을 한번에 : char[][] ch = new char[3][2] ;
		
		// 데이터 입력
		ch[0][0] = 'a' ;
		ch[0][1] = 'A' ;
		
		ch[1][0] = 'b' ;
		ch[1][1] = 'B' ; 
		
		ch[2][0] = 'c' ;
		ch[2][1] = 'C' ; 
		
		// 출력
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		
		System.out.println("==============================");
		// 선언과 생성과 초기값을 한번에
		String[][] str = {{"java","자바"},{"jsp","자바서버페이지"},{"spring","스프링"}};
		// 출력
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
			
		}
		
		System.out.println("==============================");
		
		// 1차원 배열을 만들어서 2차원 배열에 넣기 (가변길이에서도 사용 됨)
		int[] num1 = {1,2,3,4};
		int[] num2 = {100,200,300,400};	
		int[][] su = new int [2][4];
		
		// 2차원 배열에 1차원 배열 넣기
		su[0] = num1;
		su[1] = num2;
		
		//출력
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
		
	}
}
