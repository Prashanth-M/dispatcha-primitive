package cadelac.lib.primitive.handler;

import cadelac.lib.primitive.concept.Message;

public interface Activation<M extends Message> {
	public M getMessage();
	public long getJobId();
}
