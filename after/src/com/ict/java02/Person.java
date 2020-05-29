package com.ict.java02;
/*
	5명의 이름, 국어, 영어, 수학을 입력받아서 
	이름, 총점, 평균, 학점, 순위를 구하고 정렬하자
	(순위와 정렬은  main에서 구함 )
	main() 메소드를 가지고 있는 클래스 : Sungjuk
	정보를 가지고 있는 클래스 : Person
*/
public class Person {
	private String name ;
	private int sum;
	private double avg;     // 세터를 여기 아래에 만들어 놔야 성적페이지에서 세터로 값을 넣어줄수 잇음.
	private String hak ;
    private int rank = 1 ;
    
    public Person() {}
    
    
    
    // 내필기 위에 변수가 프라이빗 이라서 게터세터로 이름 변경해서 넣고 가져올수 있게  하는 것

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
    
    

}
