package cadelac.lib.primitive.util;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

	public static String getDateString() {
		return getDateString(new Date());
	}
	
	public static String getDateString(final Date date_) {
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date_);
	}
	
	
	public static void writeFile(final File file_, final String text_) 
			throws IOException {
		final FileWriter w = new FileWriter(file_);
		w.write(text_);
		w.close();
	}
	
	public static String readFile(final String filePath_) throws IOException {
		final FileIntoString inj = new FileIntoString();
		return inj.readFile(filePath_);
	}
}
