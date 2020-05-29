package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//1. 바이트 스트림 : 모든 처리를 1byte 씩 처리
//대상 : byte로 이루어진 모든 파일 (영문자, 숫자, 그림 소리, 동영상)
//최상위 클래스 : InputStream(입력), OutputStream(출력)

//FileInputStream 주요메소드
// - read() : int = 결과가 숫자(아스키코드) 하나 나옴,
//				   char를 형변환해서 문자로 변경해야 된다.

// - read(byte[] b) : int => 배열 크기를 지정해야 된다.
//						  	1byte 씩 배열에 저장하고, 읽는 수 만큼 반환
//
//
// - close() :스트림을 닫기 (finally로 처리)
public class Ex03 {
	public static void main(String[] args) {
		String pathname 
		= "C:" + File.separator+"STUDY"+File.separator+"util"+ File.separator+"io01.txt"; 
		File file = new File(pathname);
		
		FileInputStream fis = null ;
		try {
			fis = new  FileInputStream(file);
			
			//한 글자 읽어오기 : read()
			// int k fis.read();
			// System.out.println(k + ":" + (char)(k));
			
			// 한 글자씩 계속 읽는 방법 : 그림, 소리, 동영상 파일을 읽는 방법(비영어권은 못 읽음)
			// int k2 = 0 ;
			// while (true) {
			//	k2 = fis.read();
				// 읽어온 숫자 -1이면 더이상 읽을 수 없다.
			//	if (k2 == -1) break; 
			//		System.out.print(k2 + ":" + (char)(k2)+ " ");
			// }
			
			/*
			int k2 = 0;
			while((k2 = fis.read()) != -1) {
				System.out.print((char)(k2));
			}
			*/
			
			// 배열로 읽어오는 방법
			// byte[] b = new byte[20];
			// 비영어권 안됨
			// byte[] b = new byte[(int)file.length()];
			
			// 읽어서 byte[] b에 넣어준다.(배열 크기만큼만 넣어준다.)
			// fis.read(b);
			// for (byte k : b) {
			//	System.out.print((char)(k));
			// }
			
			// String 이용하는 방법 : 비영어권 사용
				byte[] b = new byte[(int) file.length()];
				fis.read(b);
				String str = new String(b);	
				System.out.println(str);
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (Exception e2) {
				
			}
		}
	
		
	
	}
}
