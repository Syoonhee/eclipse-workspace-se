package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressDeleteByNoMain {

	public static void main(String[] args) throws Exception {
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; 
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		
		String deleteSql = "delete address where no=3"; //semicolon 있으면 애로사항 발생 
		
		
		/*
		 1.Driver Class loading
		 2.Connection객체생성(DBServer에연결)
		 3.Statement객체생성(SQL 전송객체)
		 4.Statement객체를 사용해 SQL문전송(DML)
		 5.실행결과(Resultset,영향받은 행의수)
		 */
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">>" + deleteRowCount + " 행 delete"); //자바에선 자동 커밋, sql은 커밋 명시
		stmt.close();
		con.close();
	}

}
