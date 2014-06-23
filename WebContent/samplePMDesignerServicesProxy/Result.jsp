<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePMDesignerServicesProxyid" scope="session" class="services.designer.pm.msg.de.PMDesignerServicesProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePMDesignerServicesProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePMDesignerServicesProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePMDesignerServicesProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        services.designer.pm.msg.de.PMDesignerServices_PortType getPMDesignerServices_PortType10mtemp = samplePMDesignerServicesProxyid.getPMDesignerServices_PortType();
if(getPMDesignerServices_PortType10mtemp == null){
%>
<%=getPMDesignerServices_PortType10mtemp %>
<%
}else{
        if(getPMDesignerServices_PortType10mtemp!= null){
        String tempreturnp11 = getPMDesignerServices_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String value_3id=  request.getParameter("value24");
        long value_3idTemp  = Long.parseLong(value_3id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_2id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_2id.setValue(value_3idTemp);
        String sessionID_4id=  request.getParameter("sessionID26");
            java.lang.String sessionID_4idTemp = null;
        if(!sessionID_4id.equals("")){
         sessionID_4idTemp  = sessionID_4id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_1id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_1id.setSessionToken(org1apache1axis1types1UnsignedInt_2id);
        services1designer1pm1msg1de1SessionType_1id.setSessionID(sessionID_4idTemp);
        String objectID_5id=  request.getParameter("objectID28");
            java.lang.String objectID_5idTemp = null;
        if(!objectID_5id.equals("")){
         objectID_5idTemp  = objectID_5id;
        }
        String adaptorstageID_6id=  request.getParameter("adaptorstageID30");
            java.lang.String adaptorstageID_6idTemp = null;
        if(!adaptorstageID_6id.equals("")){
         adaptorstageID_6idTemp  = adaptorstageID_6id;
        }
        String propertyName_7id=  request.getParameter("propertyName32");
            java.lang.String propertyName_7idTemp = null;
        if(!propertyName_7id.equals("")){
         propertyName_7idTemp  = propertyName_7id;
        }
        String timeValue_9id=  request.getParameter("timeValue36");
            java.lang.String timeValue_9idTemp = null;
        if(!timeValue_9id.equals("")){
         timeValue_9idTemp  = timeValue_9id;
        }
        String dateValue_10id=  request.getParameter("dateValue38");
            java.lang.Integer dateValue_10idTemp = null;
        if(!dateValue_10id.equals("")){
         dateValue_10idTemp  = java.lang.Integer.valueOf(dateValue_10id);
        }
        String arrayID_11id=  request.getParameter("arrayID40");
            java.lang.String arrayID_11idTemp = null;
        if(!arrayID_11id.equals("")){
         arrayID_11idTemp  = arrayID_11id;
        }
        String integerValue_12id=  request.getParameter("integerValue42");
            java.lang.Integer integerValue_12idTemp = null;
        if(!integerValue_12id.equals("")){
         integerValue_12idTemp  = java.lang.Integer.valueOf(integerValue_12id);
        }
        String floatValue_13id=  request.getParameter("floatValue44");
            java.lang.Double floatValue_13idTemp = null;
        if(!floatValue_13id.equals("")){
         floatValue_13idTemp  = java.lang.Double.valueOf(floatValue_13id);
        }
        String booleanValue_14id=  request.getParameter("booleanValue46");
            java.lang.Boolean booleanValue_14idTemp = null;
        if(!booleanValue_14id.equals("")){
         booleanValue_14idTemp  = java.lang.Boolean.valueOf(booleanValue_14id);
        }
        String stringValue_15id=  request.getParameter("stringValue48");
            java.lang.String stringValue_15idTemp = null;
        if(!stringValue_15id.equals("")){
         stringValue_15idTemp  = stringValue_15id;
        }
        String isoCode_17id=  request.getParameter("isoCode52");
            java.lang.String isoCode_17idTemp = null;
        if(!isoCode_17id.equals("")){
         isoCode_17idTemp  = isoCode_17id;
        }
        String value_18id=  request.getParameter("value54");
            java.lang.String value_18idTemp = null;
        if(!value_18id.equals("")){
         value_18idTemp  = value_18id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1MultiLanguageString_16id" scope="session" class="services.designer.pm.msg.de.MultiLanguageString" />
        <%
        services1designer1pm1msg1de1MultiLanguageString_16id.setIsoCode(isoCode_17idTemp);
        services1designer1pm1msg1de1MultiLanguageString_16id.setValue(value_18idTemp);
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyValueType_8id" scope="session" class="services.designer.pm.msg.de.PropertyValueType" />
        <%
        services1designer1pm1msg1de1PropertyValueType_8id.setTimeValue(timeValue_9idTemp);
        services1designer1pm1msg1de1PropertyValueType_8id.setDateValue(dateValue_10idTemp);
        services1designer1pm1msg1de1PropertyValueType_8id.setArrayID(arrayID_11idTemp);
        services1designer1pm1msg1de1PropertyValueType_8id.setIntegerValue(integerValue_12idTemp);
        services1designer1pm1msg1de1PropertyValueType_8id.setFloatValue(floatValue_13idTemp);
        services1designer1pm1msg1de1PropertyValueType_8id.setBooleanValue(booleanValue_14idTemp);
        services1designer1pm1msg1de1PropertyValueType_8id.setStringValue(stringValue_15idTemp);
        services1designer1pm1msg1de1PropertyValueType_8id.setMultilanguageValue(services1designer1pm1msg1de1MultiLanguageString_16id);
        services.designer.pm.msg.de.OperationResponseType modifyProperty13mtemp = samplePMDesignerServicesProxyid.modifyProperty(services1designer1pm1msg1de1SessionType_1id,objectID_5idTemp,adaptorstageID_6idTemp,propertyName_7idTemp,services1designer1pm1msg1de1PropertyValueType_8id);
if(modifyProperty13mtemp == null){
%>
<%=modifyProperty13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(modifyProperty13mtemp != null){
%>
<%=modifyProperty13mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(modifyProperty13mtemp != null){
java.lang.String typeresultMessage18 = modifyProperty13mtemp.getResultMessage();
        String tempResultresultMessage18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage18));
        %>
        <%= tempResultresultMessage18 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 56:
        gotMethod = true;
        String userName_19id=  request.getParameter("userName73");
            java.lang.String userName_19idTemp = null;
        if(!userName_19id.equals("")){
         userName_19idTemp  = userName_19id;
        }
        String password_20id=  request.getParameter("password75");
            java.lang.String password_20idTemp = null;
        if(!password_20id.equals("")){
         password_20idTemp  = password_20id;
        }
        String datasource_21id=  request.getParameter("datasource77");
            java.lang.String datasource_21idTemp = null;
        if(!datasource_21id.equals("")){
         datasource_21idTemp  = datasource_21id;
        }
        String workspaceID_22id=  request.getParameter("workspaceID79");
            java.lang.String workspaceID_22idTemp = null;
        if(!workspaceID_22id.equals("")){
         workspaceID_22idTemp  = workspaceID_22id;
        }
        services.designer.pm.msg.de.OpenSessionResponseType openSession56mtemp = samplePMDesignerServicesProxyid.openSession(userName_19idTemp,password_20idTemp,datasource_21idTemp,workspaceID_22idTemp);
if(openSession56mtemp == null){
%>
<%=openSession56mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">session:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">sessionToken:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">sessionID:</TD>
<TD>
<%
if(openSession56mtemp != null){
services.designer.pm.msg.de.SessionType tebece0=openSession56mtemp.getSession();
if(tebece0 != null){
java.lang.String typesessionID65 = tebece0.getSessionID();
        String tempResultsessionID65 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesessionID65));
        %>
        <%= tempResultsessionID65 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(openSession56mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=openSession56mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(openSession56mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=openSession56mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage71 = tebece0.getResultMessage();
        String tempResultresultMessage71 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage71));
        %>
        <%= tempResultresultMessage71 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 81:
        gotMethod = true;
        String value_25id=  request.getParameter("value92");
        long value_25idTemp  = Long.parseLong(value_25id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_24id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_24id.setValue(value_25idTemp);
        String sessionID_26id=  request.getParameter("sessionID94");
            java.lang.String sessionID_26idTemp = null;
        if(!sessionID_26id.equals("")){
         sessionID_26idTemp  = sessionID_26id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_23id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_23id.setSessionToken(org1apache1axis1types1UnsignedInt_24id);
        services1designer1pm1msg1de1SessionType_23id.setSessionID(sessionID_26idTemp);
        services.designer.pm.msg.de.OperationResponseType closeSession81mtemp = samplePMDesignerServicesProxyid.closeSession(services1designer1pm1msg1de1SessionType_23id);
if(closeSession81mtemp == null){
%>
<%=closeSession81mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(closeSession81mtemp != null){
%>
<%=closeSession81mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(closeSession81mtemp != null){
java.lang.String typeresultMessage86 = closeSession81mtemp.getResultMessage();
        String tempResultresultMessage86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage86));
        %>
        <%= tempResultresultMessage86 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 96:
        gotMethod = true;
        String value_29id=  request.getParameter("value117");
        long value_29idTemp  = Long.parseLong(value_29id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_28id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_28id.setValue(value_29idTemp);
        String sessionID_30id=  request.getParameter("sessionID119");
            java.lang.String sessionID_30idTemp = null;
        if(!sessionID_30id.equals("")){
         sessionID_30idTemp  = sessionID_30id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_27id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_27id.setSessionToken(org1apache1axis1types1UnsignedInt_28id);
        services1designer1pm1msg1de1SessionType_27id.setSessionID(sessionID_30idTemp);
        String folderID_31id=  request.getParameter("folderID121");
            java.lang.String folderID_31idTemp = null;
        if(!folderID_31id.equals("")){
         folderID_31idTemp  = folderID_31id;
        }
        String templateID_32id=  request.getParameter("templateID123");
            java.lang.String templateID_32idTemp = null;
        if(!templateID_32id.equals("")){
         templateID_32idTemp  = templateID_32id;
        }
        services.designer.pm.msg.de.CreateProductModuleResponseType createProductModule96mtemp = samplePMDesignerServicesProxyid.createProductModule(services1designer1pm1msg1de1SessionType_27id,folderID_31idTemp,templateID_32idTemp);
if(createProductModule96mtemp == null){
%>
<%=createProductModule96mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">createdModule:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">adaptorstageID:</TD>
<TD>
<%
if(createProductModule96mtemp != null){
services.designer.pm.msg.de.ModuleDescriptionType tebece0=createProductModule96mtemp.getCreatedModule();
if(tebece0 != null){
java.lang.String typeadaptorstageID101 = tebece0.getAdaptorstageID();
        String tempResultadaptorstageID101 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeadaptorstageID101));
        %>
        <%= tempResultadaptorstageID101 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">generationID:</TD>
<TD>
<%
if(createProductModule96mtemp != null){
services.designer.pm.msg.de.ModuleDescriptionType tebece0=createProductModule96mtemp.getCreatedModule();
if(tebece0 != null){
java.lang.String typegenerationID103 = tebece0.getGenerationID();
        String tempResultgenerationID103 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegenerationID103));
        %>
        <%= tempResultgenerationID103 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">objectID:</TD>
<TD>
<%
if(createProductModule96mtemp != null){
services.designer.pm.msg.de.ModuleDescriptionType tebece0=createProductModule96mtemp.getCreatedModule();
if(tebece0 != null){
java.lang.String typeobjectID105 = tebece0.getObjectID();
        String tempResultobjectID105 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeobjectID105));
        %>
        <%= tempResultobjectID105 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(createProductModule96mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createProductModule96mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(createProductModule96mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createProductModule96mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage111 = tebece0.getResultMessage();
        String tempResultresultMessage111 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage111));
        %>
        <%= tempResultresultMessage111 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 125:
        gotMethod = true;
        String value_35id=  request.getParameter("value136");
        long value_35idTemp  = Long.parseLong(value_35id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_34id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_34id.setValue(value_35idTemp);
        String sessionID_36id=  request.getParameter("sessionID138");
            java.lang.String sessionID_36idTemp = null;
        if(!sessionID_36id.equals("")){
         sessionID_36idTemp  = sessionID_36id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_33id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_33id.setSessionToken(org1apache1axis1types1UnsignedInt_34id);
        services1designer1pm1msg1de1SessionType_33id.setSessionID(sessionID_36idTemp);
        String objectID_37id=  request.getParameter("objectID140");
            java.lang.String objectID_37idTemp = null;
        if(!objectID_37id.equals("")){
         objectID_37idTemp  = objectID_37id;
        }
        String name_38id=  request.getParameter("name142");
            java.lang.String name_38idTemp = null;
        if(!name_38id.equals("")){
         name_38idTemp  = name_38id;
        }
        services.designer.pm.msg.de.OperationResponseType setModuleName125mtemp = samplePMDesignerServicesProxyid.setModuleName(services1designer1pm1msg1de1SessionType_33id,objectID_37idTemp,name_38idTemp);
if(setModuleName125mtemp == null){
%>
<%=setModuleName125mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(setModuleName125mtemp != null){
%>
<%=setModuleName125mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(setModuleName125mtemp != null){
java.lang.String typeresultMessage130 = setModuleName125mtemp.getResultMessage();
        String tempResultresultMessage130 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage130));
        %>
        <%= tempResultresultMessage130 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 144:
        gotMethod = true;
        String value_41id=  request.getParameter("value155");
        long value_41idTemp  = Long.parseLong(value_41id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_40id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_40id.setValue(value_41idTemp);
        String sessionID_42id=  request.getParameter("sessionID157");
            java.lang.String sessionID_42idTemp = null;
        if(!sessionID_42id.equals("")){
         sessionID_42idTemp  = sessionID_42id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_39id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_39id.setSessionToken(org1apache1axis1types1UnsignedInt_40id);
        services1designer1pm1msg1de1SessionType_39id.setSessionID(sessionID_42idTemp);
        String objectID_43id=  request.getParameter("objectID159");
            java.lang.String objectID_43idTemp = null;
        if(!objectID_43id.equals("")){
         objectID_43idTemp  = objectID_43id;
        }
        String generationID_44id=  request.getParameter("generationID161");
            java.lang.String generationID_44idTemp = null;
        if(!generationID_44id.equals("")){
         generationID_44idTemp  = generationID_44id;
        }
        String name_45id=  request.getParameter("name163");
            java.lang.String name_45idTemp = null;
        if(!name_45id.equals("")){
         name_45idTemp  = name_45id;
        }
        services.designer.pm.msg.de.OperationResponseType setGenerationName144mtemp = samplePMDesignerServicesProxyid.setGenerationName(services1designer1pm1msg1de1SessionType_39id,objectID_43idTemp,generationID_44idTemp,name_45idTemp);
if(setGenerationName144mtemp == null){
%>
<%=setGenerationName144mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(setGenerationName144mtemp != null){
%>
<%=setGenerationName144mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(setGenerationName144mtemp != null){
java.lang.String typeresultMessage149 = setGenerationName144mtemp.getResultMessage();
        String tempResultresultMessage149 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage149));
        %>
        <%= tempResultresultMessage149 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 165:
        gotMethod = true;
        String value_48id=  request.getParameter("value176");
        long value_48idTemp  = Long.parseLong(value_48id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_47id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_47id.setValue(value_48idTemp);
        String sessionID_49id=  request.getParameter("sessionID178");
            java.lang.String sessionID_49idTemp = null;
        if(!sessionID_49id.equals("")){
         sessionID_49idTemp  = sessionID_49id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_46id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_46id.setSessionToken(org1apache1axis1types1UnsignedInt_47id);
        services1designer1pm1msg1de1SessionType_46id.setSessionID(sessionID_49idTemp);
        String adaptorstageID_50id=  request.getParameter("adaptorstageID180");
            java.lang.String adaptorstageID_50idTemp = null;
        if(!adaptorstageID_50id.equals("")){
         adaptorstageID_50idTemp  = adaptorstageID_50id;
        }
        String name_51id=  request.getParameter("name182");
            java.lang.String name_51idTemp = null;
        if(!name_51id.equals("")){
         name_51idTemp  = name_51id;
        }
        services.designer.pm.msg.de.OperationResponseType setAdaptorstageName165mtemp = samplePMDesignerServicesProxyid.setAdaptorstageName(services1designer1pm1msg1de1SessionType_46id,adaptorstageID_50idTemp,name_51idTemp);
if(setAdaptorstageName165mtemp == null){
%>
<%=setAdaptorstageName165mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(setAdaptorstageName165mtemp != null){
%>
<%=setAdaptorstageName165mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(setAdaptorstageName165mtemp != null){
java.lang.String typeresultMessage170 = setAdaptorstageName165mtemp.getResultMessage();
        String tempResultresultMessage170 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage170));
        %>
        <%= tempResultresultMessage170 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 184:
        gotMethod = true;
        String value_54id=  request.getParameter("value195");
        long value_54idTemp  = Long.parseLong(value_54id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_53id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_53id.setValue(value_54idTemp);
        String sessionID_55id=  request.getParameter("sessionID197");
            java.lang.String sessionID_55idTemp = null;
        if(!sessionID_55id.equals("")){
         sessionID_55idTemp  = sessionID_55id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_52id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_52id.setSessionToken(org1apache1axis1types1UnsignedInt_53id);
        services1designer1pm1msg1de1SessionType_52id.setSessionID(sessionID_55idTemp);
        services.designer.pm.msg.de.OperationResponseType beginTransaction184mtemp = samplePMDesignerServicesProxyid.beginTransaction(services1designer1pm1msg1de1SessionType_52id);
if(beginTransaction184mtemp == null){
%>
<%=beginTransaction184mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(beginTransaction184mtemp != null){
%>
<%=beginTransaction184mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(beginTransaction184mtemp != null){
java.lang.String typeresultMessage189 = beginTransaction184mtemp.getResultMessage();
        String tempResultresultMessage189 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage189));
        %>
        <%= tempResultresultMessage189 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 199:
        gotMethod = true;
        String value_58id=  request.getParameter("value210");
        long value_58idTemp  = Long.parseLong(value_58id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_57id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_57id.setValue(value_58idTemp);
        String sessionID_59id=  request.getParameter("sessionID212");
            java.lang.String sessionID_59idTemp = null;
        if(!sessionID_59id.equals("")){
         sessionID_59idTemp  = sessionID_59id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_56id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_56id.setSessionToken(org1apache1axis1types1UnsignedInt_57id);
        services1designer1pm1msg1de1SessionType_56id.setSessionID(sessionID_59idTemp);
        services.designer.pm.msg.de.OperationResponseType rollbackTransaction199mtemp = samplePMDesignerServicesProxyid.rollbackTransaction(services1designer1pm1msg1de1SessionType_56id);
if(rollbackTransaction199mtemp == null){
%>
<%=rollbackTransaction199mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(rollbackTransaction199mtemp != null){
%>
<%=rollbackTransaction199mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(rollbackTransaction199mtemp != null){
java.lang.String typeresultMessage204 = rollbackTransaction199mtemp.getResultMessage();
        String tempResultresultMessage204 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage204));
        %>
        <%= tempResultresultMessage204 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 214:
        gotMethod = true;
        String value_62id=  request.getParameter("value225");
        long value_62idTemp  = Long.parseLong(value_62id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_61id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_61id.setValue(value_62idTemp);
        String sessionID_63id=  request.getParameter("sessionID227");
            java.lang.String sessionID_63idTemp = null;
        if(!sessionID_63id.equals("")){
         sessionID_63idTemp  = sessionID_63id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_60id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_60id.setSessionToken(org1apache1axis1types1UnsignedInt_61id);
        services1designer1pm1msg1de1SessionType_60id.setSessionID(sessionID_63idTemp);
        services.designer.pm.msg.de.OperationResponseType commitTransaction214mtemp = samplePMDesignerServicesProxyid.commitTransaction(services1designer1pm1msg1de1SessionType_60id);
if(commitTransaction214mtemp == null){
%>
<%=commitTransaction214mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(commitTransaction214mtemp != null){
%>
<%=commitTransaction214mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(commitTransaction214mtemp != null){
java.lang.String typeresultMessage219 = commitTransaction214mtemp.getResultMessage();
        String tempResultresultMessage219 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage219));
        %>
        <%= tempResultresultMessage219 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 229:
        gotMethod = true;
        String value_66id=  request.getParameter("value240");
        long value_66idTemp  = Long.parseLong(value_66id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_65id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_65id.setValue(value_66idTemp);
        String sessionID_67id=  request.getParameter("sessionID242");
            java.lang.String sessionID_67idTemp = null;
        if(!sessionID_67id.equals("")){
         sessionID_67idTemp  = sessionID_67id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_64id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_64id.setSessionToken(org1apache1axis1types1UnsignedInt_65id);
        services1designer1pm1msg1de1SessionType_64id.setSessionID(sessionID_67idTemp);
        String objectID_68id=  request.getParameter("objectID244");
            java.lang.String objectID_68idTemp = null;
        if(!objectID_68id.equals("")){
         objectID_68idTemp  = objectID_68id;
        }
        services.designer.pm.msg.de.OperationResponseType deleteProductModule229mtemp = samplePMDesignerServicesProxyid.deleteProductModule(services1designer1pm1msg1de1SessionType_64id,objectID_68idTemp);
if(deleteProductModule229mtemp == null){
%>
<%=deleteProductModule229mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(deleteProductModule229mtemp != null){
%>
<%=deleteProductModule229mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(deleteProductModule229mtemp != null){
java.lang.String typeresultMessage234 = deleteProductModule229mtemp.getResultMessage();
        String tempResultresultMessage234 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage234));
        %>
        <%= tempResultresultMessage234 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 246:
        gotMethod = true;
        String value_71id=  request.getParameter("value263");
        long value_71idTemp  = Long.parseLong(value_71id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_70id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_70id.setValue(value_71idTemp);
        String sessionID_72id=  request.getParameter("sessionID265");
            java.lang.String sessionID_72idTemp = null;
        if(!sessionID_72id.equals("")){
         sessionID_72idTemp  = sessionID_72id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_69id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_69id.setSessionToken(org1apache1axis1types1UnsignedInt_70id);
        services1designer1pm1msg1de1SessionType_69id.setSessionID(sessionID_72idTemp);
        String objectID_73id=  request.getParameter("objectID267");
            java.lang.String objectID_73idTemp = null;
        if(!objectID_73id.equals("")){
         objectID_73idTemp  = objectID_73id;
        }
        services.designer.pm.msg.de.CreateGenerationResponseType createGeneration246mtemp = samplePMDesignerServicesProxyid.createGeneration(services1designer1pm1msg1de1SessionType_69id,objectID_73idTemp);
if(createGeneration246mtemp == null){
%>
<%=createGeneration246mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">adaptorstageID:</TD>
<TD>
<%
if(createGeneration246mtemp != null){
java.lang.String typeadaptorstageID249 = createGeneration246mtemp.getAdaptorstageID();
        String tempResultadaptorstageID249 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeadaptorstageID249));
        %>
        <%= tempResultadaptorstageID249 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">generationID:</TD>
<TD>
<%
if(createGeneration246mtemp != null){
java.lang.String typegenerationID251 = createGeneration246mtemp.getGenerationID();
        String tempResultgenerationID251 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegenerationID251));
        %>
        <%= tempResultgenerationID251 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(createGeneration246mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createGeneration246mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(createGeneration246mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createGeneration246mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage257 = tebece0.getResultMessage();
        String tempResultresultMessage257 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage257));
        %>
        <%= tempResultresultMessage257 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 269:
        gotMethod = true;
        String value_76id=  request.getParameter("value284");
        long value_76idTemp  = Long.parseLong(value_76id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_75id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_75id.setValue(value_76idTemp);
        String sessionID_77id=  request.getParameter("sessionID286");
            java.lang.String sessionID_77idTemp = null;
        if(!sessionID_77id.equals("")){
         sessionID_77idTemp  = sessionID_77id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_74id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_74id.setSessionToken(org1apache1axis1types1UnsignedInt_75id);
        services1designer1pm1msg1de1SessionType_74id.setSessionID(sessionID_77idTemp);
        String objectID_78id=  request.getParameter("objectID288");
            java.lang.String objectID_78idTemp = null;
        if(!objectID_78id.equals("")){
         objectID_78idTemp  = objectID_78id;
        }
        String generationID_79id=  request.getParameter("generationID290");
            java.lang.String generationID_79idTemp = null;
        if(!generationID_79id.equals("")){
         generationID_79idTemp  = generationID_79id;
        }
        String templateID_80id=  request.getParameter("templateID292");
            java.lang.String templateID_80idTemp = null;
        if(!templateID_80id.equals("")){
         templateID_80idTemp  = templateID_80id;
        }
        services.designer.pm.msg.de.CreateAdaptorstageResponseType createAdaptorstage269mtemp = samplePMDesignerServicesProxyid.createAdaptorstage(services1designer1pm1msg1de1SessionType_74id,objectID_78idTemp,generationID_79idTemp,templateID_80idTemp);
if(createAdaptorstage269mtemp == null){
%>
<%=createAdaptorstage269mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">adaptorstageID:</TD>
<TD>
<%
if(createAdaptorstage269mtemp != null){
java.lang.String typeadaptorstageID272 = createAdaptorstage269mtemp.getAdaptorstageID();
        String tempResultadaptorstageID272 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeadaptorstageID272));
        %>
        <%= tempResultadaptorstageID272 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(createAdaptorstage269mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createAdaptorstage269mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(createAdaptorstage269mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createAdaptorstage269mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage278 = tebece0.getResultMessage();
        String tempResultresultMessage278 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage278));
        %>
        <%= tempResultresultMessage278 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 294:
        gotMethod = true;
        String value_83id=  request.getParameter("value309");
        long value_83idTemp  = Long.parseLong(value_83id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_82id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_82id.setValue(value_83idTemp);
        String sessionID_84id=  request.getParameter("sessionID311");
            java.lang.String sessionID_84idTemp = null;
        if(!sessionID_84id.equals("")){
         sessionID_84idTemp  = sessionID_84id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_81id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_81id.setSessionToken(org1apache1axis1types1UnsignedInt_82id);
        services1designer1pm1msg1de1SessionType_81id.setSessionID(sessionID_84idTemp);
        String objectID_85id=  request.getParameter("objectID313");
            java.lang.String objectID_85idTemp = null;
        if(!objectID_85id.equals("")){
         objectID_85idTemp  = objectID_85id;
        }
        String adaptorstageID_86id=  request.getParameter("adaptorstageID315");
            java.lang.String adaptorstageID_86idTemp = null;
        if(!adaptorstageID_86id.equals("")){
         adaptorstageID_86idTemp  = adaptorstageID_86id;
        }
        String modelRelationID_87id=  request.getParameter("modelRelationID317");
            java.lang.String modelRelationID_87idTemp = null;
        if(!modelRelationID_87id.equals("")){
         modelRelationID_87idTemp  = modelRelationID_87id;
        }
        String targetObjectID_88id=  request.getParameter("targetObjectID319");
            java.lang.String targetObjectID_88idTemp = null;
        if(!targetObjectID_88id.equals("")){
         targetObjectID_88idTemp  = targetObjectID_88id;
        }
        services.designer.pm.msg.de.CreateRelationResponseType createRelation294mtemp = samplePMDesignerServicesProxyid.createRelation(services1designer1pm1msg1de1SessionType_81id,objectID_85idTemp,adaptorstageID_86idTemp,modelRelationID_87idTemp,targetObjectID_88idTemp);
if(createRelation294mtemp == null){
%>
<%=createRelation294mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">relationID:</TD>
<TD>
<%
if(createRelation294mtemp != null){
java.lang.String typerelationID297 = createRelation294mtemp.getRelationID();
        String tempResultrelationID297 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerelationID297));
        %>
        <%= tempResultrelationID297 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(createRelation294mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createRelation294mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(createRelation294mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=createRelation294mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage303 = tebece0.getResultMessage();
        String tempResultresultMessage303 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage303));
        %>
        <%= tempResultresultMessage303 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 321:
        gotMethod = true;
        String value_91id=  request.getParameter("value332");
        long value_91idTemp  = Long.parseLong(value_91id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_90id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_90id.setValue(value_91idTemp);
        String sessionID_92id=  request.getParameter("sessionID334");
            java.lang.String sessionID_92idTemp = null;
        if(!sessionID_92id.equals("")){
         sessionID_92idTemp  = sessionID_92id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_89id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_89id.setSessionToken(org1apache1axis1types1UnsignedInt_90id);
        services1designer1pm1msg1de1SessionType_89id.setSessionID(sessionID_92idTemp);
        String objectID_93id=  request.getParameter("objectID336");
            java.lang.String objectID_93idTemp = null;
        if(!objectID_93id.equals("")){
         objectID_93idTemp  = objectID_93id;
        }
        String adaptorstageID_94id=  request.getParameter("adaptorstageID338");
            java.lang.String adaptorstageID_94idTemp = null;
        if(!adaptorstageID_94id.equals("")){
         adaptorstageID_94idTemp  = adaptorstageID_94id;
        }
        String relationID_95id=  request.getParameter("relationID340");
            java.lang.String relationID_95idTemp = null;
        if(!relationID_95id.equals("")){
         relationID_95idTemp  = relationID_95id;
        }
        services.designer.pm.msg.de.OperationResponseType deleteRelation321mtemp = samplePMDesignerServicesProxyid.deleteRelation(services1designer1pm1msg1de1SessionType_89id,objectID_93idTemp,adaptorstageID_94idTemp,relationID_95idTemp);
if(deleteRelation321mtemp == null){
%>
<%=deleteRelation321mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(deleteRelation321mtemp != null){
%>
<%=deleteRelation321mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(deleteRelation321mtemp != null){
java.lang.String typeresultMessage326 = deleteRelation321mtemp.getResultMessage();
        String tempResultresultMessage326 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage326));
        %>
        <%= tempResultresultMessage326 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 342:
        gotMethod = true;
        String value_98id=  request.getParameter("value353");
        long value_98idTemp  = Long.parseLong(value_98id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_97id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_97id.setValue(value_98idTemp);
        String sessionID_99id=  request.getParameter("sessionID355");
            java.lang.String sessionID_99idTemp = null;
        if(!sessionID_99id.equals("")){
         sessionID_99idTemp  = sessionID_99id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_96id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_96id.setSessionToken(org1apache1axis1types1UnsignedInt_97id);
        services1designer1pm1msg1de1SessionType_96id.setSessionID(sessionID_99idTemp);
        String objectID_100id=  request.getParameter("objectID357");
            java.lang.String objectID_100idTemp = null;
        if(!objectID_100id.equals("")){
         objectID_100idTemp  = objectID_100id;
        }
        String generationID_101id=  request.getParameter("generationID359");
            java.lang.String generationID_101idTemp = null;
        if(!generationID_101id.equals("")){
         generationID_101idTemp  = generationID_101id;
        }
        String adaptorstageID_102id=  request.getParameter("adaptorstageID361");
            java.lang.String adaptorstageID_102idTemp = null;
        if(!adaptorstageID_102id.equals("")){
         adaptorstageID_102idTemp  = adaptorstageID_102id;
        }
        String name_104id=  request.getParameter("name365");
            java.lang.String name_104idTemp = null;
        if(!name_104id.equals("")){
         name_104idTemp  = name_104id;
        }
        String validTo_105id=  request.getParameter("validTo367");
            java.lang.Integer validTo_105idTemp = null;
        if(!validTo_105id.equals("")){
         validTo_105idTemp  = java.lang.Integer.valueOf(validTo_105id);
        }
        String validFrom_106id=  request.getParameter("validFrom369");
            java.lang.Integer validFrom_106idTemp = null;
        if(!validFrom_106id.equals("")){
         validFrom_106idTemp  = java.lang.Integer.valueOf(validFrom_106id);
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1AdaptorstageType_103id" scope="session" class="services.designer.pm.msg.de.AdaptorstageType" />
        <%
        services1designer1pm1msg1de1AdaptorstageType_103id.setName(name_104idTemp);
        services1designer1pm1msg1de1AdaptorstageType_103id.setValidTo(validTo_105idTemp);
        services1designer1pm1msg1de1AdaptorstageType_103id.setValidFrom(validFrom_106idTemp);
        services.designer.pm.msg.de.OperationResponseType modifyAdaptorstage342mtemp = samplePMDesignerServicesProxyid.modifyAdaptorstage(services1designer1pm1msg1de1SessionType_96id,objectID_100idTemp,generationID_101idTemp,adaptorstageID_102idTemp,services1designer1pm1msg1de1AdaptorstageType_103id);
if(modifyAdaptorstage342mtemp == null){
%>
<%=modifyAdaptorstage342mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(modifyAdaptorstage342mtemp != null){
%>
<%=modifyAdaptorstage342mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(modifyAdaptorstage342mtemp != null){
java.lang.String typeresultMessage347 = modifyAdaptorstage342mtemp.getResultMessage();
        String tempResultresultMessage347 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage347));
        %>
        <%= tempResultresultMessage347 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 371:
        gotMethod = true;
        String value_109id=  request.getParameter("value382");
        long value_109idTemp  = Long.parseLong(value_109id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_108id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_108id.setValue(value_109idTemp);
        String sessionID_110id=  request.getParameter("sessionID384");
            java.lang.String sessionID_110idTemp = null;
        if(!sessionID_110id.equals("")){
         sessionID_110idTemp  = sessionID_110id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_107id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_107id.setSessionToken(org1apache1axis1types1UnsignedInt_108id);
        services1designer1pm1msg1de1SessionType_107id.setSessionID(sessionID_110idTemp);
        String objectID_111id=  request.getParameter("objectID386");
            java.lang.String objectID_111idTemp = null;
        if(!objectID_111id.equals("")){
         objectID_111idTemp  = objectID_111id;
        }
        String generationID_112id=  request.getParameter("generationID388");
            java.lang.String generationID_112idTemp = null;
        if(!generationID_112id.equals("")){
         generationID_112idTemp  = generationID_112id;
        }
        String salesPeriodFrom_114id=  request.getParameter("salesPeriodFrom392");
            java.lang.Integer salesPeriodFrom_114idTemp = null;
        if(!salesPeriodFrom_114id.equals("")){
         salesPeriodFrom_114idTemp  = java.lang.Integer.valueOf(salesPeriodFrom_114id);
        }
        String name_115id=  request.getParameter("name394");
            java.lang.String name_115idTemp = null;
        if(!name_115id.equals("")){
         name_115idTemp  = name_115id;
        }
        String salesPeriodTo_116id=  request.getParameter("salesPeriodTo396");
            java.lang.Integer salesPeriodTo_116idTemp = null;
        if(!salesPeriodTo_116id.equals("")){
         salesPeriodTo_116idTemp  = java.lang.Integer.valueOf(salesPeriodTo_116id);
        }
        String endExtension_117id=  request.getParameter("endExtension398");
            java.lang.Integer endExtension_117idTemp = null;
        if(!endExtension_117id.equals("")){
         endExtension_117idTemp  = java.lang.Integer.valueOf(endExtension_117id);
        }
        String endModification_118id=  request.getParameter("endModification400");
            java.lang.Integer endModification_118idTemp = null;
        if(!endModification_118id.equals("")){
         endModification_118idTemp  = java.lang.Integer.valueOf(endModification_118id);
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1GenerationType_113id" scope="session" class="services.designer.pm.msg.de.GenerationType" />
        <%
        services1designer1pm1msg1de1GenerationType_113id.setSalesPeriodFrom(salesPeriodFrom_114idTemp);
        services1designer1pm1msg1de1GenerationType_113id.setName(name_115idTemp);
        services1designer1pm1msg1de1GenerationType_113id.setSalesPeriodTo(salesPeriodTo_116idTemp);
        services1designer1pm1msg1de1GenerationType_113id.setEndExtension(endExtension_117idTemp);
        services1designer1pm1msg1de1GenerationType_113id.setEndModification(endModification_118idTemp);
        services.designer.pm.msg.de.OperationResponseType modifyGeneration371mtemp = samplePMDesignerServicesProxyid.modifyGeneration(services1designer1pm1msg1de1SessionType_107id,objectID_111idTemp,generationID_112idTemp,services1designer1pm1msg1de1GenerationType_113id);
if(modifyGeneration371mtemp == null){
%>
<%=modifyGeneration371mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(modifyGeneration371mtemp != null){
%>
<%=modifyGeneration371mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(modifyGeneration371mtemp != null){
java.lang.String typeresultMessage376 = modifyGeneration371mtemp.getResultMessage();
        String tempResultresultMessage376 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage376));
        %>
        <%= tempResultresultMessage376 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 402:
        gotMethod = true;
        String value_121id=  request.getParameter("value413");
        long value_121idTemp  = Long.parseLong(value_121id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_120id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_120id.setValue(value_121idTemp);
        String sessionID_122id=  request.getParameter("sessionID415");
            java.lang.String sessionID_122idTemp = null;
        if(!sessionID_122id.equals("")){
         sessionID_122idTemp  = sessionID_122id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_119id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_119id.setSessionToken(org1apache1axis1types1UnsignedInt_120id);
        services1designer1pm1msg1de1SessionType_119id.setSessionID(sessionID_122idTemp);
        String objectID_123id=  request.getParameter("objectID417");
            java.lang.String objectID_123idTemp = null;
        if(!objectID_123id.equals("")){
         objectID_123idTemp  = objectID_123id;
        }
        String generationID_124id=  request.getParameter("generationID419");
            java.lang.String generationID_124idTemp = null;
        if(!generationID_124id.equals("")){
         generationID_124idTemp  = generationID_124id;
        }
        services.designer.pm.msg.de.OperationResponseType deleteGeneration402mtemp = samplePMDesignerServicesProxyid.deleteGeneration(services1designer1pm1msg1de1SessionType_119id,objectID_123idTemp,generationID_124idTemp);
if(deleteGeneration402mtemp == null){
%>
<%=deleteGeneration402mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(deleteGeneration402mtemp != null){
%>
<%=deleteGeneration402mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(deleteGeneration402mtemp != null){
java.lang.String typeresultMessage407 = deleteGeneration402mtemp.getResultMessage();
        String tempResultresultMessage407 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage407));
        %>
        <%= tempResultresultMessage407 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 421:
        gotMethod = true;
        String value_127id=  request.getParameter("value432");
        long value_127idTemp  = Long.parseLong(value_127id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_126id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_126id.setValue(value_127idTemp);
        String sessionID_128id=  request.getParameter("sessionID434");
            java.lang.String sessionID_128idTemp = null;
        if(!sessionID_128id.equals("")){
         sessionID_128idTemp  = sessionID_128id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_125id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_125id.setSessionToken(org1apache1axis1types1UnsignedInt_126id);
        services1designer1pm1msg1de1SessionType_125id.setSessionID(sessionID_128idTemp);
        String adaptorstageID_129id=  request.getParameter("adaptorstageID436");
            java.lang.String adaptorstageID_129idTemp = null;
        if(!adaptorstageID_129id.equals("")){
         adaptorstageID_129idTemp  = adaptorstageID_129id;
        }
        services.designer.pm.msg.de.OperationResponseType deleteAdaptorstage421mtemp = samplePMDesignerServicesProxyid.deleteAdaptorstage(services1designer1pm1msg1de1SessionType_125id,adaptorstageID_129idTemp);
if(deleteAdaptorstage421mtemp == null){
%>
<%=deleteAdaptorstage421mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(deleteAdaptorstage421mtemp != null){
%>
<%=deleteAdaptorstage421mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(deleteAdaptorstage421mtemp != null){
java.lang.String typeresultMessage426 = deleteAdaptorstage421mtemp.getResultMessage();
        String tempResultresultMessage426 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage426));
        %>
        <%= tempResultresultMessage426 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 438:
        gotMethod = true;
        String value_132id=  request.getParameter("value449");
        long value_132idTemp  = Long.parseLong(value_132id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_131id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_131id.setValue(value_132idTemp);
        String sessionID_133id=  request.getParameter("sessionID451");
            java.lang.String sessionID_133idTemp = null;
        if(!sessionID_133id.equals("")){
         sessionID_133idTemp  = sessionID_133id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_130id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_130id.setSessionToken(org1apache1axis1types1UnsignedInt_131id);
        services1designer1pm1msg1de1SessionType_130id.setSessionID(sessionID_133idTemp);
        String objectID_134id=  request.getParameter("objectID453");
            java.lang.String objectID_134idTemp = null;
        if(!objectID_134id.equals("")){
         objectID_134idTemp  = objectID_134id;
        }
        String adaptorstageID_135id=  request.getParameter("adaptorstageID455");
            java.lang.String adaptorstageID_135idTemp = null;
        if(!adaptorstageID_135id.equals("")){
         adaptorstageID_135idTemp  = adaptorstageID_135id;
        }
        String relationID_136id=  request.getParameter("relationID457");
            java.lang.String relationID_136idTemp = null;
        if(!relationID_136id.equals("")){
         relationID_136idTemp  = relationID_136id;
        }
        String maxCardinality_138id=  request.getParameter("maxCardinality461");
            java.lang.Integer maxCardinality_138idTemp = null;
        if(!maxCardinality_138id.equals("")){
         maxCardinality_138idTemp  = java.lang.Integer.valueOf(maxCardinality_138id);
        }
        String minCardinality_139id=  request.getParameter("minCardinality463");
            java.lang.Integer minCardinality_139idTemp = null;
        if(!minCardinality_139id.equals("")){
         minCardinality_139idTemp  = java.lang.Integer.valueOf(minCardinality_139id);
        }
        String reverseName_140id=  request.getParameter("reverseName465");
            java.lang.String reverseName_140idTemp = null;
        if(!reverseName_140id.equals("")){
         reverseName_140idTemp  = reverseName_140id;
        }
        String name_141id=  request.getParameter("name467");
            java.lang.String name_141idTemp = null;
        if(!name_141id.equals("")){
         name_141idTemp  = name_141id;
        }
        String minReverseCardinality_142id=  request.getParameter("minReverseCardinality469");
            java.lang.Integer minReverseCardinality_142idTemp = null;
        if(!minReverseCardinality_142id.equals("")){
         minReverseCardinality_142idTemp  = java.lang.Integer.valueOf(minReverseCardinality_142id);
        }
        String maxReverseCardinality_143id=  request.getParameter("maxReverseCardinality471");
            java.lang.Integer maxReverseCardinality_143idTemp = null;
        if(!maxReverseCardinality_143id.equals("")){
         maxReverseCardinality_143idTemp  = java.lang.Integer.valueOf(maxReverseCardinality_143id);
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1RelationType_137id" scope="session" class="services.designer.pm.msg.de.RelationType" />
        <%
        services1designer1pm1msg1de1RelationType_137id.setMaxCardinality(maxCardinality_138idTemp);
        services1designer1pm1msg1de1RelationType_137id.setMinCardinality(minCardinality_139idTemp);
        services1designer1pm1msg1de1RelationType_137id.setReverseName(reverseName_140idTemp);
        services1designer1pm1msg1de1RelationType_137id.setName(name_141idTemp);
        services1designer1pm1msg1de1RelationType_137id.setMinReverseCardinality(minReverseCardinality_142idTemp);
        services1designer1pm1msg1de1RelationType_137id.setMaxReverseCardinality(maxReverseCardinality_143idTemp);
        services.designer.pm.msg.de.OperationResponseType modifyRelation438mtemp = samplePMDesignerServicesProxyid.modifyRelation(services1designer1pm1msg1de1SessionType_130id,objectID_134idTemp,adaptorstageID_135idTemp,relationID_136idTemp,services1designer1pm1msg1de1RelationType_137id);
if(modifyRelation438mtemp == null){
%>
<%=modifyRelation438mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(modifyRelation438mtemp != null){
%>
<%=modifyRelation438mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(modifyRelation438mtemp != null){
java.lang.String typeresultMessage443 = modifyRelation438mtemp.getResultMessage();
        String tempResultresultMessage443 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage443));
        %>
        <%= tempResultresultMessage443 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 473:
        gotMethod = true;
        String value_146id=  request.getParameter("value488");
        long value_146idTemp  = Long.parseLong(value_146id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_145id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_145id.setValue(value_146idTemp);
        String sessionID_147id=  request.getParameter("sessionID490");
            java.lang.String sessionID_147idTemp = null;
        if(!sessionID_147id.equals("")){
         sessionID_147idTemp  = sessionID_147id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_144id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_144id.setSessionToken(org1apache1axis1types1UnsignedInt_145id);
        services1designer1pm1msg1de1SessionType_144id.setSessionID(sessionID_147idTemp);
        String className_148id=  request.getParameter("className492");
            java.lang.String className_148idTemp = null;
        if(!className_148id.equals("")){
         className_148idTemp  = className_148id;
        }
        String objectName_149id=  request.getParameter("objectName494");
            java.lang.String objectName_149idTemp = null;
        if(!objectName_149id.equals("")){
         objectName_149idTemp  = objectName_149id;
        }
        services.designer.pm.msg.de.FindIDResponseType findObjectID473mtemp = samplePMDesignerServicesProxyid.findObjectID(services1designer1pm1msg1de1SessionType_144id,className_148idTemp,objectName_149idTemp);
if(findObjectID473mtemp == null){
%>
<%=findObjectID473mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findObjectID473mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findObjectID473mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findObjectID473mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findObjectID473mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage480 = tebece0.getResultMessage();
        String tempResultresultMessage480 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage480));
        %>
        <%= tempResultresultMessage480 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findObjectID473mtemp != null){
java.lang.String typeid482 = findObjectID473mtemp.getId();
        String tempResultid482 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid482));
        %>
        <%= tempResultid482 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 496:
        gotMethod = true;
        String value_152id=  request.getParameter("value511");
        long value_152idTemp  = Long.parseLong(value_152id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_151id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_151id.setValue(value_152idTemp);
        String sessionID_153id=  request.getParameter("sessionID513");
            java.lang.String sessionID_153idTemp = null;
        if(!sessionID_153id.equals("")){
         sessionID_153idTemp  = sessionID_153id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_150id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_150id.setSessionToken(org1apache1axis1types1UnsignedInt_151id);
        services1designer1pm1msg1de1SessionType_150id.setSessionID(sessionID_153idTemp);
        String className_154id=  request.getParameter("className515");
            java.lang.String className_154idTemp = null;
        if(!className_154id.equals("")){
         className_154idTemp  = className_154id;
        }
        services.designer.pm.msg.de.FindIDResponseType findClassID496mtemp = samplePMDesignerServicesProxyid.findClassID(services1designer1pm1msg1de1SessionType_150id,className_154idTemp);
if(findClassID496mtemp == null){
%>
<%=findClassID496mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findClassID496mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findClassID496mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findClassID496mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findClassID496mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage503 = tebece0.getResultMessage();
        String tempResultresultMessage503 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage503));
        %>
        <%= tempResultresultMessage503 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findClassID496mtemp != null){
java.lang.String typeid505 = findClassID496mtemp.getId();
        String tempResultid505 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid505));
        %>
        <%= tempResultid505 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 517:
        gotMethod = true;
        String value_157id=  request.getParameter("value532");
        long value_157idTemp  = Long.parseLong(value_157id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_156id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_156id.setValue(value_157idTemp);
        String sessionID_158id=  request.getParameter("sessionID534");
            java.lang.String sessionID_158idTemp = null;
        if(!sessionID_158id.equals("")){
         sessionID_158idTemp  = sessionID_158id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_155id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_155id.setSessionToken(org1apache1axis1types1UnsignedInt_156id);
        services1designer1pm1msg1de1SessionType_155id.setSessionID(sessionID_158idTemp);
        String className_159id=  request.getParameter("className536");
            java.lang.String className_159idTemp = null;
        if(!className_159id.equals("")){
         className_159idTemp  = className_159id;
        }
        String objectName_160id=  request.getParameter("objectName538");
            java.lang.String objectName_160idTemp = null;
        if(!objectName_160id.equals("")){
         objectName_160idTemp  = objectName_160id;
        }
        String generationName_161id=  request.getParameter("generationName540");
            java.lang.String generationName_161idTemp = null;
        if(!generationName_161id.equals("")){
         generationName_161idTemp  = generationName_161id;
        }
        services.designer.pm.msg.de.FindIDResponseType findGenerationID517mtemp = samplePMDesignerServicesProxyid.findGenerationID(services1designer1pm1msg1de1SessionType_155id,className_159idTemp,objectName_160idTemp,generationName_161idTemp);
if(findGenerationID517mtemp == null){
%>
<%=findGenerationID517mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findGenerationID517mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findGenerationID517mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findGenerationID517mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findGenerationID517mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage524 = tebece0.getResultMessage();
        String tempResultresultMessage524 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage524));
        %>
        <%= tempResultresultMessage524 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findGenerationID517mtemp != null){
java.lang.String typeid526 = findGenerationID517mtemp.getId();
        String tempResultid526 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid526));
        %>
        <%= tempResultid526 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 542:
        gotMethod = true;
        String value_164id=  request.getParameter("value557");
        long value_164idTemp  = Long.parseLong(value_164id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_163id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_163id.setValue(value_164idTemp);
        String sessionID_165id=  request.getParameter("sessionID559");
            java.lang.String sessionID_165idTemp = null;
        if(!sessionID_165id.equals("")){
         sessionID_165idTemp  = sessionID_165id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_162id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_162id.setSessionToken(org1apache1axis1types1UnsignedInt_163id);
        services1designer1pm1msg1de1SessionType_162id.setSessionID(sessionID_165idTemp);
        String className_166id=  request.getParameter("className561");
            java.lang.String className_166idTemp = null;
        if(!className_166id.equals("")){
         className_166idTemp  = className_166id;
        }
        String objectName_167id=  request.getParameter("objectName563");
            java.lang.String objectName_167idTemp = null;
        if(!objectName_167id.equals("")){
         objectName_167idTemp  = objectName_167id;
        }
        String generationName_168id=  request.getParameter("generationName565");
            java.lang.String generationName_168idTemp = null;
        if(!generationName_168id.equals("")){
         generationName_168idTemp  = generationName_168id;
        }
        String adaptStageName_169id=  request.getParameter("adaptStageName567");
            java.lang.String adaptStageName_169idTemp = null;
        if(!adaptStageName_169id.equals("")){
         adaptStageName_169idTemp  = adaptStageName_169id;
        }
        services.designer.pm.msg.de.FindIDResponseType findAdaptStageID542mtemp = samplePMDesignerServicesProxyid.findAdaptStageID(services1designer1pm1msg1de1SessionType_162id,className_166idTemp,objectName_167idTemp,generationName_168idTemp,adaptStageName_169idTemp);
if(findAdaptStageID542mtemp == null){
%>
<%=findAdaptStageID542mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findAdaptStageID542mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findAdaptStageID542mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findAdaptStageID542mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findAdaptStageID542mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage549 = tebece0.getResultMessage();
        String tempResultresultMessage549 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage549));
        %>
        <%= tempResultresultMessage549 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findAdaptStageID542mtemp != null){
java.lang.String typeid551 = findAdaptStageID542mtemp.getId();
        String tempResultid551 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid551));
        %>
        <%= tempResultid551 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 569:
        gotMethod = true;
        String value_172id=  request.getParameter("value584");
        long value_172idTemp  = Long.parseLong(value_172id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_171id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_171id.setValue(value_172idTemp);
        String sessionID_173id=  request.getParameter("sessionID586");
            java.lang.String sessionID_173idTemp = null;
        if(!sessionID_173id.equals("")){
         sessionID_173idTemp  = sessionID_173id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_170id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_170id.setSessionToken(org1apache1axis1types1UnsignedInt_171id);
        services1designer1pm1msg1de1SessionType_170id.setSessionID(sessionID_173idTemp);
        String className_174id=  request.getParameter("className588");
            java.lang.String className_174idTemp = null;
        if(!className_174id.equals("")){
         className_174idTemp  = className_174id;
        }
        String fullPath_175id=  request.getParameter("fullPath590");
            java.lang.String fullPath_175idTemp = null;
        if(!fullPath_175id.equals("")){
         fullPath_175idTemp  = fullPath_175id;
        }
        String libraryName_176id=  request.getParameter("libraryName592");
            java.lang.String libraryName_176idTemp = null;
        if(!libraryName_176id.equals("")){
         libraryName_176idTemp  = libraryName_176id;
        }
        services.designer.pm.msg.de.FindIDResponseType findFolderID569mtemp = samplePMDesignerServicesProxyid.findFolderID(services1designer1pm1msg1de1SessionType_170id,className_174idTemp,fullPath_175idTemp,libraryName_176idTemp);
if(findFolderID569mtemp == null){
%>
<%=findFolderID569mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findFolderID569mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findFolderID569mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findFolderID569mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findFolderID569mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage576 = tebece0.getResultMessage();
        String tempResultresultMessage576 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage576));
        %>
        <%= tempResultresultMessage576 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findFolderID569mtemp != null){
java.lang.String typeid578 = findFolderID569mtemp.getId();
        String tempResultid578 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid578));
        %>
        <%= tempResultid578 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 594:
        gotMethod = true;
        String value_179id=  request.getParameter("value609");
        long value_179idTemp  = Long.parseLong(value_179id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_178id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_178id.setValue(value_179idTemp);
        String sessionID_180id=  request.getParameter("sessionID611");
            java.lang.String sessionID_180idTemp = null;
        if(!sessionID_180id.equals("")){
         sessionID_180idTemp  = sessionID_180id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_177id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_177id.setSessionToken(org1apache1axis1types1UnsignedInt_178id);
        services1designer1pm1msg1de1SessionType_177id.setSessionID(sessionID_180idTemp);
        String className_181id=  request.getParameter("className613");
            java.lang.String className_181idTemp = null;
        if(!className_181id.equals("")){
         className_181idTemp  = className_181id;
        }
        String templateName_182id=  request.getParameter("templateName615");
            java.lang.String templateName_182idTemp = null;
        if(!templateName_182id.equals("")){
         templateName_182idTemp  = templateName_182id;
        }
        services.designer.pm.msg.de.FindIDResponseType findTemplateID594mtemp = samplePMDesignerServicesProxyid.findTemplateID(services1designer1pm1msg1de1SessionType_177id,className_181idTemp,templateName_182idTemp);
if(findTemplateID594mtemp == null){
%>
<%=findTemplateID594mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findTemplateID594mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findTemplateID594mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findTemplateID594mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findTemplateID594mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage601 = tebece0.getResultMessage();
        String tempResultresultMessage601 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage601));
        %>
        <%= tempResultresultMessage601 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findTemplateID594mtemp != null){
java.lang.String typeid603 = findTemplateID594mtemp.getId();
        String tempResultid603 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid603));
        %>
        <%= tempResultid603 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 617:
        gotMethod = true;
        String value_185id=  request.getParameter("value632");
        long value_185idTemp  = Long.parseLong(value_185id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_184id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_184id.setValue(value_185idTemp);
        String sessionID_186id=  request.getParameter("sessionID634");
            java.lang.String sessionID_186idTemp = null;
        if(!sessionID_186id.equals("")){
         sessionID_186idTemp  = sessionID_186id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_183id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_183id.setSessionToken(org1apache1axis1types1UnsignedInt_184id);
        services1designer1pm1msg1de1SessionType_183id.setSessionID(sessionID_186idTemp);
        String sourceClassID_187id=  request.getParameter("sourceClassID636");
            java.lang.String sourceClassID_187idTemp = null;
        if(!sourceClassID_187id.equals("")){
         sourceClassID_187idTemp  = sourceClassID_187id;
        }
        String destClassID_188id=  request.getParameter("destClassID638");
            java.lang.String destClassID_188idTemp = null;
        if(!destClassID_188id.equals("")){
         destClassID_188idTemp  = destClassID_188id;
        }
        String modelRelationName_189id=  request.getParameter("modelRelationName640");
            java.lang.String modelRelationName_189idTemp = null;
        if(!modelRelationName_189id.equals("")){
         modelRelationName_189idTemp  = modelRelationName_189id;
        }
        services.designer.pm.msg.de.FindIDResponseType findModelRelationID617mtemp = samplePMDesignerServicesProxyid.findModelRelationID(services1designer1pm1msg1de1SessionType_183id,sourceClassID_187idTemp,destClassID_188idTemp,modelRelationName_189idTemp);
if(findModelRelationID617mtemp == null){
%>
<%=findModelRelationID617mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findModelRelationID617mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findModelRelationID617mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findModelRelationID617mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findModelRelationID617mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage624 = tebece0.getResultMessage();
        String tempResultresultMessage624 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage624));
        %>
        <%= tempResultresultMessage624 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findModelRelationID617mtemp != null){
java.lang.String typeid626 = findModelRelationID617mtemp.getId();
        String tempResultid626 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid626));
        %>
        <%= tempResultid626 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 642:
        gotMethod = true;
        String value_192id=  request.getParameter("value659");
        long value_192idTemp  = Long.parseLong(value_192id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_191id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_191id.setValue(value_192idTemp);
        String sessionID_193id=  request.getParameter("sessionID661");
            java.lang.String sessionID_193idTemp = null;
        if(!sessionID_193id.equals("")){
         sessionID_193idTemp  = sessionID_193id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_190id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_190id.setSessionToken(org1apache1axis1types1UnsignedInt_191id);
        services1designer1pm1msg1de1SessionType_190id.setSessionID(sessionID_193idTemp);
        String className_194id=  request.getParameter("className663");
            java.lang.String className_194idTemp = null;
        if(!className_194id.equals("")){
         className_194idTemp  = className_194id;
        }
        String objectName_195id=  request.getParameter("objectName665");
            java.lang.String objectName_195idTemp = null;
        if(!objectName_195id.equals("")){
         objectName_195idTemp  = objectName_195id;
        }
        String propertyName_196id=  request.getParameter("propertyName667");
            java.lang.String propertyName_196idTemp = null;
        if(!propertyName_196id.equals("")){
         propertyName_196idTemp  = propertyName_196id;
        }
        String generationName_197id=  request.getParameter("generationName669");
            java.lang.String generationName_197idTemp = null;
        if(!generationName_197id.equals("")){
         generationName_197idTemp  = generationName_197id;
        }
        String adaptStageName_198id=  request.getParameter("adaptStageName671");
            java.lang.String adaptStageName_198idTemp = null;
        if(!adaptStageName_198id.equals("")){
         adaptStageName_198idTemp  = adaptStageName_198id;
        }
        services.designer.pm.msg.de.PropertyTypeResponseType getPropertyType642mtemp = samplePMDesignerServicesProxyid.getPropertyType(services1designer1pm1msg1de1SessionType_190id,className_194idTemp,objectName_195idTemp,propertyName_196idTemp,generationName_197idTemp,adaptStageName_198idTemp);
if(getPropertyType642mtemp == null){
%>
<%=getPropertyType642mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">type:</TD>
<TD>
<%
if(getPropertyType642mtemp != null){
java.lang.String typetype645 = getPropertyType642mtemp.getType();
        String tempResulttype645 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetype645));
        %>
        <%= tempResulttype645 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dimension:</TD>
<TD>
<%
if(getPropertyType642mtemp != null){
%>
<%=getPropertyType642mtemp.getDimension()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(getPropertyType642mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getPropertyType642mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(getPropertyType642mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getPropertyType642mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage653 = tebece0.getResultMessage();
        String tempResultresultMessage653 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage653));
        %>
        <%= tempResultresultMessage653 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 673:
        gotMethod = true;
        String value_201id=  request.getParameter("value688");
        long value_201idTemp  = Long.parseLong(value_201id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_200id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_200id.setValue(value_201idTemp);
        String sessionID_202id=  request.getParameter("sessionID690");
            java.lang.String sessionID_202idTemp = null;
        if(!sessionID_202id.equals("")){
         sessionID_202idTemp  = sessionID_202id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_199id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_199id.setSessionToken(org1apache1axis1types1UnsignedInt_200id);
        services1designer1pm1msg1de1SessionType_199id.setSessionID(sessionID_202idTemp);
        String templateID_203id=  request.getParameter("templateID692");
            java.lang.String templateID_203idTemp = null;
        if(!templateID_203id.equals("")){
         templateID_203idTemp  = templateID_203id;
        }
        services.designer.pm.msg.de.GetFolderPathResponseType getFolderPath673mtemp = samplePMDesignerServicesProxyid.getFolderPath(services1designer1pm1msg1de1SessionType_199id,templateID_203idTemp);
if(getFolderPath673mtemp == null){
%>
<%=getFolderPath673mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">folderPath:</TD>
<TD>
<%
if(getFolderPath673mtemp != null){
java.lang.String typefolderPath676 = getFolderPath673mtemp.getFolderPath();
        String tempResultfolderPath676 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefolderPath676));
        %>
        <%= tempResultfolderPath676 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(getFolderPath673mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getFolderPath673mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(getFolderPath673mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getFolderPath673mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage682 = tebece0.getResultMessage();
        String tempResultresultMessage682 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage682));
        %>
        <%= tempResultresultMessage682 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 694:
        gotMethod = true;
        String value_206id=  request.getParameter("value773");
        long value_206idTemp  = Long.parseLong(value_206id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_205id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_205id.setValue(value_206idTemp);
        String sessionID_207id=  request.getParameter("sessionID775");
            java.lang.String sessionID_207idTemp = null;
        if(!sessionID_207id.equals("")){
         sessionID_207idTemp  = sessionID_207id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_204id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_204id.setSessionToken(org1apache1axis1types1UnsignedInt_205id);
        services1designer1pm1msg1de1SessionType_204id.setSessionID(sessionID_207idTemp);
        String objectID_208id=  request.getParameter("objectID777");
            java.lang.String objectID_208idTemp = null;
        if(!objectID_208id.equals("")){
         objectID_208idTemp  = objectID_208id;
        }
        String adaptorstageID_209id=  request.getParameter("adaptorstageID779");
            java.lang.String adaptorstageID_209idTemp = null;
        if(!adaptorstageID_209id.equals("")){
         adaptorstageID_209idTemp  = adaptorstageID_209id;
        }
        String propertyName_210id=  request.getParameter("propertyName781");
            java.lang.String propertyName_210idTemp = null;
        if(!propertyName_210id.equals("")){
         propertyName_210idTemp  = propertyName_210id;
        }
        services.designer.pm.msg.de.GetPropertyRestrictionResponseType getPropertyRestriction694mtemp = samplePMDesignerServicesProxyid.getPropertyRestriction(services1designer1pm1msg1de1SessionType_204id,objectID_208idTemp,adaptorstageID_209idTemp,propertyName_210idTemp);
if(getPropertyRestriction694mtemp == null){
%>
<%=getPropertyRestriction694mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">restriction:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">listValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType[] typelistValue699 = tebece0.getListValue();
        String templistValue699 = null;
        if(typelistValue699 != null){
        java.util.List listlistValue699= java.util.Arrays.asList(typelistValue699);
        templistValue699 = listlistValue699.toString();
        }
        %>
        <%=templistValue699%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">range:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">step:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">dateValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getStep();
if(tebece2 != null){
java.lang.Integer typedateValue705 = tebece2.getDateValue();
        String tempResultdateValue705 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedateValue705));
        %>
        <%= tempResultdateValue705 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">integerValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getStep();
if(tebece2 != null){
java.lang.Integer typeintegerValue707 = tebece2.getIntegerValue();
        String tempResultintegerValue707 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeintegerValue707));
        %>
        <%= tempResultintegerValue707 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">floatValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getStep();
if(tebece2 != null){
java.lang.Double typefloatValue709 = tebece2.getFloatValue();
        String tempResultfloatValue709 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefloatValue709));
        %>
        <%= tempResultfloatValue709 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">minValue:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">dateValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getMinValue();
if(tebece2 != null){
java.lang.Integer typedateValue713 = tebece2.getDateValue();
        String tempResultdateValue713 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedateValue713));
        %>
        <%= tempResultdateValue713 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">integerValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getMinValue();
if(tebece2 != null){
java.lang.Integer typeintegerValue715 = tebece2.getIntegerValue();
        String tempResultintegerValue715 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeintegerValue715));
        %>
        <%= tempResultintegerValue715 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">floatValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getMinValue();
if(tebece2 != null){
java.lang.Double typefloatValue717 = tebece2.getFloatValue();
        String tempResultfloatValue717 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefloatValue717));
        %>
        <%= tempResultfloatValue717 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">maxValue:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">dateValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getMaxValue();
if(tebece2 != null){
java.lang.Integer typedateValue721 = tebece2.getDateValue();
        String tempResultdateValue721 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedateValue721));
        %>
        <%= tempResultdateValue721 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">integerValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getMaxValue();
if(tebece2 != null){
java.lang.Integer typeintegerValue723 = tebece2.getIntegerValue();
        String tempResultintegerValue723 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeintegerValue723));
        %>
        <%= tempResultintegerValue723 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">floatValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionType tebece1=tebece0.getRange();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyRangeRestrictionValueType tebece2=tebece1.getMaxValue();
if(tebece2 != null){
java.lang.Double typefloatValue725 = tebece2.getFloatValue();
        String tempResultfloatValue725 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefloatValue725));
        %>
        <%= tempResultfloatValue725 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">singleValue:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">timeValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
java.lang.String typetimeValue729 = tebece1.getTimeValue();
        String tempResulttimeValue729 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimeValue729));
        %>
        <%= tempResulttimeValue729 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">dateValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
java.lang.Integer typedateValue731 = tebece1.getDateValue();
        String tempResultdateValue731 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedateValue731));
        %>
        <%= tempResultdateValue731 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">arrayID:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
java.lang.String typearrayID733 = tebece1.getArrayID();
        String tempResultarrayID733 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typearrayID733));
        %>
        <%= tempResultarrayID733 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">integerValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
java.lang.Integer typeintegerValue735 = tebece1.getIntegerValue();
        String tempResultintegerValue735 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeintegerValue735));
        %>
        <%= tempResultintegerValue735 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">floatValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
java.lang.Double typefloatValue737 = tebece1.getFloatValue();
        String tempResultfloatValue737 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefloatValue737));
        %>
        <%= tempResultfloatValue737 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">booleanValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
java.lang.Boolean typebooleanValue739 = tebece1.getBooleanValue();
        String tempResultbooleanValue739 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebooleanValue739));
        %>
        <%= tempResultbooleanValue739 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">stringValue:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
java.lang.String typestringValue741 = tebece1.getStringValue();
        String tempResultstringValue741 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestringValue741));
        %>
        <%= tempResultstringValue741 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">multilanguageValue:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">isoCode:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
services.designer.pm.msg.de.MultiLanguageString tebece2=tebece1.getMultilanguageValue();
if(tebece2 != null){
java.lang.String typeisoCode745 = tebece2.getIsoCode();
        String tempResultisoCode745 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeisoCode745));
        %>
        <%= tempResultisoCode745 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">value:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyValueType tebece1=tebece0.getSingleValue();
if(tebece1 != null){
services.designer.pm.msg.de.MultiLanguageString tebece2=tebece1.getMultilanguageValue();
if(tebece2 != null){
java.lang.String typevalue747 = tebece2.getValue();
        String tempResultvalue747 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevalue747));
        %>
        <%= tempResultvalue747 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">enumReference:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">listSelectedValues:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyEnumRestrictionType tebece1=tebece0.getEnumReference();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyValueType[] typelistSelectedValues751 = tebece1.getListSelectedValues();
        String templistSelectedValues751 = null;
        if(typelistSelectedValues751 != null){
        java.util.List listlistSelectedValues751= java.util.Arrays.asList(typelistSelectedValues751);
        templistSelectedValues751 = listlistSelectedValues751.toString();
        }
        %>
        <%=templistSelectedValues751%>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">enumName:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyEnumRestrictionType tebece1=tebece0.getEnumReference();
if(tebece1 != null){
java.lang.String typeenumName753 = tebece1.getEnumName();
        String tempResultenumName753 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeenumName753));
        %>
        <%= tempResultenumName753 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">tableColumnReference:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">listSelectedValues:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyTableColumnRestrictionType tebece1=tebece0.getTableColumnReference();
if(tebece1 != null){
services.designer.pm.msg.de.PropertyValueType[] typelistSelectedValues757 = tebece1.getListSelectedValues();
        String templistSelectedValues757 = null;
        if(typelistSelectedValues757 != null){
        java.util.List listlistSelectedValues757= java.util.Arrays.asList(typelistSelectedValues757);
        templistSelectedValues757 = listlistSelectedValues757.toString();
        }
        %>
        <%=templistSelectedValues757%>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">tableName:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyTableColumnRestrictionType tebece1=tebece0.getTableColumnReference();
if(tebece1 != null){
java.lang.String typetableName759 = tebece1.getTableName();
        String tempResulttableName759 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetableName759));
        %>
        <%= tempResulttableName759 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">tableColumn:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.PropertyRestrictionType tebece0=getPropertyRestriction694mtemp.getRestriction();
if(tebece0 != null){
services.designer.pm.msg.de.PropertyTableColumnRestrictionType tebece1=tebece0.getTableColumnReference();
if(tebece1 != null){
java.lang.String typetableColumn761 = tebece1.getTableColumn();
        String tempResulttableColumn761 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetableColumn761));
        %>
        <%= tempResulttableColumn761 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getPropertyRestriction694mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(getPropertyRestriction694mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getPropertyRestriction694mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage767 = tebece0.getResultMessage();
        String tempResultresultMessage767 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage767));
        %>
        <%= tempResultresultMessage767 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 783:
        gotMethod = true;
        String value_213id=  request.getParameter("value794");
        long value_213idTemp  = Long.parseLong(value_213id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_212id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_212id.setValue(value_213idTemp);
        String sessionID_214id=  request.getParameter("sessionID796");
            java.lang.String sessionID_214idTemp = null;
        if(!sessionID_214id.equals("")){
         sessionID_214idTemp  = sessionID_214id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_211id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_211id.setSessionToken(org1apache1axis1types1UnsignedInt_212id);
        services1designer1pm1msg1de1SessionType_211id.setSessionID(sessionID_214idTemp);
        String objectID_215id=  request.getParameter("objectID798");
            java.lang.String objectID_215idTemp = null;
        if(!objectID_215id.equals("")){
         objectID_215idTemp  = objectID_215id;
        }
        String adaptorstageID_216id=  request.getParameter("adaptorstageID800");
            java.lang.String adaptorstageID_216idTemp = null;
        if(!adaptorstageID_216id.equals("")){
         adaptorstageID_216idTemp  = adaptorstageID_216id;
        }
        String propertyName_217id=  request.getParameter("propertyName802");
            java.lang.String propertyName_217idTemp = null;
        if(!propertyName_217id.equals("")){
         propertyName_217idTemp  = propertyName_217id;
        }
        String dateValue_221id=  request.getParameter("dateValue810");
            java.lang.Integer dateValue_221idTemp = null;
        if(!dateValue_221id.equals("")){
         dateValue_221idTemp  = java.lang.Integer.valueOf(dateValue_221id);
        }
        String integerValue_222id=  request.getParameter("integerValue812");
            java.lang.Integer integerValue_222idTemp = null;
        if(!integerValue_222id.equals("")){
         integerValue_222idTemp  = java.lang.Integer.valueOf(integerValue_222id);
        }
        String floatValue_223id=  request.getParameter("floatValue814");
            java.lang.Double floatValue_223idTemp = null;
        if(!floatValue_223id.equals("")){
         floatValue_223idTemp  = java.lang.Double.valueOf(floatValue_223id);
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyRangeRestrictionValueType_220id" scope="session" class="services.designer.pm.msg.de.PropertyRangeRestrictionValueType" />
        <%
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_220id.setDateValue(dateValue_221idTemp);
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_220id.setIntegerValue(integerValue_222idTemp);
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_220id.setFloatValue(floatValue_223idTemp);
        String dateValue_225id=  request.getParameter("dateValue818");
            java.lang.Integer dateValue_225idTemp = null;
        if(!dateValue_225id.equals("")){
         dateValue_225idTemp  = java.lang.Integer.valueOf(dateValue_225id);
        }
        String integerValue_226id=  request.getParameter("integerValue820");
            java.lang.Integer integerValue_226idTemp = null;
        if(!integerValue_226id.equals("")){
         integerValue_226idTemp  = java.lang.Integer.valueOf(integerValue_226id);
        }
        String floatValue_227id=  request.getParameter("floatValue822");
            java.lang.Double floatValue_227idTemp = null;
        if(!floatValue_227id.equals("")){
         floatValue_227idTemp  = java.lang.Double.valueOf(floatValue_227id);
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyRangeRestrictionValueType_224id" scope="session" class="services.designer.pm.msg.de.PropertyRangeRestrictionValueType" />
        <%
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_224id.setDateValue(dateValue_225idTemp);
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_224id.setIntegerValue(integerValue_226idTemp);
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_224id.setFloatValue(floatValue_227idTemp);
        String dateValue_229id=  request.getParameter("dateValue826");
            java.lang.Integer dateValue_229idTemp = null;
        if(!dateValue_229id.equals("")){
         dateValue_229idTemp  = java.lang.Integer.valueOf(dateValue_229id);
        }
        String integerValue_230id=  request.getParameter("integerValue828");
            java.lang.Integer integerValue_230idTemp = null;
        if(!integerValue_230id.equals("")){
         integerValue_230idTemp  = java.lang.Integer.valueOf(integerValue_230id);
        }
        String floatValue_231id=  request.getParameter("floatValue830");
            java.lang.Double floatValue_231idTemp = null;
        if(!floatValue_231id.equals("")){
         floatValue_231idTemp  = java.lang.Double.valueOf(floatValue_231id);
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyRangeRestrictionValueType_228id" scope="session" class="services.designer.pm.msg.de.PropertyRangeRestrictionValueType" />
        <%
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_228id.setDateValue(dateValue_229idTemp);
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_228id.setIntegerValue(integerValue_230idTemp);
        services1designer1pm1msg1de1PropertyRangeRestrictionValueType_228id.setFloatValue(floatValue_231idTemp);
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyRangeRestrictionType_219id" scope="session" class="services.designer.pm.msg.de.PropertyRangeRestrictionType" />
        <%
        services1designer1pm1msg1de1PropertyRangeRestrictionType_219id.setStep(services1designer1pm1msg1de1PropertyRangeRestrictionValueType_220id);
        services1designer1pm1msg1de1PropertyRangeRestrictionType_219id.setMinValue(services1designer1pm1msg1de1PropertyRangeRestrictionValueType_224id);
        services1designer1pm1msg1de1PropertyRangeRestrictionType_219id.setMaxValue(services1designer1pm1msg1de1PropertyRangeRestrictionValueType_228id);
        String timeValue_233id=  request.getParameter("timeValue834");
            java.lang.String timeValue_233idTemp = null;
        if(!timeValue_233id.equals("")){
         timeValue_233idTemp  = timeValue_233id;
        }
        String dateValue_234id=  request.getParameter("dateValue836");
            java.lang.Integer dateValue_234idTemp = null;
        if(!dateValue_234id.equals("")){
         dateValue_234idTemp  = java.lang.Integer.valueOf(dateValue_234id);
        }
        String arrayID_235id=  request.getParameter("arrayID838");
            java.lang.String arrayID_235idTemp = null;
        if(!arrayID_235id.equals("")){
         arrayID_235idTemp  = arrayID_235id;
        }
        String integerValue_236id=  request.getParameter("integerValue840");
            java.lang.Integer integerValue_236idTemp = null;
        if(!integerValue_236id.equals("")){
         integerValue_236idTemp  = java.lang.Integer.valueOf(integerValue_236id);
        }
        String floatValue_237id=  request.getParameter("floatValue842");
            java.lang.Double floatValue_237idTemp = null;
        if(!floatValue_237id.equals("")){
         floatValue_237idTemp  = java.lang.Double.valueOf(floatValue_237id);
        }
        String booleanValue_238id=  request.getParameter("booleanValue844");
            java.lang.Boolean booleanValue_238idTemp = null;
        if(!booleanValue_238id.equals("")){
         booleanValue_238idTemp  = java.lang.Boolean.valueOf(booleanValue_238id);
        }
        String stringValue_239id=  request.getParameter("stringValue846");
            java.lang.String stringValue_239idTemp = null;
        if(!stringValue_239id.equals("")){
         stringValue_239idTemp  = stringValue_239id;
        }
        String isoCode_241id=  request.getParameter("isoCode850");
            java.lang.String isoCode_241idTemp = null;
        if(!isoCode_241id.equals("")){
         isoCode_241idTemp  = isoCode_241id;
        }
        String value_242id=  request.getParameter("value852");
            java.lang.String value_242idTemp = null;
        if(!value_242id.equals("")){
         value_242idTemp  = value_242id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1MultiLanguageString_240id" scope="session" class="services.designer.pm.msg.de.MultiLanguageString" />
        <%
        services1designer1pm1msg1de1MultiLanguageString_240id.setIsoCode(isoCode_241idTemp);
        services1designer1pm1msg1de1MultiLanguageString_240id.setValue(value_242idTemp);
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyValueType_232id" scope="session" class="services.designer.pm.msg.de.PropertyValueType" />
        <%
        services1designer1pm1msg1de1PropertyValueType_232id.setTimeValue(timeValue_233idTemp);
        services1designer1pm1msg1de1PropertyValueType_232id.setDateValue(dateValue_234idTemp);
        services1designer1pm1msg1de1PropertyValueType_232id.setArrayID(arrayID_235idTemp);
        services1designer1pm1msg1de1PropertyValueType_232id.setIntegerValue(integerValue_236idTemp);
        services1designer1pm1msg1de1PropertyValueType_232id.setFloatValue(floatValue_237idTemp);
        services1designer1pm1msg1de1PropertyValueType_232id.setBooleanValue(booleanValue_238idTemp);
        services1designer1pm1msg1de1PropertyValueType_232id.setStringValue(stringValue_239idTemp);
        services1designer1pm1msg1de1PropertyValueType_232id.setMultilanguageValue(services1designer1pm1msg1de1MultiLanguageString_240id);
        String enumName_244id=  request.getParameter("enumName856");
            java.lang.String enumName_244idTemp = null;
        if(!enumName_244id.equals("")){
         enumName_244idTemp  = enumName_244id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyEnumRestrictionType_243id" scope="session" class="services.designer.pm.msg.de.PropertyEnumRestrictionType" />
        <%
        services1designer1pm1msg1de1PropertyEnumRestrictionType_243id.setEnumName(enumName_244idTemp);
        String tableName_246id=  request.getParameter("tableName860");
            java.lang.String tableName_246idTemp = null;
        if(!tableName_246id.equals("")){
         tableName_246idTemp  = tableName_246id;
        }
        String tableColumn_247id=  request.getParameter("tableColumn862");
            java.lang.String tableColumn_247idTemp = null;
        if(!tableColumn_247id.equals("")){
         tableColumn_247idTemp  = tableColumn_247id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyTableColumnRestrictionType_245id" scope="session" class="services.designer.pm.msg.de.PropertyTableColumnRestrictionType" />
        <%
        services1designer1pm1msg1de1PropertyTableColumnRestrictionType_245id.setTableName(tableName_246idTemp);
        services1designer1pm1msg1de1PropertyTableColumnRestrictionType_245id.setTableColumn(tableColumn_247idTemp);
        %>
        <jsp:useBean id="services1designer1pm1msg1de1PropertyRestrictionType_218id" scope="session" class="services.designer.pm.msg.de.PropertyRestrictionType" />
        <%
        services1designer1pm1msg1de1PropertyRestrictionType_218id.setRange(services1designer1pm1msg1de1PropertyRangeRestrictionType_219id);
        services1designer1pm1msg1de1PropertyRestrictionType_218id.setSingleValue(services1designer1pm1msg1de1PropertyValueType_232id);
        services1designer1pm1msg1de1PropertyRestrictionType_218id.setEnumReference(services1designer1pm1msg1de1PropertyEnumRestrictionType_243id);
        services1designer1pm1msg1de1PropertyRestrictionType_218id.setTableColumnReference(services1designer1pm1msg1de1PropertyTableColumnRestrictionType_245id);
        services.designer.pm.msg.de.OperationResponseType modifyPropertyRestriction783mtemp = samplePMDesignerServicesProxyid.modifyPropertyRestriction(services1designer1pm1msg1de1SessionType_211id,objectID_215idTemp,adaptorstageID_216idTemp,propertyName_217idTemp,services1designer1pm1msg1de1PropertyRestrictionType_218id);
if(modifyPropertyRestriction783mtemp == null){
%>
<%=modifyPropertyRestriction783mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(modifyPropertyRestriction783mtemp != null){
%>
<%=modifyPropertyRestriction783mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(modifyPropertyRestriction783mtemp != null){
java.lang.String typeresultMessage788 = modifyPropertyRestriction783mtemp.getResultMessage();
        String tempResultresultMessage788 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage788));
        %>
        <%= tempResultresultMessage788 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 864:
        gotMethod = true;
        String value_250id=  request.getParameter("value875");
        long value_250idTemp  = Long.parseLong(value_250id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_249id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_249id.setValue(value_250idTemp);
        String sessionID_251id=  request.getParameter("sessionID877");
            java.lang.String sessionID_251idTemp = null;
        if(!sessionID_251id.equals("")){
         sessionID_251idTemp  = sessionID_251id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_248id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_248id.setSessionToken(org1apache1axis1types1UnsignedInt_249id);
        services1designer1pm1msg1de1SessionType_248id.setSessionID(sessionID_251idTemp);
        String productModuleName_253id=  request.getParameter("productModuleName881");
            java.lang.String productModuleName_253idTemp = null;
        if(!productModuleName_253id.equals("")){
         productModuleName_253idTemp  = productModuleName_253id;
        }
        String className_254id=  request.getParameter("className883");
            java.lang.String className_254idTemp = null;
        if(!className_254id.equals("")){
         className_254idTemp  = className_254id;
        }
        String generationName_255id=  request.getParameter("generationName885");
            java.lang.String generationName_255idTemp = null;
        if(!generationName_255id.equals("")){
         generationName_255idTemp  = generationName_255id;
        }
        String adaptorstageName_256id=  request.getParameter("adaptorstageName887");
            java.lang.String adaptorstageName_256idTemp = null;
        if(!adaptorstageName_256id.equals("")){
         adaptorstageName_256idTemp  = adaptorstageName_256id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1ObjectKeyType_252id" scope="session" class="services.designer.pm.msg.de.ObjectKeyType" />
        <%
        services1designer1pm1msg1de1ObjectKeyType_252id.setProductModuleName(productModuleName_253idTemp);
        services1designer1pm1msg1de1ObjectKeyType_252id.setClassName(className_254idTemp);
        services1designer1pm1msg1de1ObjectKeyType_252id.setGenerationName(generationName_255idTemp);
        services1designer1pm1msg1de1ObjectKeyType_252id.setAdaptorstageName(adaptorstageName_256idTemp);
        services.designer.pm.msg.de.OperationResponseType deleteProductModuleByObjectKey864mtemp = samplePMDesignerServicesProxyid.deleteProductModuleByObjectKey(services1designer1pm1msg1de1SessionType_248id,services1designer1pm1msg1de1ObjectKeyType_252id);
if(deleteProductModuleByObjectKey864mtemp == null){
%>
<%=deleteProductModuleByObjectKey864mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(deleteProductModuleByObjectKey864mtemp != null){
%>
<%=deleteProductModuleByObjectKey864mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(deleteProductModuleByObjectKey864mtemp != null){
java.lang.String typeresultMessage869 = deleteProductModuleByObjectKey864mtemp.getResultMessage();
        String tempResultresultMessage869 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage869));
        %>
        <%= tempResultresultMessage869 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 889:
        gotMethod = true;
        String value_259id=  request.getParameter("value900");
        long value_259idTemp  = Long.parseLong(value_259id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_258id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_258id.setValue(value_259idTemp);
        String sessionID_260id=  request.getParameter("sessionID902");
            java.lang.String sessionID_260idTemp = null;
        if(!sessionID_260id.equals("")){
         sessionID_260idTemp  = sessionID_260id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_257id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_257id.setSessionToken(org1apache1axis1types1UnsignedInt_258id);
        services1designer1pm1msg1de1SessionType_257id.setSessionID(sessionID_260idTemp);
        String productModuleName_262id=  request.getParameter("productModuleName906");
            java.lang.String productModuleName_262idTemp = null;
        if(!productModuleName_262id.equals("")){
         productModuleName_262idTemp  = productModuleName_262id;
        }
        String className_263id=  request.getParameter("className908");
            java.lang.String className_263idTemp = null;
        if(!className_263id.equals("")){
         className_263idTemp  = className_263id;
        }
        String generationName_264id=  request.getParameter("generationName910");
            java.lang.String generationName_264idTemp = null;
        if(!generationName_264id.equals("")){
         generationName_264idTemp  = generationName_264id;
        }
        String adaptorstageName_265id=  request.getParameter("adaptorstageName912");
            java.lang.String adaptorstageName_265idTemp = null;
        if(!adaptorstageName_265id.equals("")){
         adaptorstageName_265idTemp  = adaptorstageName_265id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1ObjectKeyType_261id" scope="session" class="services.designer.pm.msg.de.ObjectKeyType" />
        <%
        services1designer1pm1msg1de1ObjectKeyType_261id.setProductModuleName(productModuleName_262idTemp);
        services1designer1pm1msg1de1ObjectKeyType_261id.setClassName(className_263idTemp);
        services1designer1pm1msg1de1ObjectKeyType_261id.setGenerationName(generationName_264idTemp);
        services1designer1pm1msg1de1ObjectKeyType_261id.setAdaptorstageName(adaptorstageName_265idTemp);
        services.designer.pm.msg.de.OperationResponseType deleteAdaptorStageByObjectKey889mtemp = samplePMDesignerServicesProxyid.deleteAdaptorStageByObjectKey(services1designer1pm1msg1de1SessionType_257id,services1designer1pm1msg1de1ObjectKeyType_261id);
if(deleteAdaptorStageByObjectKey889mtemp == null){
%>
<%=deleteAdaptorStageByObjectKey889mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(deleteAdaptorStageByObjectKey889mtemp != null){
%>
<%=deleteAdaptorStageByObjectKey889mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(deleteAdaptorStageByObjectKey889mtemp != null){
java.lang.String typeresultMessage894 = deleteAdaptorStageByObjectKey889mtemp.getResultMessage();
        String tempResultresultMessage894 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage894));
        %>
        <%= tempResultresultMessage894 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 914:
        gotMethod = true;
        String value_268id=  request.getParameter("value925");
        long value_268idTemp  = Long.parseLong(value_268id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_267id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_267id.setValue(value_268idTemp);
        String sessionID_269id=  request.getParameter("sessionID927");
            java.lang.String sessionID_269idTemp = null;
        if(!sessionID_269id.equals("")){
         sessionID_269idTemp  = sessionID_269id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_266id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_266id.setSessionToken(org1apache1axis1types1UnsignedInt_267id);
        services1designer1pm1msg1de1SessionType_266id.setSessionID(sessionID_269idTemp);
        String name_270id=  request.getParameter("name929");
            java.lang.String name_270idTemp = null;
        if(!name_270id.equals("")){
         name_270idTemp  = name_270id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1TableRowListType_271id" scope="session" class="services.designer.pm.msg.de.TableRowListType" />
        <%
        %>
        <jsp:useBean id="services1designer1pm1msg1de1TableRowListType_273id" scope="session" class="services.designer.pm.msg.de.TableRowListType" />
        <%
        %>
        <jsp:useBean id="services1designer1pm1msg1de1TableRowListType_274id" scope="session" class="services.designer.pm.msg.de.TableRowListType" />
        <%
        %>
        <jsp:useBean id="services1designer1pm1msg1de1TableModifyRowType_272id" scope="session" class="services.designer.pm.msg.de.TableModifyRowType" />
        <%
        services1designer1pm1msg1de1TableModifyRowType_272id.setKeyCells(services1designer1pm1msg1de1TableRowListType_273id);
        services1designer1pm1msg1de1TableModifyRowType_272id.setValueCells(services1designer1pm1msg1de1TableRowListType_274id);
        %>
        <jsp:useBean id="services1designer1pm1msg1de1TableRowListType_275id" scope="session" class="services.designer.pm.msg.de.TableRowListType" />
        <%
        services.designer.pm.msg.de.OperationResponseType modifyTableData914mtemp = samplePMDesignerServicesProxyid.modifyTableData(services1designer1pm1msg1de1SessionType_266id,name_270idTemp,services1designer1pm1msg1de1TableRowListType_271id,services1designer1pm1msg1de1TableModifyRowType_272id,services1designer1pm1msg1de1TableRowListType_275id);
if(modifyTableData914mtemp == null){
%>
<%=modifyTableData914mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(modifyTableData914mtemp != null){
%>
<%=modifyTableData914mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(modifyTableData914mtemp != null){
java.lang.String typeresultMessage919 = modifyTableData914mtemp.getResultMessage();
        String tempResultresultMessage919 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage919));
        %>
        <%= tempResultresultMessage919 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 941:
        gotMethod = true;
        String value_278id=  request.getParameter("value954");
        long value_278idTemp  = Long.parseLong(value_278id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_277id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_277id.setValue(value_278idTemp);
        String sessionID_279id=  request.getParameter("sessionID956");
            java.lang.String sessionID_279idTemp = null;
        if(!sessionID_279id.equals("")){
         sessionID_279idTemp  = sessionID_279id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_276id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_276id.setSessionToken(org1apache1axis1types1UnsignedInt_277id);
        services1designer1pm1msg1de1SessionType_276id.setSessionID(sessionID_279idTemp);
        String name_280id=  request.getParameter("name958");
            java.lang.String name_280idTemp = null;
        if(!name_280id.equals("")){
         name_280idTemp  = name_280id;
        }
        services.designer.pm.msg.de.GetTableLayoutResponseType getTableLayout941mtemp = samplePMDesignerServicesProxyid.getTableLayout(services1designer1pm1msg1de1SessionType_276id,name_280idTemp);
if(getTableLayout941mtemp == null){
%>
<%=getTableLayout941mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(getTableLayout941mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getTableLayout941mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(getTableLayout941mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getTableLayout941mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage948 = tebece0.getResultMessage();
        String tempResultresultMessage948 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage948));
        %>
        <%= tempResultresultMessage948 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 960:
        gotMethod = true;
        String value_283id=  request.getParameter("value975");
        long value_283idTemp  = Long.parseLong(value_283id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_282id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_282id.setValue(value_283idTemp);
        String sessionID_284id=  request.getParameter("sessionID977");
            java.lang.String sessionID_284idTemp = null;
        if(!sessionID_284id.equals("")){
         sessionID_284idTemp  = sessionID_284id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_281id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_281id.setSessionToken(org1apache1axis1types1UnsignedInt_282id);
        services1designer1pm1msg1de1SessionType_281id.setSessionID(sessionID_284idTemp);
        String name_285id=  request.getParameter("name979");
            java.lang.String name_285idTemp = null;
        if(!name_285id.equals("")){
         name_285idTemp  = name_285id;
        }
        services.designer.pm.msg.de.GetTableDataResponseType getTableData960mtemp = samplePMDesignerServicesProxyid.getTableData(services1designer1pm1msg1de1SessionType_281id,name_285idTemp);
if(getTableData960mtemp == null){
%>
<%=getTableData960mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">tableValues:</TD>
<TD>
<%
if(getTableData960mtemp != null){
java.lang.String[][] typetableValues963 = getTableData960mtemp.getTableValues();
        String temptableValues963 = null;
        if(typetableValues963 != null){
        java.util.List listtableValues963= java.util.Arrays.asList(typetableValues963);
        temptableValues963 = listtableValues963.toString();
        }
        %>
        <%=temptableValues963%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(getTableData960mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getTableData960mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(getTableData960mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=getTableData960mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage969 = tebece0.getResultMessage();
        String tempResultresultMessage969 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage969));
        %>
        <%= tempResultresultMessage969 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 981:
        gotMethod = true;
        String value_288id=  request.getParameter("value992");
        long value_288idTemp  = Long.parseLong(value_288id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_287id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_287id.setValue(value_288idTemp);
        String sessionID_289id=  request.getParameter("sessionID994");
            java.lang.String sessionID_289idTemp = null;
        if(!sessionID_289id.equals("")){
         sessionID_289idTemp  = sessionID_289id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_286id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_286id.setSessionToken(org1apache1axis1types1UnsignedInt_287id);
        services1designer1pm1msg1de1SessionType_286id.setSessionID(sessionID_289idTemp);
        String objectID_290id=  request.getParameter("objectID996");
            java.lang.String objectID_290idTemp = null;
        if(!objectID_290id.equals("")){
         objectID_290idTemp  = objectID_290id;
        }
        String adaptorstageID_291id=  request.getParameter("adaptorstageID998");
            java.lang.String adaptorstageID_291idTemp = null;
        if(!adaptorstageID_291id.equals("")){
         adaptorstageID_291idTemp  = adaptorstageID_291id;
        }
        String propertyName_292id=  request.getParameter("propertyName1000");
            java.lang.String propertyName_292idTemp = null;
        if(!propertyName_292id.equals("")){
         propertyName_292idTemp  = propertyName_292id;
        }
        String tagID_293id=  request.getParameter("tagID1002");
            java.lang.String tagID_293idTemp = null;
        if(!tagID_293id.equals("")){
         tagID_293idTemp  = tagID_293id;
        }
        String newTagValue_294id=  request.getParameter("newTagValue1004");
            java.lang.String newTagValue_294idTemp = null;
        if(!newTagValue_294id.equals("")){
         newTagValue_294idTemp  = newTagValue_294id;
        }
        services.designer.pm.msg.de.OperationResponseType modifyPropertyTag981mtemp = samplePMDesignerServicesProxyid.modifyPropertyTag(services1designer1pm1msg1de1SessionType_286id,objectID_290idTemp,adaptorstageID_291idTemp,propertyName_292idTemp,tagID_293idTemp,newTagValue_294idTemp);
if(modifyPropertyTag981mtemp == null){
%>
<%=modifyPropertyTag981mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(modifyPropertyTag981mtemp != null){
%>
<%=modifyPropertyTag981mtemp.getResultCode()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(modifyPropertyTag981mtemp != null){
java.lang.String typeresultMessage986 = modifyPropertyTag981mtemp.getResultMessage();
        String tempResultresultMessage986 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage986));
        %>
        <%= tempResultresultMessage986 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1006:
        gotMethod = true;
        String value_297id=  request.getParameter("value1021");
        long value_297idTemp  = Long.parseLong(value_297id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedInt_296id" scope="session" class="org.apache.axis.types.UnsignedInt" />
        <%
        org1apache1axis1types1UnsignedInt_296id.setValue(value_297idTemp);
        String sessionID_298id=  request.getParameter("sessionID1023");
            java.lang.String sessionID_298idTemp = null;
        if(!sessionID_298id.equals("")){
         sessionID_298idTemp  = sessionID_298id;
        }
        %>
        <jsp:useBean id="services1designer1pm1msg1de1SessionType_295id" scope="session" class="services.designer.pm.msg.de.SessionType" />
        <%
        services1designer1pm1msg1de1SessionType_295id.setSessionToken(org1apache1axis1types1UnsignedInt_296id);
        services1designer1pm1msg1de1SessionType_295id.setSessionID(sessionID_298idTemp);
        String libraryName_299id=  request.getParameter("libraryName1025");
            java.lang.String libraryName_299idTemp = null;
        if(!libraryName_299id.equals("")){
         libraryName_299idTemp  = libraryName_299id;
        }
        services.designer.pm.msg.de.FindIDResponseType findLibraryID1006mtemp = samplePMDesignerServicesProxyid.findLibraryID(services1designer1pm1msg1de1SessionType_295id,libraryName_299idTemp);
if(findLibraryID1006mtemp == null){
%>
<%=findLibraryID1006mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">operationResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultCode:</TD>
<TD>
<%
if(findLibraryID1006mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findLibraryID1006mtemp.getOperationResponse();
if(tebece0 != null){
%>
<%=tebece0.getResultCode()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">resultMessage:</TD>
<TD>
<%
if(findLibraryID1006mtemp != null){
services.designer.pm.msg.de.OperationResponseType tebece0=findLibraryID1006mtemp.getOperationResponse();
if(tebece0 != null){
java.lang.String typeresultMessage1013 = tebece0.getResultMessage();
        String tempResultresultMessage1013 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultMessage1013));
        %>
        <%= tempResultresultMessage1013 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(findLibraryID1006mtemp != null){
java.lang.String typeid1015 = findLibraryID1006mtemp.getId();
        String tempResultid1015 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid1015));
        %>
        <%= tempResultid1015 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>