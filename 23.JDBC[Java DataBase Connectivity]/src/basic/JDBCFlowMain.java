package basic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; //클라이언트가 thin하다?
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		String selectSql = "select * from dept"; //semicolon 있으면 에러 발생 
		
		/*
		 1.Driver Class loading
		 -Driver클래스 객체 생성
		 -DriverManager 객체 등록
		 */

		Class.forName(driverClass); //클래스 로딩 
		System.out.println("1.Driver Class loading");
		
		/*
		 * 2.Connection 객체 생성(DBServer에 연결)
		 */
		
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2.Connection 객체 생성(DBServer에 연결)" + con);
		
		/*
		 * 3.Statement객체 생성(SQL문 전송 객체)
		 */
		
		Statement stmt = con.createStatement();
		System.out.println("3.Statement객체 생성(SQL문 전송 객체)");
		
		/*
		 * 4.SQL문 전송
		 * 5.ResultSet얻기
		 */
		
		ResultSet rs = stmt.executeQuery(selectSql);
		System.out.println("4.SQL문 전송:" + selectSql);
		System.out.println("5.ResultSet(결과집합)얻기:" + rs);
		System.out.println("-------------------------------------------");
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno+"\t" + dname + "\t" + loc);
		}
		/*
		 * 6. resource 해지
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6.resource 해지 close()");
		
		
		
		
	}

}
