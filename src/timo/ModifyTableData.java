package timo;

public class ModifyTableData {

	private Boolean release = true; // als deze true is dat maakt hij de
										// connectie met de actual stub

	private services.designer.pm.msg.de.SessionType session; // verplicht
	private String name; // verplicht9

	private services.designer.pm.msg.de.TableRowListType delRows;
	private services.designer.pm.msg.de.TableModifyRowType updRows;
	private services.designer.pm.msg.de.TableRowListType addRowsVar;

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
	// services.designer.pm.msg.de.TableRowListType keyCells: // de key voor een
	// cell? waarom dan listype weet ik ook niet, want deze heeft en cloumn en row informatie
	// Mogelijk is de key de combinatie van huidige column names[] en values[][]
	// Maar dan zou er eerst een read actie van de database uitgevoegd moeten worden
	// Om te kijken wat de huidige values zijn.
	// services.designer.pm.msg.de.TableRowListType valueCells: de values voor de cellen

	// in theorie zou je ook rows kunnen deleten, adden en updaten in 1
	// statement, maar dat lijkt me niet gewenst
	// daarom is elk een losse statement

	public services.designer.pm.msg.de.OperationResponseType deleteRows(
			services.designer.pm.msg.de.TableRowListType tableRowListType) {

		this.delRows = tableRowListType;
		this.updRows = null;
		this.addRowsVar = null;
		return sendToProxy();

	}

	public services.designer.pm.msg.de.OperationResponseType updatedRows(
			services.designer.pm.msg.de.TableModifyRowType tableModifyRowType) {

		this.delRows = null;
		this.updRows = tableModifyRowType;
		this.addRowsVar = null;
		return sendToProxy();

	}

	public services.designer.pm.msg.de.OperationResponseType addRows(
			services.designer.pm.msg.de.TableRowListType tableRowListType) {

		this.delRows = null;
		this.updRows = null;
		this.addRowsVar = tableRowListType;
		return sendToProxy();

	}

	private services.designer.pm.msg.de.OperationResponseType sendToProxy() {

		if (release) {
			try {
				services.designer.pm.msg.de.PMDesignerServices_BindingStub conn = new services.designer.pm.msg.de.PMDesignerServices_BindingStub();
				services.designer.pm.msg.de.OperationResponseType result = new services.designer.pm.msg.de.OperationResponseType();
				try {
					result = conn.modifyTableData(session, getName(), delRows,
							updRows, addRowsVar);
					return result;
				} catch (java.rmi.RemoteException e) {
					e.printStackTrace();
				}
			} catch (org.apache.axis.AxisFault e) {
				e.printStackTrace();
			}
		} else {

			services.designer.pm.msg.de.PMDesignerServicesProxy conn = new services.designer.pm.msg.de.PMDesignerServicesProxy();
			services.designer.pm.msg.de.OperationResponseType result = new services.designer.pm.msg.de.OperationResponseType();
			try {
				result = conn.modifyTableData(session, getName(), delRows,
						updRows, addRowsVar);
				return result;
			} catch (java.rmi.RemoteException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public services.designer.pm.msg.de.SessionType getSession() {
		return session;
	}

	public void setSession(services.designer.pm.msg.de.SessionType session) {
		this.session = session;
	}

}
