package com.sax1_29;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookSaxParsing extends DefaultHandler {
	
	public BookSaxParsing() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser;
		try {
			parser = factory.newSAXParser();
			parser.parse("xml/book.xml", new FindBookEventHandler("author", "이규미")); // 사건 처리할 핸들러를 인자로 넣어줘야함
			// this : parsing 도중 발생하는 사건처리를 담당할 객체
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// 문서의 시작인 경우
	// 문서의 제일 처음 부분. Document가 시작이 되면
	@Override
	public void startDocument() throws SAXException {
		System.out.println("document 시작!");
	}

	// 문서의 끝인 경우
	// 문서의 제일 마지막 부분. Document가 끝나면
	@Override
	public void endDocument() throws SAXException {
		System.out.println("document 끝");
	}

	// 문서에서 시작하는 엘리먼트를 만나는 경우 호출함
	// 엘리먼트 시작이 되면
	@Override											    // 태그이름		   // 속성
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("booklist")) {
			System.out.println("<booklist>");
		} else if (qName.equals("book")) {
			System.out.println("<book kind = " + attributes.getValue("kind") +">");
		} else if (qName.equals("title")) {
			System.out.println("<title>");
		} else if (qName.equals("author")) {
			System.out.println("<author>");
		} else if (qName.equals("publisher")) {
			System.out.println("<publisher>");
		} else if (qName.equals("price")) {
			System.out.println("<price>");
		}
	}

	// 문서에서 끝나는 엘리먼트를 만나는 경우 호출함
	// 엘리먼트가 끝나면
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("booklist")) {
			System.out.println("</booklist>");
		} else if (qName.equals("book")) {
			System.out.println("</book>");
		} else if (qName.equals("title")) {
			System.out.println("</title>");
		} else if (qName.equals("author")) {
			System.out.println("</author>");
		} else if (qName.equals("publisher")) {
			System.out.println("</publisher>");
		} else if (qName.equals("price")) {
			System.out.println("</price>");
		}
	}


	//텍스트를 만나면
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length);
		System.out.println(str);
	}



	public static void main(String[] args) {
		new BookSaxParsing();
	}
}
