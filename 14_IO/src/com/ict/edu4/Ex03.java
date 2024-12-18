package com.ict.edu4;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read() : int(아스키코드) => char형변환, read(byte[] b), String 이용
// FileReader	   : read() : int(유니코드) => char형변환, read(char[] b), String 이용
public class Ex03 {
public static void main(String[] args) {
		String pathName = "C :"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io06.txt";
		File file = new File(pathName);
		FileReader fr = null ;
		try {
			fr = new FileReader(file);
			
			// 한 글자 읽기 : 모든 글자를 읽어올 수 있다.
			// int k = fr.read();
			// System.out.println(k+":"+(char)(k));
			
			// 전체 읽기
			/*
			int k = 0 ;
			while ((k = fr.read()) != -1) {
				System.out.println((char)(k));
			}
			*/
			
			// char[]
			/*
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			for (char k : c) {
				System.out.println(k);
			}
			*/
			
			// String
			/*
			char[] c = new char[(int) file.length()];
			fr.read(c);
			for (char k : c) {
				System.out.println(k);
			}
				*/
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
    }
}
