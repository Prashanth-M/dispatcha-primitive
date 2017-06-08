package cadelac.lib.primitive.concept;

public class IdentifiedBase implements Identified {

	public IdentifiedBase(final String id_) {
		_id = id_;
	}
	
	@Override
	public String getId() {
		return _id;
	}

	private final String _id;
}
