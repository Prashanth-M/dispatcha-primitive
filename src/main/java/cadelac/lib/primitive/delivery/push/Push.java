package cadelac.lib.primitive.delivery.push;

import cadelac.lib.primitive.concept.Identified;
import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;
import cadelac.lib.primitive.concept.state.StateAware;

// analogous to Agent: cadelac.framework.blade.core.container.handler.h2.AgentSubmit

public interface Push<M extends Message,S extends State> 
		extends Identified, StateAware<M,S> {
	Routine<M,S> getRoutine();
	void setRoutine(Routine<M,S> routine);
}
