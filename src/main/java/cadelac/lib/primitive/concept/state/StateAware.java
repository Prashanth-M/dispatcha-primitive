package cadelac.lib.primitive.concept.state;

import cadelac.lib.primitive.concept.Message;

public interface StateAware<M extends Message, S extends State> 
	extends StateIdMapper<M>, StateCreator<M,S> {
}
