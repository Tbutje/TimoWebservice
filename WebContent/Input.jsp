<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core">

<!-- This java script is used to "grey out" the file output box -->
<!-- since it should only be used when writing to xml -->
<!-- It is called everytime a change is made in dropdown list-->
<script type="text/javascript">
	function findselected() {
		var selMenu = document.getElementById('outmenu');
		var txtField = document.getElementById('outfile');
		if (selMenu.value == 'XML')
			txtField.disabled = false;
		else {
			txtField.disabled = true;
			txtField.value = "";
		}
	}
</script>

<h:head>
	<title>Convert Input to Output</title>
	<link href="timostyle.css" rel="stylesheet" type="text/css" />
</h:head>

<body class="background">
	<div class="title">Convert Input to Output</div>

	<!-- The servlet processes input files when create File is pressed-->
	<!-- the error classes are used to display errors that are send by the servlet-->
	<form action="RunServlet" method="post">
		<table>
			<tr>
				<td>inputFile</td>
				<td><input type="file" name="inputFile"
					value="${param.inputFile}" accept=".csv, .xlsx, .xls, .xml" /></td>
				<td><span class="error">${errors.inputFile}</span></td>
			</tr>
			<tr>
				<td>outputType</td>
				<td><select name="outputType" id="outmenu"
					onChange="findselected()">
						<option value="XML">XML</option>
						<option value="msg.PM">msg.PM</option>
						<option value="DBMS">DMBS</option>
				</select></td>
				<td><span class="error">${errors.outputType}</span></td>
			</tr>
			<tr>
				<td>outputFile (Only XML)</td>
				<td><input type="text" name="outputFile" id="outfile"
					value="${param.outputFile}" /></td>
				<td><span class="error">${errors.outputFile}</span></td>
			</tr>
		</table>

		<input type="submit" value="Create File"> <br> <span
			class="confirmed">${errors.writeSucces}</span>

	</form>
	<br/>


	<!-- this will display a html table with the data when there is data -->
	<!-- the try and empty catch result in that the table is only generated with data -->
	<%
		try {
			out.print("	<div style=\"width: 1200px; height: 300px; display: inline-block; overflow-x: auto; overflow-y: auto;\">");

			String[][] rowValues = (String[][]) request
					.getAttribute("rowValues");
			String[] columnNames = (String[]) request
					.getAttribute("columnNames");

			out.print("<table class=\"table\">");

			// generate headers
			for (int colIdx = 0; colIdx < columnNames.length; colIdx++) {
				out.println("<th>" + columnNames[colIdx] + "</th>");
			}

			// generate rows
			for (int rowIdx = 0; rowIdx < rowValues.length; rowIdx++) {
				out.print("<tr>");

				for (int colIdx = 0; colIdx < columnNames.length; colIdx++) {
					out.println("<td>" + rowValues[rowIdx][colIdx]
							+ "</td>");
				}
				out.print("</tr>");
			}
			out.print("</table>");
			out.print("</div>");
		} catch (Exception ex) {
		}
	%>

</body>