
public class IfTest2 {

	public static void main(String[] args) {
		int x=21;
		int y=30;
		
		if (x > y) {
			System.out.println("true --> 21 > 30");
		} else {
			System.out.println("false --> 21 > 30");
		}
		if(x < y) {
			System.out.println("true--> 21 < 30");
		}else {
			System.out.println("false--> 21 < 30");
		}
		if(x==y) {
			System.out.println("true--> 21 == 30");
		}
		if(x!=y) {
			System.out.println("true--> 21 != 30");
		}
		System.out.println("-----------블록안에선언된 변수의 범위(scope)-------------");
		int kor=90;
		if(kor>=90) {
			char grade='A';
			String msg="참잘했어요!!!";
			System.out.println("kor="+kor);
			System.out.println("grade="+grade);
			System.out.println("msg="+msg);
		}
		System.out.println("kor="+kor);		
		//System.out.println("grade="+grade);	//grade cannot be resolved to a variable		
		//System.out.println("msg="+msg);		//msg cannot be resolved to a variable		
		
		return;//실행흐름되돌려줌 생략가능
	}//end main

}
