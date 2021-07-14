package dao.address.third;

public class AddressDao3Main {

	public static void main(String[] args) throws Exception {
		AddressDao3 addressDao2 = new AddressDao3();
		System.out.println(">> delete");
		addressDao2.deleteByNo(1);
		System.out.println(">> selectByNo");
		addressDao2.selectByNo(15);
		System.out.println(">> selecetAll");
		addressDao2.selectAll();
		System.out.println(">> insert");
		System.out.println(">> update");


	}

}
