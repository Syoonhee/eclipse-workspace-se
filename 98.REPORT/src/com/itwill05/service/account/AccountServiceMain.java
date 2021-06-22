package com.itwill05.service.account;


public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		
		System.out.println("0.AccountService객체야 Account추가(배열사이즈증가)[OPTION]");
		accountService.addAccount(new Account (8000, "EUGHT", 80000, 7.7));
		accountService.addAccount(9000, "EUGHT", 80000, 7.7);

		
		System.out.println("1.AccountService객체야 은행계좌들 총계좌수출력해줘");

		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		accountService.print();

		System.out.println("3.AccountService객체야 은행계좌들 총잔고 출력해줘");
		
		System.out.println("4.AccountService객체야 계좌번호줄께 계좌한개출력해줘");
		
		System.out.println("5.AccountService객체야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		
		System.out.println("6.AccountService객체야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		
		System.out.println("7.AccountService객체야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		
		System.out.println("8.AccountService객체야 계좌번호,입금할돈 인자로줄께 입금해줘");
		
		System.out.println("9.AccountService객체야 계좌번호,출금할돈 인자로줄께 출금해줘");
		
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘");
		accountService.findByNoPrint(1111);
		accountService.findByNoPrint(1111);
		
		accountService.findByNoPrint(2222);
		//accountService.updateAccount(1111, "KIM", 3000, 3.3);
		Account updateAccount = new Account(2222, "TWO", 2000 ,2.2); //데이터를 옮겨주는 객체(Data Transfer Object)
		accountService.updateAccount(updateAccount); //인자로 넣어줌 (4개의 데이터 넘겨줌)
		accountService.findByNoPrint(2222);
		
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께 이름,잔고,이율 수정(update)해줘");
	}
}