package com.itwill05.service.academy;
public class AcademyStaff extends AcademyMember {
	public String depart;//부서
	public AcademyStaff() {
	}
	//alt+shift+s --> o
	public AcademyStaff(int no,String name,String depart) {
		this.no=no;
		this.name=name;
		this.depart = depart;
	}
	
	public void staffPrint() {
		this.print();
		System.out.println(depart);
	}
	
	//alt+shift+s --> r
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
}