
public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception /*????*/ {
		System.out.println("1.main");
		System.out.println("2.main 쓰레드 3초간 sleep");
		/*
		 * Causes the currently executing thread
		 *  to sleep (temporarily cease execution) for the specified number of milliseconds
		 *   plus the specified number of nanoseconds, 
		 *   subject to the precision and accuracy of system timers and schedulers. 
		 */
		Thread.sleep(3000); // 3초가 되기 전 나머지는 cpu점유권을 얻을 수 없는 방으로 ----> 대기실 가자마자 점유권 얻음
		System.out.println("3.main 쓰레드 3초 후 sleep 깨어난 후 실행");
		ControlSleepThread cst = new ControlSleepThread();
		cst.start();
		System.out.println("4.main 쓰레드 return");
		
		
		
		
	}

}
