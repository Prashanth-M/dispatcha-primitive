package cadelac.lib.primitive.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbBatchedExecution implements DbExecutable {

	public DbBatchedExecution(Connection connection_) throws SQLException  {
		_connection = connection_;
		_prep = connection_.prepareStatement(getQuery());		
	}
	
	@Override
	public void execute() throws SQLException {
	    _connection.setAutoCommit(false);
	    _prep.executeBatch();
	    _connection.setAutoCommit(true);
	}
	
	protected String getQuery() {
		return null;
	}
	
	public void bindParams(DbStatementParam params_) throws SQLException {
	}

	protected PreparedStatement getStatement() {
		return _prep;
	}
	
	private Connection _connection;
	private PreparedStatement _prep;
}
