package timo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;
import java.util.ArrayList;

public class Inlezen {
	// TODO: kies een excel bestandje
	
	private List<List<String>> data = null;

	public List<List<String>> readFile(String file_type, String location) {
		//TODO:doe iets met string locatie
		//TODO: error handling nu ook niet goed als je iets randoms invuld; misschien enum van maken?
		
		switch(file_type){
	
		case "xls":
			read_xls();
		}
		
		return data;
		
	}

	private void read_xls() {
		
		try {

			FileInputStream file = new FileInputStream(new File(
					"D:\\simpel.xls"));

			// Get the workbook instance for XLS file
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Get first sheet from the workbook
			HSSFSheet sheet = workbook.getSheetAt(0);

	

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

}
