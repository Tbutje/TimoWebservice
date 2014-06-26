package timo;

import java.util.List;

/**
 * This Reader calls other classes named Readxx depending on the file extension
 * The other read classes return a List<List<String>>. Since the required end
 * format is columnNames[] and rowValues[][] the List is converted to this
 * filetype Because of the two return values I chose to not have a return
 * statement but have the higher classes call the getter of each type.
 * Alternatively i could have another class, just like in the MsgPm library,
 * that combines the two. However for me it was easyer to connect with the GUI
 * etc. to keep it split up. But it could be argued that they should infact be
 * combined to one class
 * 
 * @author Timo Koole
 */
public class Read {

	private List<List<String>> data = null;
	private String[] columnNames;
	private String[][] rowValues;

	public void readFile(String inputFile) throws Exception {

		String fileType = getFileExtension(inputFile);
		if (fileType.equals("xls") || fileType.equals("xlsx")) {
			ReadExcel readExcel = new ReadExcel();
			this.data = readExcel.readFile(inputFile);
		} else if (fileType.equals("csv")) {
			ReadCsv readCsv = new ReadCsv();
			this.data = readCsv.readFile(inputFile);
		} else {
			data = null;
			throw new Exception("Unknown extension");
		}

		// convert the List to the required columnNames/rowValues format
		ConvertInputFormat convertInputFormat = new ConvertInputFormat(data);
		columnNames = convertInputFormat.getColumnNames();
		rowValues = convertInputFormat.getRowValues();
	}

	private static String getFileExtension(String fileName) {
		String ext;
		int mid = fileName.lastIndexOf(".");
		ext = fileName.substring(mid + 1, fileName.length());
		return ext;
	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public String[][] getRowValues() {
		return rowValues;
	}

}
