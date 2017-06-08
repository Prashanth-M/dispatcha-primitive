package cadelac.lib.primitive.concept.state;

import cadelac.lib.primitive.concept.Message;

@FunctionalInterface
public interface StateCreator<M extends Message, S extends State> {
	public S createState(final M message_) throws Exception;
}
