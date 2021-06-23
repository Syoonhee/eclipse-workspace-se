import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		System.out.println("-----------Object[]-------------");
		Object[] anyTypeArray = new Object[5];
		System.out.println(anyTypeArray);
		Account acc1 =  new Account(1111, "BING", 33000,0.5);
		Account acc2 = new Account(2222, "KING", 23000,0.1);
		Account acc3 = new Account(3333, "KING", 89000,0.2);
		Account acc4 = new Account(4444, "YONG", 12000,0.5);
		Account acc5 = new Account(5555, "SANG", 99000,0.8);
		
		
		anyTypeArray[0] = acc1;
		anyTypeArray[1] = acc2;
		anyTypeArray[2] = acc3;
		anyTypeArray[3] = acc4;
		anyTypeArray[4] = acc5;
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount = (Account)anyTypeArray[i]; //Account 캐스팅
			tempAccount.print();
		}
		
		System.out.println("-------------------------------------------");
		ArrayList accountList = new ArrayList();
		System.out.println("# size:" + accountList.size());
		System.out.println("***********1.add*************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("# size:" + accountList.size());
		System.out.println(">>>"+ accountList);
		accountList.add(3, new Account(3334, "KIMM", 90000, 0.9));
		System.out.println(">>>"+ accountList);
		System.out.println("# size:" + accountList.size());
		System.out.println("***********2.set ******************");
		accountList.set(3, new Account(3337, "PARK", 8888,8.8));
		System.out.println(accountList);
		System.out.println("# size:" + accountList.size());
		System.out.println("**************** 3.get ******************");
		Account getAccount = (Account) accountList.get(1);
		getAccount.print();
		getAccount = (Account) accountList.get(accountList.size()-1);
		getAccount.print();
		System.out.println("************* 4.remove ******************");
		Account removeAccount = (Account) accountList.remove(3);
		removeAccount.print();
		System.out.println(accountList);
		System.out.println("# size:" + accountList.size());
		System.out.println("%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("**************1.계좌전체출력********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			System.out.println(tempAccount);
		}
		
		System.out.println("**************2.계좌번호 3333 계좌 1개 찾기********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if(tempAccount.getNo()== 3333) {
				tempAccount.print();
				break;
			}
		}
		
		System.out.println("**************3.계좌주이름 KING 계좌 여러 개 찾기********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account temptAccount = (Account) accountList.get(i);
			if(temptAccount.getOwner().equals("KING")) {
				temptAccount.print();
			}
		}
		
		
		System.out.println("**************4.계좌주이름 3333번 한 개 삭제********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 3333) {
				Account removeAcc = (Account) accountList.remove(i);
				System.out.println("# remove size:" + accountList.size());
				removeAcc.print();
				break;
			}
		}
		
		
		
		System.out.println("**************5.계좌주이름 KING 계좌 여러 개 삭제[Quiz]********************");
		System.out.println("****************계좌전체출력*************************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			tempAccount.print();
		}
	
	}

}
