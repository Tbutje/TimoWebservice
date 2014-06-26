package timo;

import java.util.List;

public class Read {

	private List<List<String>> data = null;
	private String[] columnNames;
	private String[][] rowValues;


	public void readFile(String inputFile) throws Exception{
		String fileType = GetFileExtension(inputFile);

		if(fileType.equals("xls") || fileType.equals("xlsx")){
			ReadExcel readExcel = new ReadExcel();
			this.data = readExcel.readFile(inputFile);
		}else if(fileType.equals("csv")){
			ReadCsv readCsv = new ReadCsv();
			this.data = readCsv.readFile(inputFile);
		}else{
			data = null;
			throw new Exception("Unknown extension");
			}
		
		// convert naar generic format met headers
		ConvertInputFormat convertInputFormat = new ConvertInputFormat(data);
		columnNames = convertInputFormat.getColumnNames();
		rowValues = convertInputFormat.getRowValues();
		}


	private static String GetFileExtension(String fname2) {
		// gebruik deze functie voor het lezen van de extensie
		String fileName = fname2;
		// String fname = "";
		String ext = "";
		int mid = fileName.lastIndexOf(".");
		// fname = fileName.substring(0, mid);
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
