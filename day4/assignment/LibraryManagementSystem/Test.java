package com.coforge.day4.LibraryManagementSystem;

public class Test {
	public static void main(String[] args) {
		Library library = new Library();
		library.addBook(new Book(101,"Virat Autobiography"));
		library.addBook(new Book(102,"Sachin Autobiography"));
		
		library.searchBook("Virat Autobiography");
		
		Member charith = new Member(1, "Charith");
		library.issueBook(101, charith);
		
		Member sai = new Member(1, "Sai");
		library.issueBook(101, sai);
		
		library.returnBook(101);
		
		library.issueBook(101, sai);
	}
}