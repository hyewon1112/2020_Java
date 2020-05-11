package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0 ;  // 전체 횟수 count ;
		int even = 0 ; // 짝수 count ;
				
		
		while (true) {
			total += 1 ;
			System.out.print("숫자 입력 : ");
			int k = sc.nextInt();
			String str = "";
			if (k % 2 == 0) {
				str = "짝수";
			}else {
				str = "홀수";
			}
			System.out.println(k + "는" + str + "입니다.");
			System.out.println("계속할까요? (1.yes, 2.no)");
			int k2 = sc.nextInt();
			if (k2 == 2) break ;
		
		}
		System.out.println("전체 횟수 : " + total + "짝수의 횟수 : " + even);
		System.out.println("수고하셨습니다.");
		
		


	}
}
