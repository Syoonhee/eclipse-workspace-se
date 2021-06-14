
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		double dresult=0.0;
		result =  a + b;
		System.out.println("a+b --> "+result);
		result = a-b;
		System.out.println("a-b --> "+result);
		result = a * b;
		System.out.println("a*b --> "+result);
		result = a / b;
		System.out.println("1.a/b --> "+result);
		dresult= a / b;
		System.out.println("2.a/b --> "+dresult);
		dresult= (double)a / b;
		System.out.println("3.a/b --> "+dresult);
		/*
		 % 나머지연산자
		 */
		result = a % b;
		System.out.println("a % b -->"+result);
		
		int year=1998;
		result = year % 4;//0,1,2,3
		System.out.println("2021 % 4 --> "+result);
		result = year % 100;//0~99
		System.out.println("2021 % 100 -->"+result);
		result = year % 400;//0~399
		System.out.println("2021 % 400 -->"+result);
		
		int no=16;
		result = no % 4;
		System.out.println("result값이 0이면 4의배수:"+result);
		/*
		 * 문자연산
		 */
		System.out.println("------------문자연산--------------");
		char ca='A';
		char cz='Z';
		int numOfAlphabet = cz-ca+1;
		System.out.println("numOfAlphabet:"+numOfAlphabet);
		char c='A';
		System.out.println(c);
		c = 'A' + 1;
		System.out.println(c);
		c = 'A' + 2;
		System.out.println(c);
		c = 'A' + 3;
		System.out.println(c);
		int numOfHangul = '힣'-'가'+1;
		System.out.println("numOfHangul:"+numOfHangul);
		
		
		/*
		 * 비트연산
		 *  << , >>
		 *  
		 *  int d  = 1         ==> 00000000|00000000|00000000|00000001 --> d
		 *  result = d << 1;   ==> 00000000|00000000|00000000|00000010 --> result
		 *  result = d << 2;   ==> 00000000|00000000|00000000|00000100 --> result
		 *  result = d << 3;   ==> 00000000|00000000|00000000|00001000 --> result
		 *  result = d << 4;   ==> 00000000|00000000|00000000|00010000 --> result
		 *    
		 */
		 int d = 1;
		 result = d << 1;
		 System.out.println(result);
		 result = d << 2;
		 System.out.println(result);
		 result = d << 3;
		 System.out.println(result);
		 result = d << 4;
		 System.out.println(result);
		 /*
		  *  int d  = 128       ==> 00000000|00000000|00000000|10000000 --> d
		  *  result = d >> 1;   ==> 00000000|00000000|00000000|01000000 --> result
		  *  result = d >> 2;   ==> 00000000|00000000|00000000|00100000 --> result
		  *  result = d >> 3;   ==> 00000000|00000000|00000000|00010000 --> result
		  *  result = d >> 4;   ==> 00000000|00000000|00000000|00001000 --> result 
		  */
		 d = 128;
		 result = d >> 1;
		 System.out.println(result);
		 result = d >> 2;
		 System.out.println(result);
		 result = d >> 3;
		 System.out.println(result);
		 result = d >> 4;
		 System.out.println(result);
		 
		 byte bbb=(byte)0b10000000;
		 System.out.println(bbb);
	}

}



















