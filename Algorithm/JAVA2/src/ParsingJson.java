import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParsingJson {
	public static void main(String[] args) throws IOException {
		//school.json을 읽어와서 parsing
		//1. school.json 읽어오기(BufferedReader br)
		//2. JsonParser 생성 후 parsing --> JsonObject 
		//3. 교육지원청코드, 학구명, 시도교육청명, 교육지원청명
		//4. 뽑아서 화면에 출력
		
		Gson gson = new Gson();
		FileInputStream fis;
		BufferedReader br = null;
		try {
			fis = new FileInputStream("json/school.json");
			br = new BufferedReader(new InputStreamReader(fis));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		StringBuilder col = new StringBuilder("");

		while(true) {
			String s = br.readLine();
			if(s == null) break;
			col.append(s).append("\n");
			
		}
		String rCol = col.toString();
//		System.out.println(rCol);
		
		JsonParser parser = new JsonParser();
		
		String test;
//		test = parser.parse(rCol).getAsString();
//		System.out.println();
//		System.out.println(parser.parse(rCol).getAsString());
//		System.out.println();
		
		// getAsJsonObject();는 json 덩어리를 갖고오는 것
		JsonObject obj = parser.parse(rCol).getAsJsonObject();
		JsonArray arr = obj.getAsJsonArray("records");
		
		// 정연이형 파트
		for(int i = 0; i < arr.size(); i++) {
			JsonObject obj2 = arr.get(i).getAsJsonObject();
			String str = obj2.get("교육지원청코드").getAsString();
			String str2 = obj2.get("학구명").getAsString();
			String str3 = obj2.get("시도교육청명").getAsString();
			String str4 = obj2.get("교육지원청명").getAsString();
			
			System.out.println(str);
			System.out.println(str2);
			System.out.println(str3);
			System.out.println(str4);
			
		}
		
		
//		ArrayList list = gson.fromJson(arr, ArrayList.class);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		
//		}
		
//		System.out.println();
//		String str1 = "{'client':'localgost', 'servers':['10.0.0.11','127.0.0.100','34.56.78.90','256.67.881.78']}";
//		String str2 = "{'winners':['queen','king','prince','eugine','princess']}";
//		String str3 = "['red','blue','yellow','green']";
//		
//		Gson gson = new Gson();
//		JsonParser parser = new JsonParser();
//		JsonObject obj = parser.parse(str1).getAsJsonObject();
//		JsonArray arr = obj.getAsJsonArray("servers");
//		ArrayList list = gson.fromJson(arr, ArrayList.class);
//		for (int i = 0; i < list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
//		System.out.println();
//		//////////////////////////////////////////////////////
//		JsonObject obj2 = parser.parse(str2).getAsJsonObject();
//		JsonArray arr2 = obj2.getAsJsonArray("winners");
//		ArrayList list2 = gson.fromJson(arr2, ArrayList.class);
//		for (int i = 0; i < list2.size(); i++)
//		{
//			System.out.println(list2.get(i));
//		}
//		System.out.println();
//		//////////////////////////////////////////////////////
//		JsonArray arr3 = parser.parse(str3).getAsJsonArray();
//		ArrayList list3 = gson.fromJson(arr3, ArrayList.class);
//		for (int i = 0; i < list3.size(); i++)
//		{
//			System.out.println(list3.get(i));
//		}
		
		
		
	}
}