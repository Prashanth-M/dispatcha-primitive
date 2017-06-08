package cadelac.lib.primitive.handler;

import cadelac.lib.primitive.concept.Message;

/**
 * A channel that can send a submit request.
 * @author cadelac
 *
 */
public interface ChannelCanSubmit<M extends Message> {
	public void submit(final M msg_) throws Exception;
}
