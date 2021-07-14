package dao.address.first;
/*
Dao(Data Access Object)
 - Address들의 데이터를 저장하고있는 Address 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위(???)메쏘드를 가지고있는 클래스
 - AddressService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressDao1 {
	public void insert() throws Exception{
		/*******************************DB접속정보********************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; //클라이언트가 thin하다?
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		String insertSql = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')"; //semicolon 있으면 애로사항 발생 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	public void deleteByNo() throws Exception{
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		
		String deleteSql = "delete address where no=3"; //semicolon 있으면 애로사항 발생 
		

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">>" + deleteRowCount + " 행 delete"); //자바에선 자동 커밋, sql은 커밋 명시
		stmt.close();
		con.close();
	}
	
	public void updateByNo() throws Exception{
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		
		String updateSql = "update address set id='xxx',name='김경호',phone='899-9999',address='서울시 강남구' where no = 3"; //semicolon 있으면 애로사항 발생 
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">>" + updateRowCount + " 행 update"); //자바에선 자동 커밋, sql은 커밋 명시
		stmt.close();
		con.close();
	}
	
	public void selectByNo() throws Exception{
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/

		String selectSql = "select no,id,name,phone,address from address where no = 5";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
	
		while (rs.next()) {
			
			int no = rs.getInt("no");
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
