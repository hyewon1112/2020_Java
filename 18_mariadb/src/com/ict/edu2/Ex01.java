package com.ict.edu2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	
	// 데이테 베이스 내용 출력
	public static void listPrn(ArrayList<VO> list) {
		System.out.println();
		System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
		for (VO vo : list) {
			System.out.print(vo.getIdx()+"\t");
			System.out.print(vo.getM_id()+"\t");
			System.out.print(vo.getM_pw()+"\t");
			System.out.print(vo.getM_name()+"\t");
			System.out.print(vo.getM_age()+"\t");
			System.out.println(vo.getM_reg());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하시오");
		System.out.println("1. 테이블 데이터 보기");
		System.out.println("2. 테이블 데이터 삽입");
		System.out.println("3. 테이블 데이터 삭제");
		System.out.println("4. 테이블 데이터 수정");
		System.out.print(">>>   ");
		int su = sc.nextInt();
		
		ArrayList<VO> list = null; 
		switch (su) {
			case 1: 
				list = DAO.getInstance().getSelect();
				listPrn(list);
				break;
			case 2:   
				System.out.println("정보를 입력하세요");
				System.out.print("아이디 : ");
				String m_id = sc.next();
				
				System.out.print("패스워드 : ");
				String m_pw = sc.next();
				
				System.out.print("이름 : ");
				String m_name = sc.next();
				
				System.out.print("나이 : ");
				String m_age = sc.next();
				
				list  = DAO.getInstance().getInsert(m_id, m_pw, m_name, m_age);
				listPrn(list);
				break;
			case 3:    
				list = DAO.getInstance().getSelect();
				listPrn(list);
				System.out.println();
				System.out.print("삭제할 IDX : ");
				System.out.println();
				String idx = sc.next();
				list = DAO.getInstance().getDelete(idx);
				listPrn(list);
				break;
			case 4:    
				list = DAO.getInstance().getSelect();
				listPrn(list);
				System.out.println();
				System.out.print("갱신할 IDX : ");
				String idx2 = sc.next();
				System.out.print("갱신할 나이 : ");
				String age = sc.next();
				System.out.println();
				list = DAO.getInstance().getUpdate(idx2, age);
				listPrn(list);
				break;
				
			case 5:    
				System.out.println();
				System.out.print(" ID : ");
				String log_id = sc.next();
				System.out.print(" PW : ");
				String log_pw = sc.next();
				System.out.println();
				list = DAO.getInstance().getLogIn(log_id, log_pw);
				listPrn(list);
				break;
				
		}
		
		System.out.println();
		System.out.println();
		System.out.println("수고 하셨습니다.");
	}
}
