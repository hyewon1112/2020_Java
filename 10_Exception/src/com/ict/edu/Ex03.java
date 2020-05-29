package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;
// 다중 catch 문 : try문의 예외발생이 여러개 될 수 있는 경우
// 주의 사항 : Exception 사용할때는 반드시 아래 쪽 catch문에 사용

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// InputMismatchException
		// ArithmeticException
		/*
		try {
			int var = 50 ; 
			System.out.println("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (InputMismatchException e1) {
			System.out.println("정수만 입력해주세요");
		} catch (ArithmeticException e2) {
			System.out.println("0으로는 나눌 수가 없습니다.");
		} catch (Exception e) {
			System.out.println("제대로 입력하세요");
		}
		 */
		try {
			int var = 50 ; 
			System.out.println("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (Exception e) {
			System.out.println("제대로 입력하세요");
		}
		System.out.println("수고 하셨습니다.");
	}
}
