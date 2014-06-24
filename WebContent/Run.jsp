<%@page import="timo.Run"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="run" class="timo.Run" scope="session" />

<html xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core">

<h:head>
	<title>DataLeesApp</title>
	<link href="timostyle.css" rel="stylesheet" type="text/css" />

</h:head>


<% run.doStuff();%>
</BODY>
</HTML>