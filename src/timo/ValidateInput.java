package timo;

import java.io.File;

public class ValidateInput {

	public Boolean checkInputExt(String fileName) {
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

	public Boolean checkOutputExt(String fileName) {
		// check if input is within allowed file extensions

		String ext = getFileExtension(fileName);
		String[] filetypes = { "XML" };

		for (String s : filetypes) {
			if (ext.equalsIgnoreCase(s)) {
				return true;
			}
		}

		return false;
	}

	public Boolean checkColumnNames(String[] columnNames) {
		// check if input is within allowed file extensions

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

		}

		return true;
	}

	public Boolean isTypeValidObject(String[] columnNames, String[][] rowValues) {
		Boolean result = true;
		// VALID_FROM == date
		// VALID_TO == date
		// CODE == string

		// OBJECT_TYPE == int

		// first get column idx
		Integer objectIdx = null;
		for (int idx = 0; idx < columnNames.length; idx++) {
			if (columnNames[idx].equals("OBJECT_TYPE")) {
				objectIdx = idx;
				break;
			}
		}
		// now check values in array
		for (int idx = 0; idx < rowValues.length; idx++) {
			try {
				Integer.parseInt(rowValues[idx][objectIdx]);
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
		Integer objectIdx = null;
		for (int idx = 0; idx < columnNames.length; idx++) {
			if (columnNames[idx].equals("VALID_TO")) {
				objectIdx = idx;
				break;
			}
		}

		// now check values in array
		for (int idx = 0; idx < rowValues.length; idx++) {
			// use regular expression to match date format
			if (!(rowValues[idx][objectIdx]
					.matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d") || rowValues[idx][objectIdx]
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

		// String fname = "";
		String ext;
		int mid = filename.lastIndexOf("\\");
		if (mid < 0) {
			return false; // dit gebuert er als er uberhaupt een \ in de naam
							// zit
		}
		ext = filename.substring(0, mid);
		File f = new File(ext);

		return f.isDirectory();

	}

	private static String getFileExtension(String fname2) {
		// gebruik deze functie voor het lezen van de extensie
		String fileName = fname2;
		// String fname = "";
		String ext = "";
		int mid = fileName.lastIndexOf(".");
		// fname = fileName.substring(0, mid);
		ext = fileName.substring(mid + 1, fileName.length());
		return ext;
	}

}
