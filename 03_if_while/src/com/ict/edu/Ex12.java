package com.ict.edu;

public class Ex12 {
	public static void main(String[] args) {
		// break label 과 continue label
		// break label : 레이블이 지정한 블록을 탈출
		// continue label : 레이블이 지정한 블록 수행문을 포기하고 다음 회차로 진행
		// label 지정 방법 '레이블이름:' 뒤나 밑에는 반복문만 올 수 있다.

		// 1-10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// i가 6일때 break 사용하기
		for (int i = 1; i < 11; i++) {
			if (i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();

		// i가 6일때 break label 사용하기
		// for문이 하나일때는 break 와 break label이 같은 결과을 낸다.
		// 그러므로 for문 하나일때는 break label를 사용할 필요가 없다.
		// continue문도 마찮가지 이다.
		esc:for (int i = 1; i < 11; i++) {
				if (i == 6)	break esc;
				System.out.print(i + " ");
			}
		System.out.println();
		
		// i가 6일때 continue 사용하기
		for (int i = 1; i < 11; i++) {
			if (i == 6) continue;
				System.out.print(i + " ");
			}
		System.out.println();
		
		// i가 6일때 continue label 사용하기
		esc2:for (int i = 1; i < 11; i++) {
			if (i == 6)	continue esc2;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");
		
		// j=3일 때 break
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) break;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");
		
		// j=3일 때 break label
		esc3:for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if(j==3) break esc3;
					System.out.println(i + ", " + j);
				}
			}
		System.out.println("========================");
		
		// j=3일 때 continue
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");
		
		// j=3일 때 continue label
		esc4:for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if(j==3) continue esc4;
					System.out.println(i + ", " + j);
				}
			}
		System.out.println("========================");
	}
}
















