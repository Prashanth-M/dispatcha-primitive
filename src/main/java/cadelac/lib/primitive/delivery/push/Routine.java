package cadelac.lib.primitive.delivery.push;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;

public interface Routine<M extends Message,S extends State> {
	public void routine(M msg_, S state_) throws Exception;
}
