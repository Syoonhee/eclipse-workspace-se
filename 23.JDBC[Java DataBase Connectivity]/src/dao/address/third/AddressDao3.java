package dao.address.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressDao3 {
	public void insert(Address address) throws Exception {
		/*******************************DB접속정보********************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; //클라이언트가 thin하다?
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		String insertSql = "insert into address values(address_no_seq.nextval,'" + address.getId() + "','"
				+ address.getName() + "','" + address.getPhone() + "','" + address.getAddress() + "')";//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	public void insert(String id, String name, String phone, String address) throws Exception{
		/*******************************DB접속정보********************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; //클라이언트가 thin하다?
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		String insertSql = "insert into address values(address_no_seq.nextval,'"+id+"','"+name+"','"+phone+"','"+address+"')"; //semicolon 있으면 애로사항 발생 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	public void deleteByNo(int no) throws Exception{ //인자타입 변수 선언
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		
		String deleteSql = "delete address where no=" + no; //semicolon 있으면 애로사항 발생 
		

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">>" + deleteRowCount + " 행 delete"); //자바에선 자동 커밋, sql은 커밋 명시
		stmt.close();
		con.close();
	}
	
	public void updateByNo(int no, String id, String name, String phone, String address) throws Exception{
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		
		String updateSql = "update address set id='" + id + "',name='" + name + "',phone='" + phone + "',address='"
				+ address + "' where no = " + no;//semicolon있으면 애로사항발생~~~~
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">>" + updateRowCount + " 행 update"); //자바에선 자동 커밋, sql은 커밋 명시
		stmt.close();
		con.close();
	}
	
	public void updateByNo(Address updateAddress) throws Exception {
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		
		String updateSql = "update address set id='" + updateAddress.getId() + "',name='" + updateAddress.getName() + "',phone='" + updateAddress.getPhone() + "',address='"
				+ updateAddress.getAddress() + "' where no = " + updateAddress.getNo();//semicolon있으면 애로사항발생~~~~
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">>" + updateRowCount + " 행 update"); //자바에선 자동 커밋, sql은 커밋 명시
		stmt.close();
		con.close();
	}
	
	/*
	public void updateByNoId(int no, String id) {}
	public void updateByNoName(int no, String name) {}
	public void updateByNoAddress(int no, String address) {}
	public void updateByNoPhone(int no, String phone) {}
	*/
	
	
	
	public void selectByNo(int no) throws Exception{
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/

		String selectSql = "select no,id,name,phone,address from address where no = " + no;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
	
		while (rs.next()) {
			
			int n = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			
			System.out.println(no+"\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}
	}
	
	public void selectAll() throws Exception{
		/*********************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/*******************************************/
		String selectSql = "select no,id,name,phone,address from address";//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) {
			
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}

		rs.close();
		stmt.close();
		con.close();
	}


	
}
