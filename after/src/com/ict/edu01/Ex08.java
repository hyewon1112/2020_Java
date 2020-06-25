package com.ict.edu01;

public class Ex08 {
	public static void main(String[] args) {
		int[][] person = new int[3][4] ;//3명에 각4개의 정보들어간다.
				
		int[] p1 = {270, 90, 'A', 1} ;
		int[] p2 = {210, 70, 'C', 1} ;
		int[] p3 = {285, 95, 'A', 1} ;
		
		
		person[0] = p1 ;
		person[1] = p2 ;
		person[2] = p3 ;
		
		// 순위 구하기  - 첨부터 끝까지를 비교행햐함
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person.length; j++) {
				if (person[i][0] < person[j][0]) {   // 나의 0번방과 너의 0번방을 비교함 
					person[i][3]++;
				}
			}
		}
		
		// 정렬하기
		int[] tmp = new int [4] ; // 자리를 변경하기 위해서 비어있는 방을 만든거임 대신 p1p2 얘네들 정보의 방크기 만큼의 임시 방을 만들어야함.
		for (int i = 0; i < person.length-1; i++) {
			for (int j = i+1; j < person.length; j++) {
				if (person[i][0] < person[j][0]) {   
					tmp = person[i];
					person[i] = person[j];
					person[j] = tmp ;
				}
			}
		}
		
		
		//출력하기
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.print(person[i][j]+ " ");			
			}
			System.out.println();
		}
		
		
		
		
			}
}
