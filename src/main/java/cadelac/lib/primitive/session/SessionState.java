package cadelac.lib.primitive.session;

import cadelac.lib.primitive.concept.state.StateSimple;

/**
 * This state represents a session.
 * @author cadelac
 *
 */
		
public class SessionState extends StateSimple {

	public SessionState(final String id_, final String userId_) {
		super(id_);
		_userId = userId_;
	}
	
	public String getUserId() {
		return _userId;
	}
	
	private final String _userId;

}
