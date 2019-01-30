package wsjava14_서울_6반_김성식;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FoodDAO {
	List<Food> list;
	List<Nutri> nList;
	Document doc;
	Document nDoc;

	public FoodDAO() throws Exception {
		list = new ArrayList<Food>();
		nList = new ArrayList<Nutri>();
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = dbf.newDocumentBuilder();
		
		
		doc = parser.parse("xml/foodInfo.xml");	
		nDoc = parser.parse("xml/FoodNutritionInfo.xml");
		
		//this.getFoodsData();
		//this.getNutrisData();
		//System.out.println(doc);
	} // end of constructor
	
	public Food search(int index) {
		return list.get(index);		
	}
	
	public List<Food> getFoodsData() {
		list.clear();
		NodeList itemList = doc.getElementsByTagName("food");
		
		int len = itemList.getLength();

		for(int i = 0; i < len; i++) {
			Food w = new Food();
			Node item = itemList.item(i);
			NodeList childList = item.getChildNodes();
			
			for(int j = 0; j < childList.getLength(); j++) {
				Node child = childList.item(j);
				String nodeName = child.getNodeName();
				if(nodeName.equalsIgnoreCase("name")) {
					// �̸� ���
					w.setName(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("maker")) {
					// �ּ� ���
					w.setMaker(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("material")) {
					w.setMaterial(child.getFirstChild().getNodeValue());
				}
			} // end of childList
			//System.out.println(w.toString());
			list.add(w); // ArrayList
		}// end of itemList
		return list;
		
	} // end of getNewsData
	
	
	public List<Nutri> getNutrisData() {
		nList.clear();
		NodeList itemList = nDoc.getElementsByTagName("item");
		
		int len = itemList.getLength();
		
		for(int i = 0; i < len; i++) {
			Nutri n = new Nutri();
			Node item = itemList.item(i);
			NodeList childList = item.getChildNodes();
			
			for(int j = 0; j < childList.getLength(); j++) {
				Node child = childList.item(j);
				String nodeName = child.getNodeName();
				if(nodeName.equalsIgnoreCase("DESC_KOR")) {
					n.setDesc(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("SERVING_WT")) {
					n.setServing(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT1")) {
					n.setCont1(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT2")) {
					n.setCont2(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT3")) {
					n.setCont3(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT4")) {
					n.setCont4(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT5")) {
					n.setCont5(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT6")) {
					n.setCont6(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT7")) {
					n.setCont7(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT8")) {
					n.setCont8(child.getFirstChild().getNodeValue());
				}
				else if(nodeName.equals("NUTR_CONT9")) {
					n.setCont9(child.getFirstChild().getNodeValue());
				}
				
			} // end of childList
			//System.out.println(w.toString());
			nList.add(n); // ArrayList 
		}// end of itemList
		return nList;
		
	} // end of getNewsData
	
	public ArrayList<Food> selectName(String name) {
		ArrayList<Food> tempList = new ArrayList<Food>();
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if(list.get(i).getName().contains(name)) {
				tempList.add(list.get(i));
			}
		}
		return tempList;
	}
	
	public ArrayList<Food> selectMaker(String maker) {
		ArrayList<Food> tempList = new ArrayList<Food>();
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if(list.get(i).getMaker().contains(maker)) {
				tempList.add(list.get(i));
			}
		}
		return tempList;
	}
	
	public ArrayList<Food> arrangeName() {
		Comparator<Food> ct = new Comparator<Food>() {
			@Override
			public int compare(Food f1, Food f2) {
				return f1.getName().compareTo(f2.getName());
				
			}
		};
		ArrayList<Food> tempList = (ArrayList<Food>) list;
		Collections.sort(tempList, ct);
		
		return tempList;
	}
	
	public ArrayList<Food> arrangeMaker() {
		Comparator<Food> ct = new Comparator<Food>() {
			@Override
			public int compare(Food f1, Food f2) {
				return f1.getMaker().compareTo(f2.getMaker());
			}
		};
				
		ArrayList<Food> tempList = (ArrayList<Food>) list;
		Collections.sort(tempList, ct);

		return tempList;
	}
	
	
	public ArrayList<Food> getList() {
		return (ArrayList<Food>) this.list;
	}
	public ArrayList<Nutri> getnList() {
		return (ArrayList<Nutri>) this.nList;
	}

}
