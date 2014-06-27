package timo;

import java.io.File;

/**
 * This class has several functions to validate input. Each function should be
 * called individually. Each function returns true when input is valid
 * As of this moment only RunServlet calls these methods to
 * validate the user input. But since all functions are in this class it is
 * quite easy to reuse them for other Gui's
 * 
 * @author Timo Koole
 */
public class ValidateInput {

	public Boolean isValidInputExt(String fileName) {
		// check if input is within allowed file extensions

		String ext = getFileExtension(fileName);
		String[] filetypes = { "csv", "xls", "xlsx" };

		for (String s : filetypes) {
			if (ext.equalsIgnoreCase(s)) {
				return true;
			}
		}

		return false;
	}

	public Boolean isValidOutputExt(String fileName) {
		// check if output is within allowed file extensions

		String ext = getFileExtension(fileName);
		String[] filetypes = { "XML" };

		for (String s : filetypes) {
			if (ext.equalsIgnoreCase(s)) {
				return true;
			}
		}

		return false;
	}

	public Boolean isColumnNamesValid(String[] columnNames) {
		// check if all required column names are there

		String[] reqColNames = { "VALID_FROM", "VALID_TO", "OBJECT_TYPE",
				"CODE" };
		
		for (String reqname : reqColNames) {
			Boolean match = new Boolean(false);

			for (String name : columnNames) {
				if (reqname.equals(name)) {
					match = true;
					break;
				}
			}
			// if any of the reqColnames is not found then return false
			if (!match) {
				return false;
			}
		} // end reqColNames loop

		return true;
	}

	public Boolean isTypeValidObject(String[] columnNames, String[][] rowValues) {
		Boolean result = true;
		// OBJECT_TYPE == int

		// first get column idx
		Integer colIdx = null;
		for (int idx = 0; idx < columnNames.length; idx++) {
			if (columnNames[idx].equals("OBJECT_TYPE")) {
				colIdx = idx;
				break;
			}
		}
		// now check values in array
		for (int idx = 0; idx < rowValues.length; idx++) {
			try {
				Integer.parseInt(rowValues[idx][colIdx]);
			} catch (NumberFormatException e) {
				result = false;
			}
		}
		return result;
	}

	public Boolean isTypeValidValidTo(String[] columnNames, String[][] rowValues) {
		Boolean result = true;
		// VALID_TO == date

		// first get column idx
		Integer colIdx = null;
		for (int idx = 0; idx < columnNames.length; idx++) {
			if (columnNames[idx].equals("VALID_TO")) {
				colIdx = idx;
				break;
			}
		}

		// now check values in array
		for (int idx = 0; idx < rowValues.length; idx++) {
			// use regular expression to match date format
			// <+> is apperantly used for empty values
			if (!(rowValues[idx][colIdx]
					.matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d") || rowValues[idx][colIdx]
					.equals("<+>"))) {
				result = false;
			}
		}
		return result;
	}

	public Boolean isTypeValidValidFrom(String[] columnNames,
			String[][] rowValues) {
		Boolean result = true;
		// VALID_FROM == date

		// first get column idx
		Integer objectIdx = null;
		for (int idx = 0; idx < columnNames.length; idx++) {
			if (columnNames[idx].equals("VALID_FROM")) {
				objectIdx = idx;
				break;
			}
		}
		// now check values in array
		for (int idx = 0; idx < rowValues.length; idx++) {
			// use regular expression to match date format
			if (!rowValues[idx][objectIdx]
					.matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d")) {
				result = false;
			}

		}
		return result;
	}

	public Boolean isValidFileLoc(String filename) {
		// check if filelocation is valid
		String ext;
		int mid = filename.lastIndexOf("\\");
		if (mid < 0) {
			return false; // when there is no backslash at all in the name
		}
		ext = filename.substring(0, mid);
		File f = new File(ext);

		return f.isDirectory();
	}

	private static String getFileExtension(String fileName) {
		String ext;
		int mid = fileName.lastIndexOf(".");
		ext = fileName.substring(mid + 1, fileName.length());
		return ext;
	}
}
