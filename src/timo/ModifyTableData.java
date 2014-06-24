package timo;

public class ModifyTableData {

	private services.designer.pm.msg.de.SessionType session; // verplicht
	private String name; // verplicht9

	private services.designer.pm.msg.de.TableRowListType delRows = null;
	private services.designer.pm.msg.de.TableModifyRowType updRows = null;
	private services.designer.pm.msg.de.TableRowListType addRowsVar = null;

	// in theorie zou je zow rows kunnen deleten, addes en update in 1
	// statement, maar dat lijkt me niet gewenst
	// daarom is elk een losse statement

	public void deleteRows(
			services.designer.pm.msg.de.TableRowListType tableRowListType) {

	}

	public void updatedRows(
			services.designer.pm.msg.de.TableModifyRowType tableModifyRowType) {

	}

	public void addRows(
			services.designer.pm.msg.de.TableRowListType tableRowListType) {

	}

	private services.designer.pm.msg.de.OperationResponseType  sendToProxy(){
		
		try{
		services.designer.pm.msg.de.PMDesignerServices_BindingStub conn = new services.designer.pm.msg.de.PMDesignerServices_BindingStub();
		}catch(org.apache.axis.AxisFault e){
			e.printStackTrace();
		}
		//services.designer.pm.msg.de.PMDesignerServicesProxy conn  = new services.designer.pm.msg.de.PMDesignerServicesProxy();
		services.designer.pm.msg.de.OperationResponseType result = new services.designer.pm.msg.de.OperationResponseType();
		try{
		result = conn.modifyTableData( 
				session, name, delRows,  updRows,addRowsVar);
		}catch (java.rmi.RemoteException e){
			e.printStackTrace();
		}
		return result;
		
	}

}
