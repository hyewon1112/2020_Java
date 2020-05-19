package com.ict.edu5;


// tiger클래스가 있긴하지만 그냥 추상클래스로 body를
// 완성하지 않았다.
// tiger를 상속받은 Cat은 tiger가 완성하지 않은 body 완성
class Cat extends Tiger {
@Override
public void like() {
	System.out.println("그루밍 하기");
	
}
}


class Cat2 extends Tiger2{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		
	}
	
}
