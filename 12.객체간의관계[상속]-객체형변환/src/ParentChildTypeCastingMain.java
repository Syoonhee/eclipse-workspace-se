/*
 객체의 형변환
   1. 부모자식관계에있는 클래스 틀에서만 가능하다.
   
   2. 자식객체를 부모클래스타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */

public class ParentChildTypeCastingMain {

	public static void main(String[] args) {

	}

}
