package cadelac.lib.primitive.invocation;


import java.util.concurrent.Future;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.exception.ArgumentException;
import cadelac.lib.primitive.exception.StateException;
import cadelac.lib.primitive.exception.SystemException;

public interface UnderstandsRequest<R, M extends Message> {
	public Future<Response<R>> request(final M message_) throws ArgumentException, StateException, SystemException, Exception;
	public Future<Response<R>> request(final M message_, long timeOut_) throws ArgumentException, StateException, SystemException, Exception;
}
