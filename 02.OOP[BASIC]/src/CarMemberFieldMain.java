
public class CarMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.차량입차 1234번차량 12시
		 */
		
		//차객체주소를 저장할 참조변수선언(8byte)
		Car car;
		//Car클래스를 사용해서 차객체를 생성한후 car참조변수에 주소대입
		car = new Car();
		
		//차객체의 no멤버필드에 값대입
		car.no="1234";
		car.inTime=12;
		
		/*
		 * 2.16시 car차량 출차  1234차량출차 
		 */
		
		//차객체의 outTime멤버필드(변수)에 16대입
		car.outTime=16;
		//주차요금계산
		//차객체의 fee멤버필드(변수)에 계산후대입
		car.fee = (car.outTime-car.inTime)*1000;
		
		//영수증출력
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호", "입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %7d %9d %8d%n",car.no,car.inTime,car.outTime,car.fee);
	}

}
