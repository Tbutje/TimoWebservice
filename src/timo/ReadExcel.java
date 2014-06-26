package timo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	private List<List<String>> data = null;
	
	
	public List<List<String>> readFile(String inputFile) {
		this.data = new ArrayList<List<String>>();
		Sheet sheet = null;

		try {

			FileInputStream file = new FileInputStream(new File(
					inputFile));

			// xls and xlsx switch
			if (getFileExtension(inputFile).equalsIgnoreCase("xls")) {
				// xls
				HSSFWorkbook workbookHssf = new HSSFWorkbook(file);
				sheet = workbookHssf.getSheetAt(0);

			} else if (getFileExtension(inputFile).equalsIgnoreCase("xlsx")) {
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
		return data;

	}
	
	private static String getFileExtension(String fname2) {
		String fileName = fname2;
		String ext = "";
		int mid = fileName.lastIndexOf(".");
		ext = fileName.substring(mid + 1, fileName.length());
		return ext;
	}

}
