package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DCaPhone dca = new DCaPhone();		
		dca.call();	//부모
		dca.sms();	//부모
		dca.dca();	//자식
		
		System.out.println("================");
		
		MP3Phone mp3 = new MP3Phone();
		mp3.call();	 //부모
		mp3.sms();	 //부모
		mp3.sound(); //자식
		System.out.println("================");
		
		// 자식클래스 = 자식클래스생성자()
		GamePhone gp = new GamePhone();
		gp.call();	//부모
		gp.sms();	//부모
		gp.play();	//자식
		System.out.println("================");
		
		// 부모클래스 = new 자식클래스생성자()
		Phone p1 = new DCaPhone();
		p1.call();	//부모
		p1.sms();	//부모
		//p1.dca();	//자식 , 오류발생 (*내필기* > 부모클래스가 자식클래스 메소드는 사용 불가) 
		
		
		Phone p2 = new MP3Phone();
		p2.call(); //부모 꺼 씀
		p2.sms();  //부모 꺼
		//p2.sound(); //자식 꺼, 못 씀 오류발생
	}
}
