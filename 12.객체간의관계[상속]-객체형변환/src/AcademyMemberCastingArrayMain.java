
public class AcademyMemberCastingArrayMain {

	public static void main(String[] args) {

		AcademyMember [] members = new AcademyMember[7];
		
		members[0] = new AcademyStudent(1, "KIM", "LINUX");
		members[1] = new AcademyStudent(2, "KANG", "OFFICE");
		members[2] = new AcademyStudent(3, "GANG", "JAVA");
		members[3] = new AcademyGangsa(4, "SIM", "ARDUINO");
		members[4] = new AcademyGangsa(5, "HIM", "DESIGN");
		members[5] = new AcademyStaff(6, "KUM", "영업부");
		members[6] = new AcademyStaff(7, "JUNG", "총무부");
		/*
		AcademyMember[] members= {
				new AcademyStudent(1, "KIM", "ARDUINO"),
				new AcademyStudent(2, "JIM", "ANDROID"),
				new AcademyStudent(3, "LIM", "IOS"),
				new AcademyGangsa(4, "김강사", "웹디자인"),
				new AcademyGangsa(5,"정강사","오피스"),
				new AcademyStaff(6, "HONG", "총무부"),
				new AcademyStaff(7, "SIM", "홍보부")
		};
		*/
		
		System.out.println("----------AcademyMember 전체출력-----------");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
	
	}

}
