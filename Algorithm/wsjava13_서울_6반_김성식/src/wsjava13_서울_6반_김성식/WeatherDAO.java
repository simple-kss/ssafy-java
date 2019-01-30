package wsjava13_서울_6반_김성식;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class WeatherDAO {
	// 받아올 때 List타입이여서 List로 선언함
	private static WeatherDAO weatherDAO;
	private List<Weather> list; // 파싱된 결과가 저장되어 있는 리스트
	String url = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1162058500";
			
	Document doc;
	private WeatherDAO() throws Exception {
		list = new ArrayList<Weather>();
		//준비작업
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = dbf.newDocumentBuilder();
//		InputStream in = new URL(url).openConnection().getInputStream();
		// InputStream 해서 받아온다
		
		// 바로 주소를 주어도 된다.
//		doc = parser.parse(in);
		doc = parser.parse(url);
			// Document doc = parser.parse("xml/member.xml");
	}
	
	public static WeatherDAO getInstance() throws Exception {
		if(weatherDAO == null) {
			weatherDAO = new WeatherDAO();
		}
		return weatherDAO;
	}
	
	public List<Weather> getWeatherData() {
		// 조금 전에 만들어 놨떤 vo안에 저장을 시켜놓아야 한다.
		// loop안에서 적당한 시점에서 new객체 생성하면서, vo에 저장을 해놓아야한다.
		
		NodeList itemList = doc.getElementsByTagName("data");
		
		int len = itemList.getLength();
		list.clear();
		
		for(int i = 0; i < len; i++) {
			Weather w = new Weather();
			Node item = itemList.item(i);
			NodeList childList = item.getChildNodes();
			
			for(int j = 0; j < childList.getLength(); j++) {
				Node child = childList.item(j);
				String nodeName = child.getNodeName();
				
				if(nodeName.equalsIgnoreCase("hour")) {
					// 이름 출력
					w.setHour(Integer.parseInt(child.getFirstChild().getNodeValue()) );
//					System.out.println(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equalsIgnoreCase("temp")) {
					w.setTemp(Double.parseDouble( child.getFirstChild().getNodeValue()) );
				}
				else if(nodeName.equalsIgnoreCase("wfKor")) {
					w.setWfKor(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equalsIgnoreCase("reh")) {
					w.setReh(Integer.parseInt(child.getFirstChild().getNodeValue()) );
				}
			} // end of childList
			list.add(w); // ArrayList 저장
			// 이러면 DAO가 할일이 끝남
		}// end of itemList
		return list;
		
		
		
	}

}
