package com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex12 {
public static void main(String[] args) {
	// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
	// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가 
	// 출력되는 프로그램 작성
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	map.put("대한민국", "서울");
	map.put("한국", "서울");
	map.put("korea", "서울");
	map.put("캐나다", "오타와");
	map.put("영국", "런던");
	map.put("스위스", "베른");
	
	Set<String> set =  map.keySet();
	//System.out.println(set);
	
	Scanner sc = new Scanner(System.in);
	
	while (true) {
		System.out.print("나라입력 : ");
		String str = sc.next();
		str = str.toLowerCase(); // korea를 대문자로 전부 써도 입력될 수 있게 만드는 것
		
		if (set.contains(str)) {
			String result = map.get(str);
			System.out.println(str + "의 수도는" + result +" 입니다.");
		}else {
			System.out.println("데이터에 없는 나라 입니다.");
		}
		System.out.println("계속할까요(y/n)? ");
		String msg = sc.next();
		if (msg.equalsIgnoreCase("n")) break;
		}
	
	}
}
