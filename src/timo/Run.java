package timo;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Run {
	
	// for logging
	Logger logger = Logger.getLogger(Run.class.getName());
	FileHandler fh;

	public void doStuff(String inputType, String inputFile, String outputType, String outputFile ) {

		// init logger
		try {
			// This block configure the logger with handler and formatter
			fh = new FileHandler("D:/TimoLogFile.log", true);
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// lees bestandje in
		Read inlezen = new Read();
		List<List<String>> data = inlezen.readFile(inputType, inputFile);
		
		// convert naar generic format met headers
		ConvertInputFormat convertInputFormat = new ConvertInputFormat(data);
		String[] columnNames = convertInputFormat.getColumnNames();
		String[][] rowValues = convertInputFormat.getRowValues();

		// ******* print information to console
		System.out.println("----Columns ");
		// print col
		for (int idx = 0; idx < data.get(0).size(); idx++) {
			System.out.print(columnNames[idx]);
			System.out.print(" ");
		}
		System.out.print("\n");
		
		System.out.println("----Values ");
		// print values
		for (int rowIdx = 0; rowIdx < data.size() - 1; rowIdx++) {

			for (int colIdx = 0; colIdx < data.get(0).size(); colIdx++) {
				System.out.print(rowValues[rowIdx][colIdx]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		// ******* print information to console
		
		// write to output
		Write write = new Write(outputType, outputFile, columnNames, rowValues);
		write.writeToOutput();

	}

	public static void main(String[] args) {
		Run run = new Run();
		
		String inputType = "csv"; // xls, xlsx, csv
		String inputFile = "D:\\simpel.csv"; // D:\\Premium-Table-Example.xlsx
													// ; D:\\simpel.xls ;
													// "D:\\simpel.csv"
		
		String outputType = "XML"; // msg.PM, DMBS, XML
		String outputFile = "D:\\file.xml"; // XML is enige dat hier iets mee doet
		run.doStuff(inputType, inputFile, outputType, outputFile);

	}

}
