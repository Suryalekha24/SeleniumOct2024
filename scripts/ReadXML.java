package scripts;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		File xmlFile=new File("C:\\Users\\surya\\OneDrive\\Documents\\Selenium - Java-FITA\\Settings.xml");
		DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		Document doc= dbBuilder.parse(xmlFile);
		
		NodeList nlXml= doc.getChildNodes();
		Node nXml = nlXml.item(0);
		Element element =(Element)nXml;
		System.out.println("URL:"+element.getElementsByTagName("APP_URL").item(0).getTextContent());
	}

}
