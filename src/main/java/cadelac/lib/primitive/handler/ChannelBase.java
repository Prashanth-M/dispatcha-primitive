package cadelac.lib.primitive.handler;

public class ChannelBase implements Channel {

	public ChannelBase(final String id_) {
		_id =  id_;
	}
	
	@Override
	public String getId() {
		return _id;
	}

	private final String _id;
}
