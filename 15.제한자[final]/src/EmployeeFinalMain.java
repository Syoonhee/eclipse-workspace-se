
public class EmployeeFinalMain {

	public static void main(String[] args) {
		Employee[] emps = {
				new SalaryEmployee(1, "KIM", 30000000),
				new SalaryEmployee(2, "LIM", 28000000),
				new SalaryEmployee(3, "UIM", 10000000),
				new HourlyEmployee(4, "TIM", 100, 20000),
				new HourlyEmployee(5, "RIM", 100, 8000)
				
		};
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].caculatePay();
			System.out.println("-----------------"+ emps[i].getName()+" 님 급여명세표-----------");
			emps[i].print();
			double incentive = emps[i].calculateIncentive();			
			System.out.println("\t인센티브:" + incentive);
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.println();
		}
		
		System.out.println("사원인센티브율" + Employee.INCENTIVE_RATE);
		
		
		
	}

}
