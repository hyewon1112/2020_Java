package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 에코서버 : 받은 내용을 그대로 돌려준다.
public class Ex01 implements Runnable{
	ServerSocket ss =  null;
	
	// 정보를 받기 위한 스트림 처리 (바이트 스트림)
	InputStream is;
	BufferedInputStream bis;
	OutputStream os ;
	BufferedOutputStream bos ;
	
	public Ex01() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("에코 서버 대기 중 ...");
			new Thread(this).start();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				Socket s = ss.accept();
				// 클라이언트에서 데이터를 보내왔다. 서버에서 스트림 처리
				is = s.getInputStream(); 
				bis = new BufferedInputStream(is);
				
				/* while문 빠져나오지 못함 */
				/*
				byte b = 0 ;
				StringBuffer sb = new StringBuffer();
				while((b=(byte) bis.read()) != -1) {
					System.out.println((char)(b));
					sb.append((char)(b));
				}
				String msg = sb.toString();
				*/
				
				byte[] b = new byte[1024];
				bis.read(b);
				
				// String msg = sb.toString();
				String msg  = new String(b);
				msg = msg.trim();
				System.out.println("받은문자 : " + msg);
				
				
				// 클라이언트에게 보내기 
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				bos.write(msg.getBytes());
				bos.flush();
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
