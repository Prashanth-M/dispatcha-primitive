package cadelac.lib.primitive.json;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonException;

import org.apache.log4j.Logger;

import cadelac.lib.primitive.exception.FrameworkException;

public class JsonDecoder {

	public static boolean willDecode(String message_) {
		try {
			Json.createReader(new StringReader(message_)).readObject();
			return true;
		}
		catch (JsonException e_) {
			logger.error("Exception: " + e_.getMessage() + "\nStacktrace:\n" + FrameworkException.getStringStackTrace(e_));
			return false;	
		}		
	}

//	public String getStringField(final JsonObject jo_, final String field_, final boolean allowNull_) 
//			throws JsonMessageException {
//		if (jo_.isNull(field_)) {
//			logger.warn(String.format("Json field [%s] is null", field_));
//			if (!allowNull_)
//				throw new JsonMessageException(String.format("Json field [%s] must not be null", field_));
//			return null;
//		}
//		return jo_.getString(field_);
//	}	
	private static final Logger logger = Logger.getLogger(JsonDecoder.class);
}
