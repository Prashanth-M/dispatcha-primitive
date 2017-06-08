package cadelac.lib.primitive.object;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.exception.FrameworkException;

public interface ObjectFactory {
	/**
	 * Creates a new instance of a class. Throws exceptions.
	 * @param type_
	 * @return
	 * @throws Exception 
	 * @throws FrameworkException 
	 */
	public <T extends Message> T fabricate(Class<T> type_) throws FrameworkException, Exception;
	
	
	/**
	 * Creates a new instance of a class. Throws exceptions. Provides an object populator.
	 * @param type_
	 * @return
	 * @throws Exception 
	 * @throws FrameworkException 
	 */
	public <T extends Message> T fabricate(Class<T> type_, ObjectPopulator<T> objectPopulator_) throws Exception;
}
