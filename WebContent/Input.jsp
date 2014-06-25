<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="run" class="timo.RunBean" scope="session" />

<html xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core">

<h:head>
	<title>DataLeesApp</title>
	<link href="timostyle.css" rel="stylesheet" type="text/css" />

</h:head>

  <form action="RunServlet" method="post">

       InputType <input type="text" name="inputType" value="csv" onClick="if(this.value == 'Enter a Name'){this.value = '';}" /> <BR> 
       InputType <input type="text" name="inputFile" value="D:\\simpel.csv" onClick="if(this.value == 'Enter a Name'){this.value = '';}" /><BR> 
        outputType <input type="text" name="outputType" value="XML" onClick="if(this.value == 'Enter a Name'){this.value = '';}" /><BR> 
        outputFile  <input type="text" name="outputFile" value="D:\\file6.xml" onClick="if(this.value == 'Enter a Name'){this.value = '';}" /><BR> 
        <input type="submit">
    </form> 
    


<BODY class="grijze_achtergrond">
	<div class="kop">Timo's de bom applicatie</div>
	<FORM METHOD=POST ACTION="Run.jsp">

		InputType <INPUT TYPE=TEXT NAME=inputType SIZE=20 VALUE="<%=run.getInputType()%>"><BR> 
			inputFile <INPUT TYPE=TEXT NAME=inputFile SIZE=20 VALUE="<%=run.getInputFile()%>"><BR>
		outputType <INPUT TYPE =TEXT NAME=outputType SIZE=4 VALUE="<%=run.getOutputType()%>">	<BR>
		outputFile <INPUT TYPE=TEXT NAME=outputFile SIZE=20 VALUE="<%=run.getOutputFile()%>"><BR>

		<P>
			<INPUT TYPE=SUBMIT>
	</FORM>

	InputType:<%=run.getInputType()%><br />
	 inputFile:<%run.getInputFile();%><br />
	outputType:	<%=run.getOutputType()%><br />
	outputFile: <%=run.getOutputFile()%><br />
</BODY>