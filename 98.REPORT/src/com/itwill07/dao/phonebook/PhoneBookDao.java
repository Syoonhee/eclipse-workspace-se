package com.itwill07.dao.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PhoneBookDao {
	public void insert (PhoneBook phonebook) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		
		String insertSql = "insert into phonebook values(phone_no_seq.nextval,'" + phonebook.getNo() + "','"
				+ phonebook.getName() + "','" + phonebook.getPhone() + "')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	public void deleteByNo (int no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		
		String deleteSql = "delete address where no=" + no;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> " + deleteRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	
	public void update (PhoneBook phonebook) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		
		String updateSql = "update address set name='" + phonebook.getName()+ "',phone='" + phonebook.getPhone() + "' where no = " + phonebook.getNo();
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	
	public void selectByNo (int no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		
		String selectSql = "select no,name,phone from phonebook where no = " + no;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int selectRowCount = stmt.executeUpdate(selectSql);
		System.out.println(">> " + selectRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	public void selectAll() throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper20";
		String password = "javadeveloper20";

		String selectSql = "select no,name,phone from phonebook";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) {
			
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			System.out.println(no + "\t" + name + "\t" + phone);
		}

		rs.close();
		stmt.close();
		con.close();
	}

	
	
	}

