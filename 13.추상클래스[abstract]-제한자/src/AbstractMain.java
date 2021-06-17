public class AbstractMain {

	public static void main(String[] args) {
		/*
		 Cannot instantiate the type AbstractClass
		 AbstractClass ac=new AbstractClass();
		 */
		AbstractClassChild acc1 = new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		
		AbstractClass acc2 = acc1; //acc1과 acc2가 같은 객체 가리킴
		acc2.method1();
		acc2.method2();
		
		AbstractClass acc3 = new AbstractClassChild(); //상위 클래스에 넣는 이유: 유지보수, 확장성
		acc3.method1();
		acc3.method2();
		System.out.println("-----------array---------------");
		AbstractClass[] accArray = new AbstractClass[3]; 
		accArray[0] = new AbstractClassChild();
		accArray[1] = new AbstractClassChild();
		accArray[2] = new AbstractClassChild();
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].method2();
		}
 		
	}

}