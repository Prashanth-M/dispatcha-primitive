package cadelac.lib.primitive;

/**
 * An element with a key.
 * @author cadelac
 *
 */
public interface KeyedElement<K,E> {
	public K getKey(E element);

}
