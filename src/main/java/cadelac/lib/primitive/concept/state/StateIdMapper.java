package cadelac.lib.primitive.concept.state;

import cadelac.lib.primitive.concept.Message;

@FunctionalInterface
public interface StateIdMapper<M extends Message> {
	public String getStateId(final M message);
}
