package com.ict.edu4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

// PrintWriter : 바이트스트림, 문자스트림 모두 인자로 받을 수 있다.
public class Ex05 {
	public static void main(String[] args) {
		String pathName = "C :"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io08.txt";
		File file = new File(pathName);
		
		FileWriter fw = null;
		BufferedWriter bw = null ; 
		PrintWriter pw = null;
		
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("PrintWriter를 가지고 연습한다.");
			pw.print(true);
			pw.print(12345);
			pw.println();
			pw.print(3.14);
			pw.print('c');
			pw.println();
			
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
