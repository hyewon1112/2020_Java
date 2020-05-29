package com.ict.edu2;

import java.io.File;
import java.io.FileOutputStream;

public class Ex04 {
	public static void main(String[] args) {
		String pathname 
		= "C:" + File.separator+"STUDY"+File.separator+"util"+ File.separator+"io02.txt"; 
		File file = new File(pathname);
		FileOutputStream fis = null ;
		try {
			fis = new FileOutputStream(file);
			String str = "Phone : 010-9777-1111\n이름 : 유혜원\n age : 23";
			byte[] b = str.getBytes();
			fis.write(b);
			fis.flush();
			
			
		}  catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (Exception e2) {
				
			}
		}
	
	}
}
