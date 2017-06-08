package cadelac.lib.primitive.job;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;

public class JobBase<M extends Message, S extends State> implements Job<M,S> {

	public JobBase(
			final M message_,
			final S state_,
			final long jobId_) {
		_message = message_;
		_state = state_;
		_jobId = jobId_;
	}


	@Override
	public M getMessage() {
		return _message;
	}

	@Override
	public S getState() {
		return _state;
	}

	@Override
	public long getJobId() {
		return _jobId;
	}
	
	private final M _message;
	private final S _state;
	private final long _jobId;
}
