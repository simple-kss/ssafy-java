package com.xml1_28;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MemberParsing2 {
	public static void main(String[] args) {
		MemberParsing2 m = new MemberParsing2();
		
		process();
		

	}
	
	private static void process() {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = dbf.newDocumentBuilder();
			Document doc = parser.parse("src/com/xml1_28/NewFile.xml");
			
			NodeList members = doc.getElementsByTagName("member");
			int length = members.getLength();
			
			
			// members iter
			for(int i = 0; i < length; i++) {
				Node member = members.item(i); // members 한사람
				// 자식이 하나래도 타입은 NodeList타입으로 나온다
				NodeList child = member.getChildNodes(); // 모든 자식 노드
				
				// members items 
				for(int j = 0; j < child.getLength(); j++) {
					Node child1 = child.item(j);
					String nodeName = child1.getNodeName();
					if(nodeName.equals("name")) {
						// 이름 출력
						System.out.println(child1.getFirstChild().getNodeValue());
					}
					else if(nodeName.equals("address")) {
						// 주소 출력
						// 자식이 어차피 1개밖에 없기 떄문에 FirstChild로 해서 출력하면됨.
						System.out.println(child1.getFirstChild().getNodeValue());
					}
				} // end of members items	
				
			} // end of members
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
