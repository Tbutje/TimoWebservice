package timo;

import java.util.List;

public class Run {
	
	Run(){
		Inlezen inlezen = new Inlezen();
		
		// deze functie returned arraylist
		List<List<String>> data = inlezen.readFile("xls", "D:\\simpel.xls");
		
		// print file for extra check
		for (int idx = 0; idx < data.size(); idx++) {
			System.out.println(data.get(idx));
		}
	}

	public static void main(String[] args) {
		new Run();

	}

}
