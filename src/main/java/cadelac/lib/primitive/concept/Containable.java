package cadelac.lib.primitive.concept;

import cadelac.lib.primitive.exception.ArgumentException;

/**
 * This interface indicates that the underlying object is contained within another container.
 * Used to contain handlers within packs and packs within other packs.
 * This is not used by plugs because plugs return specific types of handlers.
 * 
 * @author cadelac
 *
 */
public interface Containable extends Identified {
	public Container getContainer();
	public void setContainer(final Container container_) throws ArgumentException;
}
