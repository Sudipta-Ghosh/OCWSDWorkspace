package com.example.ws.jaxb.file;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;




public class JAXBExample{
	
	public static void main(String args[]){
		JAXBContext jc;
		try {
			
			//jc = JAXBContext.newInstance("com.example.ws.jaxb.file");
			jc = JAXBContext.newInstance(new Class[] {com.example.ws.jaxb.file.catalog.class});

			Unmarshaller u = jc.createUnmarshaller();
			catalog catelogobj = (catalog) u.unmarshal(new File("books.xml"));
			System.out.println("End of main"+catelogobj.getBook().getAuthor());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	
 
}