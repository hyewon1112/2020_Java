package test;

public class Person {

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
	
    private String name;
	private int sum ;
    private double avg ;
	private String hak ;
	private int rank = 1 ;
	
	// 총점
	public int s_sum(int kor, int eng, int math) {
		return kor + eng + math ;
	}
	
	// 평균
	public double s_avg() {
		return (int)(sum/3.0*10)/10.0;
	} 
	
	// 학점
	public String s_hak() {
		if(avg>=90) {
			hak = "A";
		}else if(avg>=80) {
			hak = "B";
		}else if(avg>=70) {
			hak="C";
		}else {
			hak = "F";
		}
		return hak;
	}

	
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
