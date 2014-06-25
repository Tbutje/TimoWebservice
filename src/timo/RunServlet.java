package timo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RunServlet
 */
public class RunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String inputType; // xls, xlsx, csv
	private String inputFile; // D:\\Premium-Table-Example.xlsx // ;
								// D:\\simpel.xls ;// "D:\\simpel.csv"
	private String outputType; // msg.PM, DMBS, XML
	private String outputFile; // "D:\\file.xml"; XML is enige dat hier iets mee
								// doet
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RunServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		inputType = request.getParameter("inputType");
		inputFile = request.getParameter("inputFile");
		outputType = request.getParameter("outputType");
		outputFile = request.getParameter("outputFile");
		
		Run run = new Run();
		run.doStuff(inputType, inputFile, outputType, outputFile);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		inputType = request.getParameter("inputType");
		inputFile = request.getParameter("inputFile");
		outputType = request.getParameter("outputType");
		outputFile = request.getParameter("outputFile");
		
		Run run = new Run();
		run.doStuff(inputType, inputFile, outputType, outputFile);

	}

}
