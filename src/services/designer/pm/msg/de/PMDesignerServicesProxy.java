package services.designer.pm.msg.de;

public class PMDesignerServicesProxy implements services.designer.pm.msg.de.PMDesignerServices_PortType {
  private String _endpoint = null;
  private services.designer.pm.msg.de.PMDesignerServices_PortType pMDesignerServices_PortType = null;
  
  public PMDesignerServicesProxy() {
    _initPMDesignerServicesProxy();
  }
  
  public PMDesignerServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initPMDesignerServicesProxy();
  }
  
  private void _initPMDesignerServicesProxy() {
    try {
      pMDesignerServices_PortType = (new services.designer.pm.msg.de.PMDesignerServices_ServiceLocator()).getPMDesignerServices();
      if (pMDesignerServices_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pMDesignerServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pMDesignerServices_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pMDesignerServices_PortType != null)
      ((javax.xml.rpc.Stub)pMDesignerServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public services.designer.pm.msg.de.PMDesignerServices_PortType getPMDesignerServices_PortType() {
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType;
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyProperty(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, services.designer.pm.msg.de.PropertyValueType newValue) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyProperty(session, objectID, adaptorstageID, propertyName, newValue);
  }
  
  public services.designer.pm.msg.de.OpenSessionResponseType openSession(java.lang.String userName, java.lang.String password, java.lang.String datasource, java.lang.String workspaceID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.openSession(userName, password, datasource, workspaceID);
  }
  
  public services.designer.pm.msg.de.OperationResponseType closeSession(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.closeSession(session);
  }
  
  public services.designer.pm.msg.de.CreateProductModuleResponseType createProductModule(services.designer.pm.msg.de.SessionType session, java.lang.String folderID, java.lang.String templateID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createProductModule(session, folderID, templateID);
  }
  
  public services.designer.pm.msg.de.OperationResponseType setModuleName(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String name) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.setModuleName(session, objectID, name);
  }
  
  public services.designer.pm.msg.de.OperationResponseType setGenerationName(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String name) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.setGenerationName(session, objectID, generationID, name);
  }
  
  public services.designer.pm.msg.de.OperationResponseType setAdaptorstageName(services.designer.pm.msg.de.SessionType session, java.lang.String adaptorstageID, java.lang.String name) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.setAdaptorstageName(session, adaptorstageID, name);
  }
  
  public services.designer.pm.msg.de.OperationResponseType beginTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.beginTransaction(session);
  }
  
  public services.designer.pm.msg.de.OperationResponseType rollbackTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.rollbackTransaction(session);
  }
  
  public services.designer.pm.msg.de.OperationResponseType commitTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.commitTransaction(session);
  }
  
  public services.designer.pm.msg.de.OperationResponseType deleteProductModule(services.designer.pm.msg.de.SessionType session, java.lang.String objectID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.deleteProductModule(session, objectID);
  }
  
  public services.designer.pm.msg.de.CreateGenerationResponseType createGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createGeneration(session, objectID);
  }
  
  public services.designer.pm.msg.de.CreateAdaptorstageResponseType createAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String templateID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createAdaptorstage(session, objectID, generationID, templateID);
  }
  
  public services.designer.pm.msg.de.CreateRelationResponseType createRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String modelRelationID, java.lang.String targetObjectID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createRelation(session, objectID, adaptorstageID, modelRelationID, targetObjectID);
  }
  
  public services.designer.pm.msg.de.OperationResponseType deleteRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String relationID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.deleteRelation(session, objectID, adaptorstageID, relationID);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String adaptorstageID, services.designer.pm.msg.de.AdaptorstageType adaptorstageData) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyAdaptorstage(session, objectID, generationID, adaptorstageID, adaptorstageData);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, services.designer.pm.msg.de.GenerationType generationData) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyGeneration(session, objectID, generationID, generationData);
  }
  
  public services.designer.pm.msg.de.OperationResponseType deleteGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.deleteGeneration(session, objectID, generationID);
  }
  
  public services.designer.pm.msg.de.OperationResponseType deleteAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String adaptorstageID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.deleteAdaptorstage(session, adaptorstageID);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String relationID, services.designer.pm.msg.de.RelationType relationData) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyRelation(session, objectID, adaptorstageID, relationID, relationData);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findObjectID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findObjectID(session, className, objectName);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findClassID(services.designer.pm.msg.de.SessionType session, java.lang.String className) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findClassID(session, className);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findGenerationID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String generationName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findGenerationID(session, className, objectName, generationName);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findAdaptStageID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String generationName, java.lang.String adaptStageName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findAdaptStageID(session, className, objectName, generationName, adaptStageName);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findFolderID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String fullPath, java.lang.String libraryName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findFolderID(session, className, fullPath, libraryName);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findTemplateID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String templateName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findTemplateID(session, className, templateName);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findModelRelationID(services.designer.pm.msg.de.SessionType session, java.lang.String sourceClassID, java.lang.String destClassID, java.lang.String modelRelationName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findModelRelationID(session, sourceClassID, destClassID, modelRelationName);
  }
  
  public services.designer.pm.msg.de.PropertyTypeResponseType getPropertyType(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String propertyName, java.lang.String generationName, java.lang.String adaptStageName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.getPropertyType(session, className, objectName, propertyName, generationName, adaptStageName);
  }
  
  public services.designer.pm.msg.de.GetFolderPathResponseType getFolderPath(services.designer.pm.msg.de.SessionType session, java.lang.String templateID) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.getFolderPath(session, templateID);
  }
  
  public services.designer.pm.msg.de.GetPropertyRestrictionResponseType getPropertyRestriction(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.getPropertyRestriction(session, objectID, adaptorstageID, propertyName);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyPropertyRestriction(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, services.designer.pm.msg.de.PropertyRestrictionType restriction) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyPropertyRestriction(session, objectID, adaptorstageID, propertyName, restriction);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyPropertyList(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.PropertyDataType[] propertyList, boolean replaceAll) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyPropertyList(session, objectKey, propertyList, replaceAll);
  }
  
  public services.designer.pm.msg.de.CreateProductModuleExResponseType createProductModuleEx(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String productModuleName, java.lang.String folderID, java.lang.String templateName, services.designer.pm.msg.de.PropertyDataType[] propertyList) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createProductModuleEx(session, className, productModuleName, folderID, templateName, propertyList);
  }
  
  public services.designer.pm.msg.de.CreateAdaptorStageExResponseType createAdaptorStageEx(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String productModuleName, java.lang.String folderID, java.lang.String templateName, services.designer.pm.msg.de.GenerationType generation, services.designer.pm.msg.de.AdaptorstageType adaptorstage, services.designer.pm.msg.de.PropertyDataType[] propertyList) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createAdaptorStageEx(session, className, productModuleName, folderID, templateName, generation, adaptorstage, propertyList);
  }
  
  public services.designer.pm.msg.de.OperationResponseType deleteProductModuleByObjectKey(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.deleteProductModuleByObjectKey(session, objectKey);
  }
  
  public services.designer.pm.msg.de.OperationResponseType deleteAdaptorStageByObjectKey(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.deleteAdaptorStageByObjectKey(session, objectKey);
  }
  
  public services.designer.pm.msg.de.CreateRelationsResponseType createRelations(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.RelationDescriptionType[] relationList, boolean replaceAll) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createRelations(session, objectKey, relationList, replaceAll);
  }
  
  public services.designer.pm.msg.de.OperationResponseType deleteRelations(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.RelationKeyType[] relationKeyList) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.deleteRelations(session, objectKey, relationKeyList);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyTableData(services.designer.pm.msg.de.SessionType session, java.lang.String name, services.designer.pm.msg.de.TableRowListType delRows, services.designer.pm.msg.de.TableModifyRowType updRows, services.designer.pm.msg.de.TableRowListType addRows) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyTableData(session, name, delRows, updRows, addRows);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyEnumeration(services.designer.pm.msg.de.SessionType session, java.lang.String name, java.lang.String[] delValues, services.designer.pm.msg.de.EnumDataType[] updValues, boolean replaceAll) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyEnumeration(session, name, delValues, updValues, replaceAll);
  }
  
  public services.designer.pm.msg.de.GetTableLayoutResponseType getTableLayout(services.designer.pm.msg.de.SessionType session, java.lang.String name) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.getTableLayout(session, name);
  }
  
  public services.designer.pm.msg.de.GetTableDataResponseType getTableData(services.designer.pm.msg.de.SessionType session, java.lang.String name) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.getTableData(session, name);
  }
  
  public services.designer.pm.msg.de.OperationResponseType modifyPropertyTag(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, java.lang.String tagID, java.lang.String newTagValue) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.modifyPropertyTag(session, objectID, adaptorstageID, propertyName, tagID, newTagValue);
  }
  
  public services.designer.pm.msg.de.CreateTableExResponseType createTableEx(services.designer.pm.msg.de.SessionType session, java.lang.String libraryID, java.lang.String folderID, java.lang.String tableName, services.designer.pm.msg.de.TableLayoutColumnType[] tableColumns, services.designer.pm.msg.de.TableRowListType[] tableValue) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createTableEx(session, libraryID, folderID, tableName, tableColumns, tableValue);
  }
  
  public services.designer.pm.msg.de.CreateEnumExResponseType createEnumEx(services.designer.pm.msg.de.SessionType session, java.lang.String libraryID, java.lang.String folderID, java.lang.String enumName, services.designer.pm.msg.de.EnumType enumType, java.lang.String[] enumLayout, services.designer.pm.msg.de.EnumDataType[] enumValues) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.createEnumEx(session, libraryID, folderID, enumName, enumType, enumLayout, enumValues);
  }
  
  public services.designer.pm.msg.de.FindIDResponseType findLibraryID(services.designer.pm.msg.de.SessionType session, java.lang.String libraryName) throws java.rmi.RemoteException{
    if (pMDesignerServices_PortType == null)
      _initPMDesignerServicesProxy();
    return pMDesignerServices_PortType.findLibraryID(session, libraryName);
  }
  
  
}