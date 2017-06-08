package cadelac.lib.primitive.concept.state;

import org.apache.log4j.Logger;

import cadelac.lib.primitive.exception.ArgumentException;
import cadelac.lib.primitive.exception.InitializationException;

public abstract class StateSimple implements State {
	
	public StateSimple(final String id_) {
		_id = id_;
		logger.info("created state [" + id_ + "]");
	}
	
	@Override
	public String getId() {
		return _id;
	}

	@Override
	public void install() throws ArgumentException, InitializationException {
		StateManager.installState(this);
	}
	
	private final String _id;
	
	private static final Logger logger = Logger.getLogger(State.class);

}
