package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1 = "Have a nice day!!!";
		String str2 = "오늘은 목요일 추상클래스를 공부할거다";
		System.out.println("-------------length-------------------------");
		int length1 = str1.length();
		int length2 = str2.length();
		int length3 = "자바가 재미있네요".length();
		String emptyStr = ""; //String 객체 초기화할 때 자주 씀
		int length4 = "".length(); //String 객체 초기화할 때 자주 씀
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(length4);
		System.out.println("-----------------null ,\"\"-------------------");
		
		String id = null; //String id="";과 동일, 참조변수니까 null초기화 할 수 있음
		if(id == null || id.equals("") ) {
			System.out.println("아이디를 입력하세요!!!");
		}
		System.out.println("------------Strin.substring--------------"); //자주 쓰는 메소드
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("Have a nice day!!!".substring(7,11).length());
		System.out.println("오늘은 수요일 추상클래스를 공부할거여요.".substring(15));
		System.out.println("오늘은 수요일 추상클래스를 공부할거여요.".substring(8,13));
		System.out.println("-----------String.charAt(index)----------------");
		String userId = "123test#00ABC$%";
		char firstChar = userId.charAt(0);
		System.out.println("'1'-->" + firstChar);
		System.out.println("'1'의 asciicode 값-->" +(int)firstChar);
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			System.out.print(tempChar + "(" + (int)tempChar + ")");
		}
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			if(tempChar >= 'a' && tempChar <= 'z') {
				System.out.println(tempChar+ " -> 영문소문자");
			}
			if(tempChar>=48 && tempChar<=57) {
				System.out.println(tempChar + " -> 숫자형문자");
			}
			
			/*
			 * Quiz: 아이디로 적합한지판단하시요
			 *    - 길이가 3~7 사이여야한다.
			 *    - 영문,숫자로만이루어져 있어야한다.
			 *    - 첫글자가 숫자여서는안된다
			 */
			String[] idArray= {"guard","7up","test"," dfdj","my id","%super%","아이디","aaaaaaaaaa","c"};
			
			
			
			
		}
		
	}
}
