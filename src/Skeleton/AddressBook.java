/**
 * Defines a reusable class AddressBook. One object of class AdressBook sorts the array.
 */

package Skeleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import letsGetThisWorking.Addressbook;

public class AddressBook {

	private ArrayList<Contact> con;

	// creating the constructor.
	public AddressBook() {
		con = new ArrayList<Contact>();
	}

	/*
	 * This method adds a contact to the arraylist,
	 */
	public void addContact() {
		String firstName;
		String lastName;
		String streetAddress;
		String zip;
		String email;
		String phoneNumber;
		String notes;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input your first name: ");
		firstName = scanner.nextLine();
		System.out.println("Please input your last name: ");
		lastName = scanner.nextLine();
		System.out.println("Please input your StreetAddress: ");
		streetAddress = scanner.nextLine();
		System.out.println("Please input your zip: ");
		zip = scanner.nextLine();
		System.out.println("Please input your Email: ");
		email = scanner.nextLine();
		System.out.println("Please input your Phone Number: ");
		phoneNumber = scanner.nextLine();
		System.out.println("Please input any notes you would like to add: ");
		notes = scanner.nextLine();

		Contact friend = new Contact(firstName, lastName, streetAddress, zip, email, phoneNumber, notes);
		con.add(friend);
	}

	/*
	 * this method prints AddressBook(arraylist)
	 */
	public void printAddressBook() {
		for (int i = 0; i < con.size(); i++) {
			Contact temp = con.get(i);
			System.out.print(i + "\t    $ ");
			System.out.println(temp.getFirstName() + "\t   " + temp.getLastName() + "\t   " + temp.getStreetAddress() + "\t   " + temp.getZip() + "\t   " + temp.getEmailAddress() + " \t" + temp.getPhoneNumber() + " \t" + temp.getNotes());
		}
	}

	/*
	 * This method searches the array. needs to be a return type
	 */
	public void searchBy(String searchby) {

	}

	/*
	 * this method sorts the array
	 */
	public void sortBy(String sortby) {
		/* Comparator for sorting the list by Student Name */
		Comparator<Addressbook> LastNameComparator = new Comparator<Addressbook>() {
			public int compare(Addressbook ln1, Addressbook ln2) {
				String LastName1 = ln1.getLastName().toLowerCase();
				String LastName2 = ln2.getLastName().toLowerCase();

				// ascending order
				return LastName1.compareTo(LastName2);
				// descending order
				// return LastName2.compareTo(LastName1);
			}
		};
	}

}
