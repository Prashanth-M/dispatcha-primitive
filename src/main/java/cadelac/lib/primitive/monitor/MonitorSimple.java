package cadelac.lib.primitive.monitor;

import java.util.concurrent.atomic.AtomicLong;

public class MonitorSimple implements Monitor {

	public MonitorSimple() {
		_jobId = new AtomicLong();
	}
	
	@Override
	public long getNextJobId() {
		return _jobId.getAndIncrement();
	}

	private final AtomicLong _jobId;
}
