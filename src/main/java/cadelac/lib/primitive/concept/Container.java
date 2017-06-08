package cadelac.lib.primitive.concept;

import java.util.Collection;

import cadelac.lib.primitive.exception.ArgumentException;

/**
 * This interface indicates that the underlying object may contain Containable's.
 * @author cadelac
 *
 */
public interface Container extends Identified {
	public Containable getContainable(final String containableId_) throws ArgumentException;
	public void addContainable(final Containable containable_) throws ArgumentException;
	public Collection<Containable> getAllContainables();	
}
