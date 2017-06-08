package cadelac.lib.primitive.concept.state;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.exception.ArgumentException;
import cadelac.lib.primitive.exception.InitializationException;
import cadelac.lib.primitive.exception.StateException;

public class StateManager {
	
	static {
		_states = new ConcurrentHashMap<String,State>();
	}
	
	@SuppressWarnings("unchecked")
	public static <M extends Message, S extends State>
	S acquireState(final StateAware<M,S> agent_, final M message_, final String stateId_) 
			throws ArgumentException , StateException , Exception {
		if (agent_==null)
			throw new ArgumentException("agent must not be null");
		if (stateId_ == null)
			throw new ArgumentException("state id must not be null");
		if (message_==null)
			throw new ArgumentException("message must not be null");

		S state = (S) _states.get(stateId_);
		if (state != null) {
			// found it, exit immediately
			return state;
		}

		if (stateId_==StateLess.STATELESS_STATE_ID)
			// state is StateLess
			state = (S) StateLess.STATELESS_STATE;
		else
			// state does not exist, create a new state
			state = (S) agent_.createState(message_);
		
		// state is not allowed to be null.
		if (state == null)
			throw new StateException("unable to create state [" + stateId_ + "]");
		
		//  install newly-created state
		_states.put(state.getId(), state);
		return state;
	}

	/*
	@SuppressWarnings("unchecked")
	public static <M extends Message, S extends State>
	S acquireState(final AgentSubmit<M,S> agent_, final M message_, final String stateId_) 
			throws ArgumentException , StateException , Exception {
		if (agent_==null)
			throw new ArgumentException("agent must not be null");
		if (stateId_ == null)
			throw new ArgumentException("state id must not be null");
		if (message_==null)
			throw new ArgumentException("message must not be null");

		S state = (S) _states.get(stateId_);
		if (state != null) {
			// found it, exit immediately
			return state;
		}

		if (stateId_==StateLess.STATELESS_STATE_ID)
			// state is StateLess
			state = (S) StateLess.STATELESS_STATE;
		else
			// state does not exist, create a new state
			state = (S) agent_.createState(message_);
		
		// state is not allowed to be null.
		if (state == null)
			throw new StateException("unable to create state [" + stateId_ + "]");
		
		//  install newly-created state
		_states.put(state.getId(), state);
		return state;
	}
	*/
	

	@SuppressWarnings("unchecked")
	public static <S extends State> 
	S getState(final String stateId_) 
			throws ArgumentException, InitializationException {
		if (stateId_ == null)
			throw new ArgumentException("state id not be null");
		if (_states == null)
			throw new InitializationException("Collection of states is not initialized");
		return (S) _states.get(stateId_);
	}
	
	public static <S extends State>
	void installState(final S state_) 
			throws ArgumentException, InitializationException {
		if (state_ == null)
			throw new ArgumentException("state must not be null");
		if (_states == null)
			throw new InitializationException("Collection of states is not initialized");
		_states.put(state_.getId(), state_);
		logger.debug("installed state [" + state_.getId() + "]");
	}
	
	private static final Logger logger = Logger.getLogger(StateManager.class);
	
	private static Map<String,State> _states;
}
