package timo;

import java.util.List;

public class ConvertInputFormat {
	
	private String[] columnNames;
	private String[][] rowValues;
	

	public ConvertInputFormat(List<List<String>> data) {
		// arraylistTo required data format
		// tableRowListType(columnNames,rowValues) // DELETE en ADD ROWS
		// java.lang.String[] columnNames: 1 dimensionaal array met column namen
		// java.lang.String[][] rowValues: 2 dimensionaal array met de rows.
		// values zijn STRING!
		columnNames = new String[data.get(0).size()];
		rowValues = new String[data.size() - 1][data.get(0).size()]; // -1 wegens header
		
		// extract first row --> col names
		for (int rowIdx = 0; rowIdx < data.size(); rowIdx++) {
			List<String> row = data.get(rowIdx);

			for (int colIdx = 0; colIdx < data.get(0).size(); colIdx++) {
				// eerste row zijn col names
				if (rowIdx == 0) {
					columnNames[colIdx] = row.get(colIdx);
				} else {
					rowValues[rowIdx - 1][colIdx] = row.get(colIdx); // -1 wegens header
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
