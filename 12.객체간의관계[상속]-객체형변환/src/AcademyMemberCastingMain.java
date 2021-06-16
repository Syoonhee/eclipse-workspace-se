
public class AcademyMemberCastingMain {

	public static void main(String[] args) {
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent(2, "KANG", "OFFICE");
		AcademyMember m3 = new AcademyStudent(3, "GANG", "JAVA");
		
		AcademyMember m4 = new AcademyGangsa(4, "SIM", "ARDUINO");
		AcademyMember m5 = new AcademyGangsa(5, "HIM", "DESIGN");
		
		AcademyMember m6 = new AcademyStudent(6, "KUM", "영업부");
		AcademyMember m7 = new AcademyStudent(7, "JUNG", "총무부");
	}

}
