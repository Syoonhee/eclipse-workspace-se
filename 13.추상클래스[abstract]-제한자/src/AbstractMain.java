public class AbstractMain {

	public static void main(String[] args) {
		/*
		 Cannot instantiate the type AbstractClass
		 AbstractClass ac=new AbstractClass();
		 */
		AbstractClassChild acc1 = new AbstractClassChild();
		acc1.method1();
		acc1.method2();
	}

}