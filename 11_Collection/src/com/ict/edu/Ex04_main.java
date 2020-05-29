package com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < args.length; i++) {
			Ex04 group = new Ex04() ;
			System.out.println("이름 : ");
			group.setName(sc.next());
			
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			
			System.out.println("영어점수 : ");
			int eng = sc.nextInt();
			
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			
			// 합계
			group.s_sum(kor,eng,math);
			
			
			
			
			
		
			
		}
		
		
		
		
		
		Ex04 p1 = new Ex04();
		p1.setName("효정");
	//	p1.setSum();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
