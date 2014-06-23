/**
 * PMDesignerServices_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public interface PMDesignerServices_PortType extends java.rmi.Remote {

    /**
     * modify a property value
     */
    public services.designer.pm.msg.de.OperationResponseType modifyProperty(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, services.designer.pm.msg.de.PropertyValueType newValue) throws java.rmi.RemoteException;

    /**
     * open a new session
     */
    public services.designer.pm.msg.de.OpenSessionResponseType openSession(java.lang.String userName, java.lang.String password, java.lang.String datasource, java.lang.String workspaceID) throws java.rmi.RemoteException;

    /**
     * close a session
     */
    public services.designer.pm.msg.de.OperationResponseType closeSession(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException;

    /**
     * create a new product module
     */
    public services.designer.pm.msg.de.CreateProductModuleResponseType createProductModule(services.designer.pm.msg.de.SessionType session, java.lang.String folderID, java.lang.String templateID) throws java.rmi.RemoteException;

    /**
     * set the name of product module
     */
    public services.designer.pm.msg.de.OperationResponseType setModuleName(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * set the name of generation
     */
    public services.designer.pm.msg.de.OperationResponseType setGenerationName(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * set the name of adaptorstage
     */
    public services.designer.pm.msg.de.OperationResponseType setAdaptorstageName(services.designer.pm.msg.de.SessionType session, java.lang.String adaptorstageID, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * begi a transaction
     */
    public services.designer.pm.msg.de.OperationResponseType beginTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException;

    /**
     * rollback a transaction
     */
    public services.designer.pm.msg.de.OperationResponseType rollbackTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException;

    /**
     * commit a transaction
     */
    public services.designer.pm.msg.de.OperationResponseType commitTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException;

    /**
     * delete a product module
     */
    public services.designer.pm.msg.de.OperationResponseType deleteProductModule(services.designer.pm.msg.de.SessionType session, java.lang.String objectID) throws java.rmi.RemoteException;

    /**
     * create a new generation
     */
    public services.designer.pm.msg.de.CreateGenerationResponseType createGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID) throws java.rmi.RemoteException;

    /**
     * create a new adaptorstage
     */
    public services.designer.pm.msg.de.CreateAdaptorstageResponseType createAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String templateID) throws java.rmi.RemoteException;

    /**
     * create a relation
     */
    public services.designer.pm.msg.de.CreateRelationResponseType createRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String modelRelationID, java.lang.String targetObjectID) throws java.rmi.RemoteException;

    /**
     * delete a relation
     */
    public services.designer.pm.msg.de.OperationResponseType deleteRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String relationID) throws java.rmi.RemoteException;

    /**
     * modify an adaptorstage
     */
    public services.designer.pm.msg.de.OperationResponseType modifyAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String adaptorstageID, services.designer.pm.msg.de.AdaptorstageType adaptorstageData) throws java.rmi.RemoteException;

    /**
     * modify a generation
     */
    public services.designer.pm.msg.de.OperationResponseType modifyGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, services.designer.pm.msg.de.GenerationType generationData) throws java.rmi.RemoteException;

    /**
     * delete a generation
     */
    public services.designer.pm.msg.de.OperationResponseType deleteGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID) throws java.rmi.RemoteException;

    /**
     * delete an adaptorstage
     */
    public services.designer.pm.msg.de.OperationResponseType deleteAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String adaptorstageID) throws java.rmi.RemoteException;

    /**
     * modify a relation
     */
    public services.designer.pm.msg.de.OperationResponseType modifyRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String relationID, services.designer.pm.msg.de.RelationType relationData) throws java.rmi.RemoteException;

    /**
     * find an identifer of product module
     */
    public services.designer.pm.msg.de.FindIDResponseType findObjectID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName) throws java.rmi.RemoteException;

    /**
     * find an identifer of class
     */
    public services.designer.pm.msg.de.FindIDResponseType findClassID(services.designer.pm.msg.de.SessionType session, java.lang.String className) throws java.rmi.RemoteException;

    /**
     * find an identifer of generation
     */
    public services.designer.pm.msg.de.FindIDResponseType findGenerationID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String generationName) throws java.rmi.RemoteException;

    /**
     * find an identifer of adapter stage
     */
    public services.designer.pm.msg.de.FindIDResponseType findAdaptStageID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String generationName, java.lang.String adaptStageName) throws java.rmi.RemoteException;

    /**
     * find an identifer of product module folder
     */
    public services.designer.pm.msg.de.FindIDResponseType findFolderID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String fullPath, java.lang.String libraryName) throws java.rmi.RemoteException;

    /**
     * find an identifer of product module template
     */
    public services.designer.pm.msg.de.FindIDResponseType findTemplateID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String templateName) throws java.rmi.RemoteException;

    /**
     * find an identifer of model relation between two classes
     */
    public services.designer.pm.msg.de.FindIDResponseType findModelRelationID(services.designer.pm.msg.de.SessionType session, java.lang.String sourceClassID, java.lang.String destClassID, java.lang.String modelRelationName) throws java.rmi.RemoteException;

    /**
     * get a type of property (format and dimension)
     */
    public services.designer.pm.msg.de.PropertyTypeResponseType getPropertyType(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String propertyName, java.lang.String generationName, java.lang.String adaptStageName) throws java.rmi.RemoteException;

    /**
     * get relative path from base folder to given template
     */
    public services.designer.pm.msg.de.GetFolderPathResponseType getFolderPath(services.designer.pm.msg.de.SessionType session, java.lang.String templateID) throws java.rmi.RemoteException;

    /**
     * get restriction of the given property
     */
    public services.designer.pm.msg.de.GetPropertyRestrictionResponseType getPropertyRestriction(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName) throws java.rmi.RemoteException;

    /**
     * modify restriction of the given property
     */
    public services.designer.pm.msg.de.OperationResponseType modifyPropertyRestriction(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, services.designer.pm.msg.de.PropertyRestrictionType restriction) throws java.rmi.RemoteException;

    /**
     * modify values and/or restrictions of a list of properties 
     * optional (flag): replace existing properties
     */
    public services.designer.pm.msg.de.OperationResponseType modifyPropertyList(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.PropertyDataType[] propertyList, boolean replaceAll) throws java.rmi.RemoteException;

    /**
     * create a product module and add a given list of properties;
     * 
     * only properties existing in template get overwritten and filled with
     * this new values
     */
    public services.designer.pm.msg.de.CreateProductModuleExResponseType createProductModuleEx(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String productModuleName, java.lang.String folderID, java.lang.String templateName, services.designer.pm.msg.de.PropertyDataType[] propertyList) throws java.rmi.RemoteException;

    /**
     * create an adapter stage and add a given list of properties
     * on demand create missing generation and/or product module;
     * only properties existing in template get overwritten and filled with
     * this new values
     */
    public services.designer.pm.msg.de.CreateAdaptorStageExResponseType createAdaptorStageEx(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String productModuleName, java.lang.String folderID, java.lang.String templateName, services.designer.pm.msg.de.GenerationType generation, services.designer.pm.msg.de.AdaptorstageType adaptorstage, services.designer.pm.msg.de.PropertyDataType[] propertyList) throws java.rmi.RemoteException;

    /**
     * delete a product module specified by object key
     */
    public services.designer.pm.msg.de.OperationResponseType deleteProductModuleByObjectKey(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey) throws java.rmi.RemoteException;

    /**
     * delete an adapter stage specified by object key 
     * on demand (if it is the last one) delete generation and/or product
     * module
     */
    public services.designer.pm.msg.de.OperationResponseType deleteAdaptorStageByObjectKey(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey) throws java.rmi.RemoteException;

    /**
     * create relations on a product module specified by object key
     * optional (flag): replace existing relations
     */
    public services.designer.pm.msg.de.CreateRelationsResponseType createRelations(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.RelationDescriptionType[] relationList, boolean replaceAll) throws java.rmi.RemoteException;

    /**
     * delete relation on product module specified by object key
     */
    public services.designer.pm.msg.de.OperationResponseType deleteRelations(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.RelationKeyType[] relationKeyList) throws java.rmi.RemoteException;

    /**
     * modify an existing internal table, insert, update and delete
     * given lists of values
     */
    public services.designer.pm.msg.de.OperationResponseType modifyTableData(services.designer.pm.msg.de.SessionType session, java.lang.String name, services.designer.pm.msg.de.TableRowListType delRows, services.designer.pm.msg.de.TableModifyRowType updRows, services.designer.pm.msg.de.TableRowListType addRows) throws java.rmi.RemoteException;

    /**
     * modify an existing enumeration, insert, update and delete given
     * lists of values
     */
    public services.designer.pm.msg.de.OperationResponseType modifyEnumeration(services.designer.pm.msg.de.SessionType session, java.lang.String name, java.lang.String[] delValues, services.designer.pm.msg.de.EnumDataType[] updValues, boolean replaceAll) throws java.rmi.RemoteException;

    /**
     * request information about a tables logical layout
     */
    public services.designer.pm.msg.de.GetTableLayoutResponseType getTableLayout(services.designer.pm.msg.de.SessionType session, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * request information about a tables logical layout and data
     */
    public services.designer.pm.msg.de.GetTableDataResponseType getTableData(services.designer.pm.msg.de.SessionType session, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * modify a property tag
     */
    public services.designer.pm.msg.de.OperationResponseType modifyPropertyTag(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, java.lang.String tagID, java.lang.String newTagValue) throws java.rmi.RemoteException;

    /**
     * create an internal table, insert layout and data
     */
    public services.designer.pm.msg.de.CreateTableExResponseType createTableEx(services.designer.pm.msg.de.SessionType session, java.lang.String libraryID, java.lang.String folderID, java.lang.String tableName, services.designer.pm.msg.de.TableLayoutColumnType[] tableColumns, services.designer.pm.msg.de.TableRowListType[] tableValue) throws java.rmi.RemoteException;

    /**
     * create an enumeration insert typ and data
     */
    public services.designer.pm.msg.de.CreateEnumExResponseType createEnumEx(services.designer.pm.msg.de.SessionType session, java.lang.String libraryID, java.lang.String folderID, java.lang.String enumName, services.designer.pm.msg.de.EnumType enumType, java.lang.String[] enumLayout, services.designer.pm.msg.de.EnumDataType[] enumValues) throws java.rmi.RemoteException;

    /**
     * find an identifer of library
     */
    public services.designer.pm.msg.de.FindIDResponseType findLibraryID(services.designer.pm.msg.de.SessionType session, java.lang.String libraryName) throws java.rmi.RemoteException;
}
