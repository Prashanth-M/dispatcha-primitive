package cadelac.lib.primitive.object;

@FunctionalInterface
public interface ObjectPopulator<T> {
	public void populate(T object_) throws Exception;
}
