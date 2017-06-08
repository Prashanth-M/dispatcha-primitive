package cadelac.lib.primitive.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import cadelac.lib.primitive.concept.Message;

public class DbUpdate implements Operation {

	@Override
	public List<Message> execute(Connection connection_, Message params_) throws SQLException {
		PreparedStatement ps = connection_.prepareStatement(getQuery());
		setParams(ps, params_);		
	    connection_.setAutoCommit(false);
	    ps.executeBatch();
	    connection_.setAutoCommit(true);
		return null;
	}
	
	protected String getQuery() {
		return null;
	}
	
	protected void setParams(PreparedStatement ps_, Message params_) throws SQLException {
	}
}
