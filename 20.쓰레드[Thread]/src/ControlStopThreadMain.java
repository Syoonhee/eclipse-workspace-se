
public class ControlStopThreadMain  {

	public static void main(String[] args) {
		System.out.println("1.main");
		ControlStopThread1 cst1 = new ControlStopThread1();
		cst1.start();
		System.out.println("2.main");
		ControlStopThread2 cst2 = new ControlStopThread2();
		cst2.start();
	
	}

}
