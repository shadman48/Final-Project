/**
 * one object of this class creates an array.
 */
package Skeleton;

public class Runner {

	public static void main(String[] args) {

		AddressBook addressbook = new AddressBook();

		addressbook.addContact();
		addressbook.printAddressBook();
		addressbook.addContact();
		addressbook.printAddressBook();
		addressbook.addContact();
		addressbook.printAddressBook();

	}

	/*Do we need to pull out the code we already have added when we submit the skeleton? 
	 * 
	 * 
	 * Add console reading 
	 * Add sort method and search method 
	 * Add search for email
	 * 
	 * 
	 * We need to go over the comments for each class 
	 * 
	 */
}
