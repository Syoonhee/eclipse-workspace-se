package wrapper;
/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */

public class WrapperClassMain {

	public static void main(String[] args) {
		/*
		 * Wrapper 객체형태
		 */
		Integer intWrapper = new Integer(123); // 클래스 intWrapper 객체 = (123) 생성자 호출; (주소값할당#5)
		System.out.println("Integer 객체 멤버필드 int value의 값: " + intWrapper.intValue());
		Boolean boolWrapper = new Boolean(true);
		System.out.println("Integer 객체 멤버필드 boolean value의 값: " + boolWrapper.booleanValue());
		
		
		/*
		 * Wrapper 객체의 생성
		 */
		
		//Boxing(기본 타입의 값을 포장 객체로 만드는 과정, 기본형을 wrapper 객체로 변경)
		//int(기본형) --> Integer(Wrapper)
		
		Integer wi1 = null;//Integer 객체의 주소값이 들어가야 하는데 없음. null로 초기화
		wi1 = new Integer(89); //value: 89
		Integer wi2 = new Integer("89"); //wi1과 wi2의 value값은 동일하나 주소는 다름
		Boolean wb1 = new Boolean(false);
		Boolean wb2 = new Boolean(true);
		Double wd1 = new Double(3.14159);
		Double wd2 = new Double(0.14142135);
		
		//Unboxing
		//Integer객체(Wrapper) --> int(기본형)
		int i1 = wi1.intValue();
		int i2 = wi2.intValue();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(wb1.booleanValue());
		System.out.println(wb2.booleanValue());
		System.out.println(wd2.doubleValue());
		System.out.println(wd2.doubleValue());
		
		/*
		 * auto boxing(wrapping)
		 */
		
		Integer wi3 = 89; //wi3에는 주소가 들어감, 89가 들어가는 게 아님
		Integer wi4 = 89;
		Boolean wb3 = true;
		Boolean wb4 = false;
		Double wd3 = 3.14159;
		Double wd4 = 3.1419;
		
		/*
		 * auto unboxing
		 */
		
		int i3 = wi3; //wi3는 주소 값이 i3에 들어간다..? -> Value가 호출되어 89의 값이 들어감
		int i4 = wi4;
		boolean b3 = wb3; //wb3.booleanValue 호출  
		boolean b4 = wb4;
		double d3 = wd3;
		double d4 = wd4;
		
		System.out.println("************AUTO BOXING****************");
		Integer ia = 89;
		Integer ib = 45;
		Integer ic = 78;
		Integer id = 99;
		
		System.out.println("*************자동형변환(Integer-->Object)****************"); /*(child-->Parent, 업캐스팅, 프로모션)*/
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		
		System.out.println("********AUTO BOXING && 자동형변환(Integer --> Object)*******");
		Object ooa = 89;
		Object oob = 45;
		Object ooc = 78;
		Object ood = 99;

		Object[] scoreArray = new Object[4];
		scoreArray[0] = /*new Integer(89);*/89;
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 99;
		for (int i = 0; i < scoreArray.length; i++) {
			/*Integer tempInteger = (Integer) scoreArray[0]; //(scoreArray[0]: Object타입, 실제 객체는 Integer객체 -> 박싱됐기때문)
			int temptScore = tempInteger.intValue();
			System.out.println(tempScore + " ");
			 */
			
			int tempScore = (Integer) scoreArray[i]; //자동으로 언박싱
			System.out.print(tempScore + " ");
		}
		System.out.println();
	}

}
