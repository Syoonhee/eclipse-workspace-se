
public class IfTest1 {
	/*
	 * 코드들여쓰기(정렬): 
	 * << ctrl + shift + f >>
	 */
	public static void main(String[] args) {
		System.out.println("stmt1");
		boolean condition = false;
		if (condition) {
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		} // end if
		System.out.println("----stmt5-----");
		if (condition) {
			System.out.println("stmt6");
			System.out.println("stmt7");
		} else {
			System.out.println("stmt8");
			System.out.println("stmt9");
		}
		System.out.println("----stmt10----");

		if (condition) 
			System.out.println("stmt11");
		
		System.out.println("---stmt12----");

		if (condition)
			System.out.println("stmt13");
		else
			System.out.println("stmt14");
		System.out.println("----stmt15-----");
	}// end main

}// end class
