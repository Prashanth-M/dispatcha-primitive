package cadelac.lib.primitive.message;

public interface AccountInformationMessage extends AuthenticationMessage {
	
	public int getAccountId();
	public void setAccountId(int accountId);
	
	public int getUserId();
	public void setUserId(int userId);
	
	public int getAccountRoleId();
	public void setAccountRoleId(int accountRoleId);
}
