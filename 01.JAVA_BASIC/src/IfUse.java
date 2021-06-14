
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수홀수판별후출력
		 */
		int no1=55;
		
		if(no1%2==0) {
			//System.out.println(no1+" 는 짝수입니다.");
			System.out.printf("%d 는 %s 입니다.%n",no1,"짝수");
		}else {
			//System.out.println(no1+" 는 홀수입니다.");
			System.out.printf(" %d 는 %s 입니다.%n",no1,"홀수");
		}
		/*
		 * 4의배수 판별후 출력
		 */
		int no2=5684;
		if(no2%4==0) {
			System.out.printf("%d 는 4의배수 %n",no2);
		}else {
			System.out.printf("%d 는 4의배수아님 %n",no2);
		}
		/*
		 * 점수의유효성체크
		 */
		int kor=-90;
		if(kor>=0 && kor<=100) {
			System.out.printf(" %d 은 유효한점수입니다.%n",kor);
		}else {
			System.out.printf(" %d 은 유효한점수 아닙니다.%n",kor);
		}
		
		/*
		 * 윤년여부체크
		 */
		int year=2021;
		if((year%4==0 && year%100!=0)|| year%400==0) {
			System.out.printf("%d 는 윤년입니다.%n",year);
		}else {
			System.out.printf("%d 는 평년입니다.%n",year);
		}
		/*
		 * 문자판단
		 *   1.한글
		 *   2.알파벳 대문자(소문자)
		 *   3.숫자형태문자 --> '0'
		 */
		char c='s';
		
		if(c>='가' && c<='힣') {
			 System.out.printf("%c 는 한글입니다.%n",c);
		}
		if(c>='A' && c<'Z') {
			System.out.printf("%c 는 알파벳대문자입니다.%n",c);
		}
		if(c>='a' && c<'z') {
			System.out.printf("%c 는 알파벳소문자입니다.%n",c);
		}
		if(c>='0' && c<'9') {
			System.out.printf("%c 는 숫자형태문자입니다.%n",c);
		}
		/*
		 Quiz:
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		 char idFirstLetter='&';
		 if(true) {
			System.out.println("아이디로적합"); 
		 }else {
			 System.out.println("아이디로부적합"); 
		 }
	}

}













