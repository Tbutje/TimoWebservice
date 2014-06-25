package timo;

import java.io.IOException;
import java.util.HashMap;
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

	private String inputType; // xls, xlsx, csv
	private String inputFile; // D:\\Premium-Table-Example.xlsx // ;

	// D:\\simpel.xls ;// "D:\\simpel.csv"
	private String outputType; // msg.PM, DMBS, XML
	private String outputFile; // "D:\\file.xml"; XML is enige dat hier iets mee
								// doet

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
		if (!validator.checkInputExt(inputFile)) {
			errors.put("inputFile", "inputFile.");
			valid = false;
		}

		if (valid) {
			Run run = new Run();
			run.doStuff(inputFile, outputType, outputFile);
		}

		// error handling
		request.setAttribute("errors", errors);

		// return to page
		String nextJSP = "/Input.jsp";
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);

	}

	public String getInputType() {
		return inputType;
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

}
