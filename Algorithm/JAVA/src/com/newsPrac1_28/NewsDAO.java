package com.newsPrac1_28;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NewsDAO {
	// 받아올 때 List타입이여서 List로 선언함
	List<News> list; // 파싱된 결과가 저장되어 있는 리스트
	String url = "http://api.newswire.co.kr/rss/industry/600";
			
	Document doc;
	NewsDAO() throws Exception {
		list = new ArrayList<News>();
		//준비작업
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = dbf.newDocumentBuilder();
		InputStream in = new URL(url).openConnection().getInputStream();
		// InputStream 해서 받아온다
		
		doc = parser.parse(in);
			// Document doc = parser.parse("xml/member.xml");
	}
	
	public List<News> getNewsData() {
		// 조금 전에 만들어 놨떤 vo안에 저장을 시켜놓아야 한다.
		// loop안에서 적당한 시점에서 new객체 생성하면서, vo에 저장을 해놓아야한다.
		
		NodeList itemList = doc.getElementsByTagName("item");
		
		int len = itemList.getLength();
		
		for(int i = 0; i < len; i++) {
			News w = new News();
			Node item = itemList.item(i);
			NodeList childList = item.getChildNodes();
			
			for(int j = 0; j < childList.getLength(); j++) {
				Node child = childList.item(j);
				String nodeName = child.getNodeName();
				
				if(nodeName.equalsIgnoreCase("title")) {
					// 이름 출력
					w.setTitle(child.getFirstChild().getNodeValue());
//					System.out.println(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("pubDate")) {
					// 주소 출력
					// 자식이 어차피 1개밖에 없기 떄문에 FirstChild로 해서 출력하면됨.
					w.setPubDate(child.getFirstChild().getNodeValue());
//					System.out.println(child.getFirstChild().getNodeValue());
				}
			} // end of childList
			list.add(w); // ArrayList 저장
			// 이러면 DAO가 할일이 끝남
		}// end of itemList
		return list;
		
		
		
	}
}
