package com.ict.edu5;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// OutputStreamWriter : OutputStream -> Writer ( 바이트스트림 => 문자스트림 )
// OutputStream => OutputStreamWriter => Writer => BufferedWriter
public class Ex02 {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			bw.write("Welcome 대한민국 !!!");
			bw.flush();
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
