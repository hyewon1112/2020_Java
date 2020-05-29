package com.ict.java02;


import java.util.Scanner;

public class Sungjuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //sc는 참조(참조=여기에갈수있다)변수=우리가 붙인 것) 사람이 직접 못 가니까 sc라는걸 만들어서 그 값에 가는 것임.
		
		Person[] arr = new Person[5];
		
		for (int i = 0; i < arr.length; i++) {
			Person person = new Person();
			
			System.out.println("이름 : ");
			String name = sc.next();
			person.setName(name); // 세터로 값을 가져와서 넣어줌.
			
			System.out.println("국어 : ");
			int kor = sc.nextInt();
			
			System.out.println("영어 : ");
			int eng = sc.nextInt();
			
			System.out.println("수학 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math ;
			person.setSum(sum);
			
			double avg = (int)(sum/3.0*10)/10.0 ; // 이렇게 하면 소숫점 첫째자리까지 평균을 구하는 방법임. 암기.
			person.setAvg(avg);
			
			String hak = " ";
			if (avg >= 90) {
				hak = "A";
			}else if (avg >= 80) {
				hak = "B";
			}else if (avg >= 70) {
				hak = "C";
			}else {
				hak = "F";
			}
			person.setHak(hak);
			
			arr[i] = person ;  // 위에서 부터 0~4까지 5번 포문이 돌면서 i에 퍼슨 내용이 5개 들어감!
		} // for문 끝
		
		// 순위 : 나(i)와 남(j)이 비교해서 나보다 큰 놈이 있으면 내 등수 증가한다.(순위는 일어나서 자리를 바꾸는게 아니라서 무조건 한명 당 모두를 비교시켜야함)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		
		// 정렬 :  나(i)와 남(j)이 비교해서 나보다 작은 놈이 있으면 자리 변경한다.(나랑자리바꾼다)
		//			자리변경 하려면 임시저장이 필요하다.
		Person tmp = new Person();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		// 출력
		for (Person k : arr) {
			System.out.print(k.getName()+ " ");
			System.out.print(k.getSum()+ " ");
			System.out.print(k.getAvg()+" ");
			System.out.print(k.getHak()+" ");
			System.out.println(k.getRank());
		}
		
	}
}
