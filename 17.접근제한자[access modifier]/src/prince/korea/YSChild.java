package prince.korea;

import president.korea.YS;

public class YSChild extends YS/*extends YS*/ {
			//YS클래스 없음 -> 풀네임 사용해야함 -> 아니면 import
	
	public void access2() {
		this.member1 = 1;
		this.member2 = 2;
		/*this.member3 = 3;
		this.member4 = 4;
		*/
		this.method1();
		this.method2();
		/*this.method3();
		this.method4();
		 */
	}
}
