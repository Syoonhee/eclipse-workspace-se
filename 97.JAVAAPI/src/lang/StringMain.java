package lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 명시적 생성(생성자 호출)
		 * 		- 생성자 호출
		 */
		
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		if(name1==name2) {
			System.out.println("name1과 name2의 주소가 같다");
		} else {
			System.out.println("name1과 name2의 주소가 다르다");
		}
		
		
		/*
		 * String 객체의 암시적 생성(생성자 호출 안함)
		 * 	- "" 로 생성
		 */
		
		String name3 = "KIM";
		String name4 = "KIM";
		if(name3==name4) {
			System.out.println("name3와 name4의 주소가 같다");
		} else {
			System.out.println("name3와 name4의 주소가 다르다");
		} 
		
		if(name3 == "KIM") {
			System.out.println("name3과 \"KIM\"의 주소가 같다");
		} else {
			System.out.println("name3과 \"KIM\"의 주소가 다르다");
		}
		
		/*
		 * << String >>
		 * public boolean equals(Object anObject)
		 * 	- String 객체가 멤버(value)로 가지고 있는 문자열 비교
		 * 
		 * - 문자열 비교로 재정의
		 * Overrides:equals in class Object
		 */
		
		System.out.println("-------------String객체비교는 equals메소드를 사용하여야한다.-------------");
		if (name1.equals(name4)) {
			System.out.println("name1, KIM 문자열이 동일하다");
		}
		if (name1.equals(name2)) {
			System.out.println("name1, KIM 문자열이 동일하다");
		}
		if (name1.equals(name3)) {
			System.out.println("name1, KIM 문자열이 동일하다");
		}
		if ("KIM".equals("KIM")) {
			System.out.println("name1, KIM 문자열이 동일하다");
		}
		
		/*
		 * public int compareTo(String anotherString) 
		 * Returns:
				the value 0 if the argument string is equal to this string; 
				a value less than 0 if this string is lexicographically less than the string argument;
 				and a value greater than 0 if this string is lexicographically greater than the string argument.
		 */
		
		String irum1 = "홍경호";
		String irum2 = "김경호";
		int unicodeGap1 = irum1.compareTo(irum2);
		System.out.println("유니코드차이:"+ unicodeGap1);
		
		int unicodeGap2 = irum2.compareTo(irum2);
		System.out.println("유니코드차이:"+ unicodeGap2);
		
		if(irum1.compareTo(irum2)>0) {
			System.out.println("irum1, irum2 교환[오름차순]");
		}
	}

}
