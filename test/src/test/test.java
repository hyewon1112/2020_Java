package test;


public class test {
	public static void main(String[] args) {
		
		/*
		순번1>

		1. 자바에서 사용하는 기본자료형를 쓰시오
		byte, short, int, char, long, double, boolean, float

		2. 정수값 10을 su라는 변수에 넣고 변수 su에 데이터가 들어갔는지 확인하는 자바 형식을  쓰시오
		
		int su = 10; 
		System.out.println(su);

		3. a++ 과 ++a 의 차이점을 쓰시오
		
		a++는 기존의 값을 가진채로 이후에 +1을 하는 것을 말한다.
		++a는 기존의 값에서 +1을 한 값을 말한다.

		4. 논리연산자 AND와 OR에 대해서 쓰시오
		논리연산자 AND는 논리곱(&&)이고 주어진 조건이 모두 true 일때 결과가 true이며, 주어진 조건 중 false를 만나면 이후 연산을 하지 않으며 결과는 false가 된다.
		논리연산자 OR는 논리합(||)이며 주어진 조건 중 하나라도 true일때 결과가 true이며 true를 만나면 이후에 연산을 하지 않는다.
		
		5. int su = 24  일때  삼항연산자를 활용해서 홀수인지, 짝수인지 판별할 수 있는 코딩을 쓰시오
		int su1 = 24;	
		String res = (su1 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println("su1은" + res + "입니다."); 

		순번2>

		1   Random 클래스를 활용해서 정수 1-10 사이의 난 수를 구하시오 
			Random ran = new Random();
			System.out.println("int형 : " + ran.nextInt());
			System.out.println("범위 지정 : " + ran.nextInt(11)); // 0-10까지 에서 난수
			
		2   Math클래스에서 올림, 반올림, 버림을 실행하는 각 각 메소드를 쓰시오 
		
		올림 메소드 :  Math.ceil();
		반올림 메소드 :  Math.round();
		버림 메소드 : Math.floor();	
		

		3   String 클래스에서 substring()에 대해서 쓰시오
		
		

		4   String 클래스에서 valueOf()에 대해서 쓰시오 


		5   제네닉과 컬렉션에 대해서 쓰시오 
	
		제네닉은 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체(클래스)타입을 말한다.
		컬렉션은 객체들을 모아서 관리하는 인터페이스들을 말한다.
		컬렉션의 주요 메소드는 add(E e), addALL(Collection<? extends E> c), clear(), contains(Object o), isEmpty(), iterator(), remove(Object o), size(), toArray() 가 있다.


		순번3>

		1   클래스는 무엇들로 이루어 졌는가 (3가지 쓰시오) ?
			>클래스는 멤버필드, 생성자, 멤버메소드 로 이루어져 있다.

		2   클래스를 객체로 생성할 때 초기화를 목적으로 반드시 호출하는 것을 무엇인가 ?
			>생성자

		3   어떤 클래스에서 같은이름의 메소드가 여러개 존재하는 것으로 반드시 매개변수는 달라야 하는것을 무엇이라 하는 가?   
			????? 오버로딩???

		4   상속관계에서 부모클래스의 메소드를 자식클래스가 가져와서 자식클래스 상황에 맞게 변경하는 것을 무엇이라 하는가?
			>오버라이딩

		5   추상클래스와 인터페이스에 대해서 쓰시오
		
		 추상클래스 : 
		 
		 인터페이스 : 
		
		

		순번4>
		
		1   근무시간이 8시간까지는 시간당 8590이고 
		 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
		현재 근무한 시간이 10이다. 
		얼마를 받아야 하는가? ( IF~else을 사용하시오)
		
		package test;

public class testt {
	public static void main(String[] args) {

		        // 근무시간이 8시간까지는 시간당 8590이고 
				// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
				// 현재 근무한 시간이 10이다. 
				// 얼마를 받아야 하는가?( IF~else을 사용하시오)
				int time = 10 ;
				int dan = 8590;
				int pay = 0 ;		
							
				if (time>8) {
					System.out.println("pay = " + (int)((8*dan)+(time-8)*dan*1.5));
				} else {
					System.out.println("pay = " + time*dan);
				}	
		
	}

}


		순번5>
		1   
		5명의 이름, 국어, 영어, 수학을 입력받아서 
		이름, 총점, 평균, 학점, 순위를 구하고 정렬하자
		(순위와 정렬은  main에서 구함 )
		main()함수를 가지고 있는 클래스 : Sungjuk
		정보를 가지고 있는 클래스 : Person
		public class Person{
		    private String name ;
		    private int sum ;
		    private double avg ;
		    private String hak ;
		    private int rank = 1 ;

		    나머지는 채우세요
		}

		순번6>

		1   Calendar를 활용해서 오늘날짜, 시간, 분, 요일을 구하시오 
		
		Date date = new Date();
		System.out.println(date);
		
		
		
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)+ "년");
		System.out.println(now.get(Calendar.MONTH)+ "월"); // 0-11
		System.out.println(now.get(Calendar.DATE)+ "일");
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		
	*/	
		
		
	
		
		
		
		
	}
	


	
	
	
	
	
}
