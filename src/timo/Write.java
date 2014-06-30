package timo;

import java.sql.SQLException;
import javax.naming.NamingException;
import org.apache.axis.types.UnsignedInt;
import services.designer.pm.msg.de.SessionType;
import services.designer.pm.msg.de.TableRowListType;

/**
 * This class acts like a switch. Depending on outputType it will call the
 * correct write function Because of this structure it is quite easy to add more
 * write options. Simple create the class and call it from this function
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
		// this function will also throw any found exceptions to higher functions
		// makes it easier to display errors in gui

		if (outputType.equalsIgnoreCase("msg.PM")) {
			// make new modifytabledata instance
			WriteMsgPm modifyTableData = new WriteMsgPm();
			// make name and session.
			modifyTableData.setName("test");
			SessionType session = new SessionType();
			session.setSessionID("SessionID");

			// apperantely sessiontoken is a unsigned int
			UnsignedInt token = new UnsignedInt();
			token.setValue(5);
			session.setSessionToken(token);

			// create the TableRowListype for calling the write function
			TableRowListType tableRowListType = new TableRowListType();
			tableRowListType.setColumnNames(columnNames);
			tableRowListType.setRowValues(rowValues);

			// write to the service
			modifyTableData.addRows(tableRowListType);

		} else if (outputType.equalsIgnoreCase("DBMS")) {

			WriteDatabase database = new WriteDatabase();
			database.setDatabaseName("DBMS");
			database.insertTable(columnNames, rowValues);
			System.out.println("written to db");

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
