
public class ForTest {

	public static void main(String[] args) {
		System.out.println("---------------while------------");
		int k=0;
		while(k<10) {
			System.out.println("k="+k);
			k++;
		}
		System.out.println("---------------for i증가------------");
		for(int i=0;i<10;i++) {
			System.out.println("i="+i);
		}
		System.out.println("---------------for i감소------------");
		for(int i=10;i>0;i--) {
			System.out.println("i="+i);
		}
		
		System.out.println(">> 짝수 출력[1~10]");
		for (int i = 1; i <= 10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">> 홀수 출력[1~10] continue");
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;//continue문이후의 for블록코드를 실행하지않고 다음반복을 계속실행한다.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(">> 4의배수 출력[1~100] continue");
		for(int i=1;i<=100;i++) {
			if(i%4!=0) {
				continue;
			}	
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println(">> 3,4의 공배수[1~100]" );
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">> 3,4의 최소공배수[1~100]" );
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
				break;//break문이후의 for블록코드를 실행하지않고 다음반복을 실행안한다.
			}
			
		}
		
		
		System.out.println();
		System.out.println(">>홀수,짝수합[1~100]");
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
			if(i%2==0) {
				oddTot+=i;
			}else {
				evenTot+=i;
			}
		}
		System.out.println("전체합:"+tot);
		System.out.println("홀수합:"+oddTot);
		System.out.println("짝수합:"+evenTot);
		System.out.println("----문자출력-----");
		for(char c='a';c<='z';c++) {
			System.out.print(c);
			if(c!='z') {
				System.out.print(",");
			}
			
		}
		System.out.println();
		System.out.println("----문자출력-----");
		for(char c='a';c<='z';c++) {
			System.out.print(c);
			if(c=='z') {
				continue;
			}
			System.out.print(",");
		}
		System.out.println();
		
	}

}






