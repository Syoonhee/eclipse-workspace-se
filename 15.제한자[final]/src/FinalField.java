/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수(변하지x,선언과 동시에 대입작업 이뤄져야 함,
     	생성자 끝날 때 까지 대입 허용)
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/

public class FinalField {
	//인스턴스마다 복사 (인스턴스 상수)
	public final int PORT_NUMBER = 80;
	public final double INCENTIVE_RATE;
	//인스턴스랑 무관 (static 상수)
	public final static int NOTRH = 0;
	public final static int SOUTH = 1;
	public final static int EAST = 2;
	public final static int WEST = 3;
	
	public FinalField() {
		this.INCENTIVE_RATE = 0.1;
		
		/* <<The final field FinalField.PORT_NUMBER cannot be assigned>>
		this.PORT_NUMBER = 8080;
		*/
		/* <<The final field INCENTIVE_RATE may already have been assigned>>
		this.INCENTIVE_RATE = 0.2;
		*/
		
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(this.PORT_NUMBER);
		
		/* <<The final field FinalField.NOTRH cannot be assigned>>
		FinalField.NOTRH = 1;
		FinalField.SOUTH = 1;
		*/
	}
}
