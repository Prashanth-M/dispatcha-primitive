package cadelac.lib.primitive.exception;

/**
 * This exception is thrown to indicate errors related to creation of states.
 * @author cadelac
 *
 */
public class StateException extends FrameworkException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1126012904519249022L;

	public StateException(final String text_)  {
		super(text_);
	}
}
