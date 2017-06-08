package cadelac.lib.primitive.concept;

/**
 * This interface allows the underlying object may be connected to another.
 * @author cadelac
 *
 */
public interface Connectable {
	public boolean isConnected();
	public void connectTo(Connectable connectable_);
	public void disconnect();
}
