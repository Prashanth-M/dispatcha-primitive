package cadelac.lib.primitive.delivery.push;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;

public abstract class PushBase<M extends Message,S extends State> 
	implements Push<M,S> {

	public PushBase(final String id_, final Routine<M,S> routine_) {
		_id = id_;
		setRoutine(routine_);
	}
	
	@Override
	public String getId() {
		return _id;
	}

	@Override
	public Routine<M,S> getRoutine() {
		return _routine;
	}
	
	@Override
	public void setRoutine(final Routine<M,S> routine_) {
		_routine = routine_;
	}
	
	private Routine<M,S> _routine;	
	private String _id;
}
