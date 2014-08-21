package com.example.ws.jaxb.saxsource;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.ValidationEventCollector;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;







public class JAXBExample{
	
	public static void main(String args[]){
	
		try {
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			 SAXParser saxParser = factory.newSAXParser();
			XMLReader xmlReader = saxParser.getXMLReader();
			InputSource inputSource = new InputSource( new StringReader( "books.xml" ) );
			SAXSource source = new SAXSource( xmlReader, inputSource );

			// Setup JAXB to unmarshal
			JAXBContext jc = JAXBContext.newInstance(new Class[] {com.example.ws.jaxb.saxsource.catalog.class});
			Unmarshaller u = jc.createUnmarshaller();
			ValidationEventCollector vec = new ValidationEventCollector();
			u.setEventHandler(vec);

			// turn off the JAXB provider's default validation mechanism to
			// avoid duplicate validation


			// unmarshal
			catalog catelogobj = (com.example.ws.jaxb.saxsource.catalog) u.unmarshal(source);
			System.out.println("End of main"+catelogobj.getBook().getAuthor());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	
 
}