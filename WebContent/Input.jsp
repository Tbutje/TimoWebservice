<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core">


<script type="text/javascript">
	function findselected() {
		var selMenu = document.getElementById('outmenu');
		var txtField = document.getElementById('outfile');
		if (selMenu.value == 'XML')
			txtField.disabled = false;
		else{
			txtField.disabled = true;
			txtField.value = "";
		}
			
	}
</script>




<h:head>
	<title>DataLeesApp</title>
	<link href="timostyle.css" rel="stylesheet" type="text/css" />

</h:head>


<BODY class="grijze_achtergrond">
	<div class="kop">Convert Input to Output</div>

	<form action="RunServlet" method="post">

		<table>
			<tr>
				<td>inputFile</td>
				<td><input type="file" name="inputFile"
					value="${param.inputFile}" accept=".csv" /> <span class="error">${errors.inputFile}</span>
				</td>
			</tr>
			<tr>
				<td>outputType</td>
				<td><select name="outputType" id="outmenu" onChange="findselected()">
						<option value="XML">XML</option>
						<option value="msg.PM">msg.PM</option>
						<option value="DMBS">DMBS</option>
				</select> <span class="error">${errors.outputType}</span></td>
			</tr>
			<tr>
				<td>outputFile (Only XML)</td>
				<td><input type="text" name="outputFile" id = "outfile"
					value="${param.outputFile}" /> <span class="error">${errors.outputFile}</span></td>
			</tr>
		</table>

		<input type="submit" value="Create File">

	</form>

</BODY>