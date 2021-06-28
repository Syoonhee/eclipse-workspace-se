
public class CreatCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread");
		
		/*
		 * 
			1. Thread 클래스를 상속받는다.
			2. Thread class의 run method를 overriding 한다.
				동사원형:public void run()
			3. Thread 객체를 생성한다.
			4. Thread 객체를통해서 Thread를 시작시킨다.
		 */
		
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("mySuperUltraThread"); //쓰레드 이름 찍기
		cct.start(); // start 호출-> JVM이 새로운 쓰레드를 만들어서 그 쓰레드 객체에 런 메소드를 호출하게 됨
		//cct.start로 cct의 쓰레드 만들어지고 메인과 다른 스레드와는 별개로 cct의 일(run)을 실행하고 반환할 때 쓰레드를 만든 vm에게 반환
		//단일 쓰레드가 아님 (mySuper~가 실행..?) ) *run메소드와의 차이..? *api 참고
		//새로운 쓰레드....메인이 죽어도 할 일함....... 둘 다 죽으면 셧다운...?
		//while(true) {
			System.out.println("2.main thread return"); 
		//}
	}

}
