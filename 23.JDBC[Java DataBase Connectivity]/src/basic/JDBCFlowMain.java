package basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		
		
		/*
		 1.Driver Class loading
		 */

		Class.forName(driverClass);
		System.out.println("1.Driver Class loading");
		
		/*
		 * 2.Connection 객체 생성(DBServer에 연결)
		 */
		
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2.Connection 객체 생성(DBServer에 연결)" + con);
		
		/*
		 * 3.Statement객체 생성
		 */
		
		/*
		 * 4.SQL문 전송
		 * 5.ResultSet얻기
		 */
		
		
	}

}
