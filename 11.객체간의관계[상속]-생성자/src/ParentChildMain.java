class Parent extends Object{
	public int member1;
	public int member2;
	public Parent() {
		/*
		 * - 클래스 생성자 첫 번째 라인에서는 반드시 부모의 생성자(디폴트)가 호출되어야한다.
		 * - 생략 시 부모의 디폴트 생성자가 자동 호출된다.
		 */
		
		super(); //Object 클래스의 기본 생성자를 호출하는 코드
		System.out.println("2.Parent()디폴트생성자");
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
		//System.out.println();
		/*
		 * - 클래스 생성자 첫 번째 라인에서는 반드시 부모의 생성자(디폴트)가 호출되어야한다.
		 * - 생략 시 부모의 디폴트 생성자가 자동 호출된다.
		 */
		super(); //super();가 첫 번째로 호출되어야 함
		System.out.println("3.Child()디폴트생성자");
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