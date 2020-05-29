package test;

import java.util.Scanner;

public class Sungjuk {


	public static void main(String[] args) {

    	/*
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
		*/
		
		Scanner sc = new Scanner(System.in);
		Person[] arr = new Person[5];
		
		for (int i = 0; i < arr.length; i++) {
			Person per = new Person() ;
			
			System.out.println("이름 : ");
			String name = sc.next();
			
			System.out.println("국어 : ");
			int kor = sc.nextInt();		
			
			System.out.println("영어 : ");
			int eng = sc.nextInt();
			
			System.out.println("수학 : ");
			int math = sc.nextInt();
			
			
			int sum = per.s_sum(kor, eng, math);
			per.setAvg(sum);
					
			double avg = per.s_avg();
			per.setAvg(avg);
			
			String hak = per.s_hak();
		    per.setHak(hak);

			arr[i] = per;
			
			
			
			
		}
		
		
		// 순위와 정렬, 출력
				// 순위
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if (arr[i].getSum() < arr[j].getSum()) {
							arr[i].setRank(arr[i].getRank() + 1);
						}
					}
				}
				// 정렬
				// 임시 저장 클래스
				Person tmp = new Person();
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i].getRank() > arr[j].getRank()) {
							tmp = arr[i];
							arr[i] = arr[j];
							arr[j] = tmp;
						}
					}
				}

				// 출력
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i].getName() + "  ");
					System.out.print(arr[i].getSum() + "  ");
					System.out.print(arr[i].getAvg() + "  ");
					System.out.print(arr[i].getHak() + "  ");
					System.out.println(arr[i].getRank());
				}
			}
				
}

			
