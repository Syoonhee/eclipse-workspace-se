import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet accountSet = new HashSet();
		System.out.println("# set size:" + accountSet.size());
		
		Account acc1=new Account(1111, "BING",33000,0.5);
		Account acc2=new Account(2222, "KING",23000,0.1);
		Account acc3=new Account(3333, "KING",89000,0.2);
		Account acc4=new Account(4444, "YONG",12000,0.5);
		Account acc5=new Account(5555, "SANG",99000,0.8);
		
		System.out.println("---------------1.add-------------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size:" + accountSet.size());
		System.out.println(accountSet);
		System.out.println("---------add[같은 객체]----------------");
		/*
		 * equals 메소드를 사용해서 중복체크를 한다.
		 */
		boolean isAdd= accountSet.add(acc2);
		System.out.println("isAdd:" + isAdd);
		isAdd= accountSet.add(acc3);
		System.out.println("isAdd:" + isAdd);
		System.out.println(accountSet);
		System.out.println("# set size:" + accountSet.size());
		System.out.println("---------------2.remove-------------------");
		//accountSet.remove(); 참조변수를 줘야 지워짐
		boolean isRemove = accountSet.remove(acc1);
		System.out.println("isRemove:"+isRemove);
		isRemove = accountSet.remove(acc1);
		System.out.println("isRemove:"+isRemove);
		System.out.println("# set size:" + accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("---------------iteration[전체출력]-----------------");
		Iterator accountIter =accountSet.iterator(); //Iterator 인터페이스 타입? ,Set은 꺼낼 수 없다?
		System.out.println(accountIter);
		
		while(accountIter.hasNext()/*element가 존재하지 않으면 false*/) {
			Account tempAccount = (Account) accountIter.next(); 
			tempAccount.print();
		}
		/*
		 * <<java.util.NoSuchElementException>>
		 * accountIter.next();
		 */
		System.out.println(accountIter.hasNext());
	}

}
