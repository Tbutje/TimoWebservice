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

/**
 * This class reads an excel file and stores it in a list. Based on the file
 * extension it will use either the xls or xlsx library's. I perform a weird
 * conversion on Numeric values. I had a weird problem because excel stores all
 * values as a float. Therefore 1 becomes 1.0. Therefore I chose to remove the
 * trailing .0 of all the strings. Side effect is that 1.0000 also becomes 1 But
 * since databases contain the value types it shouldn't be a problem since it is
 * easy to cast 1 to 1.0000
 * 
 * @author Timo Koole
 */
public class ReadExcel {

	private List<List<String>> data = null;

	public List<List<String>> readFile(String inputFile) throws Exception {
		this.data = new ArrayList<List<String>>();
		Sheet sheet = null;

		try {

			FileInputStream file = new FileInputStream(new File(inputFile));

			// xls and xlsx switch
			if (getFileExtension(inputFile).equalsIgnoreCase("xls")) {
				// xls
				HSSFWorkbook workbookHssf = new HSSFWorkbook(file);
				sheet = workbookHssf.getSheetAt(0);

			} else if (getFileExtension(inputFile).equalsIgnoreCase("xlsx")) {
				// xlsx
				XSSFWorkbook workbookXssf = new XSSFWorkbook(file);
				sheet = workbookXssf.getSheetAt(0);
			}

			// Iterate through each row
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				// For each row, iterate through each column
				Iterator<Cell> cellIterator = row.cellIterator();
				List<String> row_read = new ArrayList<String>();
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_BOOLEAN:
						row_read.add(String.valueOf(cell.getBooleanCellValue()));
						break;
					case Cell.CELL_TYPE_NUMERIC:
						// this operation may look weird. but excel sees all
						// numbers as floats causing issues with integers since
						// it adds .0 to each integer
						// therefore we can safely remove every .0 at the end of a string
						String tmp = String.valueOf(cell.getNumericCellValue());
						if (tmp.substring(tmp.length() - 2, tmp.length())
								.equals(".0")) {
							tmp = tmp.substring(0, tmp.length() - 2);
						}
						row_read.add(tmp); // add col
						break;
					case Cell.CELL_TYPE_STRING:
						row_read.add(cell.getStringCellValue());
						break;
					}
				}
				data.add(row_read); // add row
			}

			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;

	}

	private static String getFileExtension(String fileName) {
		String ext;
		int mid = fileName.lastIndexOf(".");
		ext = fileName.substring(mid + 1, fileName.length());
		return ext;
	}

}
