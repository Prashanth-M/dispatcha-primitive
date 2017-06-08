package cadelac.lib.primitive.session;

import java.util.HashMap;
import java.util.Map;

import cadelac.lib.primitive.concept.state.StateSimple;

/**
 * This state maintains a collection of states.
 * @author cadelac
 *
 */
public class SessionTableState extends StateSimple {

	public static final String STATE_ID = "sessionTableState";
	
	public SessionTableState(final String id_) {
		super(id_);
		_sessionTableByUserId = new HashMap<String,SessionState>();
		_sessionTableBySessionId = new HashMap<String,SessionState>();
	}

	public Map<String,SessionState> getSessionTableByUserId() {
		return _sessionTableByUserId;
	}
	
	public Map<String,SessionState> getSessionTableBySessionId() {
		return _sessionTableBySessionId;
	}
	
	private final Map<String,SessionState> _sessionTableByUserId;
	private final Map<String,SessionState> _sessionTableBySessionId;
}
