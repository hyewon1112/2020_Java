package com.ict.edu;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		// Random 클래스를 가지고 객체 생성 해서 사용
		Random ran = new Random();  //  객체 생성
		int su = ran.nextInt(10)+1 ; // 1-10
		System.out.println(su);
	}
}
