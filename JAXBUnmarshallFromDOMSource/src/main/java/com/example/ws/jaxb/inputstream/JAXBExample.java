package com.example.ws.jaxb.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;






public class JAXBExample{
	
	public static void main(String args[]){
	
		try {
			
			//jc = JAXBContext.newInstance("com.example.ws.jaxb.file");
			InputStream is = new FileInputStream("books.xml");
			JAXBContext jc = JAXBContext.newInstance(new Class[] {com.example.ws.jaxb.inputstream.catalog.class});
			Unmarshaller u = jc.createUnmarshaller();
			catalog catelogobj = (com.example.ws.jaxb.inputstream.catalog) u.unmarshal(is);
			System.out.println("End of main"+catelogobj.getBook().getAuthor());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	
 
}