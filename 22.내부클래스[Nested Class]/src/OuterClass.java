
public class OuterClass {
	/*
	 * 인스턴스 멤버 필드 
	 */
	public int outer_member_field;
	/*
	 * 인스턴스 멤버 메소드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	
	/*********외부클래스에서 내부클래스의 사용**********/
	public void outer_inner_class_use() { 
		/*
		 * 1.InnerClass객체생성
		 */
		//OuterClass.InnerClass innerClassObject = this.new InnerClass(); 이너클래스는 단독으로 존재x (앞에 OuterClass 생략 가능) ,this는 왜..?(모르면 걍 넘어감ㅋ)
		InnerClass innerClassObject = new InnerClass();
		/*
		 * 2.InnerClass객체멤버사용
		 */
		innerClassObject.inner_member_field = 99999;
		innerClassObject.inner_member_method();
		
	}
	
	
	
	/*
	 * 인스턴스 멤버 클래스[Nested class, Inner Class, 내부클래스]
	 */
	/**************inner class******************/
	public class InnerClass{ //아우터클래스가 생성되어야 의미가 있음 (사용도 아우터 클래스 안에서)
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		
		/*
		 * 내부클래스의 사용이유
		 - 내부클래스(객체)에서 외부 클래스(객체)의
		   멤버필드, 멤버메쏘드 접근을 손쉽게 하기 위해서 
		 */
		public void inner_outer_member_access() {
			//InnerClass.this.inner_member_field = 9090;
			//OuterClass.this.outer_member_field = 7878;
			outer_member_field = 7878;
			//OuterClass.this.outer_member_method();
			outer_member_method();
		}
		
		
	}//inner class end
	/********************************/
	
	
} //end outer class
