/*
 * <<Object>>
 * Class Object is the root of the class hierarchy.
 *  Every class has Object as a superclass.
 *	All objects, including arrays, implement the methods of this class.
 */

class ObjectChild /*extends Object*/ {
	/*
	 * extends Object 생략가능
	 */
	

}

public class ObjectchildMain {

	public static void main(String[] args) {
		ObjectChild oc = new ObjectChild();
		int hashCode = oc.hashCode(); //이런 메소드가 있음...
		System.out.println(hashCode);
		System.out.println(Integer.toHexString(hashCode)); //얜 뭘까...
		/*
		 * public String toString()
		 */
		String str = oc.toString();  //얜 또 뭘까..
		System.out.println(str);
	
	}

}
