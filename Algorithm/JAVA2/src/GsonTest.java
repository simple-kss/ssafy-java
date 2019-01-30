import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonTest {
	
	// Gson 은 json을 string으로 변환해 주는 애
	
// 설정 작업 쓸때 builder 씀
	public static void toJson() {
		Person p = new Person(123, "kim", "tokyo");
		
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		
		
//			Gson gson = new Gson();
		String str = gson.toJson(p);
		System.out.println(str);
	}
	
	public static void fromJson() {
		String json = "{'num' : '500', 'name' : 'harry', 'address' : 'london'}";
		Gson gson = new Gson();
		Person p = gson.fromJson(json, Person.class);
		System.out.println(p);
	}
	
	public static void makeJson() {
		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		obj.addProperty("num", 900);
		obj.addProperty("name", "june");
		obj.addProperty("address", "Paris");
		
		String json = gson.toJson(obj);
		System.out.println(json);
	}
	
	public static void parseJson() {
		String json = "{'num' : 123, 'name' : 'jully', 'address' : 'seattle'}";
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(json).getAsJsonObject();
		
		int num = obj.get("num").getAsInt();
		String name = obj.get("name").getAsString();
		String address = obj.get("address").getAsString();
		System.out.println(num + ":" + name + ":" + address);
	}
	
	public static void parseJsonArray()
	{
		String str1 = "{'client':'localgost', 'servers':['10.0.0.11','127.0.0.100','34.56.78.90','256.67.881.78']}";
		String str2 = "{'winners':['queen','king','prince','eugine','princess']}";
		String str3 = "['red','blue','yellow','green']";
		
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(str1).getAsJsonObject();
		JsonArray arr = obj.getAsJsonArray("servers");
		ArrayList list = gson.fromJson(arr, ArrayList.class);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		//////////////////////////////////////////////////////
		JsonObject obj2 = parser.parse(str2).getAsJsonObject();
		JsonArray arr2 = obj2.getAsJsonArray("winners");
		ArrayList list2 = gson.fromJson(arr2, ArrayList.class);
		for (int i = 0; i < list2.size(); i++)
		{
			System.out.println(list2.get(i));
		}
		System.out.println();
		//////////////////////////////////////////////////////
		JsonArray arr3 = parser.parse(str3).getAsJsonArray();
		ArrayList list3 = gson.fromJson(arr3, ArrayList.class);
		for (int i = 0; i < list3.size(); i++)
		{
			System.out.println(list3.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		// 1.java opject --> Json string
		toJson();
		// 2.json string --> java obejct
		fromJson();
		// 3.JsonObject --> json string
		makeJson();
		// 4. json parsing
		parseJson();
		//
		System.out.println();
		System.out.println("----------------");
		System.out.println( );
		parseJsonArray();
	}
	
}