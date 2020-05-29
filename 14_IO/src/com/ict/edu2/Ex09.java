package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// 사진, 동영상, 음악은 1byte씩 처리해야 된다.
		// 읽는 위치
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "video.mp4";
		File file1 = new File(pathname1);

		// 쓰는 위치
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "videocopy.mp4";
		File file2 = new File(pathname2);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			int b = 0 ;
			while((b = bis.read())!= -1) {
				bos.write(b);
			}
			bos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
		}		
	}
}







