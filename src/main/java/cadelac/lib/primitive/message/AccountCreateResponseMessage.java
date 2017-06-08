package cadelac.lib.primitive.message;

import cadelac.lib.primitive.concept.Message;

public interface AccountCreateResponseMessage extends Message {

	public String getAccountId();
	public void setAccountId(String accountId);
	
	public AccountCreateMessage getAccountCreateMessage();
	public void setAccountCreateMessage(AccountCreateMessage accountCreateMessage);
}
