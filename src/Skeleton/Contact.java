package Skeleton;

import java.util.Comparator;

import letsGetThisWorking.Addressbook;

public class Contact {
//testttt
	private String firstName;
	private String lastName;
	private String streetAdress;
	private String email;
	private String phoneNumber;
	private String notes;
	private String zip;

	
	public Contact(String firstName, String lastName, String zip) 
    {
        
    }
    
    public String getFirstName() 
    {
    	return firstName;
    }
    public void setFirstName(String firstName) 
    {

    }
    //last name
    public String getLastName() 
    {
    	return lastName;
    }
    public void setLastName(String lastName) 
    {

    }
    public String getZip() 
    {
    return zip;
    }
    public void setZip(String zip) 
    {

    }
   
	public void setStreetAddress()
	{
		
	}
	public void setEmailAddress()
	{
		
	}
	public void setPhoneNumber()
	{
		
	}
	public void setNotes()
	{
		
	}

	//This returns a string representation of the objects.
	public String toString()
	{
		return firstName;
	}
	
	
	/*Comparator for sorting the list by Student Name
	public static Comparator<Contact> LastNameComparator = new Comparator<Contact>() 
		{
			public int compare(Contact ln1, Contact ln2) 
				{
					String LastName1 = ln1.getLastName().toLowerCase();
					String LastName2 = ln2.getLastName().toLowerCase();
		
					//ascending order
					return LastName1.compareTo(LastName2);
		
					//descending order
					//return LastName2.compareTo(LastName1);
				}
		};*/

}
