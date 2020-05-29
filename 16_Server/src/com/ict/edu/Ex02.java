package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
													//지금 이 코딩은 안좋은 케이스 로 보여주는 예시라서 이렇게 쓰지말라고 보여주는 예이다.

public class Ex02 implements Runnable{
	static ServerSocket ss;
	public static void main(String[] args) {		
		try {
			ServerSocket ss = new ServerSocket(7788);
			System.out.println("서버 대기 중 ...");
			
			Ex02 e2 = new Ex02();
			Thread thread = new Thread(e2);
			thread.start();
		} catch (Exception e) {
		}
		
		
	}

	@Override
	public void run() {
		while (true) {
			try {
			Socket s = ss.accept();
			System.out.println("ip : 203.236.220.55 " + s.getInetAddress().getHostAddress());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
