package com.ict.edu7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInuptStream : 객체 입력 스트림, 바이트 스트림
// readObject() => 역직렬화 메소드
// 받아서 읽는다. Input, VO 클래스가 필요하다.
public class Input {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"STUDY"+File.separator+"util"+ File.separator+"io10.txt";
		File file = new File(pathName);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null ;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
			for (VO k : list) {
			System.out.println(k.getName()+" ");	
			System.out.println(k.getAge()+" ");	
			System.out.println(k.getWeight()+" ");	
			System.out.println(k.isGender());	
			}
					
			
			VO vo = (VO) ois.readObject();
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender()); // 불린형은 겟으로 데려오지 않고 is로 데려온다 .
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
