package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressInsertMain {

	public static void main(String[] args) throws Exception {
		/***************************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; //클라이언트가 thin하다?
		String user = "javadeveloper20";
		String password = "javadeveloper20";
		/***************************************************************/
		String insertSql = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')"; //semicolon 있으면 애로사항 발생 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
	}

}