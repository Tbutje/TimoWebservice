package timo;

import org.apache.axis.AxisFault;
import services.designer.pm.msg.de.TableRowListType;
import services.designer.pm.msg.de.TableModifyRowType;
import services.designer.pm.msg.de.SessionType;
import services.designer.pm.msg.de.OperationResponseType;
import services.designer.pm.msg.de.PMDesignerServices_BindingStub;
import services.designer.pm.msg.de.PMDesignerServicesProxy;

public class WriteMsgPm {

	private Boolean release = true; // als deze true is dat maakt hij de
									// connectie met de actual stub

	private SessionType session; // verplicht
	private String name; // verplicht9

	private TableRowListType delRows;
	private TableModifyRowType updRows;
	private TableRowListType addRowsVar;

	// hieronder een beschrijving van de verschillende classes die als input
	// dienen

	// sessiontype = new SessionType(sessionToken, sessionID)
	// sessiontoken is een security maatregel om de client te identificeren;
	// Integer
	// sessionID is een identificatie voor deze sessie; Integer

	// name
	// vermoedelijk de naam van de client; String

	// tableRowListType(columnNames,rowValues) // DELETE en ADD ROWS
	// java.lang.String[] columnNames: 1 dimensionaal array met column namen
	// java.lang.String[][] rowValues: 2 dimensionaal array met de rows.
	// values zijn STRING!

	// tableModifyRowType(keyCells, valueCells) // UPDATE ROWS
	// TableRowListType keyCells: // de key voor een
	// cell? waarom dan listype weet ik ook niet, want deze heeft en cloumn en
	// row informatie
	// Mogelijk is de key de combinatie van huidige column names[] en values[][]
	// Maar dan zou er eerst een read actie van de database uitgevoegd moeten
	// worden
	// Om te kijken wat de huidige values zijn.
	// TableRowListType valueCells: de values voor
	// de cellen

	// in theorie zou je ook rows kunnen deleten, adden en updaten in 1
	// statement, maar dat lijkt me niet gewenst
	// daarom is elk een losse statement

	public OperationResponseType deleteRows(
			TableRowListType tableRowListType)
			throws java.rmi.RemoteException {

		this.delRows = tableRowListType;
		this.updRows = null;
		this.addRowsVar = null;
		try {
			return sendToProxy();
		} catch (java.rmi.RemoteException e) {
			throw new java.rmi.RemoteException("Can't connect to MSG.pm");
		}

	}

	public OperationResponseType updatedRows(
			TableModifyRowType tableModifyRowType)
			throws java.rmi.RemoteException {

		this.delRows = null;
		this.updRows = tableModifyRowType;
		this.addRowsVar = null;
		try {
			return sendToProxy();
		} catch (java.rmi.RemoteException e) {
			throw new java.rmi.RemoteException("Can't connect to MSG.pm");
		}

	}

	public OperationResponseType addRows(
			TableRowListType tableRowListType)
			throws java.rmi.RemoteException {

		this.delRows = null;
		this.updRows = null;
		this.addRowsVar = tableRowListType;

		try {
			return sendToProxy();
		} catch (java.rmi.RemoteException e) {
			throw new java.rmi.RemoteException("Can't connect to MSG.pm");
		}

	}

	private OperationResponseType sendToProxy()
			throws java.rmi.RemoteException {

		OperationResponseType result = new OperationResponseType();
		if (release) {
			try {
				PMDesignerServices_BindingStub conn = new PMDesignerServices_BindingStub();
				
				try {
					result = conn.modifyTableData(session, getName(), delRows,
							updRows, addRowsVar);
					return result;
				} catch (java.rmi.RemoteException e) {
				//	e.printStackTrace();
					throw new java.rmi.RemoteException(
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
			} catch (java.rmi.RemoteException e) {
				e.printStackTrace();
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
