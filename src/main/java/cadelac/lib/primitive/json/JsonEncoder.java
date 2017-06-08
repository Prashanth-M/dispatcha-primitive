package cadelac.lib.primitive.json;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.websocket.EncodeException;

import org.apache.log4j.Logger;

import cadelac.lib.primitive.concept.Message;

public class JsonEncoder {
	
	public static String encode(final Message message_) throws EncodeException {
		final JsonObjectBuilder jbuilder = Json.createObjectBuilder();
		message_.marshall(jbuilder);
		final String encodedString = jbuilder.build().toString();
		logger.info(String.format("encoded %s: [%s]", 
				message_.getClass().getSimpleName(), encodedString));
		return encodedString;
	}
	
	private static final Logger logger = Logger.getLogger(JsonEncoder.class);
}
