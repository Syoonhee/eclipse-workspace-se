
public class AccountConstructorMain2 {

	public static void main(String[] args) {
		Account account=new Account(1111, "KIM", 30000, 0.2);
		
		account.setIyul(0.8);
		
		account.print();
		int recvBalance = account.getBalance();
		
		System.out.println("account balance:"+recvBalance);
	}

}
