package com.ict.edu9;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Output {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io13.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			VO vo = new VO("태권브이", 25, 190.1, true);
			oos.writeObject(vo);
			oos.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
