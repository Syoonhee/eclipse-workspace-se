package com.itwill04.array;

import java.util.Iterator;

/*
 * 주차관리프로그램
 */
public class CarArrayMain {

	public static void main(String[] args) {
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		
		
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) { 
				carArray[i].print(); //빈 공간은 제외, 입차된 차량만 출력
			}
		}
		
		
		System.out.println("2.전체주차구획수: " + carArray.length);

		System.out.print("3.주차가능주차구획수");
		int count = 0; //주차 
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) { 
				count++; //비어 있는 곳을 count해서 출력
			}
		}
		System.out.println(": "+ count);
		
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리(null)찾아서대입
		 */
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]== null) {
				carArray[i] = new Car("7777",15); //빈 공간에 차량번호, 입차시간 대입
				carArray[i].print();
				break;
			}
		} 
	
		
		System.out.println("5.차량번호 7789번  차 한 대 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null && carArray[i].getNo().equals("7789")) { //조건: null값이 아니며 차량번호는 7789(equals를 사용해서 문자열 비교)
				carArray[i].print();
				break; // 차 한 대 정보 출력
			}
		}
		
		
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null && carArray[i].getInTime()>=10) { //조건: null값이 아니며 10시 이후 차량 
				carArray[i].print(); //차량 여러 대 출력
			}
		}
		
		
		
		System.out.println("7.2389번차량 12시 출차");
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 주차에서 차량삭제
		 */
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null && carArray[i].getNo().equals("2389")) { //조건: null값이 아니며 차량번호는 2389
				carArray[i].setOutTime(12); //12시 출차 대입
				carArray[i].calculateFee(); //주차요금 계산
				carArray[i].print(); //영수증 출력
				carArray[i]= null; //차량 삭제
				break;
			}
		}	
		
		
	}

}