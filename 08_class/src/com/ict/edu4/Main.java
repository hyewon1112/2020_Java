package com.ict.edu4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 오버로딩   : 한 클래스 안에서 같은 이름의 메소드가 여러 개 존재하는 것.
		// 				(인자의 자료형이나 갯수가 다르다)
		
		// 오버라이딩 : 상속관계에서 부모메소드와 자식메소드가 같은 것.
		//				이때 자식클래스가 부모메소드를 갖다 쓰는 대신에
		//				내용은 자기에 맞게 변경해서 사용하는 것.
		//			 ** 부모메소드가 숨겨진다. (은닉화, = 캡슐화)
		//		  	 ** 같은메소드를 실행하여도 다른 내용을 실행한다. (다형성)
		
		Animal d = new Dog();
		Animal c = new Cat();
		
		System.out.println(d.eye);
		System.out.println(d.legs);
		d.like();
		d.sound();
		System.out.println("===================");
	
		
		System.out.println(c.eye);
		System.out.println(c.legs);
		c.like();
		c.sound();
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요 (1.고양이, 2.강아지) >>");
		int su = sc.nextInt();
		
		/* > 이게 틀린 내용이 아니라 이거보다 코딩줄이는 빠른 방법이 있어서 주석화 한 것.
		if (su == 1) {
			Cat cat = new Cat();
			cat.sound();
			cat.like();
			cat.hobby();
		}else if (su == 2) {
			Dog dog = new Dog();
			dog.sound();
			dog.like();
			dog.hobby();
		}
		*/
		
		Animal a = null;		
		if (su == 1) {
			a = new Cat();
		} else if(su == 2) {
			a = new Dog();
		}
		a.sound(); // 부모, 자식 둘다가지고 있음 > 오버라이딩 이름 만 갖고 가져오는 내용은 다르니까 가져옴
		a.like();  // 부모 가 가지고 있음 > 그래서 부모껄로만들었으니 바로 가져 옴
		// a.hobby();  자식이 가지고 있어서 사용 못 함 부모는 자식꺼 못 씀
	
		
	}
}
