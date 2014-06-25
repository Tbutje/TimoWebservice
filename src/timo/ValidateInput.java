package timo;

public class ValidateInput {
	
	public Boolean checkInputExt(String fileName){
		// check if input is within allowed file extensions
		
		String ext = getFileExtension(fileName);
		String[] filetypes = {"csv", "xls", "xlsx"};
	

		for(String s : filetypes)
		    {
		        if(ext.equals(s))
		        {
		            return true;
		        }
		    }

		return false;
	}
	
	public Boolean checkOutputExt(String fileName){
		// check if input is within allowed file extensions
		
		String ext = getFileExtension(fileName);
		String[] filetypes = {".XML"};
	

		for(String s : filetypes)
		    {
		        if(ext.equals(s))
		        {
		            return true;
		        }
		    }

		return false;
	}
	
	
	
	private static String getFileExtension(String fname2) {
		// gebruik deze functie voor het lezen van de extensie
		String fileName = fname2;
		// String fname = "";
		String ext = "";
		int mid = fileName.lastIndexOf(".");
		// fname = fileName.substring(0, mid);
		ext = fileName.substring(mid + 1, fileName.length());
		return ext;
	}
	


}
