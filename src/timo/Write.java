package timo;

import java.sql.SQLException;
import javax.naming.NamingException;
import org.apache.axis.types.UnsignedInt;
import services.designer.pm.msg.de.SessionType;
import services.designer.pm.msg.de.TableRowListType;

/**
 * This class acts like a switch. Depending on outputType it will call the correct write function
 * Because of this structure it is quite easy to add more write options. Simple create the class
 * and call it from this function
 * 
 * @author Timo Koole
 */
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

		if (outputType.equalsIgnoreCase("msg.PM")) {
			// make new modifytabledata instance
			WriteMsgPm modifyTableData = new WriteMsgPm();
			// make name and session.
			modifyTableData.setName("test");
			SessionType session = new SessionType();
			session.setSessionID("SessionID");
		
			// apperantely  sessiontoken is a unsigned int
			UnsignedInt token = new UnsignedInt();
			token.setValue(5);
			session.setSessionToken(token);

			// create the TableRowListype for calling the write function
			TableRowListType tableRowListType = new TableRowListType();
			tableRowListType.setColumnNames(columnNames);
			tableRowListType.setRowValues(rowValues);

			// write to the service
			try {
				modifyTableData.addRows(tableRowListType);
			} catch (java.rmi.RemoteException ex) {
				throw new java.rmi.RemoteException(ex.getMessage());
			}

		} else if (outputType.equalsIgnoreCase("DBMS")) {
			try {
				WriteDatabase database = new WriteDatabase();
				database.setDatabaseName("DBMS");
				database.insertTable(columnNames, rowValues);
				System.out.println("written to db");
			} catch (SQLException | NamingException ex) {
				throw new Exception(ex.getMessage());
			}
			
		} else if (outputType.equalsIgnoreCase("XML")) {
			WriteXMLFile xlmwriter = new WriteXMLFile(OutputFile);
			try {
				xlmwriter.write(columnNames, rowValues);
			} catch (Exception ex) {
				throw ex;
			}
		} else {
			throw new Exception("Unknown output type");
		}
	}
}
