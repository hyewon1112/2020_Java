package com.ict.edu6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream : 객체 출력 스트림, 바이트 스트림
// writeObject() => 직렬화 메소드 
// 쓴다. => Output, VO
public class Output {
	public static void main(String[] args) {
		String pathName = "C :"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io09.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 하나의 객체 정보를 담아 보자 
			VO vo = new VO("고길동", 34, 70.4, true);
			
			// 객체 직렬화
			oos.writeObject(vo);
			oos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
