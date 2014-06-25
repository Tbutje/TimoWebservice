package timo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RunServlet
 */
public class RunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String inputFile; 
	private String outputType; 
	private String outputFile; 
	
	private String[] columnNames = null;
	private String[][] rowValues = null;
	


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RunServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Map<String, String> errors = new HashMap<String, String>();
		ValidateInput validator = new ValidateInput();
		Boolean valid = true; // this will change to false if any input variable
								// is not valid

		inputFile = request.getParameter("inputFile");
		// validate input
		// extension must be csv, xls, xlsx
		if (!validator.checkInputExt(inputFile)) {
			errors.put("inputFile", "Select a valid input file: csv, xls, xlsx.");
			valid = false;
		}

		outputType = request.getParameter("outputType");
	
		outputFile = request.getParameter("outputFile");
		
		// validate extension
		if (!validator.checkOutputExt(outputFile)) {
			errors.put("outputFile", "Extension must be .XML");
			valid = false;
		}

		// validate file location
		if(!validator.isValidFileLoc(outputFile)){
			errors.put("outputFile", "Output location does not exist");
			valid = false;
			
		}
		
		
		if (valid) {
			
			Read inlezen = new Read();
			List<List<String>> data = inlezen.readFile(inputFile);
			
			// convert naar generic format met headers
			ConvertInputFormat convertInputFormat = new ConvertInputFormat(data);
			columnNames = convertInputFormat.getColumnNames();
			rowValues = convertInputFormat.getRowValues();
			
			// Validate data
			if(!validator.checkColumnNames(columnNames)){
				errors.put("inputFile", "Input file does not have required column names");
				valid = false;
			}
			
			// write data
			if(valid){
				request.setAttribute("rowValues", rowValues);
				request.setAttribute("columnNames", columnNames);
				Write write = new Write(outputType, outputFile, columnNames, rowValues);
				write.writeToOutput();
				errors.put("writeSucces", "succesfully written to file");
			}

			//Run run = new Run();
		//	run.doStuff(inputFile, outputType, outputFile);
			
		}
		
	

		// error handling
		request.setAttribute("errors", errors);

		// return to page
		String nextJSP = "/Input.jsp";
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);

	}


	public String getInputFile() {
		return inputFile;
	}

	public String getOutputType() {
		return outputType;
	}

	public String getOutputFile() {
		return outputFile;
	}
	
	public String[] getColumnNames() {
		return columnNames;
	}

	public String[][] getRowValues() {
		return rowValues;
	}

	

}
