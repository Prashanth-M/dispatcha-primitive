package cadelac.lib.primitive.plug;

public class PlugBase implements Plug {

	public PlugBase(final String id_) {
		_id = id_;
	}

	@Override
	public String getId() {
		return _id;
	}

	private final String _id;
}
