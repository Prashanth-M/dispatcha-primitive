package cadelac.lib.primitive.comm;

import java.io.IOException;

import cadelac.lib.primitive.exception.FrameworkException;

public abstract class AbstractCommConnection implements CommConnection {

	public AbstractCommConnection(final String id_) {
		_id = id_;
		_isConnected = false;
	}
	
	@Override
	public String getId() {
		return _id;
	}
	
	@Override
	public abstract void disconnect() throws FrameworkException, IOException;


	@Override
	public boolean getIsConnected() {
		return _isConnected;
	}
	
	protected void setIsConnected(final boolean isConnected_) {
		_isConnected = isConnected_;
	}
	
	private final String _id;
	private /* not final */ boolean _isConnected;
}
