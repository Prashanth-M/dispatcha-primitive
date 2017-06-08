package cadelac.lib.primitive.message;

import cadelac.lib.primitive.concept.Message;

public interface AccountCreateMessage extends Message {
	public AuthenticationMessage getAuthenticationMessage();
	public void setAuthenticationMessage(AuthenticationMessage authenticationMessage);
	
	public UserInformationMessage getUserInformationMessage();
	public void setUserInformationMessage(UserInformationMessage userInformationMessage);
}
