package cadelac.lib.primitive.handler;

import java.util.concurrent.Callable;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;
import cadelac.lib.primitive.invocation.Response;

public interface ActivationReply<R,M extends Message,S extends State> 
	extends Activation<M>, Callable<Response<R>> {
}
