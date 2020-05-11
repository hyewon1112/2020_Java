package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0; // 전체 횟수 count ;
		int even = 0; // 짝수 count ;

		esc:while (true) {
			total += 1;
			System.out.print("숫자 입력 : ");
			int k = sc.nextInt();
			String str = "";
			if (k % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			System.out.println(k + "는" + str + "입니다.");

			while (true) {
				System.out.println("계속할까요? (1.yes, 2.no) >> ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					continue esc;
				}else if (k2 == 2) {
					break esc;
				}else {
					System.out.println("제대로 입력하세요");
					continue;
				}					
							
			}

		}
		System.out.println("전체 횟수 : " + total + "짝수의 횟수 : " + even);
		System.out.println("수고하셨습니다.");

	}
}
