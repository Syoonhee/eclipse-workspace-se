package wrapper;

import com.sun.rowset.internal.WebRowSetXmlReader;

public class WrapperClass유용한메쏘드 {

	public static void main(String[] args) {
		System.out.println("int --> String");
		int y = 2147483647;
		String yStr = Integer.toString(y);
		System.out.println(yStr);
	
		String yStr2 = y+"";
		System.out.println(yStr2);
	
		String yStr3 = Integer.toBinaryString(y); //toBinaryString: 이진으로 출력하는 String
		System.out.println(yStr3);
		
		String yStr4 = Integer.toHexString(y); //toHexString: 대문자 16진수 문자로 인코딩된 해당하는 문자열 표현으로 변환
		System.out.println(yStr4);
	
		System.out.println("String-->int,double, boolean");
		// parseInt() :문자열 인자를 구문분석하여 특정 진수(수의 진법 체계에 기준이 되는 값)의 정수를 반환
		int i1 = Integer.parseInt("564665464");
		System.out.println(i1);
		double d1 = Double.parseDouble("3.14159");
		System.out.println(d1);
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1);
		
		/*
		 *  + 연산자 오버로딩 
		 *  - 항이 문자열일 경우는 concat
		 *  
		 */
	
		
		int number = 454354;
		String numberStr1 = number + "";
		String numberStr2 = 1+2+3+4+5+"6";
		System.out.println(numberStr2);
		System.out.println("-------------Character-----------------");
		Character wc1 = new Character('김');
		Character wc2 = '김';
		char c1 = wc1.charValue(); //언박싱
		char c2 = wc2;
		System.out.println("-----------String--> char,char[]-----------");
		char firstChar = "김경호".charAt(0); //charAt(): 문자열에서 특정 인덱스에 위치하는  유니코드 단일문자를 반환
		System.out.println(firstChar);
		char[] ca = "오늘은 수요일 WrapperClass를 공부합니다.".toCharArray(); //toCharArray(): 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 집어넣어주는 친절한 메소드
		System.out.println(ca[0]+""+ca[6]);
		System.out.println("-----------char,char[]-->String------------");
		char c3 = '김'; //'김' --> "김"
		String str3 = String.valueOf(c3); //String.valueOf(): "null"이라는 문자열로 처리
		String str4 = c3+"";
		System.out.println(str3+","+str4);
		char[] ca5 = {'김','은','희'};
		String str5 = String.valueOf(ca5);
		System.out.println("char[] ---> String:" + str5);
		String str6 = new String(ca5); //객체 생성은 왠만하면 줄이는 것이 좋음
		System.out.println("char[] ---> String:" + str6);
		
		String strs = "Hello Java!$#%#%#$%#@@3헬로우자바";
		for (int i = 0; i < strs.length(); i++) {
			char tempChar = strs.charAt(i);
			int type = Character.getType(tempChar);
			System.out.println(tempChar + " type:" + type);
			if(type == Character.UPPERCASE_LETTER) {
				System.out.println("UPPERCASE_LETTER:" + tempChar);
			}
			if(type == Character.LOWERCASE_LETTER) {
				System.out.println("LOWERCASE_LETTER:" + tempChar);
			}
			if(type == Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("DECIMAL_DIGIT_NUMBER:" + tempChar);
			}
			
			if(type == Character.SPACE_SEPARATOR) {
				System.out.println("SPACE_SEPARATOR:" + tempChar);
			}
			if(Character.isSpaceChar(tempChar)) {
				System.out.println("Character.isSpaceChar:" + tempChar);
			}
			if(Character.isAlphabetic(tempChar)) {
				System.out.println("Character.isAlphabetic:" + tempChar);
			}
		}
		
		
		
		
	}

}
