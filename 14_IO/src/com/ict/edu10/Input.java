package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io14.txt";
		File file = new File(pathName);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
		
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}try {
			ois.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
