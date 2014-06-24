package timo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;
import javax.sql.DataSource;

public class WriteDatabase {
	
	
	private String databaseName;
	
    private Connection getConnection() throws SQLException, NamingException {
    	// deze class maakt de connectie met de database
        Context context = new InitialContext();
        DataSource dataSource = (DataSource) context.lookup(getDatabaseName());
        Connection connection = dataSource.getConnection();
        return connection;
    }

	
	public void insertTable(String[] columnNames, String[][] rowValues)
			throws NamingException, SQLException {
		// this function inserts into database
		// it responds dynamically on row and col length.
		
		
		// generate col names
		StringBuilder columns = new StringBuilder();
		for(String s : columnNames) {
			columns.append(s);
			columns.append(",");
		}
		columns.deleteCharAt(columns.length() - 1); // delete last ,
		
		// generete ?'s
		StringBuilder values = new StringBuilder();
		values.append("?");
		for(int idx = 0; idx < columnNames.length - 1;idx++) {
			values.append(",?");
		}

		// build sql
		String sql = "insert into Pm (" + columns +")"
				+ " values ("+values + ")";
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement(sql);
			for (int idx = 0; idx < rowValues[0].length; idx++) {
				//VALID_FROM (DATE)
				//VALID_TO (DATE)
				//OBJECT_TYPE (INTEGER)
				//CODE (STRING)
				// TODO: optionally set data to correct type
				// but I don't know what the database structure is like
				// maybe it expects strings aswell just like msg.pm
				
				//loop trough cols
				for(int colIdx = 1; colIdx < columnNames.length + 1;colIdx++){ // +1 because sql statement starts at 1
					preparedStatement.setString(colIdx, rowValues[idx][colIdx]);
					
				}
				preparedStatement.executeUpdate();
			}

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
