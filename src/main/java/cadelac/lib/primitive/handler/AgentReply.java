package cadelac.lib.primitive.handler;

import java.util.concurrent.Future;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;
import cadelac.lib.primitive.concept.state.StateAware;
import cadelac.lib.primitive.invocation.Response;

public interface AgentReply<R,M extends Message,S extends State> 
		extends StateAware<M,S> {
	
//	public String getStateId(final M msg_);
//	public S createState(final M msg_);
//  the-above is now in StateAware
	
	// request-reply
	public R respond(final M msg_, final S state_) throws Exception;
	public Future<Response<R>> executeRequest(final M msg_) throws InterruptedException;
}
