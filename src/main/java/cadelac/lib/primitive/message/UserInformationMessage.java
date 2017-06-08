package cadelac.lib.primitive.message;


import java.util.Date;

import cadelac.lib.primitive.concept.Message;

/**
 * message used to contain user's personal information
 * @author cadelac
 *
 */
public interface UserInformationMessage extends Message {
	
	public int getUserId();
	public void setUserId(int userId);
	
	public String getFirstName();
	public void setFirstName(String firstName);

	public String getLastName();
	public void setLastName(String lastName);
	
	public String getMiddleInitial();
	public void setMiddleInitial(String middleInitial);
	
	public String getGender();
	public void setGender(String gender);
	
	public Date getBirthdate();
	public void setBirthdate(Date birthdate);
	
	public int getAge();
	public void setAge(int age);
	
	public String getMailingAddress();
	public void setMailingAddress(String mailingAddress);
	
	public String getEmailAddress();
	public void setEmailAddress(String emailAddress);
	
	// other personal information...
}
