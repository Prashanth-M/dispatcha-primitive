package cadelac.lib.primitive.comm;

import java.io.IOException;

import cadelac.lib.primitive.concept.Identified;
import cadelac.lib.primitive.exception.FrameworkException;


public interface CommConnection extends Identified {	
	public void disconnect() throws FrameworkException, IOException;
	public boolean getIsConnected();
}
