package cadelac.lib.primitive.delivery.pull;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;

public interface Calculation<R,M extends Message,S extends State> {
	public R calculate(M msg_, S state_) throws Exception;
}
