package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력	
		System.out.print("이름 입력 : ");
		String name = sc.next();		
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();								
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();									
		System.out.print("수학점수 입력 : ");
		int mat = sc.nextInt();	
		System.out.println("=====================================");
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);

		
		//출력
		int sum = 0; 
		int avg = 0;
		char lev = 'A';
		
		System.out.println(sum +"="+ kor+eng+mat);
		System.out.println(avg +"="+ ((kor+eng+mat)/3) );
		
				
				
				
				
				
				
				
				
	}
}
