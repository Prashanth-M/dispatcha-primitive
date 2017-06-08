package cadelac.lib.primitive.concept.state;

import cadelac.lib.primitive.exception.ArgumentException;
import cadelac.lib.primitive.exception.InitializationException;

public interface Installable {
	public void install() throws ArgumentException, InitializationException;
}
