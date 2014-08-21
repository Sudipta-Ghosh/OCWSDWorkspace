package com.example.ws.jaxb.inputstream;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class catalog {
  Book book;

public Book getBook() {
	return book;
}
@XmlElement
public void setBook(Book book) {
	this.book = book;
}
  
}
