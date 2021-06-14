package com.itwill01.method;

public class StudentMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		stu1.setData(1, "KIM", 93, 82, 86);
		stu2.setData(2, "LEE", 85, 96, 93);
		stu3.setData(3, "SON", 77, 82, 80);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 */
		stu1.calculateTot();
		stu2.calculateTot();
		stu3.calculateTot();
		/*
		 학생평균계산 메쏘드 호출(3명)
		*/
		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();
		/*
		 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.calculateGrade();
		stu2.calculateGrade();
		stu3.calculateGrade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		return;
	}

}
