import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonTest {
	
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
		obj.addProperty("num", 900);d
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
	
	public static void main(String[] args) {
		// 1.java opject --> Json string
		toJson();
		// 2.json string --> java obejct
		fromJson();
		// 3.JsonObject --> json string
		makeJson();
		// 4. json parsing
		parseJson();
	}
	
}