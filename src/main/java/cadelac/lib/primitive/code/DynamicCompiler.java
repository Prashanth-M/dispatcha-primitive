package cadelac.lib.primitive.code;

import java.io.File;

public interface DynamicCompiler {
	public int compile(final File sourceFile_);
	public File getSourceDir();
	public File getClassDir();
}
