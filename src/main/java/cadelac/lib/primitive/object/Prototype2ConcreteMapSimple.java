package cadelac.lib.primitive.object;

import java.util.HashMap;
import java.util.Map;

import cadelac.lib.primitive.concept.Message;

public class Prototype2ConcreteMapSimple implements Prototype2ConcreteMap {

	public Prototype2ConcreteMapSimple() {
		_map = new HashMap<Class<? extends Message>,Class<? extends Message>>();
	}
	
	@Override
	public Class<? extends Message> get(final Class<? extends Message> prototypeClass_) {
		return _map.get(prototypeClass_);
	}

	@Override
	public void put(final Class<? extends Message> prototypeClass_, final Class<? extends Message> concreteClass_) {
		_map.put(prototypeClass_, concreteClass_);
	}

	private final Map<Class<? extends Message>,Class<? extends Message>> _map;
}
