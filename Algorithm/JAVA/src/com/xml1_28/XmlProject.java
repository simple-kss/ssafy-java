package com.xml1_28;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlProject {
	public static void main(String[] args) throws Exception {
		// 이 4Line 외워야함 시험에 나옴
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = dbf.newDocumentBuilder();
		
		// dom tree 제일 위에 있는 가상 노드를 가리킴
		Document xmldoc = parser.parse("./src/com/xml1_28/NewFile.xml");
		
		//root 엘리머트를 가리킴
		Element list = xmldoc.getDocumentElement();
		
		// 태그 이름 기준으로 검색
		NodeList names = list.getElementsByTagName("name");
		int length = names.getLength();
		
		for(int i = 0; i < length; i++) {
			/*
			 * <name>태그 전체가 다 가져오게됨
			 * 
			 */
			Node name = names.item(i); // name element 한 개
			Node text = name.getFirstChild(); 
			// <name>김성식</name> text node인 "김성식"이 나옴
			// lastChild라고 해도 된다.
			// 바로 안뽑아진다. text는 node타입이다. 
			// 그래서 최종적으로 text node에서 값을 뽑아야 하므로 getNodeValue메소드 호출
			System.out.println(text.getNodeValue());
		}
		
		
//		System.out.println(list.getTextContent());
//		getNode(list);
	}
	
	public static void getNode(Node n) {
		for(Node ch = n.getFirstChild();ch != null; ch = ch.getNextSibling()) {
//			if(ch.getNodeType() == Node.ELEMENT_NODE) {
				System.out.println(ch.getNodeName());
//			}
		}		
	}

}
