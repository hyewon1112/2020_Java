package com.ict.debugging;

// 디버깅 또는 디버그는 컴퓨터 프로그램 개발 단계 중에
// 발생하는 시스템의 논리적인 오류나 비정상적 연산(버그)을 찾아내고
// 그 원인을 밝히고 수정하는 작업 과정을 뜻한다.

// breakpoint(중단점) : 디버깅 실행시 자동으로 실행이 중단되어 해당
//						변수의 값을 조사 할 수 있는 특정 지점을 말한다.

// F8 : 중단점에서 중단점으로 이동
// F5 : 한 문장씩 실행, 메소드를 만나면 안으로 진입
// F6 : 한 문장씩 실행, 메소드를 만나면 건너뛴다.
 
public class Ex01 {
	public static void main(String[] args) {
		int total = 0 ; 
		for (int i = 1; i < 11; i++) {
			total = total + i ;
			System.out.println("i = " + i + "total = " + total);
		}
		System.out.println("합 : " + total);
	}
}
