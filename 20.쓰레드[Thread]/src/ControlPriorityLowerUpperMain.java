
public class ControlPriorityLowerUpperMain {

	public static void main(String[] args) {
		System.out.println("1. main");
		ControlPriorityUpperThread ut = new ControlPriorityUpperThread();
		ControlPriorityLowerThread lt = new ControlPriorityLowerThread();
		/*
		 * priority
		 * 	-CPU의 점유권을 얻을 수 있는 우선 순위
		 * 	-1~10까지의 우선 순위를 가짐 (우선순위 10이 높은 것)
		 */
		System.out.println("ControlPriorityUpperThread -->" + ut.getPriority());
		System.out.println("ControlPriorityLowerThread -->" + lt.getPriority());
		
		ut.setPriority(10);
		lt.setPriority(1);
		
		ut.start();
		lt.start();
		
		System.out.println("99.main return");
	}

}
