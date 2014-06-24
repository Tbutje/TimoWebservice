package timo;

import java.util.List;

import org.apache.axis.types.UnsignedInt;

import services.designer.pm.msg.de.SessionType;
import services.designer.pm.msg.de.TableRowListType;

public class Run {

	public void doStuff() {

		String input = "csv"; // xls, xlsx, csv
		String file_location = "D:\\simpel.csv"; // D:\\Premium-Table-Example.xlsx ; D:\\simpel.xls ; "D:\\simpel.csv"
		String output = "msg.PM"; // msg.PM, dbms, SOAP, xml

		Inlezen inlezen = new Inlezen();

		// deze functie returned arraylist
		List<List<String>> data = inlezen.readFile(input, file_location); 
																	

		// print file for extra check
		for (int idx = 0; idx < data.size(); idx++) {
			System.out.println(data.get(idx));
		}

		// arraylistTo required data format
		// tableRowListType(columnNames,rowValues) // DELETE en ADD ROWS
		// java.lang.String[] columnNames: 1 dimensionaal array met column namen
		// java.lang.String[][] rowValues: 2 dimensionaal array met de rows.
		// values zijn STRING!
		String[] columnNames = new String[data.get(0).size()];
		String[][] rowValues = new String[data.size() - 1][data.get(0).size()]; // -1
																				// omdat
																				// de
																				// header
																				// eraf
																				// gaat

		// extract first crow --> col names
		for (int rowIdx = 0; rowIdx < data.size(); rowIdx++) {
			List<String> row = data.get(rowIdx);

			for (int colIdx = 0; colIdx < data.get(0).size(); colIdx++) {
				// eerste row zijn col names
				if (rowIdx == 0) {
					columnNames[colIdx] = row.get(colIdx);
				} else {
					rowValues[rowIdx - 1][colIdx] = row.get(colIdx); // -1 omdat
																		// de
																		// header
																		// eraf
																		// gaat
				}
			}
		}
		System.out.println("----Columns ");

		// print cols
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

		// make new modifytabledata bean
		ModifyTableData modifyTableData = new ModifyTableData();
		// make name and session
		modifyTableData.setName("test");
		SessionType session = new SessionType();
		session.setSessionID("SessionID");
		// beetje overbodig dit, maar blijkbaar moet token een unsigned int
		// zijn.
		UnsignedInt token = new UnsignedInt();
		token.setValue(5);
		session.setSessionToken(token);

		// maak het object voor de modifytable class
		TableRowListType tableRowListType = new TableRowListType();
		tableRowListType.setColumnNames(columnNames);
		tableRowListType.setRowValues(rowValues);

		// maak de call
		modifyTableData.addRows(tableRowListType);

		// xml trough client to webservice

	}

	public static void main(String[] args) {
		Run run = new Run();
		run.doStuff();

	}

}
