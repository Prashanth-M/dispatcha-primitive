package cadelac.lib.primitive.message;

import cadelac.lib.primitive.concept.Message;

public interface AuthenticationMessage extends Message {
	
	public String getAccountName();
	public void setAccountName(String accountName);
	
	public String getPassword();
	public void setPassword(String password);
}
