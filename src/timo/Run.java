package timo;

import java.util.List;

public class Run {
	
	Run(){
		Inlezen inlezen = new Inlezen();
		
		// deze functie returned arraylist
		List<List<Object>> data = inlezen.readFile("xls", "D:\\simpel.xls");
		
		// print file for extra check
		for (int idx = 0; idx < data.size(); idx++) {
			System.out.println(data.get(idx));
		}
		
		// arraylistTo xml?
	}

	public static void main(String[] args) {
		new Run();

	}

}
