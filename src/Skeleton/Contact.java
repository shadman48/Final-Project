/**
 * Defines a reusable class Contact. One object of class Contact stores the first name, last name, street address, email, phone number, notes, zip
 */

package Skeleton;

import java.util.Comparator;

public class Contact {

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

}
