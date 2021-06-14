
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		입차
		*/
		Car car1=new Car();
		/*
		car1.no="7788";
		car1.inTime=5;
		*/
		car1.setIpChaData("7788",5);
		
		Car car2=new Car();
		/*
		car2.no="6767";
		car2.inTime=6;
		*/
		car2.setIpChaData("6767", 6);
		/*
		출차(4시간후car1,car2)
		*/
		//1.출차시간대입
		//car1.outTime=10;
		car1.setOutTime(10);
		//car2.outTime=10;
		car2.setOutTime(10);
		
		//2.요금계산
		car1.calculateFee();
		car2.calculateFee();
		//3.영수증출력
		car1.print();
		car2.print();

	}

}
