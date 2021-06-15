class Parent extends Object{
	public int member1;
	public int member2;
	public Parent() {
		System.out.println("Parent()디폴트생성자");
	}
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
		
	}
}
class Child extends Parent{
	public int member3;
	public Child() {
		System.out.println("Child()디폴트생성자");
	}
	public void method3() {
		System.out.println("Child.method3()");
	}
}



public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("--------------------");
		Child c1=new Child();
		System.out.println("--------------------");
		
	}

}