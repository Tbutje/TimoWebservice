package timo;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This class is NOT used by other classes. This class calls the read and write
 * functions and could be used as a commandline application. Personally I mainly
 * used it for testing purposes But This class does take command line arguments
 * (inputFile, outputType, outputFile) to perform it's actions. Could also be
 * used by other programs/classes to call this class
 * 
 * @author Timo Koole
 */
public class Run {

	public void InputToOutput(String inputFile, String outputType,
			String outputFile) {

		// setup logging
		// switched file writing off, since this will write to a dir that may
		// not exist for whoever is testing this program
		//SimpleFormatter formatterTxt = new SimpleFormatter();
		Logger logger = Logger.getLogger("timologger");
		try {
		//	FileHandler handler = new FileHandler("d:\\timologger.log");
		//	handler.setFormatter(formatterTxt);
		//	logger.addHandler(handler);
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

		String inputFile = null;
		String outputType = null;
		String outputFile = null;

		// if commandline arguments are present use those to call the function
		if (args.length > 0) {
			if (args.length != 3) {
				System.out
						.println("Needs 3 commandline parameters: inputFile, outputType,  outputFile");
				return;
			}
			for (int idx = 0; idx < args.length; idx++) {
				inputFile = args[0];
				outputType = args[1];
				outputFile = args[2];

			}
		} else {
			// if not then use these testing values

			inputFile = "D:\\test.xls";
			outputType = "XML"; // msg.PM, DBMS, XML
			outputFile = "D:\\file2.xml"; // only output XML does something with
											// this dir

		}

		// run
		run.InputToOutput(inputFile, outputType, outputFile);

	}
}
