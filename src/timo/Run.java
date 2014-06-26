package timo;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.axis.AxisFault;

public class Run {

	// use the classname for the logger, this way you can refactor
	// private final static Logger LOGGER =
	// Logger.getLogger(Run.class.getName());

	public void doStuff(String inputFile, String outputType, String outputFile) {

		// setup logging
		SimpleFormatter formatterTxt = new SimpleFormatter();
		Logger logger = Logger.getLogger("timologger");
		try {
			FileHandler handler = new FileHandler("d:\\timologger.log", true);
			handler.setFormatter(formatterTxt);
			logger.addHandler(handler);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Read file
		Read reader = new Read();
		try {
			reader.readFile(inputFile);
		} catch (Exception ex) {
			// if extension is unknown reader will throw an exception
			// also exit the program since we cannot run without valid input
			// file
			System.out.print(ex.getMessage());
			logger.severe(ex.getMessage());
			return;
		}
		String[] columnNames = reader.getColumnNames();
		String[][] rowValues = reader.getRowValues();

		// ******* print information to console
		System.out.println("----Columns ");
		// print col
		for (int idx = 0; idx < columnNames.length; idx++) {
			System.out.print(columnNames[idx]);
			System.out.print(" ");
		}
		System.out.print("\n");
		System.out.println("----Values ");
		// print values
		for (int rowIdx = 0; rowIdx < rowValues.length; rowIdx++) {

			for (int colIdx = 0; colIdx < columnNames.length; colIdx++) {
				System.out.print(rowValues[rowIdx][colIdx]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		// ******* print information to console

		// write to output
		Write write = new Write(outputType, outputFile, columnNames, rowValues);
		try {
			write.writeToOutput();
		} catch (Exception ex) {
			// if the writer cant write to file it throws an exception
			System.out.print(ex.getMessage());
			logger.severe(ex.getMessage());
			return;

		}

	}

	public static void main(String[] args) {
		Run run = new Run();

		// set the LogLevel to Info, severe, warning and info will be written
		// finest is still not written

		// String inputType = "csv"; // xls, xlsx, csv
		String inputFile = "D:\\Premium-Table-Example.xlsxz"; // D:\\Premium-Table-Example.xlsx
		// ; D:\\simpel.xls ;
		// "D:\\simpel.csv"

		String outputType = "XML"; // msg.PM, DBMS, XML
		String outputFile = "D:\\file.xml"; // XML is enige dat hier iets mee
											// doet
		run.doStuff(inputFile, outputType, outputFile);

	}

}
