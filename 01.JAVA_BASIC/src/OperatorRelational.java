/*
 관계(비교)연산
     - 형태:  >,<,>=,<=,==,!=
     - 관계연산의 결과값은 논리형 데이타이다(true,false)
*/
public class OperatorRelational {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		boolean result;
		result = a > b;
		System.out.println("10 > 20 --> "+result);
		result = a < b;
		System.out.println("10 < 20 --> "+result);
		result = a >= b;
		System.out.println("10 >= 20 --> "+result);
		result = a <= b;
		System.out.println("10 <= 20 --> "+result);
		result = a == b;
		System.out.println("10 == 20 --> "+result);
		result = a != b;
		System.out.println("10 != 20 --> "+result);
		
		char ca='A';
		char cb='B';
		char h1='가';
		char h2='나';
		result = ca < cb;
		System.out.println("A < B -->"+result);
		result= h1 > h2;
		System.out.println("가 > 나-->"+result);
		

	}

}
