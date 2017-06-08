package cadelac.lib.primitive.exception;

import java.io.PrintWriter;
import java.io.StringWriter;


public class FrameworkException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7983559504539415L;

	public FrameworkException(final String text_)  {
		super(text_);
	}
	
	public String getStringStackTrace() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        printStackTrace(pw);
        pw.flush();
        sw.flush();
	    return sw.toString();
	}
	
	public static String getStringStackTrace(final Exception except_) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        except_.printStackTrace(pw);
        pw.flush();
        sw.flush();
	    return sw.toString();
	}
}
