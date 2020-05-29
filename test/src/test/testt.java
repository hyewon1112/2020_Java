package test;

public class testt {
	public static void main(String[] args) {

		        // 근무시간이 8시간까지는 시간당 8590이고 
				// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
				// 현재 근무한 시간이 10이다. 
				// 얼마를 받아야 하는가?( IF~else을 사용하시오)
				int time = 10 ;
				int dan = 8590;
				int pay = 0 ;		
							
				if (time>8) {
					System.out.println("pay = " + (int)((8*dan)+(time-8)*dan*1.5));
				} else {
					System.out.println("pay = " + time*dan);
				}
		
		
		
		
	}

}
