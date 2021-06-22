
public class Second {
	public void method2() {
		System.out.println("\t\t Second.method2() 실행");
		String str = null;
		int length = str.length();
		System.out.println("length:" + length);
		
		/************case1***************/
		/*
		 * 1. JVM 예외상황을  감지하고 예외 객체(NullpointerException) 생성
		 * 2. JVM은 생성한 예외 객체를 반환 방향으로 던진다. (throw)
		 * 3. 실행 중인 쓰레드는 실행을 멈추고 호출한 곳으로 이동한다
		 * 4. JVM은 던져진 에외 객체의 메세지를 출력한 후 쓰레드 종료(shut down)
		 */
		
		
		/**************case2**************/
		/*
		 * 1. 내가예외객체생성
		 * 2. 내가 예외객체를 던진다
		 * 3. 실행 중인 쓰레드는 실행을 멈추고 호출한 곳으로 이동한다
		 * 4. JVM은 던져진 에외 객체의 메세지를 출력한 후 쓰레드 종료(shut down)
		 */
		NullPointerException ex = new NullPointerException("내가만든예외객체");
		boolean b = true;
		if(b) {
			throw ex;
		}
		System.out.println("\t\t Second.method2() 반환");
		return;
	}
}
