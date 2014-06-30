package timo;

import org.apache.axis.AxisFault;
import java.rmi.RemoteException;
import services.designer.pm.msg.de.TableRowListType;
import services.designer.pm.msg.de.TableModifyRowType;
import services.designer.pm.msg.de.SessionType;
import services.designer.pm.msg.de.OperationResponseType;
import services.designer.pm.msg.de.PMDesignerServices_BindingStub;
import services.designer.pm.msg.de.PMDesignerServicesProxy;

/**
 * This class uses the methods and types generated based on the .wsdl file. In
 * theory the method modifyTableData can delete, add and update in one
 * statement. But it seems like a bad practice to do so. Therefore I made a
 * separate function for add, delete and update. Each then calls the sendToProxy
 * method. Since I have no idea of all the service variables such as Endpoint
 * etc. it doesnt work. Therefore this class is not fully tested and maybe I
 * made some incorrect assumptions about how it should be used
 * 
 * @author Timo Koole
 */
public class WriteMsgPm {

	// added this for testing purposes
	// when true it will attempt to make an connection to the actual service instead of
	// the proxy. 
	private Boolean release = true;
	
	private SessionType session;
	private String name;
	private TableRowListType delRows;
	private TableModifyRowType updRows;
	private TableRowListType addRowsVar;

	// Hereby a discription of the different variables

	// sessiontype = new SessionType(sessionToken, sessionID)
	// sessiontoken Is a security measure to identify client; 
	// Session ID is a identifier for this session

	// name
	// presumably the name of the client, but could be used differently

	// tableRowListType(columnNames,rowValues) // DELETE and ADD ROWS
	// java.lang.String[] columnNames: 1 dimensional string array with column names
	// java.lang.String[][] rowValues: 2 dimensional string array with row values
	// Both value types are String, presumably the webservice converts it back to String/float/integer
	// but I can only guess

	// tableModifyRowType(keyCells, valueCells) // UPDATE ROWS
	// TableRowListType keyCells: Used to identify cells. presumably the combination
	// 			of column names and values is the key.
	// TableRowListType valueCells: cell values


	public OperationResponseType deleteRows(TableRowListType tableRowListType)
			throws RemoteException {
		// function for deleting rows

		this.delRows = tableRowListType;
		this.updRows = null;
		this.addRowsVar = null;
		try {
			return sendToProxy();
		} catch (RemoteException e) {
			throw new RemoteException("Can't connect to MSG.pm");
		}

	}

	public OperationResponseType updatedRows(
			TableModifyRowType tableModifyRowType)
			throws RemoteException {
		// function for updating rows
		
		this.delRows = null;
		this.updRows = tableModifyRowType;
		this.addRowsVar = null;
		try {
			return sendToProxy();
		} catch (RemoteException e) {
			throw new RemoteException("Can't connect to MSG.pm");
		}

	}

	public OperationResponseType addRows(TableRowListType tableRowListType)
			throws RemoteException {
		// function for adding rows
		this.delRows = null;
		this.updRows = null;
		this.addRowsVar = tableRowListType;

		try {
			return sendToProxy();
		} catch (RemoteException e) {
			throw new RemoteException("Can't connect to MSG.pm");
		}

	}

	/**
	 * This is where the magic happens. This function calls the actual msg.pm service.
	 * depending on release = true/false, t will call the  PMDesignerServices_BindingStub or
	 * the PMDesignerServicesProxy.
	 * 
	 * @author Timo Koole
	 */
	private OperationResponseType sendToProxy() throws RemoteException {

		OperationResponseType result = new OperationResponseType();
		if (release) {
			try {
				PMDesignerServices_BindingStub conn = new PMDesignerServices_BindingStub();

				try {
					result = conn.modifyTableData(session, getName(), delRows,
							updRows, addRowsVar);
					return result;
				} catch (RemoteException e) {
					throw new RemoteException(
							"Can't connect to MSG.pm");
				}
			} catch (AxisFault e) {
				e.printStackTrace();
			}
		} else {
			PMDesignerServicesProxy conn = new PMDesignerServicesProxy();
			try {
				result = conn.modifyTableData(session, getName(), delRows,
						updRows, addRowsVar);
				return result;
			} catch (RemoteException e) {
				throw new RemoteException(
						"Can't connect to proxy");
			}
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SessionType getSession() {
		return session;
	}

	public void setSession(SessionType session) {
		this.session = session;
	}

}
