package cadelac.lib.primitive.job;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;

public interface Job<M extends Message, S extends State> {
	public M getMessage();
	public S getState();
	public long getJobId();
}
