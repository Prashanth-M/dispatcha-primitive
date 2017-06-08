package cadelac.lib.primitive.handler;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;
import cadelac.lib.primitive.concept.state.StateAware;

public interface AgentSubmit<M extends Message,S extends State> 
		extends StateAware<M,S> {
	
//	public String getStateId(final M msg_);
//	public S createState(final M msg_);
//  the-above is now in StateAware
	
	// submit
	public void perform(final M msg_, final S state_) throws Exception;
	public void executeSubmit(final M msg_) throws InterruptedException;
}
