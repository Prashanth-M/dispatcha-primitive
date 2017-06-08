package cadelac.lib.primitive.message;

import cadelac.lib.primitive.concept.Message;

public interface AuthenticationResponseMessage extends Message {
	public boolean getAuthenticationResult();
	public void setAuthenticationResult(boolean authenticationResult);
}
