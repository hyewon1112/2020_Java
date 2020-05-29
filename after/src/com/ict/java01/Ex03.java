package com.ict.java01;

public class Ex03 {
	public static void main(String[] args) {
		/*
		근무시간이 8시간까지는 시간당 8590이고 
		 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
		현재 근무한 시간이 10이다. 
		얼마를 받아야 하는가? ( IF~else을 사용하시오)
		*/
		int dan = 8590;
		int work = 10 ; 
        int money = 0;
        
        
        if (work > 8) {
			money = (int)((8 * dan) + (work-8)*dan*1.5) ;
		} else {
			money = work  * dan ;
		}
        System.out.println("받아야 할 돈은" + money );
		
		
		
		
		
	}
}
