package cadelac.lib.primitive.object;

import cadelac.lib.primitive.concept.Message;

/**
 * This interface is used to map a prototype (interface) to its associated concrete class.
 * @author cadelac
 *
 */
public interface Prototype2ConcreteMap {
	public Class<? extends Message> get(final Class<? extends Message> prototypeClass_);
	public void put(final Class<? extends Message> prototypeClass_, final Class<? extends Message> concreteClass_);
}
