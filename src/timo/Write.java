package timo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.naming.NamingException;

import org.apache.axis.types.UnsignedInt;

import services.designer.pm.msg.de.SessionType;
import services.designer.pm.msg.de.TableRowListType;

public class Write {

	// for logging
	Logger logger = Logger.getLogger(Write.class.getName());
	FileHandler fh;

	private String[] columnNames;
	private String[][] rowValues;
	private String outputType;
	private String OutputFile; // only implemented for xml

	Write(String outputType, String OutputFile, String[] columnNames,
			String[][] rowValues) {
		this.columnNames = columnNames;
		this.rowValues = rowValues;
		this.outputType = outputType;
		this.OutputFile = OutputFile;
	}

	public void writeToOutput() {

		// init logger
		try {
			fh = new FileHandler("D:/TimoLogFile.log");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
		switch (outputType) {
		case "msg.PM":
			// make new modifytabledata bean
			WriteMsgPm modifyTableData = new WriteMsgPm();
			// make name and session
			modifyTableData.setName("test");
			SessionType session = new SessionType();
			session.setSessionID("SessionID");
			// beetje overbodig dit, maar blijkbaar moet token een unsigned int
			// zijn.
			UnsignedInt token = new UnsignedInt();
			token.setValue(5);
			session.setSessionToken(token);

			// maak het object voor de modifytable class
			TableRowListType tableRowListType = new TableRowListType();
			tableRowListType.setColumnNames(columnNames);
			tableRowListType.setRowValues(rowValues);

			// maak de call
			modifyTableData.addRows(tableRowListType);
			
			break;

		case "DBMS":
			try {
				WriteDatabase database = new WriteDatabase();
				database.setDatabaseName("DBMS");
				database.insertTable(columnNames, rowValues);
			} catch (SQLException | NamingException ex) {
				logger.log(Level.SEVERE, "Error {0}", ex);
				System.out.println(ex.getMessage());
			}
			break;

		case "XML":
			WriteXMLFile xlmwriter = new WriteXMLFile(OutputFile);
			xlmwriter.write(columnNames, rowValues);
			break;

		}
	}

}
