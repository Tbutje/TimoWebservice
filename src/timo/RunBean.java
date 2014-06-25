package timo;

public class RunBean {

	private String inputType; // xls, xlsx, csv
	private String inputFile; // D:\\Premium-Table-Example.xlsx // ;
								// D:\\simpel.xls ;// "D:\\simpel.csv"
	private String outputType; // msg.PM, DMBS, XML
	private String outputFile; // "D:\\file.xml"; XML is enige dat hier iets mee
								// doet

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputType() {
		return outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public void readAndWrite() {
		Run run = new Run();
		run.doStuff(inputType, inputFile, outputType, outputFile);

	}

}
