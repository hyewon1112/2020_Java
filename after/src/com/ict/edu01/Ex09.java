package com.ict.edu01;

public class Ex09 {
	public static void main(String[] args) {
		// 다차원배열 : 1차원 배열이 여러개 모인 것
		// 		종류 : 고정길이, 가변길이
		// 고정길이배열 : 1차원 안에 존재하는 배열의 수가 같다.
		// 가변길이배열 : 1차원 안에 존재하는 배열의 수가 다르다.
		
		// 가변길이배열
		// 선언 : 자료형[][] 이름 ;
		// 생성 : 이름 = new 자료형[1차원배열의 수][] ;  // 고정되있지 않아서 뒤에는 비어있음. 
		char[][] ch ;
		ch = new char[3][] ;
	  
	//	char[][] = new char[3][];
			
		// 데이터 입력 : 아래 처럼 쓰면 가변길이에서는 무조건 오류이다.
		/*
		ch[0][0] = 'a' ;
		ch[0][1] = 'A' ;
				
		ch[1][0] = 'b' ;
		ch[1][1] = 'B' ; 
				
		ch[2][0] = 'c' ;
		ch[2][1] = 'C' ; 
				*/
		
		char[] c1 = {'a','A','Z'};
		char[] c2 = {'b','B'};
		char[] c3 = {'c','C','Y','M'};
		
		ch[0] = c1 ;
		ch[1] = c2 ;
		ch[2] = c3 ;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		
		
		// 선언, 생성, 데이터 입력을 한번에 // 실제로 이건 잘안쓰긴함 이차원에선 위에꺼 많은씀
		String[][] str = {{"java","자바","안드로이드"},{"jsp","html"},{"spring","css","android","python"}};
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
	}
}
