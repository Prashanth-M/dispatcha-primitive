package cadelac.lib.primitive.arg;

import cadelac.lib.primitive.exception.ArgumentException;

public interface Arg {
	public String getArgument(final String argumentName_);
	public void setArgument(final String argumentName_, final String argumentValue_);
	public void populate(final String[] arguments_) throws ArgumentException;
}
