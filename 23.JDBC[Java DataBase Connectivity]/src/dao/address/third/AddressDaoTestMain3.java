package dao.address.third;

import java.util.ArrayList;

public class AddressDaoTestMain3 {

	public static void main(String[] args) throws Exception {
		AddressDao3 addressDao3 = new AddressDao3();
		System.out.println(">> delete");
		addressDao3.deleteByNo(11);
		/**************************select***************************/
		System.out.println(">> selectByNo");
		Address findAddress = addressDao3.selectByNo(20);
		System.out.println(findAddress);
		System.out.println(">> selectAll");
		ArrayList<Address> addressList = addressDao3.selectAll();
		for (Address address : addressList) {
			System.out.println(address);
		}

		/***************************case 1*********************************/
		System.out.println(">> insert");

		int rowCount = addressDao3.insert("zzz", "김수로", "888-9090", "서울시민");

		System.out.println(">> update");
		rowCount = addressDao3.updateByNo(12, "eight", "팔팔팔", "888-8888", "팔도시");
		/***************************case 2(DTO Address)*********************/
		System.out.println(">> insert");
		Address insertAddress = new Address(0, "vvv", "김부이", "111-9090", "제주시민");
		rowCount = addressDao3.insert(insertAddress);
		System.out.println(">> update");
		Address updateAddress = new Address(15, "twotwo", "투투투", "222-2222", "광주시민");
		rowCount = addressDao3.updateByNo(updateAddress);
		findAddress = addressDao3.selectByNo(15);
		System.out.println(findAddress);
	}

}