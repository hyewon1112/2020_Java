package com.ict.edu;

public class Ex02 {
	// String 클래스 주요 메소드
	public static void main(String[] args) {

		String str = "ICT인재개발원 2강의장";

		// 1. charAt(int index) : char
		// 위치정보가 숫자로 들어오면 해당 위치의 글자를 반환한다.
		char c1 = str.charAt(5);
		System.out.println(c1);

		// 모두 대문자로 만들자 (대문자와 소문자의 차이는 32 이다)
		String str2 = "대한민국 I love You 123";
		for (int i = 0; i < str2.length(); i++) {
			int c2 = str2.charAt(i);
			// 소문자 찾기
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.println(c2);
		}
		System.out.println();

		// 2. concat(String str) : String
		// 들어온 문자열을 현재 문자열과 합친다.
		String str3 = "대한민국";
		String str4 = "KOREA";
		String result = str3.concat(str4);
		System.out.println(result);
		System.out.println(str3 + str4);

		// 3. equals(Object anObject) : boolean
		// 들어온 문자열과 현재 문자열이 같으면 true, 다르면 false ( 대소문자 구별 )

		// 4. equalsIgnoreCase(String anotherString) : boolean
		// 들어온 문자열과 현재 문자열이 같으면 true, 다르면 false ( 대소문자 구별 없음 )
		String str5 = "Korea";
		String str6 = "KOREA";

		if (str5.equals(str6)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println("===================");

		if (str5.equals(str6)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		// 5. format(String format, Object... args)
		// 형식을 지정하고 형식에 맞춰 생성
		String str7 = "ICT 인재 개발원";
		String res = String.format("%s", str7);
		System.out.println(res);
		System.out.println("==================");

		res = String.format("%30s", str7);
		System.out.println(res);
		System.out.println("==================");
		
		// 남은 자리는 비워둔다.
		res = String.format("%25s", str7);
		System.out.println(res);
		System.out.println("==================");
		
		// 모자란 자리는 상관하지 않음
		res = String.format("%6s", str7);
		System.out.println(res);
		System.out.println("==================");
		
		
		
		// 6. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입출력할때 사용한다. (대소문자, 숫자만 가능, 영어 이외의 글자는 안됨)
		String str8 = "java";
		byte[] b = str7.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("==================");
		
		// 반대로 해당 byte[]를 문자열로 만들자
		String str9 = new String(b);
		System.out.println(str8);

		// 7. indexOf(int ch), indexOf(String str) :
		// char 나 Strnig이 들어오면 해당문자열에 char나 String의 위치값을 알려준다.
		// 찾는 문자나 문자열이 없으면 -1
		String str10 = "BufferedReader";
		
		// 'r'의 위치값을 찾아라
		int k1 = str10.indexOf('r');
		System.out.println(k1);
		System.out.println("==================");
		
		k1 = str10.indexOf('K');
		System.out.println(k1);
		System.out.println("==================");
		
		k1 = str10.indexOf("er");
		System.out.println(k1);
		System.out.println("==================");
		
		// 7. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// 여기서 int formIndex란 시작위치를 말한다.
		// 2번째, 3번째 문자나 글자를 찾기 위함이다.
		
		// 위에서 'r'의 위치값은 5이다. 6부터 다시 'r'를 찾으면 두번째 'r'를 찾을 수 있다.
		k1 = str10.indexOf('r', 6);
		System.out.println(k1);
		
		k1 = str10.indexOf('r', str10.indexOf('r')+1);
		System.out.println(k1);
		
		k1 = str10.indexOf("er", str10.indexOf("er")+1);
		System.out.println(k1);
		System.out.println("==================");
		
		// 8. lastIndexOf(int ch), lastIndexOf(String str) : in
		// 마지막 문자나 문자열을 찾을 때 사용
		k1 = str10.lastIndexOf('d');
		System.out.println(k1);
		
		k1 = str10.lastIndexOf("er");
		System.out.println(k1); 
		
		// 9. length() : int
		// 해당 문자열의 길이를 구해준다. (for문에 많이 사용된다.)
		String str11 = "abcABC123가나다";
		k1 = str11.length();
		System.out.println("길이 : " + k1);
		System.out.println("=====================");
		
		// 10. replace(char oldChar, char newChar), replace(String oldstr, String newstr) : String
		// 새로운 문자나 문자열을 받아서 치환하기
		String str12 = "대한민국";
		String str13 = str12.replace("대한민국", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		System.out.println("==================");
		
		str12 = str12.replace("한", "한 ♥");
		System.out.println(str12);
		
		// 11. contains(String s) : boolean, 인자 char 는 오류, 대소문자 구별함
		// 인자로 들어온 문자열이 해당 문자열에 존재하면 true, 존재하지 않으면 false
		String str14 = "KOREA @ 대한민국";
		boolean b1 = str14.contains("@");
		System.out.println(b1);
		
		b1 = str14.contains("대한");
		System.out.println(b1);
		
		b1 = str14.contains("$");
		System.out.println(b1);
		
		b1 = str14.contains("KOR");
		System.out.println(b1);
		
		b1 = str14.contains("kor");
		System.out.println(b1);
		System.out.println("==========================================");
		
		// 12. isEmpty() : boolean
		// 해당문자열이 비어있으면 true, 내용이 있으면 false
		String str15 = "";
		b1= str15.isEmpty();
		System.out.println(b1);
		
		str15 = "대한민국";
		b1 = str15.isEmpty();
		System.out.println(b1);
		System.out.println("==========================================");
		
		// 13. split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// String regex : 구분자(나눌기준), int limit => 나눌 배열의 크기
		String str16 = "사과,딸기,망고 오렌지,파인애플,두리안";
		String[] arr1 = str16.split(",");
		for (String k : arr1) {
			System.out.println(k);
			
		}
		System.out.println("==========================================");
		
		String[] arr2 = str16.split(" ");
		for (String k : arr2) {
			System.out.println(k);
			
		}
		System.out.println("==========================================");
		
		String[] arr3 = str16.split(",",3);
		for (String k : arr3) {
			System.out.println(k);
			
		}
		System.out.println("==========================================");
		
		String[] arr4 = str16.split(",",7
				);
		for (String k : arr4) {
			System.out.println(k);
			
		}
		System.out.println("==========================================");
		
		// 14. substring(int beginIndex) : String
		//  시작위치부터 끝까지 문자열 추출
		// substring(int beginIndex, int endIndex) : String
		//  시작위치부터 끝위치 전까지 문자열 추출
		String str17 = "010-7777-9999";
		String msg = str17.substring(4);
		System.out.println(msg);
		System.out.println("==========================================");
		
		msg = str17.substring(4, 8);
		System.out.println(msg);
		System.out.println("==========================================");
		
		msg = str17.substring(0, 3);
		System.out.println(msg);
		System.out.println("==========================================");
		
		String str18 = "770707-1";
		msg = str18.substring(7, 8);
		System.out.println(msg);
		System.out.println("==========================================");
		
		msg = str18.substring(str18.indexOf("-"), str18.indexOf("-")+2);
		System.out.println(msg);
		System.out.println("==========================================");
		
		// 퀴즈 : 010-7777-9999 => 010-
		
		// 15. toLowerCase() : String
		//모든 대문자를 소문자로 변경 시킨다.
		// 16. toUpperCase() : String
		//모든 소문자를 대문자로 변경 시킨다.
		String str19 = "koREa 19";
		msg = str19.toLowerCase();
		System.out.println(msg);
		
		msg = str19.toUpperCase();
		System.out.println(msg);
		
		msg = str19.substring(0,4).toUpperCase()+str19.substring(1).toLowerCase();
		System.out.println(msg);
		System.out.println("==========================================");
		
		// 17. toString() : String
		// object의 toString() : 모든 객체에 사용가능, 객체가 가지고 있는 정보나 값들을
		//						 문자열로 만들어 리턴하는 메소드(오버라이딩할때 배운다.)
		// String의 toString() : 문자열 자체를 반환
		String str20 = "java 8 자바 8";
		msg = str20.toString();
		System.out.println(msg);
		System.out.println(str20.toString());
		
		// 18. trim() : String
		// 해당문자열의 앞, 뒤 공백 제거 , 중간의 공백은 제거하지 못한다.
		String str21 = "	java	자바	JAVA	";
		msg = str21.trim();
		System.out.println(str21);
		System.out.println(msg);
		
		System.out.println(str21.length());
		System.out.println(msg.length());
		System.out.println("==========================");
		
		// 19. valueOf(자료형) : static String
		// 어떤 자료형이든 String으로 변경 시킨다.
		boolean bo1 = true;
		char ch1 = 'A';
		int num1 = 34 ;
		long num2 = 58L;
		float num3 = 3.14f;
		double num4 = 342.12;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("==========================");
		
		// 자료형 + 1
		// System.out.println(bo1+1); boolean형은 +를 할 수 없다.
		
		System.out.println(ch1+1);
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		System.out.println("==========================");
		
		
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println(String.valueOf(num4)+1);
		System.out.println("==========================");
		
		
		System.out.println(bo1+"1");
		System.out.println(ch1+"1");
		System.out.println(num1+"1");
		System.out.println(num2+"1");
		System.out.println(num3+"1");
		System.out.println(num4+"1");
		System.out.println("==========================");
		
		System.out.println(bo1+"");
		System.out.println(ch1+"");
		System.out.println(num1+"");
		System.out.println(num2+"");
		System.out.println(num3+"");
		System.out.println(num4+"");
		System.out.println("==========================");
		
		
		// 20. Wrapper class : 
		// - 각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경시키는 클래스들
		// - 원래 의미는 기본자료형을 객체로 만들 때 사용하는 클래스 (이제는 자동으로 만들어짐)
		
		// 문자열을 boolean형으로 변경 : Boolean.parseBoolean()
		// "true", "false" 만 사용 가능
		String message = "true";
		boolean m1 = Boolean.parseBoolean(message);
		if (m1) {
			System.out.println("변경 성공");
		} else {
			System.out.println("변경 실패");
		}
		System.out.println("==========================");
		
		// 20-2. 문자열을 int형으로 변경 : Integer.parseInt()
		message = "241";
		int m2 = Integer.parseInt(message);
		System.out.println(message + 10);
		System.out.println(m2 + 10);
		System.out.println("==========================");
		
		// 20-3. 문자열을 long형으로 변경 : Long.parseLong();
		// "숫자" => "숫자L" => X
		// message = "241L"; // 오류발생
		message = "241";
		long m3 = Long.parseLong(message);
		System.out.println(message + 10);
		System.out.println(m3 + 10);
		System.out.println("==========================");
		
		// 20-4. 문자열을 float로 변경 : Float.parseFloat
		message = "3.14f";
		float m4 = Float.parseFloat(message);
		System.out.println(message + 10);
		System.out.println(m4 + 10);
		System.out.println("==========================");
		
		// 20-5. 문자열을  double로 변경 : Double.parseDouble()
		message = "3.14";
		double m5 = Double.parseDouble(message);
		System.out.println(message + 10);
		System.out.println(m5 + 10);
		System.out.println("==========================");
		
		// 20-6. 문자열을 char로 변경 : X
		// 		 String.charAt() 사용
		message = "A";
		char m6 = message.charAt(0);
		System.out.println(message);
		System.out.println(m6);
		System.out.println("==========================");
		
		// 21. toCharArray() : char[]
		// - 해당문자열을 char[]로 만들어줌
		// - 모든 문자 사용 가능 (getBytes()는 영어와 숫자만 가능)
		message = "java 자바 JAVA 大韓民國 2020";
		byte[] m7 = message.getBytes(); // 숫자로 변경(영어와 숫자만 가능)
		for (byte k : m7) {
			System.out.println(k);
		}
		System.out.println("==========================");
		
		char[] m8 = message.toCharArray();
		for (char k : m8) {
			System.out.println(k);
		}
		System.out.println("==========================");		
	}	

}





