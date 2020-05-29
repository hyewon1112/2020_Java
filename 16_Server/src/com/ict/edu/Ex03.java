package com.ict.edu;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex03 implements Runnable {

	
	ServerSocket ss = null;
	public Ex03() {
		try {
			ss = new ServerSocket(7788);
			System.out.println("서버 대기 중 ...");
			
			Ex02 e2 = new Ex02();
			new Thread(this).start();
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	} 
	
	
	
	@Override
	public void run() {
		try {
			
			while (true) {
				System.out.println(Thread.currentThread().getName());
				Socket s = ss.accept();  //정보는 s가 전부 다 가지고 있다.
				System.out.println("ip : " + s.getInetAddress().getHostAddress());
				System.out.println(Thread.currentThread().getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}

	public static void main(String[] args) {
		new Ex03();
		System.out.println(Thread.currentThread().getName());

	}
	
}
