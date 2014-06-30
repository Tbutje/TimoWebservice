package timo;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads a csv into a list and returns it to Read. Separator is set in
 * the class, better would be to have a option in the gui
 * 
 * @author Timo Koole
 */
public class ReadCsv {

	private List<List<String>> data = null;

	public List<List<String>> readFile(String inputFile) {
		this.data = new ArrayList<List<String>>();
		String csvFile = inputFile;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				List<String> row_read = new ArrayList<String>();
				String[] row = line.split(cvsSplitBy);
				for (String s : row) {
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

		return data;
	}
}
