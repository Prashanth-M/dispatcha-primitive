package cadelac.lib.primitive.delivery.pull;

import cadelac.lib.primitive.concept.Identified;
import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;
import cadelac.lib.primitive.concept.state.StateAware;
import cadelac.lib.primitive.concept.state.StateCreator;
import cadelac.lib.primitive.concept.state.StateIdMapper;

public interface Pull<R,M extends Message,S extends State> 
	extends Identified, StateAware<M,S>
{
	Calculation<R,M,S> getCalculation();
	StateIdMapper<M> getStateIdMapper();
	StateCreator<M,S> getStateCreator();
}
