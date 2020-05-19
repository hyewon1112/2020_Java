package com.ict.edu3;

public class Main {
	public static void main(String[] args) {
		// super 와 super() , this 와 this()
		// this : 객체 내부에서 자기 자신을  지칭하는 예약어
		//		  전역변수와 지역변수의 이름이 같을 때
		//	 	  전역변수 앞 this을 사용해서 전역변수임을 알 수 있다.
		// this([인자]) : 객체 자신의 생성자를 지칭하는 예약어
		// 			생성자에서 자기의 다른 생성자를 호출할 때 사용
		//			반드시 생성자 첫줄에 존재해야 된다.
		
		// super : 부모클래스의 멤버필드를 지칭하는 예약어
		// 		   자식클래스의 전역변수와 이름이 같을 때
		//		   부모클래스 멤버필드 앞에 사용한다.
		
		// super([인자]) : 부모의 생성자를 지칭하는 예약어
		//				   부모 생성자를 호출할때 사용
		// 				   반드시 생성자 첫줄에 존재해야 된다.
		//				   this(), super()를 같이 사용할 수 없다.
		//		   		   없으면 생성되어 있다.
		

		Person s = new Student("홍길동학생", 24, 25000);
		Person t = new Teacher("고길동강사", 54, "자바");
		Person e = new Employee("둘리관리자", 45, "교무과");
		
		// 만약에 Person에  print()가 없으면
		// 아무리 Student(), Teacher(), Employee()에 print()가 있어도 사용 불가
		s.print();
		t.print();
		e.print();
		
		
		
		
	}
}
