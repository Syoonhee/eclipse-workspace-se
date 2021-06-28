package com.itwill04.array;

import com.itwill05.service.student.Student;

public class StudentArrayMain {

	public static void main(String[] args) {
		
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] students = { 
				new Student(1, "KIM", 89, 93, 94), 
				new Student(2, "HIM", 88, 77, 98),
				new Student(3, "AIM", 65, 87, 99), 
				new Student(4, "BIM", 75, 97, 60), 
				new Student(5, "XIM", 85, 98, 90),
				new Student(6, "KIM", 95, 88, 77), 
				new Student(7, "ZIM", 99, 93, 95), 
				new Student(8, "LIM", 83, 80, 99),
				new Student(9, "QIM", 73, 90, 80)
		};

		
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
		
		
		
		
		
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].getTot() < students[j].getTot()) { //만약 i의 총점보다 j총점이 크다면
					students[i].setRank(students[i].getRank()+1); //i의 등수 1증가(석차 밀린다는 것)
				}
			}
		}

		
		
		
		
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}

		
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력");
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo() == 3) {
				students[i].print();
				break;
			}
		}
		
		
		
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade() == 'A') {
				students[i].print();
			}
		}
		
		
		
		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 내림(오름)차순정렬");
		Student.headerPrint();
		for (int i = 0; i < students.length-1; i++) { //몇 회전 해야하는 지 결정 (길이-1번 회전)
			for (int j = 0; j < students.length-1; j++) {  //j는 값 비교+ 자리 바꿔주는 역할
				if(students[j].getTot() < students[j+1].getTot()) { //조건: students[i]의 총점 < students[i]의 총점
					Student temp = students[j+1]; //자리를 바꿔주기 위한 변수 temp,student[j+1]의 주소 보관
					students[j+1] = students[j]; // students[j]의 주소가 students[j+1}에..
					students[j] = temp; //자리를 바꿔줌

				}
			} 
			
			}
		
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		

		
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("6. 학생학점순으로 오름차순정렬");
		Student.headerPrint();
		for (int i = 0; i < students.length-1; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getGrade() > students[j+1].getGrade()) {
					Student temp = students[j+1];
					students[j+1] = students[j];
					students[j] = temp;
					}
				}
		}
			for (int i = 0; i < students.length; i++) {
				students[i].print();
			
			
			
			}


	
	
		
		
		
		
		/*
		 8.이름이 KIM인학생들 출력
		 */
		System.out.println(" 8.이름이 KIM인학생들 출력");
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals("KIM")) {
				students[i].print();
			}
		}
		
		
		
		
		
		/*
		 9. 학생이름순으로 오름차순정렬
		 */
		System.out.println(" 9.학생이름순으로 오름차순정렬");
		Student.headerPrint();
		for (int i = 0; i < students.length-1; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getName().compareTo(students[j+1].getName()) > 0) {
					Student temp = students[j+1];
					students[j+1] = students[j];
					students[j] = temp;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
	}

}