package timo;

import java.io.IOException;
import java.util.HashMap;
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
 * This servlet is called by Input.jsp to process input and send a response back
 * This servlet also performs the input validation which adds alot of code. But
 * I wanted to give specific feedback to the gui what was wrong and therefore
 * this seemed to be the best method
 * 
 * @author Timo Koole
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
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Not using this call

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// setup logging
		// switched file writing off, since this will write to a dir that may
		// not exist for whoever is testing this program
		//SimpleFormatter formatterTxt = new SimpleFormatter();
		Logger logger = Logger.getLogger("timologger");
		try {
			//FileHandler handler = new FileHandler("d:\\timologgui.log");
			//handler.setFormatter(formatterTxt);
			//logger.addHandler(handler);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// this map is used for all the errors
		Map<String, String> errors = new HashMap<String, String>();

		// the validator is used for all the validation checks
		ValidateInput validator = new ValidateInput();
		Boolean valid = true; // this will change to false if any input variable
								// is not valid

		inputFile = request.getParameter("inputFile");
		// validate input
		// extension must be csv, xls, xlsx
		if (!validator.isValidInputExt(inputFile)) {
			errors.put("inputFile",
					"Select a valid input file: csv, xls, xlsx.");
			valid = false;
		}

		outputType = request.getParameter("outputType");

		outputFile = request.getParameter("outputFile");
		// validate extension, this is only done when outputType == XML
		if (outputType.equals("XML")) {
			if (!validator.isValidOutputExt(outputFile)) {
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

			// *****Validate data
			if (valid) {
				columnNames = reader.getColumnNames();
				rowValues = reader.getRowValues();

				// Validate column names
				if (!validator.isColumnNamesValid(columnNames)) {
					errors.put("inputFile",
							"Input file does not have required column names");
					valid = false;
				}
				if (valid) {
					// validate data type OBJECT_TYPE column
					if (!validator.isTypeValidObject(columnNames, rowValues)) {
						errors.put("inputFile",
								"Data format of column OBJECT_TYPE is not correct");
						valid = false;
					}

					// validate VALID_FROM column
					if (!validator.isTypeValidValidFrom(columnNames, rowValues)) {
						errors.put("inputFile",
								"Data format of column VALID_FROM is not correct");
						valid = false;
					}

					// validate VALID_TO column
					if (!validator.isTypeValidValidTo(columnNames, rowValues)) {
						errors.put("inputFile",
								"Data format of column VALID_TO is not correct");
						valid = false;
					}
				}
			}

			// write data
			if (valid) {
				// send rowvalues and columnnames to the client to display
				request.setAttribute("rowValues", rowValues);
				request.setAttribute("columnNames", columnNames);
				
				//write to file
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

		// Send messages
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
