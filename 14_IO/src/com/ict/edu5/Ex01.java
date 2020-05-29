package com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// InputStreamReader : InputStream => Reader (바이트 스트림 => 문자스트림)
// InputStream => InputStreamReader => Reader => BufferdeReader
public class Ex01 {
	public static void main(String[] args) {
		/*
		  sc = new Scanner(System.in);	
		System.out.println("원하는 문자 입력 : ");
		String msg = sc.next();
		System.out.println(msg);
		 */
		System.out.println("원하는 문자 입력 : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
	
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr); // Reader는 한글 안깨짐
			String msg = br.readLine();
			System.out.println("받는 문자 : " + msg);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
