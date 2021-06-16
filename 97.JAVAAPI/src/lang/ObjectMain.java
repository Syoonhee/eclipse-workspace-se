package lang;

public class ObjectMain {

	public static void main(String[] args) {

		/*
		 * Class Object is the root of the class hierarchy.
		 *  Every class has Object as a superclass.
		 *  All objects, including arrays, implement the methods of this class.
		 */
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		/*
		 * public String toString()
		 * - Returns a string representation of the object. 
		 * - It is recommended that all subclasses override this method.
		 * Returns:
					a string representation of the object.
		 */
		
		String str1 =o1.toString();
		//String str2 =o1.toString();
		System.out.println(str1);
		System.out.println(o2.toString());
		System.out.println(o2);
		
		/*
		 * public boolean equals(Object obj)
		 * - 주소가 같은지 비교
		 */
		boolean isEqual = o1.equals(o2);
		System.out.println(isEqual);
		if(o1.equals(o3)) {
			System.out.println("o1과 o3의 주소가 동일하다");
		}
		if(o1.equals(o2)) {
			System.out.println("o1과 o3의 주소가 동일하지 않다");
		}
		
		if(o1 == o3) {
			System.out.println("o1 == o3의 주소가 동일하다");
		}
		if(o1 != o2) {
			System.out.println("o1 == o2의 주소가 동일하지 않다");
		}
		
		System.out.println("-----------ObjectChild-------------");
		ObjectChild oc1 = new ObjectChild();
		ObjectChild oc2 = new ObjectChild();
		ObjectChild oc3 = new ObjectChild();
		System.out.println(oc1.toString());
		System.out.println(oc2.toString());
		System.out.println(oc3.toString());
		if(oc1.equals(oc3)) {
			System.out.println("oc주소 oc3 주소 동일하다");
		}
		
	}

}
