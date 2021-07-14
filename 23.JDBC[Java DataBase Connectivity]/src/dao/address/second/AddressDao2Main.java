package dao.address.second;

public class AddressDao2Main {

	public static void main(String[] args) throws Exception {
		AddressDao2 addressDao2 = new AddressDao2();
		System.out.println(">> delete");
		addressDao2.deleteByNo(1);
		System.out.println(">> selectByNo");
		addressDao2.selectByNo(15);
		System.out.println(">> selecetAll");
		addressDao2.selectAll();
		System.out.println(">> insert");
		addressDao2.insert("cccc","김수미","838-9490","부산시민");
		System.out.println(">> update");
		addressDao2.updateByNo(8, "eight", "팔팔팔", "888-8888","팔도시"); //pk (no:8)

	}

}
