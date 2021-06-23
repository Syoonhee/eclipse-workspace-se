package wrapper;

public class WrapperClassCompereMain {

	public static void main(String[] args) {
		Integer wi1 = new Integer(89);
		Integer wi2 = new Integer(89);
		Integer wi3 = new Integer(89); //wi1,wi3 주소 값 동일
		/*
		 * Wrapper,String 객체
		 * - 비교 연산자 (==)를 사용하면 주소 비교 [사용금지]
		 * - equals 메소드 사용(멤버필드 기본형 값 비교) [재정의]
		 */
		
		if(wi1.equals(wi2)) {
			System.out.println("wil,wi2의 값이 동일하다");
		}
		if(wi1.equals(wi3)) {
			System.out.println("wi1,wi3의 값이 동일하다");
		}if(wi2.equals(wi3)) {
			System.out.println("wi2,wi3의 값이 동일하다");
		}
		
		
		/*
		System.out.println("************************************");
		wi1을 언박싱
		if(wi1 == 89) {
			System.out.println("wi1.intValue()==89 값이 동일하다");
		}
		if(wi1 > 67) {
			System.out.println("wi1.intValue() > 67");
		}
		if(wi1 >= wi2) {
			System.out.println("wi1.intValue() >= wi2.intValue()");
		}
		*/
		
		
		
		
		
	}

}
