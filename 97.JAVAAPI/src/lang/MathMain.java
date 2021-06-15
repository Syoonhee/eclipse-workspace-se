package lang;

public class MathMain {

	public static void main(String[] args) {
		/* <<The constructor Math() is not visible>>
			Math m = new Math();
		*/
		
		
		/*
		Math 클래스
		   - 수학함수를 가지고있는클래스
		   - 모든 메쏘드 static 이다.
		   - 객체생성이 불가능
		      (생성자 접근제한자 private)
		The constructor Math() is not visible
		Math math=new Math();
		 */
		
		
		double r = Math.abs(-898975834.589); //abs(): 절대값 구할 수 있는 메소드 
		System.out.println(r);
		System.out.println(Math.max(23, 45));
		System.out.println(Math.min(23, 45));
		System.out.println(Math.round(33.55645));
		System.out.println(Math.round(33.55645*10)/10.0);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sin(3.141592/2));
		System.out.println("---------------Math.random()--------------");
		
		/*
		 * public static double random()
		 * 		Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		 */
		
		System.out.println(Math.random());
		System.out.println("1~10사이의 정수 랜덤 생성");
		System.out.println((int) (Math.random()*10)+1);
		System.out.println((int) (Math.random()*10)+1);
		System.out.println((int) (Math.random()*10)+1);
		System.out.println((int) (Math.random()*10)+1);
		System.out.println("1~45");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		
	}

}
