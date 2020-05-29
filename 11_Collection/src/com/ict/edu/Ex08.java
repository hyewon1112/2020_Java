package com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex08 {
	public static void main(String[] args) {
		// List 인터페이스 : 배열과 흡사한 구조, 삽입, 삭제, 추가가 자유롭다,
		//					 크기를 미리 정하지 않아도 된다.
	
		// 관련 클래스 : Stack, ArrayList, Vector;
		// Stack : LIFO(Last In First Out) : 마지막에 들어온 데이터가 먼저 나가는 형태
		// add, push, addElement => 추가
		// add(index, E) 		 => 삽입
		// pop  : 맨 위에 존재하는 객체를 반환하고 삭제한다.
		// peek : 맨 위에 존재하는 객체를 반환
		// search : 검색 (오른쪽 1부터)
		// indexOf : 검색 (왼쪽 0부터)
		// elementAt(index) : 추출 (왼쪽 0부터)
		// get(index) : 	  추출 (왼쪽 0부터)
		// firstElement() => 맨처음요소 추출
		// lastElement() => 마지막요소 추출
		// setElement(Element, index) => 치환
		
		Stack<String> st = new Stack<String>();
		st.add("둘리");
		st.addElement("공실이");
		st.push("마이콜");
		System.out.println(st);
		
		st.add(0, "고길동");
		st.add(3, "희동이");
		System.out.println(st);
		
		// 마지막객체 보기 : pop(삭제), peek
		System.out.println(st.peek());
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("=======================");
		
		if (st.contains("둘리")) {
			System.out.println(st.indexOf("둘리") + "번째 위치 ");
			System.out.println(st.search("둘리") + "번째 위치 ");
			System.out.println(st.get(3));
			System.out.println(st.elementAt(3));
			System.out.println(st.firstElement());
			System.out.println(st.lastElement());
			System.out.println(st.size()+ "개");
		}else {
			System.out.println("존재하지 않음");
		}
		
		// 치환
		st.setElementAt("도우너", 2);
		System.out.println(st);
		System.out.println("=======================");
		
		// 중복 가능
		st.add("둘리");
		st.add(3,"둘리");
		System.out.println(st);
		System.out.println("=======================");
		
		// 출력
		for (String k : st) {
			System.out.println(k);
		}
		System.out.println("=======================");
		
		Iterator<String> it = st.iterator(); 
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
		System.out.println("=======================");
		
		//거꾸로 나오면서 삭제하기
		while (! st.isEmpty()) {
			// st.peek();  // 무한루프
			String k = st.pop();
			System.out.println(k+"삭제 됨, 크기는" + st.size());
			
		}

	}
}
