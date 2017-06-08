package cadelac.lib.primitive.handler;

import cadelac.lib.primitive.concept.Message;
import cadelac.lib.primitive.concept.state.State;

public interface ActivationSubmit<M extends Message,S extends State> extends Runnable {
}
