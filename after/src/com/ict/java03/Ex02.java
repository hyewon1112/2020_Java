package com.ict.java03;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		
		
	//1   Calendar를 활용해서 오늘날짜, 시간, 분, 요일을 구하시오 
		
	   // Calendar는 new로 객체 생성을 하지 않는다.
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1); // 0부터 11까지로 되어있어서 ! 자바에서 '월'은 무조건 +1 해야 한다.
		System.out.println(now.get(Calendar.DATE));
		System.out.println("=========================================");
		System.out.println(now.get(Calendar.HOUR)); 
		
		int res = now.get(Calendar.AM_PM);
		if (res == 0) {			// 0은 오전am을 말하는 거고 
			System.out.println("오전 : "+ now.get(Calendar.HOUR)); 
		}else if(res == 1){	      // 1은 오후pm을 말하는 거다.
			System.out.println("오후 : "+ now.get(Calendar.HOUR)); 
		}
		System.out.println("=========================================");
		
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); // HOUR은 12시간제라서 24시간제인 아워오브대이 쓰는게 나음
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println("=========================================");
		
		
		// 요일 : 일요일(1) ~ 토요일(7)   일요일에서 토요일 숫자들도 자바에서 원래 정해져 있는거다.
		int result = now.get(Calendar.DAY_OF_WEEK);
		switch (result) {
		case 1:System.out.println("일요일"); break;
		case 2:System.out.println("월요일"); break;
		case 3:System.out.println("화요일"); break;
		case 4:System.out.println("수요일"); break;
		case 5:System.out.println("목요일"); break;
		case 6:System.out.println("금요일"); break;
		case 7:System.out.println("토요일"); break;
		}
		
	}
}
