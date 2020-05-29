package com.ict.edu01;

public class Ex04 {
	public static void main(String[] args) {
		// 순위구하기
		// 1. 모든 사람의 등수는 1으로 초기값 부여한다.
		// 2. 나(i)보다 남(j)이 크면 내 순위를 증가 시킨다.
		// 3. 모든 사람이 모든사람과 비교해야 한다.
		int[] sum = {90, 85, 70, 95, 80, 80 ,90};   // 똑같은 점수들이 들어와도 상관 없고 같은 등수 줌 따라서 > 3등은 없음.
		int[] rank = {1, 1, 1, 1, 1 ,1 , 1};
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}				
			}
		}
		
		System.out.println();
		for (int k : rank) {
			System.out.println(k);
		}
		
	}
}
