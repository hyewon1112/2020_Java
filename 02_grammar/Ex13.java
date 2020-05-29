class Ex13{
    public static void main(String[] args){
	    
	// 2시간 40분 30초는 몇 초일까요?
	// String time = "2:40:30" ; // 나중에 
	
	int h = 2 * 60 * 60 ; // 시간 => 초
        int m = 40 * 60 ;     // 분 => 초
        int s = 30 ;
        int result = h + m + s ;
        System.out.println("2시간 40분 30초는 " + result + "입니다.");

    }
}
