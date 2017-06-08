package cadelac.lib.primitive.handler;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.invocation.Response;

/**
 * A channel that can send a request-reply.
 * @author cadelac
 *
 * @param <R>
 * @param <M>
 */
public interface ChannelCanReply<R,M extends Message> {
	public Response<R> requestReply(final M msg_) throws Exception;
}
