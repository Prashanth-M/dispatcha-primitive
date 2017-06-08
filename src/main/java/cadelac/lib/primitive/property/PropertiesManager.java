package cadelac.lib.primitive.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import cadelac.lib.primitive.exception.ArgumentException;

public class PropertiesManager {

	/**
	 * Creates a PropertiesManager
	 * @param configFullPathName_ the full path name of the properties configuration file. It must be neither null nor an empty string.
	 * @throws InitializationException thrown when the configFullPathName_ is either (1) null, (2) an empty string, (3) properties configuration file does not exist, or (4) otherwise cannot be opened.
	 */
	public PropertiesManager(final String configFullPathName_) throws ArgumentException, IOException {
		if (configFullPathName_ == null || configFullPathName_.isEmpty())
			throw new ArgumentException("Full path of properties configuration file must not be null nor empty");

		final File configFile = new File(configFullPathName_);
		final FileInputStream fis = new FileInputStream(configFile);
		_properties = new Properties();
		_properties.load(fis);
	}
	
	public Properties getProperties() {
		return _properties;
	}
	
	private final Properties _properties;
}
