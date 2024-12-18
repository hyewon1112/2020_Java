package com.ict.edu5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// DAO : Data Access Object
//  - DataBase의 data에 접근하기 위한 객체
//  - CRUD 작업(insert, update, delete, select)
//   을 처리하는 메소드를 만들어서 제공하는 한다.

public class DAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
    
	// 싱글톤 패턴 : 하나의 인스턴스만을 생성하고, 사용할 수 있다.
	// (하나의 객체만 생성하고 사용해야 할때, 적용할 수 있는 패턴.)

	private static DAO dao = new DAO();

	public static DAO getInstance() {
		return dao;
	}

	// 접속
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.65:1521:xe";
			String user = "c##hyewon";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
		}
		return conn;
	}

	// select
	public ArrayList<VO> getSelect() {
		// vo를 담을 컬렉션 만들기 
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from members order by idx";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//데이터를 VO에 담는다.
				VO vo = new VO();
				vo.setIdx(rs.getString(1));
				vo.setM_id(rs.getString(2));
				vo.setM_pw(rs.getString(3));
				vo.setM_name(rs.getString(4));
				vo.setM_age(rs.getString(5));
				vo.setM_reg(rs.getString(6).substring(0, 10));
				list.add(vo);
			}
			// 출력은 main메소드에서 하자 
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}

	// insert
	public ArrayList<VO> getInsert(String m_id, String m_pw, String m_name, String m_age) {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "insert into members values(members_seq.nextval,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m_id);
			pstmt.setString(2, m_pw);
			pstmt.setString(3, m_name);
			pstmt.setString(4, m_age);
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				list = getSelect();
			} else {
				System.out.println(" 삽입 실패 ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}

	// delete
	public ArrayList<VO> getDelete(String idx) {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "delete from members where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, idx);
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				list = getSelect();
			} else {
				System.out.println("삭제 실패 ");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패 2");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// update
	public ArrayList<VO> getUpdate(String idx, String age) {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "update members set m_age = ? where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, age);
			pstmt.setString(2, idx);
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				list = getSelect();
			} else {
				System.out.println("삭제 실패 ");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패 2");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	// 로그인 
	public ArrayList<VO> getLogIn(String m_id, String m_pw){
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from members where m_id = ? and m_pw = ? " ;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m_id);
			pstmt.setString(2, m_pw);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//데이터를 VO에 담는다.
				VO vo = new VO();
				vo.setIdx(rs.getString(1));
				vo.setM_id(rs.getString(2));
				vo.setM_pw(rs.getString(3));
				vo.setM_name(rs.getString(4));
				vo.setM_age(rs.getString(5));
				vo.setM_reg(rs.getString(6).substring(0, 10));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
}
