package timo;

import java.util.List;


/**
 * This Class Converts List<List<String>> coming from a data source to
 * the required format of columnNames[] and rowValues[][]
 * @author Timo Koole
 */
public class ConvertInputFormat {
	
	private String[] columnNames;
	private String[][] rowValues;
	
	public ConvertInputFormat(List<List<String>> data) {
		
		// java.lang.String[] columnNames: 1 dimensional array with column names
		// java.lang.String[][] rowValues: 2 dimensional array with row values
		// Both array's are strings
		
		columnNames = new String[data.get(0).size()];
		rowValues = new String[data.size() - 1][data.get(0).size()]; // -1 because of the header
		
		// extract first row --> col names
		for (int rowIdx = 0; rowIdx < data.size(); rowIdx++) {
			List<String> row = data.get(rowIdx);

			for (int colIdx = 0; colIdx < data.get(0).size(); colIdx++) {
				if (rowIdx == 0) {
					columnNames[colIdx] = row.get(colIdx);
				} else {
					rowValues[rowIdx - 1][colIdx] = row.get(colIdx); // -1 because of the header
					
				} // if statement
			} // col
		} // row
	}

	public String[][] getRowValues() {
		return rowValues;
	}


	public String[] getColumnNames() {
		return columnNames;
	}

}
