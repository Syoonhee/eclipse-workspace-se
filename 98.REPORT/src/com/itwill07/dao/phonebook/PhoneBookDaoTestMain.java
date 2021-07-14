package com.itwill07.dao.phonebook;

public class PhoneBookDaoTestMain {
	public static void main(String[] args) throws Exception {
	PhoneBookDao phonebook = new PhoneBookDao();
	System.out.println(">> delete");
	phonebook.deleteByNo(10);
	System.out.println(">> selectByNo");
	phonebook.selectByNo(11);
	System.out.println(">> selectAll");
	phonebook.selectAll();
	System.out.println(">>update");
	PhoneBook updatePhonebook = new PhoneBook(14,"김영희","467-8973");
	phonebook.update(updatePhonebook);
	System.out.println(">> insert");
	PhoneBook insertPhonebook = new PhoneBook(12, "김철수", "123-5467");
	phonebook.insert(insertPhonebook);
	
	
	
	}
}
