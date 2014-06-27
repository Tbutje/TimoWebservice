package timo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * This class writes to a database. Unfortunately there is no database so it's
 * hard to really test this function. But I did base the function on a previous
 * database function I used so I am fairly confident it works. The insertion is
 * now all of type string and in one table. In a real database the types would
 * probably be different, and maybe some columns would be placed in other tables
 * due to normalization.
 * 
 * @author Timo Koole
 */
public class WriteDatabase {

	private String databaseName = null;

	private Connection getConnection() throws SQLException, NamingException {
		// This class makes the database connection
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context
					.lookup(getDatabaseName());
			Connection connection = dataSource.getConnection();
			return connection;
		} catch (Exception ex) {
			// ex.printStackTrace();
			throw new NamingException("Cant connect to database");
		}

	}

	public void insertTable(String[] columnNames, String[][] rowValues)
			throws NamingException, SQLException {
		// this function inserts into database
		// it responds dynamically on row and col length.
		if (databaseName == null) {
			throw new NamingException("Need a database name");
		}

		// generate col names for query
		StringBuilder columns = new StringBuilder();
		for (String s : columnNames) {
			columns.append(s);
			columns.append(",");
		}
		columns.deleteCharAt(columns.length() - 1); // delete last ,

		// generete ?'s
		StringBuilder values = new StringBuilder();
		values.append("?");
		for (int idx = 0; idx < columnNames.length - 1; idx++) {
			values.append(",?");
		}

		// build sql statement
		String sql = "insert into Pm (" + columns + ")" + " values (" + values
				+ ")";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement(sql);

			for (int idx = 0; idx < rowValues[0].length; idx++) {
				// VALID_FROM (DATE)
				// VALID_TO (DATE)
				// OBJECT_TYPE (INTEGER)
				// CODE (STRING)
				// optionally set data to correct type
				// but I don't know what the database structure is like
				// maybe it expects strings aswell, just like msg.pm

				// loop trough cols
				// +1 because sql statement starts at 1
				for (int colIdx = 1; colIdx < columnNames.length + 1; colIdx++) {
					preparedStatement.setString(colIdx, rowValues[idx][colIdx]);

				}
				preparedStatement.executeUpdate();
			}
		} catch (SQLException ex) {
			throw new SQLException("Cant connect to database");
		} catch (NamingException ex2) {
			throw new NamingException("Cant connect to database");
		} finally {
			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

}
