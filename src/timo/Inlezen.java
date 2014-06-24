package timo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

//import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.List;
import java.util.ArrayList;

public class Inlezen {

	private List<List<String>> data = null;

	private String file_location;

	public List<List<String>> readFile(String file_type, String file_location) {
		// TODO: error handling nu niet goed als je iets randoms invuld;
		// misschien enum van maken?
		this.file_location = file_location;

		switch (file_type) {

		case "excel":
			readExcel();
		case "csv":
			readCsv();
		}

		return data;

	}

	private void readExcel() {
		this.data = new ArrayList<List<String>>();
		Sheet sheet = null;

		try {

			FileInputStream file = new FileInputStream(new File(
					this.file_location));

			// xls and xlsx switch
			if (GetFileExtension(file_location).equalsIgnoreCase("xls")) {
				// xls
				HSSFWorkbook workbookHssf = new HSSFWorkbook(file);
				sheet = workbookHssf.getSheetAt(0);

			} else if (GetFileExtension(file_location).equalsIgnoreCase("xlsx")) {
				// xlsx
				XSSFWorkbook workbookXssf = new XSSFWorkbook(file);
				sheet = workbookXssf.getSheetAt(0);

			} else {
				// TODO: iets van een error
			}

			// Iterate through each rows from first sheet
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				// For each row, iterate through each columns
				Iterator<Cell> cellIterator = row.cellIterator();
				List<String> row_read = new ArrayList<String>();
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_BOOLEAN:
						row_read.add(String.valueOf(cell.getBooleanCellValue()));
						break;
					case Cell.CELL_TYPE_NUMERIC:
						row_read.add(String.valueOf(cell.getNumericCellValue()));
						break;
					case Cell.CELL_TYPE_STRING:
						row_read.add(cell.getStringCellValue());
						break;
					}

				}
				data.add(row_read);
			}

			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void readCsv(){
		this.data = new ArrayList<List<String>>();
		String csvFile = this.file_location;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";
	 
		try {
	 
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
	 
				List<String> row_read = new ArrayList<String>();
				String[] row = line.split(cvsSplitBy);
				for(String s:row){
					row_read.add(s);
				}
				data.add(row_read);
			
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
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

}
