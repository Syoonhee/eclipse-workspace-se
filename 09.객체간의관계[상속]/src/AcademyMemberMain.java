
public class AcademyMemberMain {

	public static void main(String[] args) {
		//AcademyMember m1 = new AcademyMember(0, "누구게");
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "HIM", "JAVA");
		AcademyStudent st3 = new AcademyStudent(3, "JIM", "DESIGN");

		AcademyGangsa gs1 = new AcademyGangsa(4, "LEE", "ANDROID"); 
		AcademyGangsa gs2 = new AcademyGangsa(5, "SIM", "IOS"); 

		AcademyStaff sf1 = new AcademyStaff(6, "WIM", "MARKETING"); 
		AcademyStaff sf2 = new AcademyStaff(7, "WIM", "ACCOUNTING"); 
		
		/*st1.print();
		st2.print();
		st3.print();
		gs1.print();
		gs2.print();
		sf1.print();
		sf1.print();
		*/
		
		//재정의 안함
		System.out.println("---------Student-----------");
		st1.studentPrint();
		st2.studentPrint();
		st3.studentPrint();

		System.out.println("-------Gangsa-------------");
		gs1.gangsaPrint();
		gs2.gangsaPrint();
		
		
		System.out.println("----------Staff-----------");
		sf1.staffPrint();
		sf2.staffPrint();
	}

}
