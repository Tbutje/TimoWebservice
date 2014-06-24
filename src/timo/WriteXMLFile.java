package timo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 
public class WriteXMLFile {
	
	private String OutputFile;
	
	WriteXMLFile(String OutputFile){
		this.OutputFile = OutputFile;
	}
	
 
	public void write(String[] columnNames, String[][] rowValues) {

	  try {
 
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
 
		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("PM");
		doc.appendChild(rootElement);
		
		// loop rows, then through cols
		for (int idx = 0; idx < rowValues.length; idx++) {
			
			Element row = doc.createElement("Row");
			rootElement.appendChild(row);

			//loop trough cols
			for(int colIdx = 0; colIdx < columnNames.length;colIdx++){
				Element cell = doc.createElement(columnNames[colIdx]);
				cell.appendChild(doc.createTextNode(rowValues[idx][colIdx]));	
				row.appendChild(cell);
			}
		}
 
		
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(OutputFile));
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(source, result);
 
	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
	}
}
