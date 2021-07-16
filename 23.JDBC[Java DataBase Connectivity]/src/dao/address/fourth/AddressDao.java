package dao.address.fourth;
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
import java.util.ArrayList;

public class AddressDao {
	private DataSource dataSource; //멤버변수
	public AddressDao(){//DAO객체 만듦
		this.dataSource = new DataSource(); 
	}
	public Address selectByNo(int no) throws Exception {

		Address findAddres = null;
		String selectSql = "select no,id,name,phone,address from address where no=" + no;//semicolon있으면 애로사항발생~~~~

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) {

			int n = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			findAddres = new Address(n, id, name, phone, address);
			//System.out.println(n + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}

		rs.close();
		stmt.close();
		
		dataSource.releaseConnection(con); //커넥션 주면 release
		return findAddres;
	}

	public ArrayList<Address> selectAll() throws Exception {
		ArrayList<Address> addressList = new ArrayList<Address>();
		String selectSql = "select no,id,name,phone,address from address";//semicolon있으면 애로사항발생~~~~

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			//System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
			Address tempAddress = new Address(no, id, name, phone, address);
			addressList.add(tempAddress);
		}
		rs.close();
		stmt.close();
		dataSource.releaseConnection(con); //커넥션 주면 release
		return addressList;
	}

	public int insert(Address address) throws Exception {

		String insertSql = "insert into address values(address_no_seq.nextval,'" + address.getId() + "','"
				+ address.getName() + "','" + address.getPhone() + "','" + address.getAddress() + "')";//semicolon있으면 애로사항발생~~~~

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		dataSource.releaseConnection(con); //커넥션 주면 release
		return insertRowCount;
	}

	public int insert(String id, String name, String phone, String address) throws Exception {

		String insertSql = "insert into address values(address_no_seq.nextval,'" + id + "','" + name + "','" + phone
				+ "','" + address + "')";//semicolon있으면 애로사항발생~~~~

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		dataSource.releaseConnection(con); //커넥션 주면 release
		return insertRowCount;
	}

	public int deleteByNo(int no) throws Exception {

		String deleteSql = "delete from address where no=" + no;//semicolon있으면 애로사항발생~~~~

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();

		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> " + deleteRowCount + " 행 delete");
		stmt.close();
		dataSource.releaseConnection(con); //커넥션 주면 release
		return deleteRowCount;
	}

	public int updateByNo(Address updateAdress) throws Exception {

		String updateSql = "update address set id='" + updateAdress.getId() + "',name='" + updateAdress.getName()
				+ "',phone='" + updateAdress.getPhone() + "',address='" + updateAdress.getAddress() + "' where no = "
				+ updateAdress.getNo();//semicolon있으면 애로사항발생~~~~

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();

		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + " 행 update");
		System.out.println("update sql:" + updateSql);
		stmt.close();
		dataSource.releaseConnection(con); //커넥션 주면 release
		return updateRowCount;
	}

	public int updateByNo(int no, String id, String name, String phone, String address) throws Exception {

		String updateSql = "update address set id='" + id + "',name='" + name + "',phone='" + phone + "',address='"
				+ address + "' where no = " + no;//semicolon있으면 애로사항발생~~~~

		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();

		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + " 행 update");
		System.out.println("update sql:" + updateSql);
		stmt.close();
		dataSource.releaseConnection(con); //커넥션 주면 release
		return updateRowCount;
	}

}
