package cadelac.lib.primitive.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIntoString {

	public FileIntoString() {
		_accums = new StringBuilder();
	}

	
	public String getString() {
		return _accums.toString();
	}
	
	public String readFile(final String path_) throws IOException {
		final FileIntoString inj = this;
		Files.lines(
				Paths.get(path_)
				, StandardCharsets.UTF_8)
		.forEach(
				p -> {
					inj.append(p);
				}
		);
		return inj.getString();
	}
	
	
	private void append(final String line_) {
		_accums.append(line_).append("\n");
	}
	
	private final StringBuilder _accums;
}
