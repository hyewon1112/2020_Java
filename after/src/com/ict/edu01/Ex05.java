package com.ict.edu01;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = {"홍", "김", "이", "박"};
		int[] kor = {80,85,70,90};  // 순서대로 홍 김 이 박 애들점수
		int[] eng = {80,85,70,90};  // 순서대로 홍 김 이 박 애들점수
		int[] math = {85,90,75,95};  // 순서대로 홍 김 이 박 애들점수
		
		int[] sum = new int[4];
		double[] avg = new double[4];
		String[] hak = new String[4];
		int[] rank = {1,1,1,1};
		
		// 총점, 평균, 학점 넣기
		for (int i = 0; i < rank.length; i++) {
			// 총점
			sum[i] = kor[i]  + eng[i] + math[i] ; // i는 0번방 부터 도는거다
			// 평균
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			// 학점
			if (avg[i]>=90) {
				hak[i] = "A";
			}else if (avg[i]>=80) {
				hak[i] = "B";
			}else if (avg[i]>=70) {
				hak[i] = "C";
			}else {
				hak[i] = "F";
			}
		}				
		
		// 순위 구하기 > 처음부터 끝까지 비교!
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
	for (int i = 0; i < rank.length; i++) {
		System.out.print(name[i] + " ");
		System.out.print(sum[i] + " ");
		System.out.print(avg[i] + " ");
		System.out.print(hak[i] + " ");
		System.out.println(rank[i] );
	}
		
		
		
	}
}
