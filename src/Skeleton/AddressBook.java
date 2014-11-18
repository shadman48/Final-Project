/**
 * Defines a reusable class AddressBook. One object of class AdressBook sorts the array.
 */

package Skeleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import letsGetThisWorking.Addressbook;

public class AddressBook {
	
	//creating the constructor.
	public AddressBook(int addressbooklength)
	{
	
	}
	
	/*
	 * This method searches the array.
	 * needs to be a return type 
	 */
	public void searchBy(String searchby)
	{
		
	}
	/*
	 * this method sorts the array
	 */
	public void sortBy(String sortby)
	{
				/*Comparator for sorting the list by Student Name*/
				Comparator<Addressbook> LastNameComparator = new Comparator<Addressbook>() 
					{
						public int compare(Addressbook ln1, Addressbook ln2) 
							{
								String LastName1 = ln1.getLastName().toLowerCase();
								String LastName2 = ln2.getLastName().toLowerCase();
					
								//ascending order
								return LastName1.compareTo(LastName2);
								//descending order
								//return LastName2.compareTo(LastName1);
							}
					};
	}
	
	
	

}
