package com.itwill04.array;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		AcademyMember[] members={
				new AcademyStudent(1, "KIM", "자바"),
				new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"),
				new AcademyStudent(4, "LEE", "IOT"),
				new AcademyGangsa(5, "CHOI", "파이썬"),
				new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"),
				new AcademyStaff(8, "AIM", "영업"),
				new AcademyStaff(9, "QIM", "생산")
		};
		
		System.out.println("1.AcademyMember 전체출력");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		System.out.println();
		
		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			members[0].print();
			break; //1명만 출력
		}
		System.out.println();
		
		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			members[1].print();
			break;//1명만 출력
		}
		System.out.println();
		
		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName() == "KIM") {
				members[i].print();
			}
		}
		System.out.println();
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) { //instanceof연산자(객체타입확인): 참조변수 instancof 클래스이름
				members[i].print();
			}
		} 
		System.out.println();
		
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				members[i].print();
			}
		} 
		System.out.println();
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				members[i].print();
			}
		} 
		System.out.println();
		
		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				AcademyStudent tempstudent = (AcademyStudent) members[i]; 
				if(tempstudent.getBan().equals("자바")) {
					members[i].print();
				}
			}
		} 
		System.out.println();
		
		
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff tempstaff = (AcademyStaff) members[i];
				if(tempstaff.getDepart().equals("영업")) {
					members[i].print();
				}
			}
		} 
		System.out.println();
		
		
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempgangsa = (AcademyGangsa) members[i];
				if(tempgangsa.getSubject().equals("자바")) {
					members[i].print();
				}
			}
		} 
		System.out.println();
		
		
	}

}