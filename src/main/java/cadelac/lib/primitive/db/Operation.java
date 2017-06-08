package cadelac.lib.primitive.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cadelac.lib.primitive.concept.Message;

public interface Operation {
	public List<Message> execute(Connection connection_, Message params_) 
			throws SQLException, InstantiationException, IllegalAccessException;
}
