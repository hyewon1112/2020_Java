package com.ict.java03;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
	// Random 클래스를 활용해서 정수 1 - 10 사이의 난 수를 구하시오
	// 1. 난수 발생 ; Random, Math.random()  
	// Random 클래스 생성
		Random ran = new Random();
		
		// boolean형 랜덤
		System.out.println(ran.nextBoolean());
		
		// 정수 범위 랜덤
		System.out.println(ran.nextInt());
		
		// 실수 범위 랜덤 (0.0이상부터 1.0 미만)
		System.out.println(ran.nextDouble());
		
		// 특정범위를 지정한 랜덤
		System.out.println(ran.nextInt(10)+1); // (0 - 9) + 1
		
		System.out.println((int)(ran.nextDouble()*10)+1);  // (0-9) + 1
		
		
		// Math.random() => (0.0이상부터 1.0 미만)
		System.out.println(Math.random());
		
		// 특정범위 지정할 수 있다.
		System.out.println((int)(Math.random()*10)+1); // (0-9) +1
		
		System.out.println("=========================================");
		
	 // 2. Math클래스에서 올림, 반올림, 버림을 실행하는 각각 메소드를 쓰시오 
		
		// 올림
		System.out.println(Math.ceil(14.45));
		System.out.println(Math.ceil(14.55));
		System.out.println(Math.ceil(14.65));
		// 반올림
		System.out.println(Math.round(14.45));
		System.out.println(Math.round(14.55));
		System.out.println(Math.round(14.65));		
		// 버림
		System.out.println(Math.floor(14.45));
		System.out.println(Math.floor(14.55));
		System.out.println(Math.floor (14.65));
		System.out.println("=========================================");
				
	// String 에서는 '같다' 라는 표시를 '==' 표시를 사용하면 안됨
	// 반드시 equals()와 equalsIgnoreCase()로 '같다'라는 표시를 해야 된다.
	// 차이점 : equals() (대소문자구별), equalsIgnoreCase() (대소문자를 구별하지 않는다)
		
		
	// getBytes() : byte[]
	// 해당문자열을 byte[] 로 만든다.(바이트배열로만든다는말) > io에서 출력할때 사용한다.
		
	// indexOf(char c), indexOf(String s) :
	// 들어온 문자, 문자열의 위치값을 알려준다.
	// 없으면 -1 나온다.
	String str = "BufferedReader";
	
	// 'r'의 위치 찾아라
	int k = str.indexOf('r');
	System.out.println(k);
	
	
	// 'er'의 위치 찾아라
	k = str.indexOf("er"); //찾는 단어의 첫 글자의 위치값이 출력된다.
	System.out.println(k);
	
	// 'f'의 위치 찾아라
	k = str.indexOf('f');
	System.out.println(k);
	
	// 두번째 'f'의 위치 찾아라
	k = str.indexOf('f',str.indexOf('f')+1);
	System.out.println(k);
	
	// 세번째 'e'의 위치 찾아라
	k = str.indexOf('e', str.indexOf('e',str.indexOf('e')+1)+1);
	System.out.println(k);
	
	// length() : 문자열의 길이 구함
	String msg = "대한 Korea 121";
	System.out.println(msg.length());
	
	// replace : 치환
	String str2 = "대한민국";
	String str3 = str2.replace("한", "han");
	System.out.println(str2);
	System.out.println(str3);

	
// 3. String 클래스에서 substring()에 대해서 쓰시오
	
	// substring(시작위치) : 시작위치부터 끝까지
	// substring(시작위치, 끝위치) : 시작위치에서 끝위치 전까지
	String str4 = "010-9732-9110";
	System.out.println(str4.substring(4));
	System.out.println(str4.substring(4,8));
	System.out.println(str4.substring(0,3)); // 맨 앞 3개 만
	System.out.println(str4.substring(9)); // 맨 뒤 4개 만
	System.out.println(str4.substring(9,13)); // 맨 뒤 4개 만
	
	// 모든 글자를 대문자로 변경 : toUpperCase()
	// 모든 글자를 소문자로 변경 : toLowerCase()
	String str5 = "KoreaSeoul";
	System.out.println(str5.toUpperCase());
	System.out.println(str5.toLowerCase());
	System.out.println(str5.substring(0,5).toUpperCase() + str5.substring(5).toLowerCase());
	
	// 4. String 클래스에서 valueOf()에 대해서 쓰시오 
	// valueOf(각종 자료형) => 인자로 들어온 각종 자료형들을 문자열(String)로 만든다.
	boolean b1 = true;
	char c1 = 'k'; 
	int n1 = 24 ;
	double n2 = 34.1;
	
 //	System.out.println(b1+1); 원래 boolean은 +1을 할 수 없다.
	System.out.println(String.valueOf(b1)+1); 
	
	System.out.println(n1+1);  // 25
	System.out.println(String.valueOf(n1)+1); // 241
	
	System.out.println(n2+1); // 35.1
	System.out.println(String.valueOf(n2)+1); // 34.11

	// 각종 자료형 처럼 생긴 문자열을 진짜 각종 자료형으로 변경
	String st1 = "true";
	String st2 = "24";
	String st3 = "34.1";
	
	//문자열 => boolean : Boolean.parseBoolean()
	System.out.println(st1+1);  // 문자니까 그냥 옆으로 숫자가 바로 붙음
	//System.out.println(boolean.parseBoolean(st1)+1); 원래 boolean은 +1을 할 수 없다.
	
	// 문자열 => 정수 : Integer.parseInt()
	System.out.println(st2+1); // 241
	System.out.println(Integer.parseInt(st2)+1); //25
	
	// 문자열 => 실수 : Double.parseDouble()
	System.out.println(st3+1); // 34.11
	System.out.println(Double.parseDouble(st3)+1); //35.1
	
	// 5. 제네닉과 컬렉션에 대해서 쓰시오
	// 제네닉과 컬렉션에 대해서 쓰시오
	// 컬렉션 : 객체들을 모아서 관리하는 것 ( set, List, Queue, Map )
	// 제네닉 : 컬렉션이 어떤 객체들로 이루어져 있는지를 표시하는 객체(혹은 클래스) 타입
	
	

	
	}
}
