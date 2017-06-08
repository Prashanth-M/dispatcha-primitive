package cadelac.lib.primitive.arg;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import cadelac.lib.primitive.exception.ArgumentException;

public class ArgSimple implements Arg {

	// 01234567810123
	// --KEY=VALUE
	public static final String PREFIX = "--";
	public static final String SEPARATOR = "=";
	public static final int PREFIX_LENGTH = PREFIX.length();
	public static final int SEPARATOR_LENGTH = SEPARATOR.length();
	
	public ArgSimple() {
		_arguments = new HashMap<String,String>();
	}
	
	@Override
	public String getArgument(final String argumentName_) {
		if (argumentName_ == null)
			return null;
		return _arguments.get(argumentName_);
	}

	@Override
	public void setArgument(final String argumentName_, final String argumentValue_) {
		if (argumentName_ != null)
			_arguments.put(argumentName_, argumentValue_);
	}

	@Override
	public void populate(final String[] arguments_) throws ArgumentException {
		if (arguments_ == null)
			throw new ArgumentException("cannot populate argument: argument is (invalid) null");
		
		for (String arg : arguments_) {
			int index = 0;
			if (arg.startsWith(PREFIX) && (index = arg.indexOf(SEPARATOR)) >= 0) {
				String key = arg.substring(PREFIX_LENGTH, index);
				String value = arg.substring(index+SEPARATOR_LENGTH);
				_arguments.put(key, value);
				logger.debug("added command-line argument: key [" + key + "], value [" + value + "]");
			}
		}			

	}

	private static final Logger logger = Logger.getLogger(Arg.class);
	
	private final Map<String,String> _arguments;
}
