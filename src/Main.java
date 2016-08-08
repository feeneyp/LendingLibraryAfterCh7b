//version 7b
public class Main {
	
	public static void main(String[] args) {
		String fullName = "Donald Duck";	
		getFirstName(fullName);
		getSurname(fullName);
		System.out.println("This was programmed in a modular way!");
	}
	
	public static void getFirstName(String fullName) {
		int spacePosition = fullName.indexOf(" ");
		String firstName = fullName.substring(0,spacePosition);
		System.out.println("First Name: " + firstName);		
	}
	
	public static void getSurname(String fullName) {
		int spacePosition = fullName.indexOf(" ");
		String surName = fullName.substring(spacePosition+1);
		System.out.println("Surname: " + surName);
	}
}		
	

//version a is all in one block
//version b has functions
//version c has functions that use return
//version d has main class and nameManager class