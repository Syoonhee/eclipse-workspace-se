/**
 * 계좌 객체를 생성하기 위한 클래스
 * @author s_yun
 *
 */
public class Account extends Object {
	/*
	 * 멤버필드
	 */
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	/*
	 * 멤버메쏘드
	 */
	//계좌데이타를 set하는메쏘드
	/**
	 * 계좌 데이타를 설정하는 메쏘드
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율 
	 */
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	//입금
	/**
	 * 계좌 입금
	 * @param m 입금할 금액
	 */
	public void deposit(int m) {
		this.balance += m;
	}

	//출금
	public void withDraw(int m) {
		//this.balance-=m;
		this.balance = this.balance - m;
	}

	public void headerPrint() {
		System.out.printf("%s%n", "---------------------------");
		System.out.printf("%s %5s %4s %4s%n", "번호", "이름", "잔고", "이율");
		System.out.printf("%s%n", "---------------------------");
	}

	/**
	 * 계좌 객체의 정보출력
	 * 
	 */
	public void print() {
		System.out.printf("%d %6s %8d %5.1f %n", this.no, this.owner, this.balance, this.iyul);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.no + "\t" + this.owner + "\t" + this.balance + "\t" + this.iyul;
	}
	
	//getter method
	/**
	 * 잔고를 반환하는 메소드
	 * @return 계좌 잔고
	 */
	public int getBalance() {
		return this.balance;
	}

	//setter method
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}

	//getter,setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getIyul() {
		return iyul;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
