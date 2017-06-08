package cadelac.lib.primitive;

public enum Side {
	
	BUY("BUY"),
	SELL("SELL"),
	SELL_SHORT("SSHORT");
	
	Side(final String text_) {
		this._text = text_;
	}

	public String getText() {
		return _text;
	}
	
	private String _text;

}
