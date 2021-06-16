
public class AccountToStringMain {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccountData(1, "KIM", 390000, 2.3);
		String account1Str = account1.toString();
		System.out.println(account1);
	}

}
