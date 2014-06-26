package timo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.naming.NamingException;

import org.apache.axis.types.UnsignedInt;
import org.apache.axis.AxisFault;

import services.designer.pm.msg.de.SessionType;
import services.designer.pm.msg.de.TableRowListType;

public class Write {

	private String[] columnNames;
	private String[][] rowValues;
	private String outputType;
	private String OutputFile; // only implemented for xml

	Write(String outputType, String OutputFile, String[] columnNames,
			String[][] rowValues) {
		this.outputType = outputType;
		this.OutputFile = OutputFile;
		this.columnNames = columnNames;
		this.rowValues = rowValues;
		
	}

	public void writeToOutput() throws Exception, java.rmi.RemoteException,
			SQLException, NamingException {

		if (outputType.equals("msg.PM")) {
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
			try {
				modifyTableData.addRows(tableRowListType);
			} catch (java.rmi.RemoteException ex) {
				throw new java.rmi.RemoteException(ex.getMessage());
			}

		}else if(outputType.equalsIgnoreCase("DBMS")){
			try {
				WriteDatabase database = new WriteDatabase();
				database.setDatabaseName("DBMS");
				database.insertTable(columnNames, rowValues);
				System.out.println("written to db");
			} catch (SQLException | NamingException ex) {
				// logger.log(Level.SEVERE, "Error {0}", ex);
				throw new Exception(ex.getMessage());
			}
		}else if(outputType.equalsIgnoreCase("XML")){
			WriteXMLFile xlmwriter = new WriteXMLFile(OutputFile);
			try {
				xlmwriter.write(columnNames, rowValues);
			} catch (Exception ex) {
				throw ex;
			}
		}else{
			throw new Exception("Unknown extension");
			}
	}
}



