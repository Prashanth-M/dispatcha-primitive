package cadelac.lib.primitive.concept.state;

public class StateLess extends StateSimple {

	public static final String    STATELESS_STATE_ID = "STATELESS";
	public static final StateLess STATELESS_STATE = new StateLess(STATELESS_STATE_ID);

	
	public StateLess(final String id_) {
		super(id_);
	}
}
