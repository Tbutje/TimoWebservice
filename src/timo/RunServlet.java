package timo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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

		// setup logging
		SimpleFormatter formatterTxt = new SimpleFormatter();
		Logger logger = Logger.getLogger("timologger");
		try {
			FileHandler handler = new FileHandler("d:\\timologger.log", true);
			handler.setFormatter(formatterTxt);
			logger.addHandler(handler);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		Map<String, String> errors = new HashMap<String, String>();
		ValidateInput validator = new ValidateInput();
		Boolean valid = true; // this will change to false if any input variable
								// is not valid

		inputFile = request.getParameter("inputFile");
		// validate input
		// extension must be csv, xls, xlsx
		if (!validator.checkInputExt(inputFile)) {
			errors.put("inputFile",
					"Select a valid input file: csv, xls, xlsx.");
			valid = false;
		}

		outputType = request.getParameter("outputType");

		outputFile = request.getParameter("outputFile");

		// validate extension
		if (outputType.equals("XML")) {
			if (!validator.checkOutputExt(outputFile)) {
				errors.put("outputFile", "Extension must be .XML");
				valid = false;
			}
		}

		// validate file location
		if (outputType.equals("XML")) {
			if (!validator.isValidFileLoc(outputFile)) {
				errors.put("outputFile", "Output location does not exist");
				valid = false;
			}
		}

		if (valid) {

			// read file
			Read reader = new Read();
			try {
				reader.readFile(inputFile);
			} catch (Exception ex) {
				valid = false;
				errors.put("inputFile", "Cannot read input file");
				logger.severe(ex.getMessage());

			}
			columnNames = reader.getColumnNames();
			rowValues = reader.getRowValues();

			// Validate data
			if (!validator.checkColumnNames(columnNames)) {
				errors.put("inputFile",
						"Input file does not have required column names");
				valid = false;
			}

			// write data
			if (valid) {
				request.setAttribute("rowValues", rowValues);
				request.setAttribute("columnNames", columnNames);
				Write write = new Write(outputType, outputFile, columnNames,
						rowValues);
				try {
					write.writeToOutput();
					errors.put("writeSucces", "succesfully written to file");
				} catch (Exception ex) {
					errors.put("outputFile", "Can't write to output file: "
							+ ex.getMessage());
					logger.severe(ex.getMessage());
				}
			}

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
