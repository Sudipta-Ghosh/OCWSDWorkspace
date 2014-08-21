package com.example.ws.jaxb.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;






public class JAXBExample{
	
	public static void main(String args[]){
	
		try {
			JAXBContext jc = JAXBContext.newInstance(new Class[] {com.example.ws.jaxb.inputstream.catalog.class});
			//jc = JAXBContext.newInstance("com.example.ws.jaxb.file");
			Unmarshaller u = jc.createUnmarshaller();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("books.xml"));
			catalog catelogobj = (com.example.ws.jaxb.inputstream.catalog) u.unmarshal(doc);
			System.out.println("End of main"+catelogobj.getBook().getAuthor());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	
 
}