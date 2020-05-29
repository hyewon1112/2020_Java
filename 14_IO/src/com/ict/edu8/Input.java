package com.ict.edu8;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io11.txt";
		File file = new File(pathName);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		
		String savepath = "C:"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io12.txt";
		File file2 = new File(pathName);
		FileWriter fw = null;
		BufferedWriter bw = null; 	
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();

			System.out.println("이름\t총점\t평균\t학점");
			for (VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getSum() + "\t");
				System.out.print(k.getAvg() + "\t");
				System.out.println(k.getHak());
				bw.write(k.getName() + "\t");
				bw.write(k.getSum() + "\t");
				bw.write(k.getAvg() + "\t");
				bw.write(k.getHak() + "\t");

					}
			bw.flush();
			
		} catch (Exception e) {

		}finally {
			try {
				bw.close();
				fw.close();
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {

			}
		}
	}
}
