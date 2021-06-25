package generic;

public class GenericMain {

	public static void main(String[] args) {
		System.out.println("*****************NoGeneric********************");
		NoGenericClass noGenericClass = new NoGenericClass();
		noGenericClass.setMember(new String("멤버"));
		noGenericClass.setMember(new Integer(123)); //상위캐스팅
		
	}

}
