package cadelac.lib.primitive.concept;

import java.sql.ResultSet;

import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import cadelac.lib.primitive.exception.FrameworkException;

/**
 * The framework is message based. A message is passed between handlers.
 * @author cadelac
 *
 */
public interface Message {
	public void marshall(final JsonObjectBuilder jbuilder);
	public void demarshall(final JsonObject jo_) throws FrameworkException, Exception;
	public void demarshall(final ResultSet resultSet_) throws Exception;
}
