package cadelac.lib.primitive.util;

public class TupleBase<X,Y> implements Tuple<X,Y>{

	public TupleBase(final X x_, final Y y_) {
		_x = x_;
		_y = y_;
	}

	@Override
	public X getFirst() {
		return _x;
	}

	@Override
	public Y getSecond() {
		return _y;
	}

	private X _x;
	private Y _y;
}
