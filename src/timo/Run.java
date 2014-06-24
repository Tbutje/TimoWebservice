package timo;

import java.util.List;

import services.designer.pm.msg.de.SessionType;

public class Run {

	Run() {
		Inlezen inlezen = new Inlezen();

		// deze functie returned arraylist
		List<List<Object>> data = inlezen.readFile("xls", "D:\\simpel.xls");

		// print file for extra check
		for (int idx = 0; idx < data.size(); idx++) {
			System.out.println(data.get(idx));
		}

		// arraylistTo xml?

		// xml trough client to webservice

	}

	public void modifyTableData(
			services.designer.pm.msg.de.SessionType sessiontype, String name,
			services.designer.pm.msg.de.TableRowListType tableRowListType,
			services.designer.pm.msg.de.TableModifyRowType tableModifyRowType,
			services.designer.pm.msg.de.TableRowListType tableModifyRowListType) {
		// hieronder een beschrijving van de verschillende classes die als input
		// dienen

		// sessiontype = new SessionType(sessionToken, sessionID)
		// sessiontoken is een security maatregel om de client te identificeren;
		// Integer
		// sessionID is een identificatie voor deze sessie; Integer

		// name
		// vermoedelijk de naam van de client; String

		// tableRowListType(columnNames,rowValues) // DELETE ROWS
		// java.lang.String[] columnNames: 1 dimensionaal array met column namen
		// java.lang.String[][] rowValues: 2 dimensionaal array met de rows.
		// values zijn STRING!

		// tableModifyRowType(keyCells, valueCells) // UPDATE ROWS
		// services.designer.pm.msg.de.TableRowListType keyCells: // de  key voor een cell? 
		//			waarom dan listype weet ik ook niet, want deze heeft en cloumn en row informatie
		//			Mogelijk is de key de combinatie van huidige column names[] en values[][]
		//			Maar dan zou er eerst een read actie van de database uitgevoegd moeten worden
		//			Om te kijken wat de huidige values zijn.
		// services.designer.pm.msg.de.TableRowListType valueCells: // de values voor de cellen
		
		// tableRowListType(columnNames,rowValues) // ADD ROWS
				// java.lang.String[] columnNames: 1 dimensionaal array met column namen
				// java.lang.String[][] rowValues: 2 dimensionaal array met de rows.
				// values zijn STRING!


	}

	public static void main(String[] args) {
		new Run();

	}

}
