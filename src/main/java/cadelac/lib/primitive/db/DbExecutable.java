package cadelac.lib.primitive.db;

import java.sql.SQLException;

/**
 * This interface indicates an executable database statement that does not return results.
 * @author cadelac
 *
 */
public interface DbExecutable {
	public void execute() throws SQLException;
}
