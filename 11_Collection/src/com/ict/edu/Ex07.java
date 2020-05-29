package com.ict.edu;


import java.util.TreeSet;

public class Ex07 {
	public static void main(String[] args) {
		// 로또 번호 : 1 - 45, 랜덤, 중복 안됨, 6자리
		TreeSet<Integer> lotto1 = new TreeSet<Integer>() ;
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math .random()*45)+1 ;
			if(!lotto1.add(k)) {	
				i--;			
		}
		
		System.out.println(lotto1);
	}
	
}

	
}