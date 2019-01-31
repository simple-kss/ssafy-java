
public class Person {
	static Person instance;
	
	private Person() {
		
	}
	
	static Person getInstance() {
		if(instance == null) 
			instance = new Person();
		
		return instance;
	}

}
