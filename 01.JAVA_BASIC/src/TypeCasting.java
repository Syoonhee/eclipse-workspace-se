/*
		형변환--> 숫자형데이타간에만 가능
		    - 형식 :  (데이타타입)변수 or 리터럴;
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short-->int-->long-->float-->double
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte     
 */
public class TypeCasting {
	public static void main(String[] args) {
		//- 자동형변환(작은데이타-->큰데이타타입변수):promotion
		int  i1 = 56;
		long l1 = i1;
		System.out.println(l1);
		double d1 = i1;
		System.out.println(d1);
		
		char c1='김';
		int i2=c1;
		System.out.println(c1);
		System.out.println(i2);
		//- 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
		double avgd = 85.665;
		int avgi = (int)avgd;
		System.out.println(avgd);
		System.out.println(avgi);
		
		/*
		 * 연산시의 형변환
		 *   - 연산항들중에 가장큰타입으로 모든항이 형변환된다(promotion)
		 */
		int ii=100;
		char cc='A';
		long ll= 45L;
		double dd =45.26;
		
		long lr = ii+cc+ll;
		double dr = ii+cc+ll+dd;
		/*
		  * double avgd = 85.665;
		  * Quiz: 
		  *  1.소수점이하 첫째짜리 내림
		  *     --> 85.6
		  *  2.소수점이하 첫째짜리 반올림
		  *     --> 85.7
		  *     
		  *  85.665 --> 8566.5 --> 8566 --> 8566+5 --> 8571 --> 857.1 -->857--> 85.7
		  */
		  double ad = 85.665;
		  System.out.println(ad);
		  ad = ad*100;
		  System.out.println(ad);
		  int ai = (int)ad;
		  System.out.println(ai);
		  ai=ai+5;
		  System.out.println(ai);
		  ad = ai/10.0;
		  System.out.println(ad);
		  ai=(int)ad;
		  System.out.println(ai);
		  ad=ai/10.0;
		  System.out.println(ad);
	}
}









