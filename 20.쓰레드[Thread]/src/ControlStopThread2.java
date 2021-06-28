public class ControlStopThread2 extends Thread{

	private boolean isPlay;
	
	public  ControlStopThread2() {
		isPlay = true;
	}

	@Override
	public void run() {
		while(isPlay) {
			
			try {
				Thread.sleep(500);
				System.out.println("game move");
				System.out.println("game fight");
				System.out.println("game get score");
				System.out.println("game power up");
				System.out.println("game score update");
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
	}
}
