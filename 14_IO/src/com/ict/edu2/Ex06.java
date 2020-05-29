package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) {
		
		// 사진, 동영상, 음악은 1byte 씩 처리해야 된다.
		
		// 읽는 위치
		String pathName1
			= "C :"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"java.jpg";
		File file1 = new File(pathName1);
		
		// 쓰는 위치
		String pathname2
			= "C :"+File.separator+"STUDY"+ File.separator+"java.jpg"; 
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;		
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			int k = 0;
			while ((k=fis.read()) != -1) {
				fos.write(k);
			}
			fos.flush();
					
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try { 
				try {
					if(fos != null) fos.close();
					if(fis != null) fis.close();
				
				} catch (Exception e2) {
				// TODO: handle exception
				}
			}finally {
				
			}
			
			}	
	
}
	
}
	
	
