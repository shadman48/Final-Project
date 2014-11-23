/**
 * Defines a reusable class Contact. One object of class Contact stores the first name, last name, street address, email, phone number, notes, zip
 */

package Skeleton;

import java.util.Comparator;

public class Contact {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String zip;
	private String email;
	private String phoneNumber;
	private String notes;

	public Contact(String firstName, String lastName, String streetAddress, String zip, String email, String phoneNumber, String notes) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.zip = zip;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.notes = notes;

	}

	/*
	 * returns a string called first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/*
	 * sets first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * returns a string called last name
	 */
	public String getLastName() {
		return lastName;
	}

	/*
	 * sets last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * returns a string called streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/*
	 * sets streetAddress
	 */
	public void setStreetAddress() {

	}

	/*
	 * returns a string called zip
	 */
	public String getZip() {
		return zip;
	}

	/*
	 * sets zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/*
	 * returns a string called email
	 */
	public String getEmailAddress() {
		return email;
	}

	/*
	 * sets emailAddress
	 */
	public void setEmailAddress() {

	}

	/*
	 * returns a string called phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/*
	 * sets phone Number
	 */
	public void setPhoneNumber() {

	}

	/*
	 * returns a string called notes
	 */
	public String getNotes() {
		return notes;
	}

	/*
	 * sets notes
	 */
	public void setNotes() {

	}

	/*
	 * This returns a string representation of the objects.
	 */
	public String toString() {
		return firstName;
	}

}
