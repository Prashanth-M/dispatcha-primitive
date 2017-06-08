package cadelac.lib.primitive.invocation;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.exception.ArgumentException;
import cadelac.lib.primitive.exception.StateException;
import cadelac.lib.primitive.exception.SystemException;

public interface UnderstandsSend<M extends Message> {
	public void send(final M message_) throws ArgumentException, StateException, SystemException, Exception;
	public void delayedCall(final M message_, final long delay_) throws ArgumentException, StateException, SystemException, Exception;
	public void recurringCall(final M message_, final long delay_, final long period_) throws ArgumentException, StateException, SystemException, Exception;
}
