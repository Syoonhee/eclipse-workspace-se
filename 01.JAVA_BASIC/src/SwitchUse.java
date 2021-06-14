
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수홀수판별
		 */
		int number=23;
		
		switch(number%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		/*
		 * 4의배수판별
		 */
		int number2=400;
		switch(number2%4) {
		case 0:
			System.out.println(number2+" 는 4의배수");
			break;
		default:
			System.out.println(number2+" 는 4의배수 아님");
		}
		/*
		 * 문자비교
		 *  A: left
		 *  D: right
		 *  W: up
		 *  Z: down
		 *  S: rotate
		 */
		char direction='D';
		switch (direction) {
		case 'A':
			System.out.println("left...");
			System.out.println("left...");
			System.out.println("left...");
			System.out.println("left...");
			System.out.println("left...");
			break;
		case 'D':
			System.out.println("right..");
			break;
		case 'W':
			System.out.println("up..");
			break;
		case 'Z':
			System.out.println("down....");
			break;
		case 'S':
			System.out.println("rotate...");
			break;
		default:
			System.out.println("nothing...");
			break;
		}

	}

}
